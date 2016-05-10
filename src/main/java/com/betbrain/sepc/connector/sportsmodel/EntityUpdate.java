package com.betbrain.sepc.connector.sportsmodel;

import java.util.List;

/**
 * Represents a Sports Model entity update.
 * 
 * @author Morten Helles
 */

public class EntityUpdate extends EntityChange {

    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------

    private Class<? extends Entity> _entityClass;
    private long _entityId;
    private List<String> _propertyNames;
    private List<Object> _propertyValues;

    // --------------------------------------------------------------------------------------------
    // Constructor
    // --------------------------------------------------------------------------------------------
    
    public EntityUpdate(Class<? extends Entity> entityClass, long entityId, List<String> propertyNames, List<Object> propertyValues) {

        _entityClass = entityClass;
        _entityId = entityId;
        _propertyNames = propertyNames;
        _propertyValues = propertyValues;
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

    public List<String> getPropertyNames() {
        
        return _propertyNames;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public List<Object> getPropertyValues() {
        
        return _propertyValues;
    }
    
    /* ----------------------------------------------------------------------------------------- */
}