package com.betbrain.sepc.connector.sportsmodel;

import java.util.Date;
import java.util.List;

/**
 * Represents a Sports Model entity change batch.
 * 
 * @author Morten Helles
 */
public class EntityChangeBatch {

    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------

    private long _id;
    private Date _createTime; // the ModelApp create time
    private List<EntityChange> _entityChanges;
    
    // --------------------------------------------------------------------------------------------
    // Constructor
    // --------------------------------------------------------------------------------------------
    
    public EntityChangeBatch(long id, Date createTime, List<EntityChange> entityChanges) {

        _id = id;
        _createTime = createTime;
        _entityChanges = entityChanges;
    }
    
    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------

    public long getId() {
        
        return _id;
    }
    
    /* ----------------------------------------------------------------------------------------- */
  
    public Date getCreateTime() {
        
        return _createTime;
    }
    
    /* ----------------------------------------------------------------------------------------- */
 
    public List<EntityChange> getEntityChanges() {
        
        return _entityChanges;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(id=");
        sb.append(_id);
        sb.append(",createTime=");
        sb.append(_createTime);
        sb.append(",#entityChanges=");
        sb.append(_entityChanges == null ? 0 : _entityChanges.size());
        sb.append(")");

        return sb.toString();
    }
    
    /* ----------------------------------------------------------------------------------------- */
}