package com.betbrain.sepc.connector.sportsmodel;

import java.util.Date;
@javax.persistence.Entity
public class NewsStory extends Entity {
    
    // --------------------------------------------------------------------------------------------
    // Class fields
    // --------------------------------------------------------------------------------------------
    
    private static final long serialVersionUID = 1L;
    
    public static final String PROPERTY_NAME_providerId = "providerId";
    public static final String PROPERTY_NAME_sourceId = "sourceId";
    public static final String PROPERTY_NAME_headline = "headline";
    public static final String PROPERTY_NAME_summary = "summary";
    public static final String PROPERTY_NAME_url = "url";
    public static final String PROPERTY_NAME_publicationTime = "publicationTime";
    public static final String PROPERTY_NAME_lastRevisedTime = "lastRevisedTime";
    
    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------
    
    private long _providerId;
    private long _sourceId;
    private String _headline;
    private String _summary;
    private String _url;
    private Date _publicationTime;
    private Date _lastRevisedTime;
    
    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------
    
    public NewsStory() {
    
    }
    
    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------
    
    public long getProviderId() {
    
        return _providerId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setProviderId(long providerId) {
    
        _providerId = providerId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public long getSourceId() {
    
        return _sourceId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setSourceId(long sourceId) {
    
        _sourceId = sourceId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public String getHeadline() {
    
        return _headline;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setHeadline(String headline) {
    
        _headline = headline;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public String getSummary() {
    
        return _summary;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setSummary(String summary) {
    
        _summary = summary;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public String getUrl() {
    
        return _url;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setUrl(String url) {
    
        _url = url;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public Date getPublicationTime() {
    
        return _publicationTime;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setPublicationTime(Date publicationTime) {
    
        _publicationTime = publicationTime;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public Date getLastRevisedTime() {
    
        return _lastRevisedTime;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setLastRevisedTime(Date lastRevisedTime) {
    
        _lastRevisedTime = lastRevisedTime;
    }
    
    /* ----------------------------------------------------------------------------------------- */
}
