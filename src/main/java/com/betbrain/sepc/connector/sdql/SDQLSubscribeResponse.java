package com.betbrain.sepc.connector.sdql;

/**
 * Represents an SDQL subscribe response.
 * 
 * @author Morten Helles
 */
public class SDQLSubscribeResponse extends SDQLConstruct {

    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------

    private String _subscriptionId;
    
    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------
    
    public SDQLSubscribeResponse(String subscriptionId) {

        _subscriptionId = subscriptionId;
    }
    
    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------
    
    public String getSubscriptionId() {
        
        return _subscriptionId;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(subscriptionId=");
        sb.append(_subscriptionId);
        sb.append(")");
        
        return sb.toString();
    }
    
    /* ----------------------------------------------------------------------------------------- */
}