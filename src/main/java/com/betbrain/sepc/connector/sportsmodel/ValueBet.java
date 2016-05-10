package com.betbrain.sepc.connector.sportsmodel;

/**
 * See the Sports Model documentation.
 *
 * @author Morten Helles
 */
@javax.persistence.Entity
public class ValueBet extends Entity {

	// --------------------------------------------------------------------------------------------
	// Class fields
	// --------------------------------------------------------------------------------------------

	private static final long serialVersionUID = 1L;

	public static final String PROPERTY_NAME_bettingOfferId = "bettingOfferId";
	public static final String PROPERTY_NAME_value = "value";

	// --------------------------------------------------------------------------------------------
	// Instance fields
	// --------------------------------------------------------------------------------------------
	
	private long _bettingOfferId;
	private float _value;
	
	// --------------------------------------------------------------------------------------------
	// Constructors
	// --------------------------------------------------------------------------------------------
	
	public ValueBet() {
		
	}

	// --------------------------------------------------------------------------------------------
	// Instance methods
	// --------------------------------------------------------------------------------------------

	public long getBettingOfferId() {
		
		return _bettingOfferId;
	}
	
	/* ----------------------------------------------------------------------------------------- */
	
	public void setBettingOfferId(long bettingOfferId) {
		
		_bettingOfferId = bettingOfferId;
	}
	
	/* ----------------------------------------------------------------------------------------- */

	public float getValue() {
		
		return _value;
	}
	
	/* ----------------------------------------------------------------------------------------- */
	
	public void setValue(float value) {
		
		_value = value;
	}
	
	/* ----------------------------------------------------------------------------------------- */
}