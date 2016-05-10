package com.betbrain.sepc.connector.sportsmodel;


/**
 * See the Sports Model documentation.
 * 
 * @author Morten Helles
 */
@javax.persistence.Entity
public class Outcome extends TypedEntity {

	// --------------------------------------------------------------------------------------------
	// Class fields
	// --------------------------------------------------------------------------------------------

	private static final long serialVersionUID = 1L;

    public static final String PROPERTY_NAME_isComplete = "isComplete";
    public static final String PROPERTY_NAME_isNegation = "isNegation";
	public static final String PROPERTY_NAME_statusId = "statusId";
	public static final String PROPERTY_NAME_eventId = "eventId";
	public static final String PROPERTY_NAME_eventPartId = "eventPartId";
	public static final String PROPERTY_NAME_paramFloat1 = "paramFloat1";
    public static final String PROPERTY_NAME_paramFloat2 = "paramFloat2";
    public static final String PROPERTY_NAME_paramFloat3 = "paramFloat3";
    public static final String PROPERTY_NAME_paramBoolean1 = "paramBoolean1";
    public static final String PROPERTY_NAME_paramString1 = "paramString1";
    public static final String PROPERTY_NAME_paramParticipantId1 = "paramParticipantId1";
    public static final String PROPERTY_NAME_paramParticipantId2 = "paramParticipantId2";
    public static final String PROPERTY_NAME_paramParticipantId3 = "paramParticipantId3";
    public static final String PROPERTY_NAME_paramEventPartId1 = "paramEventPartId1";
	
	// --------------------------------------------------------------------------------------------
	// Instance fields
	// --------------------------------------------------------------------------------------------

    private boolean _isComplete;
    private boolean _isNegation;
	private long _statusId;
	private long _eventId;
	private long _eventPartId;
	private Float _paramFloat1;
	private Float _paramFloat2;
	private Float _paramFloat3;
	private Boolean _paramBoolean1;
	private String _paramString1;
	private Long _paramParticipantId1;
	private Long _paramParticipantId2;
    private Long _paramParticipantId3;
    private Long _paramEventPartId1;
	
	// --------------------------------------------------------------------------------------------
	// Constructors
	// --------------------------------------------------------------------------------------------
	
	public Outcome() {
		
	}

	// --------------------------------------------------------------------------------------------
	// Instance methods
	// --------------------------------------------------------------------------------------------

    public boolean getIsComplete() {
        
        return _isComplete;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setIsComplete(boolean isComplete) {
        
        _isComplete = isComplete;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public boolean getIsNegation() {
        
        return _isNegation;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setIsNegation(boolean isNegation) {
        
        _isNegation = isNegation;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
	public long getStatusId() {
		
		return _statusId;
	}
	
	/* ----------------------------------------------------------------------------------------- */
	
	public void setStatusId(long statusId) {
		
		_statusId = statusId;
	}

	/* ----------------------------------------------------------------------------------------- */
	
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

	public Float getParamFloat3() {
		
		return _paramFloat3;
	}
	
	/* ----------------------------------------------------------------------------------------- */
	
	public void setParamFloat3(Float paramFloat3) {
		
		_paramFloat3 = paramFloat3;
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

	public String getParamString1() {
		
		return _paramString1;
	}
	
	/* ----------------------------------------------------------------------------------------- */
	
	public void setParamString1(String paramString1) {
		
		_paramString1 = paramString1;
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

    public Long getParamParticipantId3() {
        
        return _paramParticipantId3;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParamParticipantId3(Long paramParticipantId3) {
        
        _paramParticipantId3 = paramParticipantId3;
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
}