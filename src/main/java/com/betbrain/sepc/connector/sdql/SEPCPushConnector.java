package com.betbrain.sepc.connector.sdql;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.betbrain.sepc.connector.sportsmodel.Entity;

/**
 * SEPC Push Connector This connector uses a Push connection (Socket - based)
 *
 */
public final class SEPCPushConnector extends SEPCConnector {
    
    public static void main(String[] args) {
    
        new SEPCPushConnector("10.0.10.53", 7000).execute("irinatest");
    }
    
    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------
    
    private volatile boolean _connected;
    private volatile SEPCPushConnection _connection;
    
    private volatile long _lastActivityFromServerTimestamp;
    private ServerActivityMonitor _serverActivityMonitor;
    
    private long _timeBeforeConnectionAttemptInMs = TimeUnit.MINUTES.toMillis(1L);
    
    private long _timeBetweenServerActivityChecks = TimeUnit.SECONDS.toMillis(5L);
    private long _maxTimeBetweenMessagesReceivedFromServer = TimeUnit.SECONDS.toMillis(60L);
    
    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------
    
    public SEPCPushConnector(String publisherAppHost, int publisherAppPort) {
    
        this._connection = new SEPCPushConnection(publisherAppHost, publisherAppPort);
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    SEPCPushConnector(SEPCPushConnection pushConnection) {
    
        this._connection = pushConnection;
    }
    
    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------
    
    public void setTimeBeforeConnectionAttemptInMs(long timeBeforeReconnectionAttemptInMs) {
    
        this._timeBeforeConnectionAttemptInMs = timeBeforeReconnectionAttemptInMs;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public long getTimeBeforeConnectionAttemptInMs() {
    
        return this._timeBeforeConnectionAttemptInMs;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    @Override
    public void start(String subscriptionName) {
    
        super.start(subscriptionName);
        
        _serverActivityMonitor = new ServerActivityMonitor();
        _serverActivityMonitor.setName("ServerActivityMonitor");
        _serverActivityMonitor.start();
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    @Override
    public void stop() {
    
        _serverActivityMonitor.interrupt();
        super.stop();
        
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    @Override
    protected void execute(String subscriptionName) {
    
        String subscriptionId = null;
        while (!connectorWasStopped()) {
            
            SEPCConnectorStep connectorStep = nextConnectorStep();
            
            if (SEPCConnectorStep.GET_INITIAL_DATA == connectorStep || SEPCConnectorStep.GET_UPDATE_RESUME == connectorStep) {
                _connected = tryToConnectIfNotStopped();
                if (!_connected) {
                    return;
                }
            }
            
            if (nextConnectorStep() == SEPCConnectorStep.GET_INITIAL_DATA) {
                
                try {
                    subscriptionId = sendSubscribeRequest(subscriptionName);
                    List<Entity> entities = readInitialData();
                    notifyInitialDump(entities);
                    setNextConnectorStep(SEPCConnectorStep.GET_UPDATE);
                } catch (Exception e) {
                    _logger.warn("", e);
                    disconnect();
                    waitBeforeSendingSubscribeRequest();
                }
                
            } else if (nextConnectorStep() == SEPCConnectorStep.GET_UPDATE) {
                try {
                    SDQLUpdateData sdqlUpdateData = readUpdateData();
                    if (sdqlUpdateData != null) {
                        notifyUpdate(sdqlUpdateData);
                    }
                } catch (Exception e) {
                    _logger.warn("", e);
                    disconnect();
                    if (shouldUpdateResume()) {
                        setNextConnectorStep(SEPCConnectorStep.GET_UPDATE_RESUME);
                    } else {
                        setNextConnectorStep(SEPCConnectorStep.GET_INITIAL_DATA);
                    }
                }
                
            } else if (nextConnectorStep() == SEPCConnectorStep.GET_UPDATE_RESUME) {
                try {
                    SDQLUpdateData sdqlUpdateData = sendGetNextUpdateDataResumeRequest(subscriptionName, subscriptionId);
                    if (sdqlUpdateData != null) {
                        notifyUpdate(sdqlUpdateData);
                    }
                    setNextConnectorStep(SEPCConnectorStep.GET_UPDATE);
                } catch (IOException e) {
                    setNextConnectorStep(SEPCConnectorStep.GET_UPDATE_RESUME);
                } catch (Exception e1) {
                    _logger.warn("", e1);
                    disconnect();
                    setNextConnectorStep(SEPCConnectorStep.GET_INITIAL_DATA);
                }
            }
            
        }
        _logger.info("Connector stopped...unsubscribing...");
        sendUnsubscribeRequest(subscriptionName, subscriptionId);
        disconnect();
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    private String sendSubscribeRequest(String subscriptionName) throws IOException, SDQLErrorException {
    
        String errorMessage = "An error occurred while subscribing..";
        try {
            _logger.info("Sending a Subscribe Request...");
            writeSDQLConstruct(new SDQLSubscribeRequest(subscriptionName));
            _logger.info("Waiting for the Subscribe Response...");
            SDQLSubscribeResponse sqdlSubscribeResponse = tryReadExpectedSdqlConstructIfNotStopped(SDQLSubscribeResponse.class);
            String subscriptionId = sqdlSubscribeResponse.getSubscriptionId();
            _logger.info("The subscription is now set up. The subscription id is '" + subscriptionId + "'.");
            return subscriptionId;
        } catch (IOException e) {
            _logger.error(errorMessage, e);
            throw e;
        } catch (SDQLErrorException e) {
            _logger.error(errorMessage, e);
            throw e;
        }
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    private void sendUnsubscribeRequest(String subscriptionName, String subscriptionId) {
    
        try {
            _logger.info("Sending an Unsubscribe Request...");
            writeSDQLConstruct(new SDQLUnsubscribeRequest(subscriptionName, subscriptionId));
        } catch (Exception e2) {}
        _logger.info("Unsubscribed...");
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    private List<Entity> readInitialData() throws IOException, SDQLErrorException {
    
        String errorMessage = "An error occurred while reading initial data...";
        List<Entity> entities = new LinkedList<Entity>();
        try {
            _logger.info("Reading Initial Data...");
            boolean dumpComplete = false;
            do {
                _logger.info("Reading Initial Data batch...");
                SDQLInitialData sdqlInitialData = tryReadExpectedSdqlConstructIfNotStopped(SDQLInitialData.class);
                if (sdqlInitialData != null) {
                    _logger.info("Read batch [" + sdqlInitialData.getBatchId() + "] containing " + sdqlInitialData.getEntities().size() + " entities. [" + sdqlInitialData.getBatchesLeft() + " batches left]");
                    entities.addAll(sdqlInitialData.getEntities());
                    dumpComplete = sdqlInitialData.getDumpComplete();
                }
            } while (!(connectorWasStopped() || dumpComplete));
            _logger.info("Read initial data. [" + entities.size() + " entities]");
        } catch (IOException e) {
            _logger.error(errorMessage, e);
            throw e;
        } catch (SDQLErrorException e) {
            _logger.error(errorMessage, e);
            throw e;
        }
        return entities;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    private SDQLUpdateData readUpdateData() throws IOException, SDQLErrorException {
    
        String errorMessage = "An error occurred while reading update data...";
        SDQLUpdateData sdqlUpdateData = null;
        try {
            _logger.debug("Reading update data..");
            sdqlUpdateData = tryReadExpectedSdqlConstructIfNotStopped(SDQLUpdateData.class);
            _logger.debug("Update data read..." + sdqlUpdateData);
        } catch (IOException e) {
            _logger.error(errorMessage, e);
            throw e;
        } catch (SDQLErrorException e) {
            _logger.error(errorMessage, e);
            throw e;
        }
        return sdqlUpdateData;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    private SDQLUpdateData sendGetNextUpdateDataResumeRequest(String subscriptionName, String subscriptionId) throws IOException, SDQLErrorException {
    
        String errorMessage = "An error occurred while sending update resume request";
        try {
            long lastBatchId = getEntityChangeBatchProcessingMonitor().getLastAppliedEntityChangeBatchId();
            _logger.info("Sending an Update-Resume Request...last batch id was..." + lastBatchId);
            writeSDQLConstruct(new SDQLUpdateDataResumeRequest(subscriptionName, subscriptionId, lastBatchId));
            _logger.info("Reading Update Data...");
            SDQLUpdateData sdqlUpdateData = tryReadExpectedSdqlConstructIfNotStopped(SDQLUpdateData.class);
            _logger.info("Update data read..." + sdqlUpdateData);
            return sdqlUpdateData;
        } catch (IOException e) {
            _logger.error(errorMessage, e);
            throw e;
        } catch (SDQLErrorException e) {
            _logger.error(errorMessage, e);
            throw e;
        }
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    private boolean tryToConnectIfNotStopped() {
    
        _logger.info("Trying to connect to SEPC Publisher app...");
        while (!connectorWasStopped()) {
            try {
                _connection.connect();
                _logger.info("Connected...");
                _lastActivityFromServerTimestamp = System.currentTimeMillis();
                return true;
            } catch (IOException e) {
                _logger.error("Failed to connect..." + e.getMessage(), e);
                _logger.info("Waiting before reconnecting (ms)..." + getTimeBeforeConnectionAttemptInMs());
                try {
                    Thread.sleep(getTimeBeforeConnectionAttemptInMs());
                } catch (InterruptedException e1) {
                    _logger.error("An error occurred while waiting to reconnect...", e1);
                }
            }
        }
        return false;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    private void disconnect() {
    
        try {
            _logger.info("Disconnecting...");
            _connection.disconnect();
            _connected = false;
            _logger.info("Disconnected...");
        } catch (IOException e2) {
            _logger.error("Failed disconnect...", e2);
        }
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    /**
     * Reads an SDQL construct of a specific type form the socket
     * At least one read attempt is done
     * The read operation is retried as long as the connector is not stopped.
     *  
     * @param sdqlConstructClass expected SDQL construct type to be read
     * @return SDQLConstruct 
     * May return null if the expected data was not read and the connector was stopped
     * 
     * @throws IOException
     * @throws SDQLErrorException
     */
    @SuppressWarnings("unchecked")
    private <T extends SDQLConstruct> T tryReadExpectedSdqlConstructIfNotStopped(Class<T> sdqlConstructClass) throws IOException, SDQLErrorException {
    
        do {
            _logger.trace("Waiting to read SDQL construct...");
            
            SDQLConstruct sdqlConstruct = _connection.read();
            
            _logger.trace("Read SDQL construct: " + sdqlConstruct);
            
            if (sdqlConstruct instanceof SDQLPingRequest) {
                SDQLPingRequest sdqlPingRequest = (SDQLPingRequest) sdqlConstruct;
                writeSDQLConstruct(new SDQLPingResponse(sdqlPingRequest.getId()));
                continue;
            }
            
            if (sdqlConstruct instanceof SDQLError) {
                SDQLError sdqlError = (SDQLError) sdqlConstruct;
                throw new SDQLErrorException(sdqlError);
            }
            
            if (!sdqlConstructClass.isInstance(sdqlConstruct))
                throw new IOException("Read unexpected SDQL construct: " + sdqlConstruct);
            
            _lastActivityFromServerTimestamp = System.currentTimeMillis();
            return (T) sdqlConstruct;
        } while (!connectorWasStopped());
        return null;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    private void writeSDQLConstruct(SDQLConstruct sdqlConstruct) throws IOException {
    
        if (_logger.isTraceEnabled())
            _logger.trace("Writing SDQL construct...");
        
        _connection.write(sdqlConstruct);
        
        if (_logger.isTraceEnabled())
            _logger.trace("Wrote SDQL construct...");
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    private class ServerActivityMonitor extends Thread {
        
        @Override
        public void run() {
        
            _logger.info("ServerActivityMonitor started.");
            
            while (!connectorWasStopped()) {
                try {
                    long time = System.currentTimeMillis();
                    if (_connected && (time - _lastActivityFromServerTimestamp) > _maxTimeBetweenMessagesReceivedFromServer) {
                        _logger.info("No activity from server in the last " + (time - _lastActivityFromServerTimestamp) + " ms.");
                        
                        disconnect();
                    }
                    Thread.sleep(_timeBetweenServerActivityChecks);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    _logger.warn("Unexpected interruption during server activity checkup. Exiting ...");
                    break;
                } catch (Throwable t) {
                    _logger.error("Unexpected exception during server activity checkup. Exiting ...", t);
                }
            }
            _logger.info("ServerActivityMonitor stopped.");
        }
    }
}