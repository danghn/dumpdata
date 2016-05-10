package com.betbrain.sepc.connector.sportsmodel;
@javax.persistence.Entity
public class EventActionDetail extends TypedEntity {

    // --------------------------------------------------------------------------------------------
    // Class fields
    // --------------------------------------------------------------------------------------------
    
    private static final long serialVersionUID = -8817833758123404834L;
    
    public static final String PROPERTY_NAME_eventActionId = "eventActionId";
    public static final String PROPERTY_NAME_paramFloat1 = "paramFloat1";
    public static final String PROPERTY_NAME_paramFloat2 = "paramFloat2";
    public static final String PROPERTY_NAME_paramParticipantId1 = "paramParticipantId1";
    public static final String PROPERTY_NAME_paramString1 = "paramString1";
    public static final String PROPERTY_NAME_paramBoolean1 = "paramBoolean1";
    
    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------
    
    private long _eventActionId;
    private Float _paramFloat1;
    private Float _paramFloat2;
    private Long _paramParticipantId1;
    private String _paramString1;
    private Boolean _paramBoolean1;
    
    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------
    
    public EventActionDetail() {
        
    }
    
    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------
    
    public long getEventActionId() {
        
        return _eventActionId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setEventActionId(long eventActionId) {
        
        _eventActionId = eventActionId;
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
}
