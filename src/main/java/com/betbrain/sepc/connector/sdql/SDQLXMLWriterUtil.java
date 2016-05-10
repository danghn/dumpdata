package com.betbrain.sepc.connector.sdql;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

/**
 * A utility class for writing SDQL constructs to an input stream.
 * 
 * @author Morten Helles
 */
class SDQLXMLWriterUtil {

    // --------------------------------------------------------------------------------------------
    // Test methods
    // --------------------------------------------------------------------------------------------

    public static final void main(String[] args) throws Exception {

        SDQLConstruct sqdlConstruct = new SDQLPingResponse("99");
        
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(baos);
        writePDU(bos, sqdlConstruct);
        System.out.println(baos.toByteArray().length);
        System.out.println(new String(baos.toByteArray(), SDQLXMLConstants.XML_ENCODING));
    }
    
    // --------------------------------------------------------------------------------------------
    // Class fields
    // --------------------------------------------------------------------------------------------
    
    private static XMLOutputFactory _xmlOutputFactory = XMLOutputFactory.newInstance();

    // --------------------------------------------------------------------------------------------
    // Class methods
    // --------------------------------------------------------------------------------------------

    /**
     * Writes the specified SDQL construct, wrapped in a protocol data unit (PDU), to the specified
     * output stream. 
     *
     * @param os the output stream to write to.
     * @param sdqlConstruct the SQDL construct to write.
     * @throws IOException if an i/o exception occurs.
     * @throws XMLStreamException if a fatal XML streaming exception occurs.
     */
    public static void writePDU(OutputStream os, SDQLConstruct sdqlConstruct) throws IOException, XMLStreamException {

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        GZIPOutputStream gzipos = new GZIPOutputStream(baos);

        write(gzipos, sdqlConstruct);
        gzipos.close();

        byte[] sqdlConstructAsGzippedBytes = baos.toByteArray();
        byte[] sqdlConstructLengthBytes = Integer.toString(sqdlConstructAsGzippedBytes.length).getBytes(SDQLXMLConstants.XML_ENCODING);
        
        os.write(sqdlConstructLengthBytes);
        os.write(0);
        os.write(sqdlConstructAsGzippedBytes);
        os.flush();
    }

    /* ----------------------------------------------------------------------------------------- */

    /**
     * Writes the specified SDQL construct to the specified output stream. 
     *
     * @param os the output stream to write to.
     * @param sdqlConstruct the SQDL construct to write.
     * @throws IOException if an i/o exception occurs.
     * @throws XMLStreamException if a fatal XML streaming exception occurs.
     */
    public static void write(OutputStream os, SDQLConstruct sdqlConstruct) throws IOException, XMLStreamException {
        
        XMLStreamWriter xmlStreamWriter = _xmlOutputFactory.createXMLStreamWriter(os, SDQLXMLConstants.XML_ENCODING);
        xmlStreamWriter.writeStartDocument(SDQLXMLConstants.XML_ENCODING, SDQLXMLConstants.XML_VERSION);
        xmlStreamWriter.writeStartElement(SDQLXMLConstants.ROOT_TAG_NAME);

        if (sdqlConstruct instanceof SDQLSubscribeRequest)
            write(xmlStreamWriter, (SDQLSubscribeRequest) sdqlConstruct);
        else if (sdqlConstruct instanceof SDQLUpdateDataResumeRequest)
            write(xmlStreamWriter, (SDQLUpdateDataResumeRequest) sdqlConstruct);
        else if (sdqlConstruct instanceof SDQLUnsubscribeRequest)
            write(xmlStreamWriter, (SDQLUnsubscribeRequest) sdqlConstruct);
        else if (sdqlConstruct instanceof SDQLPingResponse)
            write(xmlStreamWriter, (SDQLPingResponse) sdqlConstruct);
        else
            throw new XMLStreamException("Unknown SDQL construct type: " + sdqlConstruct);
        
        xmlStreamWriter.writeEndElement();
        xmlStreamWriter.writeEndDocument();
        xmlStreamWriter.flush();
        xmlStreamWriter.close();
    }

    /* ----------------------------------------------------------------------------------------- */

    private static void write(XMLStreamWriter xmlStreamWriter, SDQLSubscribeRequest sdqlSubscribeRequest) throws XMLStreamException {

        xmlStreamWriter.writeEmptyElement("SubscribeRequest");
        xmlStreamWriter.writeAttribute("subscriptionSpecificationName", sdqlSubscribeRequest.getSubscriptionSpecificationName());
    }

    /* ----------------------------------------------------------------------------------------- */

    private static void write(XMLStreamWriter xmlStreamWriter, SDQLUpdateDataResumeRequest sdqlUpdateDataResumeRequest) throws XMLStreamException {

        xmlStreamWriter.writeEmptyElement("UpdateDataResumeRequest");
        xmlStreamWriter.writeAttribute("subscriptionSpecificationName", sdqlUpdateDataResumeRequest.getSubscriptionSpecificationName());
        xmlStreamWriter.writeAttribute("subscriptionId", sdqlUpdateDataResumeRequest.getSubscriptionId());
        xmlStreamWriter.writeAttribute("lastBatchId", Long.toString(sdqlUpdateDataResumeRequest.getLastBatchId()));
    }

    /* ----------------------------------------------------------------------------------------- */
    
    private static void write(XMLStreamWriter xmlStreamWriter, SDQLUnsubscribeRequest sdqlUnsubscribeRequest) throws XMLStreamException {

        xmlStreamWriter.writeEmptyElement("UnsubscribeRequest");
        xmlStreamWriter.writeAttribute("subscriptionSpecificationName", sdqlUnsubscribeRequest.getSubscriptionSpecificationName());
        xmlStreamWriter.writeAttribute("subscriptionId", sdqlUnsubscribeRequest.getSubscriptionId());
    }

    /* ----------------------------------------------------------------------------------------- */
    
    private static void write(XMLStreamWriter xmlStreamWriter, SDQLPingResponse sdqlPingResponse) throws XMLStreamException {

        xmlStreamWriter.writeEmptyElement("PingResponse");
        xmlStreamWriter.writeAttribute("id", sdqlPingResponse.getId());
    }

    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------

    /**
     * Disallow instantiation.
     */
    private SDQLXMLWriterUtil() {
        
    }
    
    /* ----------------------------------------------------------------------------------------- */
}