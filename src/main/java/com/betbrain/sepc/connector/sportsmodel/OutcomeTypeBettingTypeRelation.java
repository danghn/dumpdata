package com.betbrain.sepc.connector.sportsmodel;


/**
 * See the Sports Model documentation.
 * 
 * @author Morten Helles
 */
@javax.persistence.Entity
public class OutcomeTypeBettingTypeRelation extends Entity {

    // --------------------------------------------------------------------------------------------
    // Class fields
    // --------------------------------------------------------------------------------------------

    private static final long serialVersionUID = 1L;

    public static final String PROPERTY_NAME_outcomeTypeId = "outcomeTypeId";
    public static final String PROPERTY_NAME_bettingTypeId = "bettingTypeId";
    
    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------
    
    private long _outcomeTypeId;
    private long _bettingTypeId;

    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------
    
    public OutcomeTypeBettingTypeRelation() {
        
    }

    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------

    public long getOutcomeTypeId() {
        
        return _outcomeTypeId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setOutcomeTypeId(long outcomeTypeId) {
        
        _outcomeTypeId = outcomeTypeId;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public long getBettingTypeId() {
        
        return _bettingTypeId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setBettingTypeId(long bettingTypeId) {
        
        _bettingTypeId = bettingTypeId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
}
