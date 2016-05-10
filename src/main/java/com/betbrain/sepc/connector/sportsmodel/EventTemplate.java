package com.betbrain.sepc.connector.sportsmodel;

/**
 * See the Sports Model documentation.
 * 
 * @author Morten Helles
 */
@javax.persistence.Entity
public class EventTemplate extends Entity {

	// --------------------------------------------------------------------------------------------
	// Class fields
	// --------------------------------------------------------------------------------------------

	private static final long serialVersionUID = 1L;
	
	public static final String PROPERTY_NAME_name = "name";
	public static final String PROPERTY_NAME_eventTypeId = "eventTypeId";
	public static final String PROPERTY_NAME_sportId = "sportId";
	public static final String PROPERTY_NAME_url = "url";
	public static final String PROPERTY_NAME_venueId = "venueId";
	public static final String PROPERTY_NAME_rootPartId = "rootPartId";
	public static final String PROPERTY_NAME_note = "note";

	// --------------------------------------------------------------------------------------------
	// Instance fields
	// --------------------------------------------------------------------------------------------
	
	private String _name;
	private long _eventTypeId;
	private long _sportId;
	private String _url;
	private Long _venueId;
	private Long _rootPartId;
    private String _note;
	
	// --------------------------------------------------------------------------------------------
	// Constructors
	// --------------------------------------------------------------------------------------------
	
	public EventTemplate() {
		
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

	public long getEventTypeId() {
		
		return _eventTypeId;
	}
	
	/* ----------------------------------------------------------------------------------------- */
	
	public void setEventTypeId(long eventTypeId) {
		
		_eventTypeId = eventTypeId;
	}
	
	/* ----------------------------------------------------------------------------------------- */

	public long getSportId() {
		
		return _sportId;
	}
	
	/* ----------------------------------------------------------------------------------------- */
	
	public void setSportId(long sportId) {
		
		_sportId = sportId;
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

	public Long getVenueId() {
		
		return _venueId;
	}
	
	/* ----------------------------------------------------------------------------------------- */
	
	public void setVenueId(Long venueId) {
		
		_venueId = venueId;
	}
	
	/* ----------------------------------------------------------------------------------------- */
	
	public Long getRootPartId() {
		
		return _rootPartId;
	}
	
	/* ----------------------------------------------------------------------------------------- */
	
	public void setRootPartId(Long rootPartId) {
		
		_rootPartId = rootPartId;
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