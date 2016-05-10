package com.betbrain.sepc.connector.sportsmodel;

import java.util.Date;

/**
 * See the Sports Model documentation.
 * 
 * @author Morten Helles
 */
@javax.persistence.Entity
public class ParticipantRelation extends TypedEntity {
    
    // --------------------------------------------------------------------------------------------
    // Class fields
    // --------------------------------------------------------------------------------------------
    
    private static final long serialVersionUID = 1L;
    
    public static final String PROPERTY_NAME_fromParticipantId = "fromParticipantId";
    public static final String PROPERTY_NAME_toParticipantId = "toParticipantId";
    public static final String PROPERTY_NAME_startTime = "startTime";
    public static final String PROPERTY_NAME_endTime = "endTime";
    public static final String PROPERTY_NAME_paramParticipantRoleId = "paramParticipantRoleId";
    
    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------
    
    private long _fromParticipantId;
    private long _toParticipantId;
    private Date _startTime;
    private Date _endTime;
    private Long _paramParticipantRoleId;
    
    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------
    
    public ParticipantRelation() {
    
    }
    
    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------
    
    public long getFromParticipantId() {
    
        return _fromParticipantId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setFromParticipantId(long fromParticipantId) {
    
        _fromParticipantId = fromParticipantId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public long getToParticipantId() {
    
        return _toParticipantId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setToParticipantId(long toParticipantId) {
    
        _toParticipantId = toParticipantId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public Date getStartTime() {
    
        return _startTime;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setStartTime(Date startTime) {
    
        _startTime = startTime;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public Date getEndTime() {
    
        return _endTime;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setEndTime(Date endTime) {
    
        _endTime = endTime;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public Long getParamParticipantRoleId() {
    
        return _paramParticipantRoleId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParamParticipantRoleId(Long paramParticipantRoleId) {
    
        _paramParticipantRoleId = paramParticipantRoleId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
}
