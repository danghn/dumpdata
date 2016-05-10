package com.betbrain.sepc.connector.sportsmodel;

import java.util.Date;

/**
 * See the Sports Model documentation.
 *
 * @author Morten Helles
 */
@javax.persistence.Entity
public class BettingOffer extends Entity {
    
    // --------------------------------------------------------------------------------------------
    // Class fields
    // --------------------------------------------------------------------------------------------
    
    private static final long serialVersionUID = 1L;
    
    public static final String PROPERTY_NAME_providerId = "providerId";
    public static final String PROPERTY_NAME_sourceId = "sourceId";
    public static final String PROPERTY_NAME_outcomeId = "outcomeId";
    public static final String PROPERTY_NAME_bettingTypeId = "bettingTypeId";
    public static final String PROPERTY_NAME_statusId = "statusId";
    public static final String PROPERTY_NAME_isLive = "isLive";
    public static final String PROPERTY_NAME_odds = "odds";
    public static final String PROPERTY_NAME_multiplicity = "multiplicity";
    public static final String PROPERTY_NAME_volume = "volume";
    public static final String PROPERTY_NAME_volumeCurrencyId = "volumeCurrencyId";
    public static final String PROPERTY_NAME_couponKey = "couponKey";
    public static final String PROPERTY_NAME_slotNum = "slotNum";
    public static final String PROPERTY_NAME_lastChangedTime = "lastChangedTime";
    
    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------
    
    private long _providerId;
    private long _sourceId;
    private long _outcomeId;
    private long _bettingTypeId;
    private long _statusId;
    private Boolean _isLive;
    private Float _odds;
    private Integer _multiplicity;
    private Float _volume;
    private Long _volumeCurrencyId;
    private String _couponKey;
    private int _slotNum;
    private Date _lastChangedTime;
    
    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------
    
    public BettingOffer() {
    
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
    
    public long getOutcomeId() {
    
        return _outcomeId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setOutcomeId(long outcomeId) {
    
        _outcomeId = outcomeId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public long getBettingTypeId() {
    
        return _bettingTypeId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setBettingTypeId(long bettingTypeId) {
    
        _bettingTypeId = bettingTypeId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public long getStatusId() {
    
        return _statusId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setStatusId(long statusId) {
    
        _statusId = statusId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public Boolean getIsLive() {
    
        return _isLive;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setIsLive(Boolean isLive) {
    
        _isLive = isLive;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public Float getOdds() {
    
        return _odds;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setOdds(Float odds) {
    
        _odds = odds;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public Integer getMultiplicity() {
    
        return _multiplicity;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setMultiplicity(Integer multiplicity) {
    
        _multiplicity = multiplicity;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    	public Float getVolume() {
    		
    		return _volume;
    	}
    
    /* ----------------------------------------------------------------------------------------- */
    
    	public void setVolume(Float volume) {
    		
    		_volume = volume;
    	}
    
    /* ----------------------------------------------------------------------------------------- */
    
    	public Long getVolumeCurrencyId() {
    		
    		return _volumeCurrencyId;
    	}
    
    /* ----------------------------------------------------------------------------------------- */
    
    	public void setVolumeCurrencyId(Long volumeCurrencyId) {
    		
    		_volumeCurrencyId = volumeCurrencyId;
    	}
    
    /* ----------------------------------------------------------------------------------------- */
    
    public String getCouponKey() {
    
        return _couponKey;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setCouponKey(String couponKey) {
    
        _couponKey = couponKey;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public int getSlotNum() {
    
        return _slotNum;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setSlotNum(int slotNum) {
    
        _slotNum = slotNum;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
      public Date getLastChangedTime() {
            
          return _lastChangedTime;
      }
    
    /* ----------------------------------------------------------------------------------------- */
    
      public void setLastChangedTime(Date lastChangedTime) {
            
          _lastChangedTime = lastChangedTime;
      }
    
    /* ----------------------------------------------------------------------------------------- */
      
      public static void main(String[] args) {
    
        Integer i = 2;
        System.out.println(Integer.toString(i).getBytes().length);
    }
}