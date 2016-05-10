package com.betbrain.sepc.connector.util;

import java.util.Date;

/**
 * Provides various utility methods for <code>Object</code>s. 
 * 
 * @author Morten Helles
 */
public class ObjectUtil {

	// --------------------------------------------------------------------------------------------
	// Class methods
	// --------------------------------------------------------------------------------------------

	/**
	 * Returns true if the two specified objects are equal, and false otherwise.
	 * <p>
	 * This method supports null values. If both objects are null, then true is returned. If one
	 * object is null, but the other object is not, then the <code>equals</code> method of the
	 * non-null object is invoked to determine equality.
	 * 
	 * @param obj1 the first object.
	 * @param obj2 the second object.
	 * @return true if the two specified objects are equal, and false otherwise.
	 */
	public static boolean equal(Object obj1, Object obj2) {
		
		if (obj1 == obj2)
			return true;
		else if (obj1 == null)
			return obj2.equals(obj1);
		else
			return obj1.equals(obj2);
	}
	
	/* ----------------------------------------------------------------------------------------- */

	/**
	 * Returns the hash code of the specified object, or zero if null.
	 * <p>
	 * If the object is null, then zero is returned. Otherwise, the <code>hashCode</code> method of
	 * the object is invoked to determine the hash code.
	 * 
	 * @param obj the object.
	 * @return the hash code of the specified object, or zero if null.
	 */
	public static int hashCode(Object obj) {
		
		return (obj == null) ? 0 : obj.hashCode();
	}

	/* ----------------------------------------------------------------------------------------- */

	/**
	 * Returns a string representation of the specified object, or null if null.
	 * <p>
	 * If the object is null, then null is returned. Otherwise, the <code>toString</code> method of
	 * the object is invoked to determine the string representation.
	 * 
	 * @param obj the object.
	 * @return a string representation of the specified object, or null if null.
	 */
	public static String toString(Object obj) {
		
		return (obj == null) ? null : obj.toString();
	}
	
    /* ----------------------------------------------------------------------------------------- */
	
    /**
     * Returns a clone of the specified object if it is <code>PublicCloneable</code>, the object
     * itself if it is immutable, or null if the object is null.
     * <p>
     * The following types are known to this method as being immutable:
     * <ul>
     *   <li><code>Boolean</code></li>
     *   <li><code>Byte</code></li>
     *   <li><code>Character</code></li>
     *   <li><code>Date</code></li>
     *   <li><code>Double</code></li>
     *   <li><code>Float</code></li>
     *   <li><code>Integer</code></li>
     *   <li><code>Long</code></li>
     *   <li><code>Short</code></li>
     *   <li><code>String</code></li>
     * </ul>
     * <p>
     * If the specified obj is <code>PublicCloneable</code> then that object's <code>clone()</code>
     * will take precedence, i.e. always be invoked.
     *
     * @param obj the object to clone, or null if none.
     * @return a clone of the specified object if it is <code>PublicCloneable</code>, the object
     * itself if it is immutable, or null if the object is null.
     * @exception RuntimeException if the object could not be cloned.
     */
    public static Object clone(Object obj) {

        if (obj == null)
            return null;

        if (obj instanceof PublicCloneable)
            return ((PublicCloneable) obj).clone();

        if (obj instanceof Boolean)
            return obj;

        if (obj instanceof Byte)
            return obj;

        if (obj instanceof Character)
            return obj;

        if (obj instanceof Date)
            return obj;

        if (obj instanceof Double)
            return obj;

        if (obj instanceof Float)
            return obj;

        if (obj instanceof Integer)
            return obj;

        if (obj instanceof Long)
            return obj;

        if (obj instanceof Short)
            return obj;

        if (obj instanceof String)
            return obj;

        throw new RuntimeException("Unable to clone object of class '" + obj.getClass().getName() + "'.");
    }

    /* ----------------------------------------------------------------------------------------- */

    /**
     * Returns true if the specified object can be assigned to a variable of the specified class,
     * and false otherwise.
     * <p>
     * The method allows object-to-primitive assignment if object is not null.
     * 
     * @param clazz the class, which must not be null. 
     * @param obj the object, which may be null.
     * @return true if the specified object can be assigned to a variable of the specified class,
     * and false otherwise.
     */
    public static boolean isAssignable(Class<?> clazz, Object obj) {
        
        if (clazz.isInstance(obj))
            return true;
        
        if (clazz.equals(boolean.class))
            return (obj != null) ? obj instanceof Boolean : false; 
        
        if (clazz.equals(short.class))
            return (obj != null) ? obj instanceof Short : false; 
        
        if (clazz.equals(int.class))
            return (obj != null) ? obj instanceof Integer : false; 
            
        if (clazz.equals(long.class))
            return (obj != null) ? obj instanceof Long : false; 

        if (clazz.equals(float.class))
            return (obj != null) ? obj instanceof Float : false; 
        
        if (clazz.equals(double.class))
            return (obj != null) ? obj instanceof Double : false; 
            
        return false;
    }

    /* ----------------------------------------------------------------------------------------- */

    /**
     * Returns a new instance of the specified class.
     * 
     * @return a new instance of the specified class.
     * @throws RuntimeException if unable to create a new instance.
     */
    public static <T extends Object> T newInstance(Class<T> clazz) {
        
        try {
            return clazz.newInstance();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        }
    }

	// --------------------------------------------------------------------------------------------
	// Constructors
	// --------------------------------------------------------------------------------------------
	
    /**
     * Cannot be instantiated.
     */
	private ObjectUtil() {
		
	}
	
	/* ----------------------------------------------------------------------------------------- */
}