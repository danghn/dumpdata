package com.betbrain.sepc.connector.sdql;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamException;

/**
 * SEPC Push Connection (Socket-Based).
 * 
 * @author Morten Helles
 */
class SEPCPushConnection {
    
    // --------------------------------------------------------------------------------------------
    // Class methods
    // --------------------------------------------------------------------------------------------
    
    public static final void main(String[] args) throws Exception {
    
        SEPCPushConnection connection = new SEPCPushConnection("10.0.1.213", 7000);
        connection.connect();
        connection.write(new SDQLSubscribeRequest("SEQC-lite"));
        for (int i = 0; i != 10; i++)
            System.out.println(connection.read());
    }
    
    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------
    
    private String _publisherAppHost;
    private int _publisherAppPort;
    
    private List<PushConnectionListener> _listeners = new ArrayList<PushConnectionListener>();
    
    private Socket _socket = null;
    private BufferedInputStream _bis;
    private BufferedOutputStream _bos;
    private SDQLXMLReaderUtil _sdqlxmlReaderUtil;
    
    private final int DEFAULT_SOCKET_TIMEOUT = 90 * 1000;
    
    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------
    
    /**
     * Default constructor.
     * 
     * @param publisherAppHost the host name (or IP address) of the publisherAppApp to connect to.
     * @param publisherAppPort the port number of the publisherAppApp to connect to.
     */
    public SEPCPushConnection(String publisherAppHost, int publisherAppPort) {
    
        _publisherAppHost = publisherAppHost;
        _publisherAppPort = publisherAppPort;
        _sdqlxmlReaderUtil = new SDQLXMLReaderUtil();
    }
    
    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------
    
    public void addListener(PushConnectionListener listener) {
    
        _listeners.add(listener);
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void removeListener(PushConnectionListener listener) {
    
        _listeners.remove(listener);
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void connect() throws IOException {
    
        connect(DEFAULT_SOCKET_TIMEOUT);
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void connect(int timeoutInMs) throws IOException {
    
        for (PushConnectionListener listener : _listeners)
            listener.connecting();
        
        try {
            _socket = new Socket(_publisherAppHost, _publisherAppPort);
            _socket.setSoTimeout(timeoutInMs);
            _bis = new BufferedInputStream(_socket.getInputStream());
            _bos = new BufferedOutputStream(_socket.getOutputStream());
        } catch (Throwable t) {
            for (PushConnectionListener listener : _listeners)
                listener.connectFailure(t);
            if (t instanceof IOException)
                throw (IOException) t;
            throw new RuntimeException(t);
        }
        
        for (PushConnectionListener listener : _listeners)
            listener.connected();
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void disconnect() throws IOException {
    
        for (PushConnectionListener listener : _listeners)
            listener.disconnecting();
        
        try {
            if (_socket != null)
                _socket.close();
        } catch (Throwable t) {
            for (PushConnectionListener listener : _listeners)
                listener.disconnectFailure(t);
            if (t instanceof IOException)
                throw (IOException) t;
            throw new RuntimeException(t);
        }
        
        for (PushConnectionListener listener : _listeners)
            listener.disconnected();
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public SDQLConstruct read() throws IOException {
    
        synchronized (_bis) {
            
            for (PushConnectionListener listener : _listeners)
                listener.reading();
            
            try {
                SDQLConstruct sdqlConstruct = _sdqlxmlReaderUtil.readPDUFromPushStream(_bis);
                for (PushConnectionListener listener : _listeners)
                    listener.read(sdqlConstruct);
                return sdqlConstruct;
            } catch (Throwable t) {
                for (PushConnectionListener listener : _listeners)
                    listener.readFailure(t);
                if (t instanceof IOException)
                    throw (IOException) t;
                if (t instanceof XMLStreamException)
                    throw new IOException(t);
                throw new RuntimeException(t);
            }
        }
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void write(SDQLConstruct sdqlConstruct) throws IOException {
    
        synchronized (_bos) {
            
            for (PushConnectionListener listener : _listeners)
                listener.writing(sdqlConstruct);
            
            try {
                SDQLXMLWriterUtil.writePDU(_bos, sdqlConstruct);
                for (PushConnectionListener listener : _listeners)
                    listener.wrote(sdqlConstruct);
            } catch (Throwable t) {
                for (PushConnectionListener listener : _listeners)
                    listener.writeFailure(t, sdqlConstruct);
                if (t instanceof IOException)
                    throw (IOException) t;
                if (t instanceof XMLStreamException)
                    throw new IOException(t);
                throw new RuntimeException(t);
            }
        }
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public String toString() {
    
        StringBuffer sb = new StringBuffer();
        sb.append(getClass().getSimpleName());
        sb.append("(publisherAppHost=");
        sb.append(_publisherAppHost);
        sb.append(",publisherAppPort=");
        sb.append(_publisherAppPort);
        sb.append(")");
        
        return sb.toString();
    }
    
    /* ----------------------------------------------------------------------------------------- */
}