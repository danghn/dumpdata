package com.betbrain.sepc.connector.sportsmodel;

@javax.persistence.Entity
public class EventParticipantInfoDetail extends TypedEntity {


    // --------------------------------------------------------------------------------------------
    // Class fields
    // --------------------------------------------------------------------------------------------

    private static final long serialVersionUID = 1L;

    public static final String PROPERTY_NAME_eventParticipantInfoId = "eventParticipantInfoId";
    public static final String PROPERTY_NAME_paramFloat1 = "paramFloat1";
    public static final String PROPERTY_NAME_paramParticipantId1 = "paramParticipantId1";
    public static final String PROPERTY_NAME_paramBoolean1 = "paramBoolean1";
    
    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------

    private long _eventParticipantInfoId;
    private Float _paramFloat1;
    private Long _paramParticipantId1;
    private Boolean _paramBoolean1;

    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------
    
    public EventParticipantInfoDetail() {
        
    }
    
    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------

    public long getEventParticipantInfoId() {
        
        return _eventParticipantInfoId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setEventParticipantInfoId(long eventParticipantInfoId) {
        
        _eventParticipantInfoId = eventParticipantInfoId;
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
    
    public Boolean getParamBoolean1() {
        
        return _paramBoolean1;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParamBoolean1(Boolean paramBoolean1) {
        
        _paramBoolean1 = paramBoolean1;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
}
