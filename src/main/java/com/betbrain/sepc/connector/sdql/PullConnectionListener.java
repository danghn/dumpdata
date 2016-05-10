package com.betbrain.sepc.connector.sdql;


interface PullConnectionListener {
    /**
     * This method is called when a request to the SEPC was successful 
     * and an SDQLConstruct was obtained based on the response received.
     */
    public void requestSuccess(SDQLConstruct sdqlConstruct);
    
    /**
     * This method is called when a request to the SEPC failed due to 
     * network or protocol errors.
     * @param cause
     */
    public void requestFailed(Throwable cause);
    
    /**
     * This method is called when a request to the SEPC was successful 
     * but an SDQLError was obtained based on the response received (SPEC publisher responded with an error message).
     * @param sdqlError
     */
    public void responseError(SDQLError sdqlError);
    
    /**
     * This method is called when a request to the SEPC failed 
     * due to server errors e.g. unavailability
     * Any HTTP status except 200 is handled here
     * @param statusCode
     */
    public void requestError(int statusCode);
}
