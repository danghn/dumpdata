package com.betbrain.sepc.connector.sportsmodel;


/**
 * See the Sports Model documentation.
 * 
 * @author Morten Helles
 */
@javax.persistence.Entity
public class EntityProperty extends TypedEntity {

    // --------------------------------------------------------------------------------------------
    // Class fields
    // --------------------------------------------------------------------------------------------

    private static final long serialVersionUID = 1L;

    public static final String PROPERTY_NAME_entityTypeId = "entityTypeId";
    public static final String PROPERTY_NAME_name = "name";
    public static final String PROPERTY_NAME_description = "description";
    
    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------

    private long _entityTypeId;
    private String _name;
    private String _description;

    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------
    
    public EntityProperty() {
        
    }

    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------

    public long getEntityTypeId() {
        
        return _entityTypeId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setEntityTypeId(long entityTypeId) {
        
        _entityTypeId = entityTypeId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public String getName() {
        
        return _name;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setName(String name) {
        
        _name = name;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public String getDescription() {
        
        return _description;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setDescription(String description) {
        
        _description = description;
    }
    
    /* ----------------------------------------------------------------------------------------- */
}
