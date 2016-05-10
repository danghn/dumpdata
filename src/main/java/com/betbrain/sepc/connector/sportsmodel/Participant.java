package com.betbrain.sepc.connector.sportsmodel;

import java.util.Date;


/**
 * See the Sports Model documentation.
 * 
 * @author Morten Helles
 */
@javax.persistence.Entity
public class Participant extends TypedEntity {

	// --------------------------------------------------------------------------------------------
	// Class fields
	// --------------------------------------------------------------------------------------------

	private static final long serialVersionUID = 1L;

	public static final String PROPERTY_NAME_name = "name";
	public static final String PROPERTY_NAME_firstName = "firstName";
	public static final String PROPERTY_NAME_lastName = "lastName";
	public static final String PROPERTY_NAME_isMale = "isMale";
	public static final String PROPERTY_NAME_birthTime = "birthTime";
	public static final String PROPERTY_NAME_countryId = "countryId";
	public static final String PROPERTY_NAME_retirementTime = "retirementTime";
	public static final String PROPERTY_NAME_note = "note";
	public static final String PROPERTY_NAME_url = "url";
	
	// --------------------------------------------------------------------------------------------
	// Instance fields
	// --------------------------------------------------------------------------------------------
	
	private String _name;
	private String _firstName;
	private String _lastName;
	private Boolean _isMale;
	private Date _birthTime;
	private Long _countryId;
	private Date _retirementTime;
	private String _note;
	private String _url;
	
	// --------------------------------------------------------------------------------------------
	// Constructors
	// --------------------------------------------------------------------------------------------
	
	public Participant() {
		
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

	public String getFirstName() {
		
		return _firstName;
	}
	
	/* ----------------------------------------------------------------------------------------- */
	
	public void setFirstName(String firstName) {
		
		_firstName = firstName;
	}
	
	/* ----------------------------------------------------------------------------------------- */

	public String getLastName() {
		
		return _lastName;
	}
	
	/* ----------------------------------------------------------------------------------------- */
	
	public void setLastName(String lastName) {
		
		_lastName = lastName;
	}
	
	/* ----------------------------------------------------------------------------------------- */
	
	public Boolean getIsMale() {
		
		return _isMale;
	}
	
	/* ----------------------------------------------------------------------------------------- */
	
	public void setIsMale(Boolean isMale) {
		
		_isMale = isMale;
	}
	
	/* ----------------------------------------------------------------------------------------- */

	public Date getBirthTime() {
		
		return _birthTime;
	}
	
	/* ----------------------------------------------------------------------------------------- */
	
	public void setBirthTime(Date birthTime) {
		
		_birthTime = birthTime;
	}
	
	/* ----------------------------------------------------------------------------------------- */
	
	public Long getCountryId() {
		
		return _countryId;
	}
	
	/* ----------------------------------------------------------------------------------------- */
	
	public void setCountryId(Long countryId) {
		
	    _countryId = countryId;
	}
	
	/* ----------------------------------------------------------------------------------------- */

	public Date getRetirementTime() {
		
		return _retirementTime;
	}
	
	/* ----------------------------------------------------------------------------------------- */
	
	public void setRetirementTime(Date retirementTime) {
		
		_retirementTime = retirementTime;
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
    
    public String getUrl() {
    
        return _url;
    }

    /* ----------------------------------------------------------------------------------------- */
    
    public void setUrl(String url) {
    
        _url = url;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    
}