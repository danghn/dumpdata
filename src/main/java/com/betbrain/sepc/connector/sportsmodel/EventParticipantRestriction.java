package com.betbrain.sepc.connector.sportsmodel;

@javax.persistence.Entity
public class EventParticipantRestriction extends Entity {
    
    // --------------------------------------------------------------------------------------------
    // Class fields
    // --------------------------------------------------------------------------------------------
    
    private static final long serialVersionUID = 1L;
    
    public static final String PROPERTY_NAME_eventId = "eventId";
    public static final String PROPERTY_NAME_participantTypeId = "participantTypeId";
    public static final String PROPERTY_NAME_participantIsMale = "participantIsMale";
    public static final String PROPERTY_NAME_participantMinAge = "participantMinAge";
    public static final String PROPERTY_NAME_participantMaxAge = "participantMaxAge";
    public static final String PROPERTY_NAME_participantPartOfLocationId = "participantPartOfLocationId";
    
    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------
    
    private long _eventId;
    private long _participantTypeId;
    private Boolean _participantIsMale;
    private Integer _participantMinAge;
    private Integer _participantMaxAge;
    private Long _participantPartOfLocationId;
    
    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------
    
    public EventParticipantRestriction() {
    
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
    
    public long getParticipantTypeId() {
    
        return _participantTypeId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParticipantTypeId(long participantTypeId) {
    
        _participantTypeId = participantTypeId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public Boolean getParticipantIsMale() {
    
        return _participantIsMale;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParticipantIsMale(Boolean participantIsMale) {
    
        _participantIsMale = participantIsMale;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public Integer getParticipantMinAge() {
    
        return _participantMinAge;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParticipantMinAge(Integer participantMinAge) {
    
        _participantMinAge = participantMinAge;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public Integer getParticipantMaxAge() {
    
        return _participantMaxAge;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParticipantMaxAge(Integer participantMaxAge) {
    
        _participantMaxAge = participantMaxAge;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public Long getParticipantPartOfLocationId() {
    
        return _participantPartOfLocationId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParticipantPartOfLocationId(Long participantPartOfLocationId) {
    
        _participantPartOfLocationId = participantPartOfLocationId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
}
