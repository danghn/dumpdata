package com.betbrain.sepc.connector.sportsmodel;

/**
 * See Sports Model documentation
 * 
 * @author Marius Balaniuc [<a href="mailto:marius.balaniuc@betbrain.com">marius.balaniuc@betbrain.com</a>]
 */
@javax.persistence.Entity
public class OutcomeParticipantRelation extends Entity {
    
    // --------------------------------------------------------------------------------------------
    // Class fields
    // --------------------------------------------------------------------------------------------
    
    private static final long serialVersionUID = 1L;
    
    public static final String PROPERTY_NAME_outcomeId = "outcomeId";
    public static final String PROPERTY_NAME_participantId = "participantId";
    
    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------
    
    private long _outcomeId;
    private long _participantId;
    
    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------
    
    public OutcomeParticipantRelation() {
    
    }
    
    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------
    
    public long getOutcomeId() {
    
        return _outcomeId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setOutcomeId(long outcomeId) {
    
        _outcomeId = outcomeId;
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
