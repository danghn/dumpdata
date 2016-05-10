package com.betbrain.sepc.connector.sportsmodel;

/**
 * See the Sports Model documentation.
 * 
 * @author Marius Balaniuc [<a href="mailto:marius.balaniuc@betbrain.com">marius.balaniuc@betbrain.com</a>]
 */
@javax.persistence.Entity
public class NewsStoryEntityTag extends Entity {
    
    // --------------------------------------------------------------------------------------------
    // Class fields
    // --------------------------------------------------------------------------------------------
    
    private static final long serialVersionUID = 1L;
    
    public static final String PROPERTY_NAME_newsStoryId = "newsStoryId";
    public static final String PROPERTY_NAME_entityTypeId = "entityTypeId";
    public static final String PROPERTY_NAME_entityId = "entityId";
    public static final String PROPERTY_NAME_strength = "strength";
    
    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------
    
    private long _newsStoryId;
    private long _entityTypeId;
    private long _entityId;
    private float _strength;
    
    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------
    
    public NewsStoryEntityTag() {
    
    }
    
    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------
    
    public long getNewsStoryId() {
    
        return _newsStoryId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setNewsStoryId(long newsStoryId) {
    
        _newsStoryId = newsStoryId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public long getEntityTypeId() {
    
        return _entityTypeId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setEntityTypeId(long entityTypeId) {
    
        _entityTypeId = entityTypeId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public long getEntityId() {
    
        return _entityId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setEntityId(long entityId) {
    
        _entityId = entityId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public float getStrength() {
    
        return _strength;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setStrength(float strength) {
    
        _strength = strength;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
}
