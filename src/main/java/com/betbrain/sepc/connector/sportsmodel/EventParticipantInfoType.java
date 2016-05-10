package com.betbrain.sepc.connector.sportsmodel;

@javax.persistence.Entity
public class EventParticipantInfoType extends Entity {

    // --------------------------------------------------------------------------------------------
    // Class fields
    // --------------------------------------------------------------------------------------------

    private static final long serialVersionUID = 1L;

    public static final String PROPERTY_NAME_name = "name";
    public static final String PROPERTY_NAME_description = "description";
    
    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------
    
    private String _name;
    private String _description;
    
    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------
    
    public EventParticipantInfoType() {
        
    }

    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------

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
