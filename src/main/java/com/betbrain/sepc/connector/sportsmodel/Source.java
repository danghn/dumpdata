package com.betbrain.sepc.connector.sportsmodel;

import java.util.Date;

/**
 * See the Sports Model documentation.
 * 
 * @author Morten Helles
 */
@javax.persistence.Entity
public class Source extends Entity {
    
    // --------------------------------------------------------------------------------------------
    // Class fields
    // --------------------------------------------------------------------------------------------
    
    private static final long serialVersionUID = 1L;
    
    public static final String PROPERTY_NAME_collectorId = "collectorId";
    public static final String PROPERTY_NAME_providerId = "providerId";
    public static final String PROPERTY_NAME_sourceKey = "sourceKey";
    public static final String PROPERTY_NAME_lastCollectedTime = "lastCollectedTime";
    public static final String PROPERTY_NAME_lastUpdatedTime = "lastUpdatedTime";
    
    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------
    
    private long _collectorId;
    private long _providerId;
    private String _sourceKey;
    private Date _lastCollectedTime;
    private Date _lastUpdatedTime;
    
    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------
    
    public Source() {
    
    }
    
    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------
    
    public long getCollectorId() {
    
        return _collectorId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setCollectorId(long collectorId) {
    
        _collectorId = collectorId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public long getProviderId() {
    
        return _providerId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setProviderId(long providerId) {
    
        _providerId = providerId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public String getSourceKey() {
    
        return _sourceKey;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setSourceKey(String sourceKey) {
    
        _sourceKey = sourceKey;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public Date getLastCollectedTime() {
    
        return _lastCollectedTime;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setLastCollectedTime(Date lastCollectedTime) {
    
        _lastCollectedTime = lastCollectedTime;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public Date getLastUpdatedTime() {
    
        return _lastUpdatedTime;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setLastUpdatedTime(Date lastUpdatedTime) {
    
        _lastUpdatedTime = lastUpdatedTime;
    }
    
    /* ----------------------------------------------------------------------------------------- */
}