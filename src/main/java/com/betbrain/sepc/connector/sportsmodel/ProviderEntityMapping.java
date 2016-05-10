package com.betbrain.sepc.connector.sportsmodel;

/**
* See the Sports Model documentation.
* 
* @author Morten Helles
*/
@javax.persistence.Entity
public class ProviderEntityMapping extends Entity {
    
    // --------------------------------------------------------------------------------------------
    // Class fields
    // --------------------------------------------------------------------------------------------
    
    private static final long serialVersionUID = 2L;
    
    public static final String PROPERTY_NAME_providerId = "providerId";
    public static final String PROPERTY_NAME_providerEntityTypeId = "providerEntityTypeId";
    public static final String PROPERTY_NAME_providerEntityId = "providerEntityId";
    public static final String PROPERTY_NAME_entityTypeId = "entityTypeId";
    public static final String PROPERTY_NAME_entityId = "entityId";
    
    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------
    
    private long _providerId;
    private String _providerEntityTypeId;
    private String _providerEntityId;
    private long _entityTypeId;
    private long _entityId;
    
    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------
    
    public ProviderEntityMapping() {
    
    }
    
    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------
    
    public long getProviderId() {
    
        return _providerId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setProviderId(long providerId) {
    
        _providerId = providerId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public String getProviderEntityTypeId() {
    
        return _providerEntityTypeId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setProviderEntityTypeId(String providerEntityTypeId) {
    
        _providerEntityTypeId = providerEntityTypeId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public String getProviderEntityId() {
    
        return _providerEntityId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setProviderEntityId(String providerEntityId) {
    
        _providerEntityId = providerEntityId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public long getEntityTypeId() {
    
        return _entityTypeId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setEntityTypeId(long entityTypeId) {
    
        _entityTypeId = entityTypeId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public long getEntityId() {
    
        return _entityId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setEntityId(long entityId) {
    
        _entityId = entityId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
}