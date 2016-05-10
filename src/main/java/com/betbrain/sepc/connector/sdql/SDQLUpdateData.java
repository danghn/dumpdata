package com.betbrain.sepc.connector.sdql;

import java.util.Date;
import java.util.List;

import com.betbrain.sepc.connector.sportsmodel.EntityChange;

/**
 * Represents an SDQL update-data construct.
 * 
 * @author Morten Helles
 */
class SDQLUpdateData extends SDQLConstruct {

    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------

    private long _batchId;
    private Date _createdTime; 
    private List<EntityChange> _entityChanges;
    
    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------
    
    public SDQLUpdateData(long batchId, Date createdTime, List<EntityChange> entityChanges) {

        _batchId = batchId;
        _createdTime = createdTime;
        _entityChanges = entityChanges;
    }

    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------
    
    public long getBatchId() {
        
        return _batchId;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public Date getCreatedTime() {
        
        return _createdTime;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public List<EntityChange> getEntityChanges() {
        
        return _entityChanges;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(batchId=");
        sb.append(_batchId);
        sb.append(",createdTime=");
        sb.append(_createdTime);
        sb.append(",#entityChanges=");
        sb.append(_entityChanges == null ? 0 : _entityChanges.size());
        sb.append(")");
        
        return sb.toString();
    }
    
    /* ----------------------------------------------------------------------------------------- */
}