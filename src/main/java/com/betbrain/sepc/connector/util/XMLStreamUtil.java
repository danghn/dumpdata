package com.betbrain.sepc.connector.util;

import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

/**
 * Provides various utility methods for XML streaming. 
 * 
 * @author Morten Helles
 */
public class XMLStreamUtil {

    // --------------------------------------------------------------------------------------------
    // Class methods
    // --------------------------------------------------------------------------------------------

    public static void parseNextTag(XMLStreamReader xmlStreamReader) throws XMLStreamException {
        
        xmlStreamReader.nextTag();
    }

    /* ----------------------------------------------------------------------------------------- */
    
    public static void parseNextTag(XMLStreamReader xmlStreamReader, int eventType) throws XMLStreamException {

        parseNextTag(xmlStreamReader);

        if (xmlStreamReader.getEventType() != eventType)
            throw new XMLStreamException("Unexpected event type: " + xmlStreamReader.getEventType() + " (Expected " + eventType + ")", xmlStreamReader.getLocation());
    }

    /* ----------------------------------------------------------------------------------------- */
    
    public static void parseNextTag(XMLStreamReader xmlStreamReader, int eventType, String localName) throws XMLStreamException {

        parseNextTag(xmlStreamReader, eventType);
        
        if (!xmlStreamReader.getLocalName().equals(localName))
            throw new XMLStreamException("Unexpected tag local name: '" + xmlStreamReader.getLocalName() + "' (Expected '" + localName + "')", xmlStreamReader.getLocation());
    }

    /* ----------------------------------------------------------------------------------------- */

    public static String getAttributeValue(XMLStreamReader xmlStreamReader, String attributeName, boolean allowNull) throws XMLStreamException {

        String attributeValue = xmlStreamReader.getAttributeValue(null, attributeName);
        if (attributeValue == null)
            throw new XMLStreamException("No attribute named '" + attributeName + "'.", xmlStreamReader.getLocation());
        if (!allowNull && attributeValue.isEmpty())
            throw new XMLStreamException("Attribute value is empty.", xmlStreamReader.getLocation());
        
        return attributeValue.isEmpty() ? null : attributeValue;
    }

    /* ----------------------------------------------------------------------------------------- */

    public static <T> T getAttributeValue(XMLStreamReader xmlStreamReader, String attributeName, boolean allowNull, Class<T> returnType) throws XMLStreamException {

        String attributeValueAsString = getAttributeValue(xmlStreamReader, attributeName, allowNull);
        if (attributeValueAsString == null)
            return null;

        return StringUtil.parseValue(attributeValueAsString, returnType);
    }
    
    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------
    
    /**
     * Cannot be instantiated.
     */
    private XMLStreamUtil() {
        
    }
    
    /* ----------------------------------------------------------------------------------------- */
}