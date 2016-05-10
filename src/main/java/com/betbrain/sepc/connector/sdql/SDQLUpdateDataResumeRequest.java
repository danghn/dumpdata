package com.betbrain.sepc.connector.sdql;

/**
 * Represents an SDQL update data resume request.
 * 
 * @author Morten Helles
 */
public class SDQLUpdateDataResumeRequest extends SDQLConstruct {

    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------

    private String _subscriptionSpecificationName;
    private String _subscriptionId;
    private long _lastBatchId;
    
    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------
    
    public SDQLUpdateDataResumeRequest(String subscriptionSpecificationName, String subscriptionId, long lastBatchId) {

        _subscriptionSpecificationName = subscriptionSpecificationName;
        _subscriptionId = subscriptionId;
        _lastBatchId = lastBatchId;
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
    
    public long getLastBatchId() {
        
        return _lastBatchId;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(subscriptionSpecificationName=");
        sb.append(_subscriptionSpecificationName);
        sb.append(",subscriptionId=");
        sb.append(_subscriptionId);
        sb.append(",lastBatchId=");
        sb.append(_lastBatchId);
        sb.append(")");
        
        return sb.toString();
    }

    /* ----------------------------------------------------------------------------------------- */
    
    @Override
    public int hashCode() {
    
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (_lastBatchId ^ (_lastBatchId >>> 32));
        result = prime * result + ((_subscriptionId == null) ? 0 : _subscriptionId.hashCode());
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
        SDQLUpdateDataResumeRequest other = (SDQLUpdateDataResumeRequest) obj;
        if (_lastBatchId != other._lastBatchId)
            return false;
        if (_subscriptionId == null) {
            if (other._subscriptionId != null)
                return false;
        } else if (!_subscriptionId.equals(other._subscriptionId))
            return false;
        return true;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    
}