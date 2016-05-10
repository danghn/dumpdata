package com.betbrain.sepc.connector.sdql;

@SuppressWarnings("serial")
class SDQLErrorException extends Exception {

    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------

    private SDQLError _sdqlError;

    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------
    
    public SDQLErrorException(SDQLError sdqlError) {

        super(sdqlError.getMessage() + " [code=" + sdqlError.getCode() + "]");
        
        _sdqlError = sdqlError;
    }

    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------
    
    public SDQLError getSDQLError() {
        
        return _sdqlError;
    }
    
    /* ----------------------------------------------------------------------------------------- */
}