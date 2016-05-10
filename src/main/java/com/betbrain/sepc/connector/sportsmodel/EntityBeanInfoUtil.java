package com.betbrain.sepc.connector.sportsmodel;

/**
 * This is a utility class for entity <code>BeanInfo</code> instances.
 * 
 * @author Morten Helles
 */
public class EntityBeanInfoUtil {

    // --------------------------------------------------------------------------------------------
    // Class fields
    // --------------------------------------------------------------------------------------------
    
    /**
     * Indicates that a certain property references another entity. The value is the referenced
     * entity class.
     */
    public static final String PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS = "PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS";
    public static final String PROPERTY_DESCRIPTOR_ENTITIES_REFERENCE_CLASS = "PROPERTY_DESCRIPTOR_ENTITIES_REFERENCE_CLASS";
    
	// --------------------------------------------------------------------------------------------
	// Constructors
	// --------------------------------------------------------------------------------------------

    /**
     * Disallow instantiation.
     */
    private EntityBeanInfoUtil() {
        
    }

    /* ----------------------------------------------------------------------------------------- */
}