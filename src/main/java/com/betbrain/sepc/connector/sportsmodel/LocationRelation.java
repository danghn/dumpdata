package com.betbrain.sepc.connector.sportsmodel;


/**
 * See the Sports Model documentation.
 * 
 * @author Morten Helles
 */
@javax.persistence.Entity
public class LocationRelation extends TypedEntity {

	// --------------------------------------------------------------------------------------------
	// Class fields
	// --------------------------------------------------------------------------------------------

	private static final long serialVersionUID = 1L;

	public static final String PROPERTY_NAME_fromLocationId = "fromLocationId";
	public static final String PROPERTY_NAME_toLocationId = "toLocationId";
	
	// --------------------------------------------------------------------------------------------
	// Instance fields
	// --------------------------------------------------------------------------------------------
	
	private long _fromLocationId;
	private long _toLocationId;
	
	// --------------------------------------------------------------------------------------------
	// Constructors
	// --------------------------------------------------------------------------------------------
	
	public LocationRelation() {
		
	}

	// --------------------------------------------------------------------------------------------
	// Instance methods
	// --------------------------------------------------------------------------------------------

	public long getFromLocationId() {
		
		return _fromLocationId;
	}
	
	/* ----------------------------------------------------------------------------------------- */
	
	public void setFromLocationId(long fromLocationId) {
		
		_fromLocationId = fromLocationId;
	}
	
	/* ----------------------------------------------------------------------------------------- */

	public long getToLocationId() {
		
		return _toLocationId;
	}
	
	/* ----------------------------------------------------------------------------------------- */
	
	public void setToLocationId(long toLocationId) {
		
		_toLocationId = toLocationId;
	}
	
	/* ----------------------------------------------------------------------------------------- */
}