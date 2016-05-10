package com.betbrain.sepc.connector.sdql;

import java.util.List;

import com.betbrain.sepc.connector.sportsmodel.Entity;

/**
 * Represents an SDQL initial-data construct.
 * 
 * @author Morten Helles
 */
class SDQLInitialData extends SDQLConstruct {

    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------

    private String _batchId;
    private int _batchesLeft; 
    private boolean _dumpComplete;
    private List<? extends Entity> _entities;
    
    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------
    
    public SDQLInitialData(String batchId, int batchesLeft, boolean dumpComplete, List<? extends Entity> entities) {

        _batchId = batchId;
        _batchesLeft = batchesLeft;
        _dumpComplete = dumpComplete;
        _entities = entities;
    }

    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------
    
    public String getBatchId() {
        
        return _batchId;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public int getBatchesLeft() {
        
        return _batchesLeft;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public boolean getDumpComplete() {
        
        return _dumpComplete;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public List<? extends Entity> getEntities() {
        
        return _entities;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(batchId=");
        sb.append(_batchId);
        sb.append(",batchesLeft=");
        sb.append(_batchesLeft);
        sb.append(",dumpComplete=");
        sb.append(_dumpComplete);
        sb.append(",#entities=");
        sb.append(_entities == null ? 0 : _entities.size());
        sb.append(")");
        
        return sb.toString();
    }
    
    /* ----------------------------------------------------------------------------------------- */
}