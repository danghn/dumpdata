package com.betbrain.sepc.connector.sdql;

/**
 * Represents an SDQL unsubscribe request.
 * 
 * @author Morten Helles
 */
class SDQLUnsubscribeRequest extends SDQLConstruct {

    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------

    private String _subscriptionSpecificationName;
    private String _subscriptionId;
    
    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------
    
    public SDQLUnsubscribeRequest(String subscriptionSpecificationName, String subscriptionId) {

        _subscriptionSpecificationName = subscriptionSpecificationName;
        _subscriptionId = subscriptionId;
    }
    
    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------
    
    public String getSubscriptionSpecificationName() {
        
        return _subscriptionSpecificationName;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public String getSubscriptionId() {
        
        return _subscriptionId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(subscriptionSpecificationName=");
        sb.append(_subscriptionSpecificationName);
        sb.append(",subscriptionId=");
        sb.append(_subscriptionId);
        sb.append(")");
        
        return sb.toString();
    }

    /* ----------------------------------------------------------------------------------------- */
    
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((_subscriptionId == null) ? 0 : _subscriptionId.hashCode());
		return result;
	}

	/* ----------------------------------------------------------------------------------------- */
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof SDQLUnsubscribeRequest))
			return false;
		SDQLUnsubscribeRequest other = (SDQLUnsubscribeRequest) obj;
		if (_subscriptionId == null) {
			if (other._subscriptionId != null)
				return false;
		} else if (!_subscriptionId.equals(other._subscriptionId))
			return false;
		return true;
	}
    
    /* ----------------------------------------------------------------------------------------- */
    
    
}