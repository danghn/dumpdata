package com.betbrain.sepc.connector.sportsmodel;


/**
 * See the Sports Model documentation.
 * 
 * @author Morten Helles
 */
@javax.persistence.Entity
public class Location extends TypedEntity {

	// --------------------------------------------------------------------------------------------
	// Class fields
	// --------------------------------------------------------------------------------------------

	private static final long serialVersionUID = 1L;

	public static final String PROPERTY_NAME_name = "name";
	public static final String PROPERTY_NAME_code = "code";
	public static final String PROPERTY_NAME_isHistoric = "isHistoric";
	public static final String PROPERTY_NAME_url = "url";
	public static final String PROPERTY_NAME_note = "note";
	
	// --------------------------------------------------------------------------------------------
	// Instance fields
	// --------------------------------------------------------------------------------------------
	
	private String _name;
	private String _code;
	private boolean _isHistoric;
	private String _url;
	private String _note;
	
	// --------------------------------------------------------------------------------------------
	// Constructors
	// --------------------------------------------------------------------------------------------

	public Location() {
		
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

	public String getCode() {
		
		return _code;
	}
	
	/* ----------------------------------------------------------------------------------------- */
	
	public void setCode(String code) {
		
		_code = code;
	}
	
	/* ----------------------------------------------------------------------------------------- */

	public boolean getIsHistoric() {
		
		return _isHistoric;
	}
	
	/* ----------------------------------------------------------------------------------------- */
	
	public void setIsHistoric(boolean isHistoric) {
		
		_isHistoric = isHistoric;
	}
	
	/* ----------------------------------------------------------------------------------------- */
	
	public String getUrl() {
		
		return _url;
	}
	
	/* ----------------------------------------------------------------------------------------- */
	
	public void setUrl(String url) {
		
		_url = url;
	}
	
	/* ----------------------------------------------------------------------------------------- */

    public String getNote() {
        
        return _note;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setNote(String note) {
        
        _note = note;
    }
    
    /* ----------------------------------------------------------------------------------------- */
}