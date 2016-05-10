package com.betbrain.sepc.connector.util.beans;

import java.beans.BeanInfo;
import java.beans.PropertyDescriptor;
import java.util.ArrayList;
import java.util.List;

/**
 * This is an abstract support class for a <code>Bean</code> implementation.
 * <p>
 * It forwards all method invocations to the similar methods in <code>BeanUtil</code>.
 * 
 * @author Morten Helles
 */

public abstract class AbstractBean implements Bean {

    // --------------------------------------------------------------------------------------------
    // Class fields
    // --------------------------------------------------------------------------------------------

	private static final long serialVersionUID = 1L;
	
    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------

	/**
     * Empty constructor.
     */
    protected AbstractBean() {
        
    }

    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------

    // implements the Bean interface
    public String getName() {

        return BeanUtil.getName(getClass());
    }

    /* ----------------------------------------------------------------------------------------- */

    // implements the Bean interface
    public String getDisplayName() {

        return BeanUtil.getDisplayName(getClass());
    }

    /* -------------------------------------------------------------- */

    // implements the Bean interface
    public BeanInfo getBeanInfo() {

        return BeanUtil.getBeanInfo(getClass());
    }

    /* ----------------------------------------------------------------------------------------- */

    // implements the Bean interface
    public List<String> getPropertyNames() {

        return BeanUtil.getPropertyNames(getClass());
    }

    /* ----------------------------------------------------------------------------------------- */

    // implements the Bean interface
    public List<PropertyDescriptor> getPropertyDescriptors() {

        return BeanUtil.getPropertyDescriptors(getClass());
    }

    /* ----------------------------------------------------------------------------------------- */

    // implements the Bean interface
    public List<PropertyDescriptor> getReadablePropertyDescriptors() {

        return BeanUtil.getReadablePropertyDescriptors(getClass());
    }

    /* ----------------------------------------------------------------------------------------- */

    // implements the Bean interface
    public List<PropertyDescriptor> getWritablePropertyDescriptors() {

        return BeanUtil.getWritablePropertyDescriptors(getClass());
    }

    /* ----------------------------------------------------------------------------------------- */

    // implements the Bean interface
    public List<PropertyDescriptor> getReadableAndWritablePropertyDescriptors() {

        return BeanUtil.getReadableAndWritablePropertyDescriptors(getClass());
    }
    
    /* ----------------------------------------------------------------------------------------- */

    // implements the Bean interface
    public PropertyDescriptor getPropertyDescriptor(String propertyName) {

        return BeanUtil.getPropertyDescriptor(getClass(), propertyName);
    }

    /* ----------------------------------------------------------------------------------------- */

    // implements the Bean interface
    public Object getPropertyValue(String propertyName) {

        return BeanUtil.getPropertyValue(this, propertyName);
    }

    /* ----------------------------------------------------------------------------------------- */

    // implements the Bean interface
    public void setPropertyValue(String propertyName, Object propertyValue) {

        BeanUtil.setPropertyValue(this, propertyName, propertyValue);
    }

    /* ----------------------------------------------------------------------------------------- */

    // implements the Bean interface
    public List<Object> getPropertyValues(List<String> propertyNames) {

    	List<Object> propertyValues = new ArrayList<Object>(propertyNames.size());
    	for (String propertyName : propertyNames)
    		propertyValues.add(getPropertyValue(propertyName));
    	
        return propertyValues;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    // implements the Bean interface
    public void setPropertyValues(List<String> propertyNames, List<? extends Object> propertyValues) {
    	
    	if (propertyNames.size() != propertyValues.size())
    		throw new RuntimeException("propertyNames and propertyValues lists are of different length.");
    	
    	for (int i = 0; i != propertyNames.size(); i++)
    		setPropertyValue(propertyNames.get(i), propertyValues.get(i));
    }

    /* ----------------------------------------------------------------------------------------- */
    
    // implements the Bean (PublicCloneable) interface
    public Bean clone() {

        return (Bean) BeanUtil.clone(this);
    }

    /* ----------------------------------------------------------------------------------------- */

    // overrides the superclass implementation
    public boolean equals(Object obj) {

        return BeanUtil.equals(this, obj);
    }

    /* ----------------------------------------------------------------------------------------- */

    // overrides the superclass implementation
    public int hashCode() {

        return BeanUtil.hashCode(this);
    }

    /* ----------------------------------------------------------------------------------------- */

    // overrides the superclass implementation
    public String toString() {

        return BeanUtil.toString(this);
    }
    
    /* ----------------------------------------------------------------------------------------- */
}