package com.betbrain.sepc.connector.sdql;

import java.util.List;

import com.betbrain.sepc.connector.sportsmodel.Entity;
import com.betbrain.sepc.connector.sportsmodel.EntityChangeBatch;

/**
 * Listens to the {@link SEPCConnector} activity. 
 * @author gka
 */
public interface SEPCConnectorListener {

    // --------------------------------------------------------------------------------------------
    // Interface methods
    // --------------------------------------------------------------------------------------------
    
    /**
     * Notify the listener that the initial dump is retrieved.
     * @param entities Entities in the initial dump.
     */
    void notifyInitialDump(List<? extends Entity> entities);

    /* ----------------------------------------------------------------------------------------- */
    
    
    /**
     * Notify the listener that entity updates were retrieved.
     * @param entityChangeBatchIterator Iterator of batches containing the entity updates, in the received order.
     * The entity updates must be applied in the received order.
     */
    void notifyEntityUpdates(EntityChangeBatch entityChangeBatchIterator);
    
    /* ----------------------------------------------------------------------------------------- */
      
}
