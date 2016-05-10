package com.betbrain.sepc.connector.sportsmodel;

@javax.persistence.Entity
public class EventParticipantInfo extends TypedEntity {

    // --------------------------------------------------------------------------------------------
    // Class fields
    // --------------------------------------------------------------------------------------------

    private static final long serialVersionUID = 1L;

    public static final String PROPERTY_NAME_eventId = "eventId";
    public static final String PROPERTY_NAME_providerId = "providerId";
    public static final String PROPERTY_NAME_sourceId = "sourceId";
    public static final String PROPERTY_NAME_eventPartId = "eventPartId";
    public static final String PROPERTY_NAME_participantId = "participantId";
    
    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------

    private long _eventId;
    private long _providerId;
    private long _sourceId;
    private long _eventPartId;
    private long _participantId;

    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------
    
    public EventParticipantInfo() {
        
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

    public long getProviderId() {
        
        return _providerId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setProviderId(long providerId) {
        
        _providerId = providerId;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public long getSourceId() {
        
        return _sourceId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setSourceId(long sourceId) {
        
        _sourceId = sourceId;
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
    
}
