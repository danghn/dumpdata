package com.betbrain.sepc.connector.sportsmodel;

/**
 * See Sports Model documentation
 * 
 * @author Marius Balaniuc [<a href="mailto:marius.balaniuc@betbrain.com">marius.balaniuc@betbrain.com</a>]
 */
@javax.persistence.Entity
public class OutcomePart extends Entity {
    
    // --------------------------------------------------------------------------------------------
    // Class fields
    // --------------------------------------------------------------------------------------------
    
    private static final long serialVersionUID = 1L;
    
    public static final String PROPERTY_NAME_outcomePartitionId = "outcomePartitionId";
    public static final String PROPERTY_NAME_outcomeId = "outcomeId";
    public static final String PROPERTY_NAME_probability = "probability";
    
    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------
    
    private long _outcomePartitionId;
    private long _outcomeId;
    private Float _probability;
    
    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------
    
    public OutcomePart() {
    
    }
    
    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------
    
    public long getOutcomePartitionId() {
    
        return _outcomePartitionId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setOutcomePartitionId(long outcomePartitionId) {
    
        _outcomePartitionId = outcomePartitionId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public long getOutcomeId() {
    
        return _outcomeId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setOutcomeId(long outcomeId) {
    
        _outcomeId = outcomeId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public Float getProbability() {
    
        return _probability;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setProbability(Float probability) {
    
        _probability = probability;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
}
