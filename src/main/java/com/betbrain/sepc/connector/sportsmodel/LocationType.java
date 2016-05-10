package com.betbrain.sepc.connector.sportsmodel;

/**
 * See the Sports Model documentation.
 *
 * @author Morten Helles
 */
@javax.persistence.Entity
public class LocationType extends Entity {

	// --------------------------------------------------------------------------------------------
	// Class fields
	// --------------------------------------------------------------------------------------------

	private static final long serialVersionUID = 1L;

	public static final String PROPERTY_NAME_name = "name";
	public static final String PROPERTY_NAME_description = "description";
	public static final String PROPERTY_NAME_hasCode = "hasCode";
	public static final String PROPERTY_NAME_codeDescription = "codeDescription";
	
	// --------------------------------------------------------------------------------------------
	// Instance fields
	// --------------------------------------------------------------------------------------------
	
	private String _name;
	private String _description;
	private Boolean _hasCode;
	private String _codeDescription;
	
	// --------------------------------------------------------------------------------------------
	// Constructors
	// --------------------------------------------------------------------------------------------

	public LocationType() {
		
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
	
	public Boolean getHasCode() {
	    
	    return _hasCode;
	}
	
    /* ----------------------------------------------------------------------------------------- */

	public void setHasCode(Boolean hasCode) {
	
	    _hasCode = hasCode;
	}
	
    /* ----------------------------------------------------------------------------------------- */

    public String getCodeDescription() {
        
        return _codeDescription;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setCodeDescription(String codeDescription) {
        
        _codeDescription = codeDescription;
    }
    
    /* ----------------------------------------------------------------------------------------- */
}