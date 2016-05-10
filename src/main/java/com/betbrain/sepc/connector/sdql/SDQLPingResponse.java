package com.betbrain.sepc.connector.sdql;

/**
 * Represents an SDQL ping response.
 * 
 * @author Morten Helles
 */
class SDQLPingResponse extends SDQLConstruct {

    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------

    private String _id;
    
    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------
    
    public SDQLPingResponse(String id) {

        _id = id;
    }
    
    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------
    
    public String getId() {
        
        return _id;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(id=");
        sb.append(_id);
        sb.append(")");
        
        return sb.toString();
    }
    
    /* ----------------------------------------------------------------------------------------- */
}