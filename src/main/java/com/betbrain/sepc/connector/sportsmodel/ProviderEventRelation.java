package com.betbrain.sepc.connector.sportsmodel;

import java.util.Date;

/**
 * See the Sports Model documentation.
 * 
 * @author Morten Helles
 */
@javax.persistence.Entity
public class ProviderEventRelation extends Entity {

    // --------------------------------------------------------------------------------------------
    // Class fields
    // --------------------------------------------------------------------------------------------

    private static final long serialVersionUID = 1L;

    public static final String PROPERTY_NAME_providerId = "providerId";
    public static final String PROPERTY_NAME_eventId = "eventId";
    public static final String PROPERTY_NAME_startTime = "startTime";
    public static final String PROPERTY_NAME_endTime = "endTime";
    public static final String PROPERTY_NAME_timeQualityRank = "timeQualityRank";
    public static final String PROPERTY_NAME_offersLiveOdds = "offersLiveOdds";
    public static final String PROPERTY_NAME_offersLiveTV = "offersLiveTV";    
    
    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------
    
    private long _providerId;
    private long _eventId;
    private Date _startTime;
    private Date _endTime;
    private int _timeQualityRank;
    private boolean _offersLiveOdds;
    private boolean _offersLiveTV;    
    
    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------
    
    public ProviderEventRelation() {
        
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

    public long getEventId() {
        
        return _eventId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setEventId(long eventId) {
        
        _eventId = eventId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public Date getStartTime() {
        
        return _startTime;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setStartTime(Date startTime) {
        
        _startTime = startTime;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public Date getEndTime() {
        
        return _endTime;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setEndTime(Date endTime) {
        
        _endTime = endTime;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public int getTimeQualityRank() {
        
        return _timeQualityRank;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setTimeQualityRank(int timeQualityRank) {
        
        _timeQualityRank = timeQualityRank;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public boolean getOffersLiveOdds() {
        
        return _offersLiveOdds;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setOffersLiveOdds(boolean offersLiveOdds) {
        
        _offersLiveOdds = offersLiveOdds;
    }

    /* ----------------------------------------------------------------------------------------- */
    
    public boolean isOffersLiveTV() {
    
        return _offersLiveTV;
    }

    /* ----------------------------------------------------------------------------------------- */
    
    public void setOffersLiveTV(boolean offersLiveTV) {
    
        _offersLiveTV = offersLiveTV;
    }
}