package com.betbrain.sepc.connector.sportsmodel;


/**
 * See the Sports Model documentation.
 * 
 * @author Morten Helles
 */
@javax.persistence.Entity
public class EntityPropertyValue extends Entity {

    // --------------------------------------------------------------------------------------------
    // Class fields
    // --------------------------------------------------------------------------------------------

    private static final long serialVersionUID = 1L;

    public static final String PROPERTY_NAME_entityPropertyId = "entityPropertyId";
    public static final String PROPERTY_NAME_entityId = "entityId";
    public static final String PROPERTY_NAME_value = "value";
    
    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------

    private long _entityPropertyId;
    private long _entityId;
    private String _value;

    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------
    
    public EntityPropertyValue() {
        
    }

    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------

    public long getEntityPropertyId() {
        
        return _entityPropertyId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setEntityPropertyId(long entityPropertyId) {
        
        _entityPropertyId = entityPropertyId;
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
    
    public String getValue() {
        
        return _value;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setValue(String value) {
        
        _value = value;
    }
    
    /* ----------------------------------------------------------------------------------------- */
}
