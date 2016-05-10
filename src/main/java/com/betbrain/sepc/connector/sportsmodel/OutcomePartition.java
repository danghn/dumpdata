package com.betbrain.sepc.connector.sportsmodel;

/**
 * See Sports Model documentation
 * 
 * @author Marius Balaniuc [<a href="mailto:marius.balaniuc@betbrain.com">marius.balaniuc@betbrain.com</a>]
 */
@javax.persistence.Entity
public class OutcomePartition extends Entity {
    
    // --------------------------------------------------------------------------------------------
    // Class fields
    // --------------------------------------------------------------------------------------------
    
    private static final long serialVersionUID = 1L;
    
    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------
    
    public static final String PROPERTY_NAME_isComplete = "isComplete";
    private boolean _isComplete;
    
    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------
    
    public OutcomePartition() {
    
    }
    
    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------
    
    public boolean getIsComplete() {
    
        return _isComplete;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setIsComplete(boolean isComplete) {
    
        _isComplete = isComplete;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
}
