package com.betbrain.sepc.connector.sportsmodel;

import java.util.Date;

@javax.persistence.Entity
public class EventInfo extends TypedEntity {
    
    
    // --------------------------------------------------------------------------------------------
    // Class fields
    // --------------------------------------------------------------------------------------------
    
    private static final long serialVersionUID = 1L;
    
    public static final String PROPERTY_NAME_eventId = "eventId";
    public static final String PROPERTY_NAME_providerId = "providerId";
    public static final String PROPERTY_NAME_sourceId = "sourceId";
    public static final String PROPERTY_NAME_eventPartId = "eventPartId";
    public static final String PROPERTY_NAME_paramFloat1 = "paramFloat1";
    public static final String PROPERTY_NAME_paramFloat2 = "paramFloat2";
    public static final String PROPERTY_NAME_paramParticipantId1 = "paramParticipantId1";
    public static final String PROPERTY_NAME_paramParticipantId2 = "paramParticipantId2";
    public static final String PROPERTY_NAME_paramEventPartId1 = "paramEventPartId1";
    public static final String PROPERTY_NAME_paramString1 = "paramString1";
    public static final String PROPERTY_NAME_paramBoolean1 = "paramBoolean1";
    public static final String PROPERTY_NAME_paramEventStatusId1 = "paramEventStatusId1";
    public static final String PROPERTY_NAME_paramTime1 = "paramTime1";
    
    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------
    
    private long _eventId;
    private long _providerId;
    private long _sourceId;
    private long _eventPartId;
    private Float _paramFloat1;
    private Float _paramFloat2;
    private Long _paramParticipantId1;
    private Long _paramParticipantId2;
    private Long _paramEventPartId1;
    private String _paramString1;
    private Boolean _paramBoolean1;
    private Long _paramEventStatusId1;
    private Date _paramTime1;
    
    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------
    
    public EventInfo() {
    
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
    
    public Float getParamFloat2() {
    
        return _paramFloat2;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParamFloat2(Float paramFloat2) {
    
        _paramFloat2 = paramFloat2;
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
    
    public Long getParamEventPartId1() {
    
        return _paramEventPartId1;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParamEventPartId1(Long paramEventPartId1) {
    
        _paramEventPartId1 = paramEventPartId1;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public String getParamString1() {
    
        return _paramString1;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParamString1(String paramString1) {
    
        _paramString1 = paramString1;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public Boolean getParamBoolean1() {
    
        return _paramBoolean1;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParamBoolean1(Boolean paramBoolean1) {
    
        _paramBoolean1 = paramBoolean1;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public Long getParamEventStatusId1() {
    
        return _paramEventStatusId1;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParamEventStatusId1(Long paramEventStatusId1) {
    
        _paramEventStatusId1 = paramEventStatusId1;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public Date getParamTime1() {
    
        return _paramTime1;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParamTime1(Date paramTime1) {
    
        _paramTime1 = paramTime1;
    }
    
    /* ----------------------------------------------------------------------------------------- */
}
