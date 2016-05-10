package com.betbrain.sepc.connector.sdql;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.betbrain.sepc.connector.sportsmodel.Entity;

/**
 * SEPC Pull Connector This connector uses a Pull connection (HTTP - based)
 *
 */
public final class SEPCPullConnector extends SEPCConnector {
    
    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------
    
    private SEPCPullConnection _connection;
    private long _millisBetweenNextUpdateDataRequests = TimeUnit.MINUTES.toMillis(1);
    
    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------
    
    public SEPCPullConnector(String publisherAppHost, int publisherAppPort) {
    
        _connection = new SEPCPullConnection(publisherAppHost, publisherAppPort);
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public SEPCPullConnector(String publisherAppHost, int publisherAppPort, long requestTimeoutMillis) {
    
        _connection = new SEPCPullConnection(publisherAppHost, publisherAppPort, requestTimeoutMillis);
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    SEPCPullConnector(SEPCPullConnection sepcPullConnection) {
    
        this._connection = sepcPullConnection;
    }
    
    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------
    
    @Override
    protected void execute(String subscriptionName) {
    
        String subscriptionId = null;
        while (!connectorWasStopped()) {
            if (nextConnectorStep() == SEPCConnectorStep.GET_INITIAL_DATA) {
                try {
                    subscriptionId = sendSubscribeRequest(subscriptionName);
                    List<Entity> entities = sendGetNextInitialDataRequests(subscriptionId);
                    notifyInitialDump(entities);
                    setNextConnectorStep(SEPCConnectorStep.GET_UPDATE);
                } catch (Exception e) {
                    waitBeforeSendingSubscribeRequest();
                    setNextConnectorStep(SEPCConnectorStep.GET_INITIAL_DATA);
                }
            } else if (nextConnectorStep() == SEPCConnectorStep.GET_UPDATE) {
                try {
                    SDQLGetNextUpdateDataResponse nextUpdateDataResponse = sendGetNextUpdateDataRequest(subscriptionId);
                    notifyUpdate(nextUpdateDataResponse);
                    waitBeforeSendingGetNextUpdateDataRequest();
                } catch (Exception e) {
                    if (!shouldUpdateResume()) {
                        setNextConnectorStep(SEPCConnectorStep.GET_INITIAL_DATA);
                    } else {
                        setNextConnectorStep(SEPCConnectorStep.GET_UPDATE_RESUME);
                    }
                }
                
            } else if (nextConnectorStep() == SEPCConnectorStep.GET_UPDATE_RESUME) {
                try {
                    SDQLGetNextUpdateDataResponse nextUpdateDataResponse = sendGetNextUpdateDataResumeRequest(subscriptionId, subscriptionName);
                    notifyUpdate(nextUpdateDataResponse);
                    setNextConnectorStep(SEPCConnectorStep.GET_UPDATE);
                } catch (IOException e) {
                	waitBeforeSendingGetNextUpdateDataRequest();
                    setNextConnectorStep(SEPCConnectorStep.GET_UPDATE_RESUME);
                } catch (SDQLErrorException e1) {
                	setNextConnectorStep(SEPCConnectorStep.GET_INITIAL_DATA);
                }
            }
            
        }
        _logger.info("Connector stopped...unsubscribing");
        sendUnsubscribeRequest(subscriptionId, subscriptionName);
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setRequestTimeoutMilis(long requestTimeoutMillis) {
    
        _connection.setRequestTimeoutMillis(requestTimeoutMillis);
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setMillisBetweenNextUpdateRequests(long millisBetweenNextUpdateRequests) {
    
        _millisBetweenNextUpdateDataRequests = millisBetweenNextUpdateRequests;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setMillisBetweenSubscribeRequests(long millisBetweenSubscribeRequests) {
    
        _millisBetweenSubscribeRequests = millisBetweenSubscribeRequests;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    private void waitBeforeSendingGetNextUpdateDataRequest() {
    
        _logger.debug("Waiting before next Update Data Request...");
        try {
            Thread.sleep(_millisBetweenNextUpdateDataRequests);
        } catch (InterruptedException e) {
            _logger.error("Current connector thread was interrupted while waiting before next update...", e);
        }
        
    }


    /* ----------------------------------------------------------------------------------------- */
    
    private void sendUnsubscribeRequest(String subscriptionId, String subscriptionName) {
    
        try {
            _logger.info("Sending Unsubscribe Request...");
            _connection.requestUnsubscribe(subscriptionId, subscriptionName);
            _logger.info("Unsubscribed...");
        } catch (Exception e) {
            _logger.error("An error occurred while unsubscribing, subscriptionId: " + subscriptionId);
        }
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    private String sendSubscribeRequest(String subscriptionName) throws Exception {
    
        _logger.info("Sending Subscribe Request...Subscription name: " + subscriptionName);
        try {
            SDQLSubscribeResponse sdqlSubscribeResponse = _connection.requestSubscribe(subscriptionName);
            String _subscriptionId = sdqlSubscribeResponse.getSubscriptionId();
            _logger.info("The subscription is now set up...Subscription id is '" + _subscriptionId + "'.");
            return _subscriptionId;
        } catch (Exception e) {
            _logger.error("An error occurred while subscribing...", e);
            throw e;
        }
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    private List<Entity> sendGetNextInitialDataRequests(String subscriptionId) throws Exception {
    
        List<Entity> entities = new LinkedList<Entity>();
        try {
            _logger.info("Sending an Initial Data Request...");
            boolean dumpComplete = false;
            do {
                SDQLInitialData sdqlInitialData = _connection.requestInitialData(subscriptionId);
                _logger.info("Initial Data batch received...[" + sdqlInitialData.getEntities().size() + " entities, last batch id: " + sdqlInitialData.getBatchId() + "]");
                entities.addAll(sdqlInitialData.getEntities());
                dumpComplete = sdqlInitialData.getDumpComplete();
            } while (!(connectorWasStopped() || dumpComplete));
            _logger.info("Initial Data received... [" + entities.size() + " entities]");
        } catch (Exception e) {
            _logger.error("An error occurred while requesting initial data...", e);
            throw e;
        }
        return entities;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    private SDQLGetNextUpdateDataResponse sendGetNextUpdateDataRequest(String subscriptionId) throws Exception {
    
        SDQLGetNextUpdateDataResponse sdqlUpdateDataResponse = null;
        try {
            _logger.info("Sending an Update Data Request...");
            sdqlUpdateDataResponse = _connection.requestUpdateData(subscriptionId);
            _logger.info("Update Data received..." + sdqlUpdateDataResponse);
        } catch (Exception e) {
            _logger.error("An error occurred while requesting update data...", e);
            throw e;
        }
        return sdqlUpdateDataResponse;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    private SDQLGetNextUpdateDataResponse sendGetNextUpdateDataResumeRequest(String subscriptionId, String subscriptionName) throws IOException, SDQLErrorException {
    
        EntityChangeBatchProcessingMonitor entityChangeBatchProcessingMonitor = getEntityChangeBatchProcessingMonitor();
        SDQLGetNextUpdateDataResponse sdqlUpdateDataResponse = null;
        try {
            _logger.info("Sending an Update Resume Request...");
            sdqlUpdateDataResponse = _connection.requestResumeUpdateData(subscriptionId, subscriptionName, entityChangeBatchProcessingMonitor.getLastAppliedEntityChangeBatchId());
            _logger.info("Update Data received..." + sdqlUpdateDataResponse);
        } catch (IOException e) {
        	_logger.error("An error occurred while requesting update resume data...", e);
            throw e;
        } catch (SDQLErrorException e) {
            _logger.error("An error was received as a response to resume data request...", e);
            throw e;
        }
        return sdqlUpdateDataResponse;
    }
    
}
