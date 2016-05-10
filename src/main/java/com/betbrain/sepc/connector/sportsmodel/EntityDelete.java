package com.betbrain.sepc.connector.sportsmodel;

/**
 * Represents a Sports Model entity delete.
 * 
 * @author Morten Helles
 */

public class EntityDelete extends EntityChange {

    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------

    private Class<? extends Entity> _entityClass;
    private long _entityId;
    
    // --------------------------------------------------------------------------------------------
    // Constructor
    // --------------------------------------------------------------------------------------------
    
    public EntityDelete(Class<? extends Entity> entityClass, long entityId) {

        _entityClass = entityClass;
        _entityId = entityId;
    }
    
    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------

    public Class<? extends Entity> getEntityClass() {
        
        return _entityClass;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public long getEntityId() {
        
        return _entityId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
}