package com.betbrain.sepc.connector.sdql;

import com.betbrain.sepc.connector.sportsmodel.EntityChangeBatch;

/**
 * Provides information on how an application deals with the {@link EntityChangeBatch entity change batches} received from the
 * Sports Engine.  
 * @author kaltman
 */
public interface EntityChangeBatchProcessingMonitor {

	// --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------
	
	/**
	 * @return The id of the last applied {@link EntityChangeBatch EntityChangeBatch}.
	 * Clients must implement logic that provides the last batch id received as a result of an update request.
	 * The value returned as last batch id will be used by the SEPC connector to make resume update requests if needed. 
	 */
	long getLastAppliedEntityChangeBatchId();
	
}
