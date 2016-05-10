package com.betbrain.sepc.connector.sdql;

/**
 * Represents an SDQL subscribe request.
 * 
 * @author Morten Helles
 */
class SDQLSubscribeRequest extends SDQLConstruct {

    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------

    private String _subscriptionSpecificationName;
    
    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------
    
    public SDQLSubscribeRequest(String subscriptionSpecificationName) {

        _subscriptionSpecificationName = subscriptionSpecificationName;
    }
    
    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------
    
    public String getSubscriptionSpecificationName() {
        
        return _subscriptionSpecificationName;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(subscriptionSpecificationName=");
        sb.append(_subscriptionSpecificationName);
        sb.append(")");
        
        return sb.toString();
    }

    /* ----------------------------------------------------------------------------------------- */ 
    
    @Override
    public int hashCode() {
    
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_subscriptionSpecificationName == null) ? 0 : _subscriptionSpecificationName.hashCode());
        return result;
    }

    /* ----------------------------------------------------------------------------------------- */
    
    @Override
    public boolean equals(Object obj) {
    
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SDQLSubscribeRequest other = (SDQLSubscribeRequest) obj;
        if (_subscriptionSpecificationName == null) {
            if (other._subscriptionSpecificationName != null)
                return false;
        } else if (!_subscriptionSpecificationName.equals(other._subscriptionSpecificationName))
            return false;
        return true;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    
}