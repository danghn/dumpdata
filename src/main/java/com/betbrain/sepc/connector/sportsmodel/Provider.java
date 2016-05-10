package com.betbrain.sepc.connector.sportsmodel;

/**
 * See the Sports Model documentation.
 * 
 * @author Morten Helles
 */
@javax.persistence.Entity
public class Provider extends Entity {

	// --------------------------------------------------------------------------------------------
	// Class fields
	// --------------------------------------------------------------------------------------------

	private static final long serialVersionUID = 1L;

	public static final String PROPERTY_NAME_name = "name";
	public static final String PROPERTY_NAME_locationId = "locationId";
	public static final String PROPERTY_NAME_url = "url";
	public static final String PROPERTY_NAME_isBookmaker = "isBookmaker";
	public static final String PROPERTY_NAME_isBettingExchange = "isBettingExchange";
	public static final String PROPERTY_NAME_bettingCommissionVACs = "bettingCommissionVACs";
    public static final String PROPERTY_NAME_isNewsSource = "isNewsSource";
    public static final String PROPERTY_NAME_isLiveOddsApproved = "isLiveOddsApproved";
    public static final String PROPERTY_NAME_isEnabled = "isEnabled";
    public static final String PROPERTY_NAME_note = "note";
	
	// --------------------------------------------------------------------------------------------
	// Instance fields
	// --------------------------------------------------------------------------------------------
	
	private String _name;
	private long _locationId;
	private String _url;
	private boolean _isBookmaker;
	private boolean _isBettingExchange;
	private float _bettingCommissionVACs;
    private boolean _isNewsSource;
    private boolean _isLiveOddsApproved;
	private boolean _isEnabled;
	private String _note;
	
	// --------------------------------------------------------------------------------------------
	// Constructors
	// --------------------------------------------------------------------------------------------
	
	public Provider() {
		
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

    public long getLocationId() {
        
        return _locationId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setLocationId(long locationId) {
        
        _locationId = locationId;
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

	public boolean getIsBookmaker() {
		
		return _isBookmaker;
	}
	
	/* ----------------------------------------------------------------------------------------- */
	
	public void setIsBookmaker(boolean isBookmaker) {
		
		_isBookmaker = isBookmaker;
	}
	
	/* ----------------------------------------------------------------------------------------- */

	public boolean getIsBettingExchange() {
		
		return _isBettingExchange;
	}
	
	/* ----------------------------------------------------------------------------------------- */
	
	public void setIsBettingExchange(boolean isBettingExchange) {
		
		_isBettingExchange = isBettingExchange;
	}
	
	/* ----------------------------------------------------------------------------------------- */

	public float getBettingCommissionVACs() {
		
		return _bettingCommissionVACs;
	}
	
	/* ----------------------------------------------------------------------------------------- */
	
	public void setBettingCommissionVACs(float bettingCommissionVACs) {
		
		_bettingCommissionVACs = bettingCommissionVACs;
	}
	
	/* ----------------------------------------------------------------------------------------- */

    public boolean getIsNewsSource() {
        
        return _isNewsSource;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setIsNewsSource(boolean isNewsSource) {
        
        _isNewsSource = isNewsSource;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public boolean getIsEnabled() {
        
        return _isEnabled;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setIsEnabled(boolean isEnabled) {
        
        _isEnabled = isEnabled;
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
    
    public boolean getIsLiveOddsApproved() {
    
        return _isLiveOddsApproved;
    }

    /* ----------------------------------------------------------------------------------------- */
    
    public void setIsLiveOddsApproved(boolean isLiveOddsApproved) {
    
        _isLiveOddsApproved = isLiveOddsApproved;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    
}