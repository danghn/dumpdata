package com.betbrain.sepc.connector.sportsmodel;

/**
 * See the Sports Model documentation.
 * 
 * @author Morten Helles
 */
@javax.persistence.Entity
public class ParticipantRole extends Entity {

	// --------------------------------------------------------------------------------------------
	// Class fields
	// --------------------------------------------------------------------------------------------

	private static final long serialVersionUID = 1L;

	public static final String PROPERTY_NAME_name = "name";
	public static final String PROPERTY_NAME_description = "description";
	public static final String PROPERTY_NAME_isPrimary = "isPrimary";
	
	// --------------------------------------------------------------------------------------------
	// Instance fields
	// --------------------------------------------------------------------------------------------
	
	private String _name;
	private String _description;
	private boolean _isPrimary;
	
	// --------------------------------------------------------------------------------------------
	// Constructors
	// --------------------------------------------------------------------------------------------
	
	public ParticipantRole() {
		
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

    public boolean getIsPrimary() {
        
        return _isPrimary;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setIsPrimary(boolean isPrimary) {
        
        _isPrimary = isPrimary;
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