package com.betbrain.sepc.connector.sportsmodel;

/**
 * See the Sports Model documentation.
 * 
 * @author Morten Helles
 */
@javax.persistence.Entity
public class EventParticipantRelation extends Entity {

	// --------------------------------------------------------------------------------------------
	// Class fields
	// --------------------------------------------------------------------------------------------

	private static final long serialVersionUID = 1L;

	public static final String PROPERTY_NAME_eventId = "eventId";
	public static final String PROPERTY_NAME_eventPartId = "eventPartId";
	public static final String PROPERTY_NAME_participantId = "participantId";
	public static final String PROPERTY_NAME_participantRoleId = "participantRoleId";
	public static final String PROPERTY_NAME_parentParticipantId = "parentParticipantId";
	
	// --------------------------------------------------------------------------------------------
	// Instance fields
	// --------------------------------------------------------------------------------------------
	
	private long _eventId;
    private long _eventPartId;
	private long _participantId;
	private long _participantRoleId;
	private Long _parentParticipantId;

	// --------------------------------------------------------------------------------------------
	// Constructors
	// --------------------------------------------------------------------------------------------
	
	public EventParticipantRelation() {
		
	}

	// --------------------------------------------------------------------------------------------
	// Instance methods
	// --------------------------------------------------------------------------------------------

	public long getEventId() {
		
		return _eventId;
	}
	
	/* ----------------------------------------------------------------------------------------- */
	
	public void setEventId(long eventId) {
		
		_eventId = eventId;
	}
	
	/* ----------------------------------------------------------------------------------------- */

    public long getEventPartId() {
        
        return _eventPartId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setEventPartId(long eventPartId) {
        
        _eventPartId = eventPartId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
	
	public long getParticipantId() {
		
		return _participantId;
	}
	
	/* ----------------------------------------------------------------------------------------- */
	
	public void setParticipantId(long participantId) {
		
		_participantId = participantId;
	}
	
	/* ----------------------------------------------------------------------------------------- */

	public long getParticipantRoleId() {
		
		return _participantRoleId;
	}
	
	/* ----------------------------------------------------------------------------------------- */
	
	public void setParticipantRoleId(long participantRoleId) {
		
		_participantRoleId = participantRoleId;
	}
	
	/* ----------------------------------------------------------------------------------------- */
	
	public Long getParentParticipantId() {
		
		return _parentParticipantId;
	}
	
	/* ----------------------------------------------------------------------------------------- */
	
	public void setParentParticipantId(Long parentParticipantId) {
		
		_parentParticipantId = parentParticipantId;
	}
	
	/* ----------------------------------------------------------------------------------------- */
}