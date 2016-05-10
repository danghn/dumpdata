package com.betbrain.sepc.connector.sdql;

/**
 * Represents an SDQL unsubscribe response.
 * 
 * @author Morten Helles
 */
class SDQLUnsubscribeResponse extends SDQLConstruct {

    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------

    private int _code;
    private String _message;

    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------
    
    public SDQLUnsubscribeResponse(int code, String message) {

        _code = code;
        _message = message;
    }

    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------
    
    public int getCode() {
        
        return _code;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public String getMessage() {
        
        return _message;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(code=");
        sb.append(_code);
        sb.append(",message=");
        sb.append(_message);
        sb.append(")");
        
        return sb.toString();
    }
    
    /* ----------------------------------------------------------------------------------------- */
}