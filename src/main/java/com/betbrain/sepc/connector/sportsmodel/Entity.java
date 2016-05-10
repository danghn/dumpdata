package com.betbrain.sepc.connector.sportsmodel;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.betbrain.sepc.connector.util.beans.AbstractBean;

/**
 * Represents a Sports Model entity.
 * <p>
 * Note that "Sports Model" here refers to the data model of the PublisherApp, not ModelApp.
 * 
 * @author Morten Helles
 */
@MappedSuperclass
public abstract class Entity extends AbstractBean {

    // --------------------------------------------------------------------------------------------
    // Class fields
    // --------------------------------------------------------------------------------------------

    private static final long serialVersionUID = 1L;
    
    public static final String PROPERTY_NAME_id = "id"; 
    
    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------
    @Id
    private long _id;
    
    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------
    
    public Entity() {

    }
    
    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------
    
    public long getId() {
        
        return _id;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public void setId(long id) {
        
        _id = id;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public int hashCode() {
        
        return getClass().hashCode() ^ (int) (_id ^ (_id >>> 32));
    }

    /* ----------------------------------------------------------------------------------------- */

    public boolean equals(Object object) {

        if (object == null)
            return false;
        
        if (!getClass().equals(object.getClass()))
            return false;
        
        Entity other = (Entity) object;
        
        return _id == other._id;
    }
    
    /* ----------------------------------------------------------------------------------------- */    
    
}