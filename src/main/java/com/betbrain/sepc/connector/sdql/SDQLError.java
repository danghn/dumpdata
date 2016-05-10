package com.betbrain.sepc.connector.sdql;

/**
 * Represents an SDQL error.
 * 
 * @author Morten Helles
 */
class SDQLError extends SDQLConstruct {
	
	public static final int ERROR_GET_NEXT_UPDATE_DATA_REQUEST_TOO_OFTEN = 305;

    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------

    private int _code;
    private String _message;

    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------
    
    public SDQLError(int code, String message) {

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