package com.betbrain.sepc.connector.util;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Provides various utility methods for <code>String</code>s. 
 * 
 * @author Morten Helles
 */
public class StringUtil {

	// --------------------------------------------------------------------------------------------
	// Class fields
	// --------------------------------------------------------------------------------------------
	
	public static final String EMPTY_STRING = "";
	
	// --------------------------------------------------------------------------------------------
	// Class methods
	// --------------------------------------------------------------------------------------------

	/**
	 * Returns the specified collection as a "separated-value string", wherein each object's string
	 * representation (as defined by the object's <code>toString</code> method) is separated with
	 * the specified separator.
	 * <p>
	 * If the specified collection is null, then null is returned.
	 * 
	 * @param collection the collection.
	 * @param seperator the string seperator.
	 * @return the specified collection as a "separated-value string".
	 */
	public static String toSV(Collection<? extends Object> collection, String seperator) {
		
		if (collection == null)
			return null;
		
		if (collection.isEmpty())
			return EMPTY_STRING;
		
		StringBuilder sb = new StringBuilder();
		for (Iterator<? extends Object> i = collection.iterator(); i.hasNext(); ) {
			sb.append(i.next());
			if (i.hasNext())
				sb.append(seperator);
		}
		
		return sb.toString();
	}

	/* ----------------------------------------------------------------------------------------- */

	/**
     * Returns the specified collection as a comma-separated string, wherein each object's string
     * representation (as defined by the object's <code>toString</code> method) is separated with a
     * comma (',').
     * <p>
     * If the specified collection is null, then null is returned.
	 * 
     * @param collection the collection.
     * @return the specified collection as a comma-separated string.
	 */
	public static String toCSV(Collection<? extends Object> collection) {
		
		return toSV(collection, ",");
	}

    /* ----------------------------------------------------------------------------------------- */

	/**
	 * Returns the values (separated by the specified separator) in the specified string as a list
	 * of strings.
	 * <p>
	 * If the specified string is null, then null is returned.
	 * 
	 * @param string the string of separated values.
	 * @param separator the value separator.
	 * @return the list of values.
	 */
	public static List<String> fromSV(String string, String separator) {

	    if (string == null)
	        return null;
	    
	    List<String> list = new ArrayList<String>();
	    StringTokenizer st = new StringTokenizer(string, separator);
	    while (st.hasMoreTokens())
	        list.add(st.nextToken());
	    
	    return list;
	}
	
    /* ----------------------------------------------------------------------------------------- */

    /**
     * Returns the comma-separated values in the specified string as a list of strings.
     * <p>
     * If the specified string is null, then null is returned.
     * 
     * @param string the string of comma-separated values.
     * @return the list of values.
     */
    public static List<String> fromCSV(String string) {

        return fromSV(string, ",");
    }
    
    /* ----------------------------------------------------------------------------------------- */

	/**
	 * Returns true if the specified string is null or empty, and false otherwise.
	 * 
	 * @param str the string.
	 * @return true if the specified string is null or empty, and false otherwise.
	 */
	public static boolean isNullOrEmpty(String str) {

	    return (str == null) || (str.length() == 0);
	}

    /* ----------------------------------------------------------------------------------------- */

	/**
	 * Returns the specified string as an object of the specified return type.
	 * 
	 * @param string the string to parse.
	 * @param returnType the type to parse into.
	 * @return the specified string as an object of the specified return type.
	 */
    @SuppressWarnings("unchecked")
    public static <T> T parseValue(String string, Class<T> returnType) {

        if ("null".equals(string))
            return null;
        if (String.class.equals(returnType))
            return (T) string;
        if (Integer.class.equals(returnType) || int.class.equals(returnType))
            return (T) Integer.valueOf(string);
        if (List.class.isAssignableFrom(returnType)) {
            List<Long> idList = new ArrayList<Long>();
            for (String longStr : fromCSV(string))
                idList.add(Long.parseLong(longStr));
            return (T) idList;
        }
        if (Long.class.equals(returnType) || long.class.equals(returnType))
            return (T) Long.valueOf(string);
        if (Float.class.equals(returnType) || float.class.equals(returnType))
            return (T) Float.valueOf(string);
        if (Boolean.class.equals(returnType) || boolean.class.equals(returnType))
            return (T) Boolean.valueOf(string);
        if (String.class.equals(returnType))
            return (T) string;
        if (Date.class.isAssignableFrom(returnType))
            return (T) Timestamp.valueOf(string);
        throw new RuntimeException("Unsupported return type: " + returnType);
    }

	// --------------------------------------------------------------------------------------------
	// Constructors
	// --------------------------------------------------------------------------------------------
	
    /**
     * Cannot be instantiated.
     */
	private StringUtil() {
		
	}
	
	/* ----------------------------------------------------------------------------------------- */
}