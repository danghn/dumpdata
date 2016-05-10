package com.betbrain.sepc.connector.sdql;

final class PullConnectorParams {
	
	private PullConnectorParams() {
	}
	
	/**
	 * Request parameter names
	 */
	public final static String SUBSCRIPTION_SPECIFICATION_NAME = "subscriptionSpecificationName";
	
	public final static String SUBSCRIPTION_ID = "subscriptionId";
	
    public final static String LAST_BATCH_ID = "lastBatchId";
    
    public static final String REQUEST_TYPE = "requestType";
    
    /**
     * Parameter values for request type
     */
	public final static String SUBSCRIBE_REQUEST ="SubscribeRequest";

    public static final String INITIAL_DATA_REQUEST = "GetNextInitialDataRequest";
    
    public static final String NEXT_UPDATE_REQUEST = "GetNextUpdateDataRequest";
    
    public static final String RESUME_UPDATE_REQUEST = "UpdateDataResumeRequest";
 
    public static final String UNSUBSCRIBE_REQUEST = "UnsubscribeRequest";
        
}
