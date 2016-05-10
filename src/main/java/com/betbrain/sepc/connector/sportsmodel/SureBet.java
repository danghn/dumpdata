package com.betbrain.sepc.connector.sportsmodel;

import java.util.List;

/**
 * See the Sports Model documentation.
 *
 * @author Morten Helles
 */

public class SureBet extends Entity {

	// --------------------------------------------------------------------------------------------
	// Class fields
	// --------------------------------------------------------------------------------------------

	private static final long serialVersionUID = 1L;

    public static final String PROPERTY_NAME_bettingOfferIds = "bettingOfferIds";
	public static final String PROPERTY_NAME_profit = "profit";
	
	// --------------------------------------------------------------------------------------------
	// Instance fields
	// --------------------------------------------------------------------------------------------
	
    private List<Long> _bettingOfferIds;
	private float _profit;
	
	// --------------------------------------------------------------------------------------------
	// Constructors
	// --------------------------------------------------------------------------------------------
	
	public SureBet() {
		
	}

	// --------------------------------------------------------------------------------------------
	// Instance methods
	// --------------------------------------------------------------------------------------------


    public List<Long> getBettingOfferIds() {
        
        return _bettingOfferIds;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setBettingOfferIds(List<Long> bettingOfferIds) {
        
        _bettingOfferIds = bettingOfferIds;
    }
    
    /* ----------------------------------------------------------------------------------------- */
	
	public float getProfit() {
		
		return _profit;
	}
	
	/* ----------------------------------------------------------------------------------------- */
	
	public void setProfit(float profit) {
		
		_profit = profit;
	}
	
	/* ----------------------------------------------------------------------------------------- */
}