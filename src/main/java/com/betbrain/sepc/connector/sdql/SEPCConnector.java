package com.betbrain.sepc.connector.sdql;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

import com.betbrain.sepc.connector.sportsmodel.Entity;
import com.betbrain.sepc.connector.sportsmodel.EntityChangeBatch;

/**
 * Base class for SEPC Connectors 
 * This class is not thread safe
 *
 */
public abstract class SEPCConnector {
    
    // --------------------------------------------------------------------------------------------
    // Class fields
    // --------------------------------------------------------------------------------------------
    
    protected final Logger _logger = Logger.getLogger(this.getClass());
    
    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------
    
    private EntityChangeBatchProcessingMonitor _entityChangeBatchProcessingMonitor;
    private List<SEPCConnectorListener> _connectorListeners = new ArrayList<SEPCConnectorListener>();
    private BackgroundThread _backgroundThread;
    
    private volatile SEPCConnectorStep _sepcConnectorStep = SEPCConnectorStep.GET_INITIAL_DATA;
    private volatile boolean _stopped = false;
    protected long _millisBetweenSubscribeRequests = TimeUnit.MINUTES.toMillis(1);
    
    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------
    
    public SEPCConnector() {
    
    }
    
    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------
    
    /**
     * Execute the sequence of calls to the SEPC publisher app.
     * The implementation of this method is not thread safe.
     * The connector must be stopped between subsequent calls to this method.
     */
    protected abstract void execute(String subscriptionName);
    
    /* ----------------------------------------------------------------------------------------- */
    
    /**
     * Start the connector workflow
     * The connector workflow executes the necessary requests to retrieve data from the SEPC app 
     * (e.g. subscribe, get initial data, get updates)
     * @param subscriptionName
     */
    public void start(String subscriptionName) {
    
        if (_logger.isInfoEnabled())
            _logger.info("Starting connector...");
        
        if (_logger.isInfoEnabled())
            _logger.info("Starting connector background thread...");
        _backgroundThread = new BackgroundThread(subscriptionName);
        _backgroundThread.start();
        
        if (_logger.isInfoEnabled())
            _logger.info("Connector Started...");
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    /**
     * Stop the connector workflow execution
     */
    public void stop() {
    
        if (_logger.isInfoEnabled())
            _logger.info("Stopping connector...");
        setStopConnector();
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    /**
     * Get the current connector execution workflow step
     * @return
     */
    public SEPCConnectorStep nextConnectorStep() {
    
        return _sepcConnectorStep;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    /**
     * Set the EntityChangeBatchProcessingMonitor for this connector.
     * The EntityChangeBatchProcessingMonitor is responsible for handling the last batch id obtained as a result of an update request
     * The EntityChangeBatchProcessingMonitor is not mandatory, 
     * it must be set for the connector to be able to execute update resume requests when it is the case.
     * @param entityChangeBatchProcessingStatus
     */
    public void setEntityChangeBatchProcessingMonitor(EntityChangeBatchProcessingMonitor entityChangeBatchProcessingStatus) {
    
        _entityChangeBatchProcessingMonitor = entityChangeBatchProcessingStatus;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setConnectorListeners(List<SEPCConnectorListener> sepcConnectorListeners) {
    
        _connectorListeners = sepcConnectorListeners;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void addConnectorListener(SEPCConnectorListener listener) {
    
        _connectorListeners.add(listener);
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public boolean connectorWasStopped() {
    
        return _stopped;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    protected EntityChangeBatchProcessingMonitor getEntityChangeBatchProcessingMonitor() {
    
        return _entityChangeBatchProcessingMonitor;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    protected List<SEPCConnectorListener> getConnectorListeners() {
    
        return _connectorListeners;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    protected void setNextConnectorStep(SEPCConnectorStep sepcConnectorStep) {
    
        this._sepcConnectorStep = sepcConnectorStep;
        
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    protected <T extends Entity> void notifyInitialDump(List<T> entities) {
    
        for (SEPCConnectorListener listener : _connectorListeners) {
            listener.notifyInitialDump(entities);
        }
        
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    protected void notifyUpdate(SDQLGetNextUpdateDataResponse sdqlGetNextUpdateDataResponse) {
    
        for (SDQLUpdateData sdqlUpdateData : sdqlGetNextUpdateDataResponse.getSDQLUpdateDataList()) {
            notifyUpdate(sdqlUpdateData);
        }
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    protected void notifyUpdate(SDQLUpdateData sdqlUpdateData) {
    
        EntityChangeBatch entityChangeBatch = new EntityChangeBatch(sdqlUpdateData.getBatchId(), sdqlUpdateData.getCreatedTime(), sdqlUpdateData.getEntityChanges());
        
        for (SEPCConnectorListener listener : _connectorListeners) {
            try {
                listener.notifyEntityUpdates(entityChangeBatch);
            } catch (Throwable e) {
                _logger.error("An error occured in batch " + entityChangeBatch.getId() + " when notifing listener: " + listener, e);
            }
        }
        
    }
    
    protected void setStopConnector() {
    
        this._stopped = true;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    protected boolean shouldUpdateResume() {
    
        boolean updateResume = getEntityChangeBatchProcessingMonitor() != null;
        _logger.info("Checking condition for update resume: " + (updateResume ? "yes" : "entity change batch processor not set, could not retrieve last batch id for update resume"));
        return updateResume;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    protected void waitBeforeSendingSubscribeRequest() {
    
        _logger.debug("Waiting before next Subscribe Request...");
        try {
            Thread.sleep(_millisBetweenSubscribeRequests);
        } catch (InterruptedException e) {
            _logger.error("Current connector thread was interrupted while waiting before subscribe...", e);
        }
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    //only for tests, access default-package
    BackgroundThread getBackgroundThread() {
    
        return _backgroundThread;
    }
    
    // --------------------------------------------------------------------------------------------
    // Inner class
    // --------------------------------------------------------------------------------------------
    
    class BackgroundThread extends Thread {
        
        // --------------------------------------------------------------------------------------------
        // Instance fields
        // --------------------------------------------------------------------------------------------
        private String _subscriptionName;
        
        // ----------------------------------------------------------------------------------------
        // Instance methods
        // ----------------------------------------------------------------------------------------
        public BackgroundThread(String subscriptionName) {
        
            this._subscriptionName = subscriptionName;
        }
        
        @Override
        public void run() {
        
            try {
                execute(_subscriptionName);
            } catch (Throwable e) {
                _logger.error("An error occured in the backgroundThread of SEPCConnector", e);
            }
            
        }
        
    }
    
}
