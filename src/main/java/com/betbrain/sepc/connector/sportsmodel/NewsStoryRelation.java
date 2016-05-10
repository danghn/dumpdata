package com.betbrain.sepc.connector.sportsmodel;
@javax.persistence.Entity
public class NewsStoryRelation extends Entity {
    
    // --------------------------------------------------------------------------------------------
    // Class fields
    // --------------------------------------------------------------------------------------------
    
    private static final long serialVersionUID = 1L;
    
    public static final String PROPERTY_NAME_newsStoryId1 = "newsStoryId1";
    public static final String PROPERTY_NAME_newsStoryId2 = "newsStoryId2";
    public static final String PROPERTY_NAME_similarity = "similarity";
    
    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------
    
    private long _newsStoryId1;
    private long _newsStoryId2;
    private float _similarity;
    
    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------
    
    public NewsStoryRelation() {
    
    }
    
    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------
    
    public long getNewsStoryId1() {
    
        return _newsStoryId1;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setNewsStoryId1(long newsStoryId1) {
    
        _newsStoryId1 = newsStoryId1;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public long getNewsStoryId2() {
    
        return _newsStoryId2;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setNewsStoryId2(long newsStoryId2) {
    
        _newsStoryId2 = newsStoryId2;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public float getSimilarity() {
    
        return _similarity;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setSimilarity(float similarity) {
    
        _similarity = similarity;
    }
    
    /* ----------------------------------------------------------------------------------------- */
}
