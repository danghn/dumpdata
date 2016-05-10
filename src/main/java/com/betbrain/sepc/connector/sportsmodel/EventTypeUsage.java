package com.betbrain.sepc.connector.sportsmodel;

/**
 * See the Sports Model documentation.
 * 
 * @author Morten Helles
 */
@javax.persistence.Entity
public class EventTypeUsage extends Entity {

	// --------------------------------------------------------------------------------------------
	// Class fields
	// --------------------------------------------------------------------------------------------

	private static final long serialVersionUID = 1L;

	public static final String PROPERTY_NAME_eventTypeId = "eventTypeId";
	public static final String PROPERTY_NAME_sportId = "sportId";
    public static final String PROPERTY_NAME_minPrimaryParticipantTimeBetweenEvents = "minPrimaryParticipantTimeBetweenEvents";
    public static final String PROPERTY_NAME_minEventDuration = "minEventDuration";
    public static final String PROPERTY_NAME_maxEventDuration = "maxEventDuration";
	
	// --------------------------------------------------------------------------------------------
	// Instance fields
	// --------------------------------------------------------------------------------------------
	
	private long _eventTypeId;
	private long _sportId;
    private Long _minPrimaryParticipantTimeBetweenEvents;
    private long _minEventDuration;
    private long _maxEventDuration;
	
	// --------------------------------------------------------------------------------------------
	// Constructors
	// --------------------------------------------------------------------------------------------
	
	public EventTypeUsage() {
		
	}

	// --------------------------------------------------------------------------------------------
	// Instance methods
	// --------------------------------------------------------------------------------------------

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

    public Long getMinPrimaryParticipantTimeBetweenEvents() {
        
        return _minPrimaryParticipantTimeBetweenEvents;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setMinPrimaryParticipantTimeBetweenEvents(Long minPrimaryParticipantTimeBetweenEvents) {
        
        _minPrimaryParticipantTimeBetweenEvents = minPrimaryParticipantTimeBetweenEvents;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public long getMinEventDuration() {
        
        return _minEventDuration;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setMinEventDuration(long minEventDuration) {
        
        _minEventDuration = minEventDuration;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public long getMaxEventDuration() {
        
        return _maxEventDuration;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setMaxEventDuration(long maxEventDuration) {
        
        _maxEventDuration = maxEventDuration;
    }
    
    /* ----------------------------------------------------------------------------------------- */
}