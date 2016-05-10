package com.betbrain.sepc.connector.sportsmodel;

import javax.persistence.MappedSuperclass;

/**
 * See the Sports Model documentation.
 * 
 * @author Morten Helles
 */
@MappedSuperclass
public abstract class TypedEntity extends Entity {

	// --------------------------------------------------------------------------------------------
	// Class fields
	// --------------------------------------------------------------------------------------------

	private static final long serialVersionUID = 1L;

	public static final String PROPERTY_NAME_typeId = "typeId";

	// --------------------------------------------------------------------------------------------
	// Constructors
	// --------------------------------------------------------------------------------------------
	
	public TypedEntity() {
		
	}
	
	// --------------------------------------------------------------------------------------------
	// Instance fields
	// --------------------------------------------------------------------------------------------
	
	private long _typeId;
	
	// --------------------------------------------------------------------------------------------
	// Instance methods
	// --------------------------------------------------------------------------------------------

	public long getTypeId() {
		
		return _typeId;
	}

    /* ----------------------------------------------------------------------------------------- */
	
	public void setTypeId(long typeId) {
		
		_typeId = typeId;
	}
	
    /* ----------------------------------------------------------------------------------------- */
}