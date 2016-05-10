package com.betbrain.sepc.connector.sdql;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.apache.log4j.Logger;

import com.betbrain.sepc.connector.sportsmodel.Entity;
import com.betbrain.sepc.connector.sportsmodel.EntityChange;
import com.betbrain.sepc.connector.sportsmodel.EntityCreate;
import com.betbrain.sepc.connector.sportsmodel.EntityDelete;
import com.betbrain.sepc.connector.sportsmodel.EntityUpdate;
import com.betbrain.sepc.connector.util.StringUtil;
import com.betbrain.sepc.connector.util.XMLStreamUtil;
import com.betbrain.sepc.connector.util.beans.BeanUtil;

/**
 * A utility class for reading SDQL constructs from an input stream.
 * 
 * @author Morten Helles
 */
class SDQLXMLReaderUtil {
    
    // --------------------------------------------------------------------------------------------
    // Test methods
    // --------------------------------------------------------------------------------------------
    
    public static final void main(String[] args) throws Exception {
    	String sqdlConstructAsXML = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><sdql><PingRequest id=\"99\"/></sdql>";
        System.out.println(sqdlConstructAsXML);
        ByteArrayInputStream bais = new ByteArrayInputStream(sqdlConstructAsXML.getBytes(SDQLXMLConstants.XML_ENCODING));
        SDQLConstruct sdqlConstruct = new SDQLXMLReaderUtil().readPDUFromPushStream(bais);
        System.out.println(sdqlConstruct);
    }
    
    // --------------------------------------------------------------------------------------------
    // Class fields
    // --------------------------------------------------------------------------------------------
    
    private static int MAX_PDU_CONTENT_BYTE_SIZE = 10 * 1024 * 1024; // 10M
    private static int MAX_PDU_LENGTH_BYTE_SIZE = Long.toString(MAX_PDU_CONTENT_BYTE_SIZE).length();
    
    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------
    
    private byte[] PDU_CONTENT_BYTE_ARRAY = new byte[MAX_PDU_CONTENT_BYTE_SIZE];
    private Logger _logger = Logger.getLogger(SDQLXMLReaderUtil.class);
    private XMLInputFactory _xmlInputFactory = XMLInputFactory.newInstance();
    
    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------
    
    /**
     * Reads the next protocol data unit (PDU) from the specified input stream, and returns the
     * SDQL construct contained therein.
     * The input stream is received by a push client subscription.
     * <p>
     * The method is not thread-safe.
     *
     * @param is the input stream to read from.
     * @return the read SDQL construct.
     * @throws IOException if an i/o exception occurs.
     * @throws XMLStreamException if a fatal XML streaming exception occurs.
     */
    public SDQLConstruct readPDUFromPushStream(InputStream is) throws IOException, XMLStreamException {
    
        // read length and 0 byte
        ByteArrayOutputStream baosLength = new ByteArrayOutputStream();
        for (int i = is.read(); i != 0; i = is.read()) {
            baosLength.write(i);
            if (baosLength.size() > MAX_PDU_LENGTH_BYTE_SIZE)
                throw new IOException("PDU length exceeds " + MAX_PDU_LENGTH_BYTE_SIZE + " bytes.");
        }
        int sdqlConstructGzippedByteLength = Integer.parseInt(new String(baosLength.toByteArray()));
        if (sdqlConstructGzippedByteLength > MAX_PDU_CONTENT_BYTE_SIZE)
            throw new IOException("PDU content exceeds " + MAX_PDU_CONTENT_BYTE_SIZE + " bytes: " + sdqlConstructGzippedByteLength);
        
        // read SDQL construct (as gzipped bytes)
        byte[] sdqlConstructAsGzippedBytes = PDU_CONTENT_BYTE_ARRAY; // new byte[sdqlConstructGzippedByteLength];
        for (int numBytesRead = 0; numBytesRead != sdqlConstructGzippedByteLength;)
            numBytesRead += is.read(sdqlConstructAsGzippedBytes, numBytesRead, sdqlConstructGzippedByteLength - numBytesRead);

        ByteArrayInputStream bais = new ByteArrayInputStream(sdqlConstructAsGzippedBytes, 0, sdqlConstructGzippedByteLength);
        GZIPInputStream gzipis = new GZIPInputStream(bais);
        
        return readFromPushStream(gzipis);
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    /**
     * Reads and returns a single SDQL construct from the specified input stream.
     * The input stream contains response data received for a push subscription. 
     * @param is the input stream to read from.
     * @return the read SDQL construct.
     * @throws XMLStreamException if a fatal XML streaming exception occurs.
     */
    private SDQLConstruct readFromPushStream(InputStream is) throws XMLStreamException {
        XMLStreamReader xmlStreamReader = _xmlInputFactory.createXMLStreamReader(is, SDQLXMLConstants.XML_ENCODING);
        XMLStreamUtil.parseNextTag(xmlStreamReader, XMLStreamReader.START_ELEMENT, SDQLXMLConstants.ROOT_TAG_NAME);
        SDQLConstruct sdqlConstruct = null;
       	XMLStreamUtil.parseNextTag(xmlStreamReader, XMLStreamReader.START_ELEMENT);
        String sdqlConstructName = xmlStreamReader.getLocalName();
        if ("SubscribeResponse".equals(sdqlConstructName)) {
        	sdqlConstruct = readSDQLSubscribeResponse(xmlStreamReader);
        } else if ("UnsubscribeResponse".equals(sdqlConstructName)) {
        	sdqlConstruct = readSDQLUnsubscribeResponse(xmlStreamReader, false);
        } else if ("InitialData".equals(sdqlConstructName)) {
        	sdqlConstruct = readSDQLInitialData(xmlStreamReader);
        } else if ("UpdateData".equals(sdqlConstructName)) {
        	sdqlConstruct = readSDQLUpdateData(xmlStreamReader, false);
        } else if ("PingRequest".equals(sdqlConstructName)) {
        	sdqlConstruct = readSDQLPingRequest(xmlStreamReader);
        } else if ("error".equals(sdqlConstructName)) {
        	sdqlConstruct = readSDQLError(xmlStreamReader);
        } else {
        	xmlStreamReader.close();
            throw new XMLStreamException("Unknown SDQL construct name: " + sdqlConstructName);
        }
        XMLStreamUtil.parseNextTag(xmlStreamReader, XMLStreamReader.END_ELEMENT, SDQLXMLConstants.ROOT_TAG_NAME);
        xmlStreamReader.close();
        return sdqlConstruct;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    
    /**
     * Reads and returns an SDQL construct from the specified input stream.
     * The input stream contains response data received for a pull subscription. 
     * The stream may contain multiple <InitialData> or <UpdateData> elements
     * @param is the input stream to read from.
     * @return the read SDQL construct.
     * @throws XMLStreamException if a fatal XML streaming exception occurs.
     * @throws IOException 
     */
    public SDQLConstruct readPDUFromPullStream(InputStream is) throws XMLStreamException, IOException {
    	ByteArrayOutputStream baos = new ByteArrayOutputStream();
		int i = -1;
		while ((i = is.read()) != -1) {
            baos.write(i);
         }
		ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
		GZIPInputStream gzipis = new GZIPInputStream(bais);
        return readFromPullStream(gzipis);
    }  
    
/* ----------------------------------------------------------------------------------------- */
    
    /**
     * Reads and returns a single SDQL construct from the specified input stream.
     * The input stream contains response data received for a pull subscription. 
     * @param is the input stream to read from.
     * @return the read SDQL construct.
     * @throws XMLStreamException if a fatal XML streaming exception occurs.
     */
    private SDQLConstruct readFromPullStream(InputStream is) throws XMLStreamException {
    	XMLStreamReader xmlStreamReader = _xmlInputFactory.createXMLStreamReader(is, SDQLXMLConstants.XML_ENCODING);
        XMLStreamUtil.parseNextTag(xmlStreamReader, XMLStreamReader.START_ELEMENT, SDQLXMLConstants.ROOT_TAG_NAME);
        SDQLConstruct sdqlConstruct = null;
       	XMLStreamUtil.parseNextTag(xmlStreamReader, XMLStreamReader.START_ELEMENT);
        String sdqlConstructName = xmlStreamReader.getLocalName();
        if ("SubscribeResponse".equals(sdqlConstructName)) {
        	sdqlConstruct = readSDQLSubscribeResponse(xmlStreamReader);
        } else if ("UnsubscribeResponse".equals(sdqlConstructName)) {
        	sdqlConstruct = readSDQLUnsubscribeResponse(xmlStreamReader, true);
        } else if ("GetNextInitialDataResponse".equals(sdqlConstructName)) {
        	sdqlConstruct = readSDQLInitialDataResponse(xmlStreamReader);
        } else if ("GetNextUpdateDataResponse".equals(sdqlConstructName)) {
        	sdqlConstruct = readGetNextUpdateDataResponse(xmlStreamReader);
        } else if ("error".equals(sdqlConstructName)) {
        	sdqlConstruct = readSDQLError(xmlStreamReader);
        } else {
        	xmlStreamReader.close();
            throw new XMLStreamException("Unknown SDQL construct name: " + sdqlConstructName);
        }
        XMLStreamUtil.parseNextTag(xmlStreamReader, XMLStreamReader.END_ELEMENT, SDQLXMLConstants.ROOT_TAG_NAME);
        xmlStreamReader.close();
        return sdqlConstruct;
    }
    
    
       
    /* ----------------------------------------------------------------------------------------- */
    
    private SDQLSubscribeResponse readSDQLSubscribeResponse(XMLStreamReader xmlStreamReader) throws XMLStreamException {
    
        String id = XMLStreamUtil.getAttributeValue(xmlStreamReader, "subscriptionId", false);
        
        XMLStreamUtil.parseNextTag(xmlStreamReader, XMLStreamReader.END_ELEMENT, "SubscribeResponse");
        
        return new SDQLSubscribeResponse(id);
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    private SDQLUnsubscribeResponse readSDQLUnsubscribeResponse(XMLStreamReader xmlStreamReader, boolean isPullSubscription) throws XMLStreamException {
    	int code;
    	if (isPullSubscription) {
    		code = XMLStreamUtil.getAttributeValue(xmlStreamReader, "code", false, int.class);
      	} else {
    		code = XMLStreamUtil.getAttributeValue(xmlStreamReader, "id", false, int.class);
    	}
        String message = XMLStreamUtil.getAttributeValue(xmlStreamReader, "message", false);
        
        XMLStreamUtil.parseNextTag(xmlStreamReader, XMLStreamReader.END_ELEMENT, "UnsubscribeResponse");
        
        return new SDQLUnsubscribeResponse(code, message);
    }


    /* ----------------------------------------------------------------------------------------- */
    
    private SDQLInitialData readSDQLInitialDataResponse(XMLStreamReader xmlStreamReader) throws XMLStreamException {
    	XMLStreamUtil.parseNextTag(xmlStreamReader, XMLStreamReader.START_ELEMENT, "InitialData");
    	SDQLInitialData sdqlInitialData =  readSDQLInitialData(xmlStreamReader);
    	XMLStreamUtil.parseNextTag(xmlStreamReader, XMLStreamReader.END_ELEMENT, "GetNextInitialDataResponse");
    	return sdqlInitialData;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    private SDQLInitialData readSDQLInitialData(XMLStreamReader xmlStreamReader) throws XMLStreamException {
    	
        String batchId = XMLStreamUtil.getAttributeValue(xmlStreamReader, "batchId", false);
        int batchesLeft = XMLStreamUtil.getAttributeValue(xmlStreamReader, "batchesLeft", false, int.class);
        boolean dumpComplete = XMLStreamUtil.getAttributeValue(xmlStreamReader, "dumpComplete", false, boolean.class);
        
        List<Entity> entities = new ArrayList<Entity>();
        
        String entitiesTagName = "entities";
        XMLStreamUtil.parseNextTag(xmlStreamReader, XMLStreamReader.START_ELEMENT, entitiesTagName);
        
        while (true) {
            XMLStreamUtil.parseNextTag(xmlStreamReader);
            if (entitiesTagName.equals(xmlStreamReader.getLocalName()) && (xmlStreamReader.getEventType() == XMLStreamReader.END_ELEMENT))
                break;
            String sdqlEntityName = xmlStreamReader.getLocalName();
            Entity entity = newEntityBySDQLEntityName(sdqlEntityName);
            if (entity != null) {
                for (int i = 0; i != xmlStreamReader.getAttributeCount(); i++) {
                    String attributeName = xmlStreamReader.getAttributeLocalName(i);
                    String propertyName = toEntityPropertyName(entity.getClass(), attributeName);
                    if (propertyName == null)
                        continue;
                    String attributeValue = XMLStreamUtil.getAttributeValue(xmlStreamReader, attributeName, true);
                    Object propertyValue = toEntityPropertyValue(entity.getClass(), propertyName, attributeValue);
                    entity.setPropertyValue(propertyName, propertyValue);
                }
                entities.add(entity);
            }
            XMLStreamUtil.parseNextTag(xmlStreamReader, XMLStreamReader.END_ELEMENT, sdqlEntityName);
        }
        
        XMLStreamUtil.parseNextTag(xmlStreamReader, XMLStreamReader.END_ELEMENT, "InitialData");
        
        //_logger.info(CACHE_IGNORE_SDQL_ENTITY_NAME_SET);
        return new SDQLInitialData(batchId, batchesLeft, dumpComplete, entities);
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    private SDQLGetNextUpdateDataResponse readGetNextUpdateDataResponse(XMLStreamReader xmlStreamReader) throws XMLStreamException {
    	
    	SDQLGetNextUpdateDataResponse sdqlGetNextUpdateResponse = new SDQLGetNextUpdateDataResponse();
    	 while (true) {
             XMLStreamUtil.parseNextTag(xmlStreamReader);
             if ("GetNextUpdateDataResponse".equals(xmlStreamReader.getLocalName()) && xmlStreamReader.getEventType() == XMLStreamReader.END_ELEMENT)
                 break;
             if ("UpdateData".equals(xmlStreamReader.getLocalName())) {
                 SDQLUpdateData sdqlUpdateData = readSDQLUpdateData(xmlStreamReader, true);
                 sdqlGetNextUpdateResponse.add(sdqlUpdateData);
             }
    	 }
         return sdqlGetNextUpdateResponse;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    private SDQLUpdateData readSDQLUpdateData(XMLStreamReader xmlStreamReader, boolean isPullSubscription) throws XMLStreamException {
    
        long batchId = XMLStreamUtil.getAttributeValue(xmlStreamReader, "batchId", false, long.class);
        Date createdTime = XMLStreamUtil.getAttributeValue(xmlStreamReader, "createdTime", false, Date.class);
        List<EntityChange> entityChanges = new ArrayList<EntityChange>();
        
         while (true) {
            XMLStreamUtil.parseNextTag(xmlStreamReader);
            if ("UpdateData".equals(xmlStreamReader.getLocalName()) && xmlStreamReader.getEventType() == XMLStreamReader.END_ELEMENT)
                break;
            String sdqlEntityName = xmlStreamReader.getLocalName();
            Class<? extends Entity> entityClass = toEntityClass(sdqlEntityName);
            if (entityClass != null) {
                String changeType = XMLStreamUtil.getAttributeValue(xmlStreamReader, "type", false);
                if ("create".equals(changeType)) {
                    Entity entity = newEntityBySDQLEntityName(sdqlEntityName);
                    for (int i = 1; i != xmlStreamReader.getAttributeCount(); i++) {
                        String attributeName = xmlStreamReader.getAttributeLocalName(i);
                        String propertyName = toEntityPropertyName(entity.getClass(), attributeName);
                        if (propertyName == null)
                            continue;
                        String attributeValue = XMLStreamUtil.getAttributeValue(xmlStreamReader, attributeName, true);
                        Object propertyValue = toEntityPropertyValue(entity.getClass(), propertyName, attributeValue);
                        entity.setPropertyValue(propertyName, propertyValue);
                    }
                    entityChanges.add(new EntityCreate(entity));
                } else if ("update".equals(changeType)) {
                    long entityId = XMLStreamUtil.getAttributeValue(xmlStreamReader, "id", false, long.class);
                    List<String> propertyNames = new ArrayList<String>();
                    List<Object> propertyValues = new ArrayList<Object>();
                    for (int i = 2; i != xmlStreamReader.getAttributeCount(); i++) {
                        String attributeName = xmlStreamReader.getAttributeLocalName(i);
                        String propertyName = toEntityPropertyName(entityClass, attributeName);
                        if (propertyName == null)
                            continue;
                        String attributeValue = XMLStreamUtil.getAttributeValue(xmlStreamReader, attributeName, true);
                        Object propertyValue = toEntityPropertyValue(entityClass, propertyName, attributeValue);
                        propertyNames.add(propertyName);
                        propertyValues.add(propertyValue);
                    }
                    entityChanges.add(new EntityUpdate(entityClass, entityId, propertyNames, propertyValues));
                } else if ("delete".equals(changeType)) {
                    long entityId = XMLStreamUtil.getAttributeValue(xmlStreamReader, "id", false, long.class);
                    entityChanges.add(new EntityDelete(entityClass, entityId));
                } else {
                    throw new XMLStreamException("Unexcepted change type: " + changeType, xmlStreamReader.getLocation());
                }
            }
            if (isPullSubscription) {
            	XMLStreamUtil.parseNextTag(xmlStreamReader, XMLStreamReader.END_ELEMENT);
            } else {
            	XMLStreamUtil.parseNextTag(xmlStreamReader, XMLStreamReader.END_ELEMENT, sdqlEntityName);
            }
        }
        return new SDQLUpdateData(batchId, createdTime, entityChanges);
    }
        
    /* ----------------------------------------------------------------------------------------- */
    
    private SDQLPingRequest readSDQLPingRequest(XMLStreamReader xmlStreamReader) throws XMLStreamException {
    
        String id = XMLStreamUtil.getAttributeValue(xmlStreamReader, "id", false);
        
        XMLStreamUtil.parseNextTag(xmlStreamReader, XMLStreamReader.END_ELEMENT, "PingRequest");
        
        return new SDQLPingRequest(id);
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    private SDQLError readSDQLError(XMLStreamReader xmlStreamReader) throws XMLStreamException {
    
        int code = XMLStreamUtil.getAttributeValue(xmlStreamReader, "code", false, int.class);
        String message = XMLStreamUtil.getAttributeValue(xmlStreamReader, "message", false);
        
        XMLStreamUtil.parseNextTag(xmlStreamReader, XMLStreamReader.END_ELEMENT, "error");
        
        return new SDQLError(code, message);
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    private  Set<String> CACHE_IGNORE_SDQL_ENTITY_NAME_SET = new HashSet<String>();
    private  Map<String, Class<? extends Entity>> CACHE_SDQL_ENTITY_NAME_TO_ENTITY_CLASS_MAP = new HashMap<String, Class<? extends Entity>>();
    
    @SuppressWarnings("unchecked")
    private Class<? extends Entity> toEntityClass(String sdqlEntityName) {
    
        if (CACHE_IGNORE_SDQL_ENTITY_NAME_SET.contains(sdqlEntityName))
            return null;
        
        Class<? extends Entity> entityClass = CACHE_SDQL_ENTITY_NAME_TO_ENTITY_CLASS_MAP.get(sdqlEntityName);
        if (entityClass != null)
            return entityClass;
        
        try {
            entityClass = (Class<? extends Entity>) Class.forName(Entity.class.getPackage().getName() + "." + sdqlEntityName);
            CACHE_SDQL_ENTITY_NAME_TO_ENTITY_CLASS_MAP.put(sdqlEntityName, entityClass);
        } catch (ClassNotFoundException e) {
            _logger.info("SDQL Entity Name Not Found " + sdqlEntityName);
            CACHE_IGNORE_SDQL_ENTITY_NAME_SET.add(sdqlEntityName);
        }
        
        return entityClass;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    private Entity newEntityBySDQLEntityName(String sdqlEntityName) {
    
        Class<? extends Entity> entityClass = toEntityClass(sdqlEntityName);
        if (entityClass == null)
            return null;
        
        try {
            return entityClass.newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Unable to instantiate " + entityClass + ".", e);
        }
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    private Map<Class<? extends Entity>, Map<String, Boolean>> CACHE_ENTITY_CLASS_TO_SDQL_ATTRIBUTE_NAME_TO_IGNORE_MAP = new HashMap<Class<? extends Entity>, Map<String, Boolean>>();
    
    private String toEntityPropertyName(Class<? extends Entity> entityClass, String sdqlAttributeName) {
    
        Map<String, Boolean> sdqlAttributeNameToIgnoreMap = CACHE_ENTITY_CLASS_TO_SDQL_ATTRIBUTE_NAME_TO_IGNORE_MAP.get(entityClass);
        if (sdqlAttributeNameToIgnoreMap != null) {
            Boolean ignoreSDQLAttributeName = sdqlAttributeNameToIgnoreMap.get(sdqlAttributeName);
            if (ignoreSDQLAttributeName != null)
                return ignoreSDQLAttributeName.booleanValue() ? null : sdqlAttributeName;
        } else {
            sdqlAttributeNameToIgnoreMap = new HashMap<String, Boolean>();
            CACHE_ENTITY_CLASS_TO_SDQL_ATTRIBUTE_NAME_TO_IGNORE_MAP.put(entityClass, sdqlAttributeNameToIgnoreMap);
        }
        boolean ignoreSDQLAttributeName = !BeanUtil.getPropertyNames(entityClass).contains(sdqlAttributeName);
        sdqlAttributeNameToIgnoreMap.put(sdqlAttributeName, ignoreSDQLAttributeName);
        
        return ignoreSDQLAttributeName ? null : sdqlAttributeName;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    private Object toEntityPropertyValue(Class<? extends Entity> entityClass, String propertyName, String sdqlAttributeValue) {
    
        return StringUtil.parseValue(sdqlAttributeValue, BeanUtil.getPropertyDescriptor(entityClass, propertyName).getPropertyType());
    }
    
}