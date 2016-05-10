package com.betbrain.sepc.connector.sportsmodel;

/**
 * See the Sports Model documentation.
 *
 * @author Morten Helles
 */
@javax.persistence.Entity
public class EventAction extends TypedEntity {
    // --------------------------------------------------------------------------------------------
    // Class fields
    // --------------------------------------------------------------------------------------------
    
    private static final long serialVersionUID = 1L;
    
    public static final String PROPERTY_NAME_eventId = "eventId";
    public static final String PROPERTY_NAME_providerId = "providerId";
    public static final String PROPERTY_NAME_sourceId = "sourceId";
    public static final String PROPERTY_NAME_eventPartId = "eventPartId";
    public static final String PROPERTY_NAME_paramFloat1 = "paramFloat1";
    public static final String PROPERTY_NAME_paramParticipantId1 = "paramParticipantId1";
    public static final String PROPERTY_NAME_paramParticipantId2 = "paramParticipantId2";
    
    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------
    
    private long _eventId;
    private long _providerId;
    private long _sourceId;
    private long _eventPartId;
    private Float _paramFloat1;
    private Long _paramParticipantId1;
    private Long _paramParticipantId2;
    
    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------
    
    public EventAction() {
    
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
    
    public Float getParamFloat1() {
    
        return _paramFloat1;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParamFloat1(Float paramFloat1) {
    
        _paramFloat1 = paramFloat1;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public Long getParamParticipantId1() {
    
        return _paramParticipantId1;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParamParticipantId1(Long paramParticipantId1) {
    
        _paramParticipantId1 = paramParticipantId1;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public Long getParamParticipantId2() {
    
        return _paramParticipantId2;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParamParticipantId2(Long paramParticipantId2) {
    
        _paramParticipantId2 = paramParticipantId2;
    }
    
    /* ----------------------------------------------------------------------------------------- */
}
