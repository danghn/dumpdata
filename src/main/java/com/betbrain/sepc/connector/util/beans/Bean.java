package com.betbrain.sepc.connector.util.beans;

import java.beans.BeanInfo;
import java.beans.PropertyDescriptor;
import java.io.Serializable;
import java.util.List;

import com.betbrain.sepc.connector.util.PublicCloneable;

/**
 * A <code>Bean</code> represents a JavaBean.
 * <p>
 * Most beans should override the default <code>equals</code>, <code>hashCode</code>,
 * <code>clone</code>, and <code>toString</code> method implementations to base them solely on
 * the bean's properties.
 * 
 * @author Morten Helles
 */

public interface Bean extends Serializable, PublicCloneable {

    // --------------------------------------------------------------------------------------------
    // Interface methods
    // --------------------------------------------------------------------------------------------

    /**
     * Returns the bean's name according to the bean info.
     *
     * @return the bean's name.
     */
    public String getName();

    /* ----------------------------------------------------------------------------------------- */

    /**
     * Returns the bean's display name according to the bean info.
     *
     * @return the bean's display name.
     */
    public String getDisplayName();

    /* ----------------------------------------------------------------------------------------- */

    /**
     * Returns the bean's <code>BeanInfo</code>.
     * 
     * @return the bean's <code>BeanInfo</code>.
     */
    public BeanInfo getBeanInfo();

    /* ----------------------------------------------------------------------------------------- */

    /**
     * Returns the names of the bean's property descriptors.
     *
     * @return the names of the bean's property descriptors.
     */
    public List<String> getPropertyNames();

    /* ----------------------------------------------------------------------------------------- */

    /**
     * Returns the bean's property descriptors.
     *
     * @return the bean's property descriptors.
     */
    public List<PropertyDescriptor> getPropertyDescriptors();

    /* ----------------------------------------------------------------------------------------- */

    /**
     * Returns the bean's property descriptors of properties that are readable.
     *
     * @return the bean's property descriptors of properties that are readable.
     */
    public List<PropertyDescriptor> getReadablePropertyDescriptors();

    /* ----------------------------------------------------------------------------------------- */

    /**
     * Returns the bean's property descriptors of properties that are writable.
     *
     * @return the bean's property descriptors of properties that are writable.
     */
    public List<PropertyDescriptor> getWritablePropertyDescriptors();

    /* ----------------------------------------------------------------------------------------- */

    /**
     * Returns the bean's property descriptors of properties that are both readable and writable.
     *
     * @return the bean's property descriptors of properties that are both readable and writable.
     */
    public List<PropertyDescriptor> getReadableAndWritablePropertyDescriptors();

    /* ----------------------------------------------------------------------------------------- */

    /**
     * Returns the bean's property descriptor for the property with the specified name.
     *
     * @return the bean's property descriptor for the property with the specified name.
     * @throws RuntimeException if there is no such property descriptor.
     */
    public PropertyDescriptor getPropertyDescriptor(String propertyName);

    /* ----------------------------------------------------------------------------------------- */

    /**
     * Returns the value of the property with the specified property name.
     *
     * @param propertyName the name of the property whose value to return.
     * @return the value of the property with the specified property name.
     * @throws RuntimeException if the property could not be read from.
     */
    public Object getPropertyValue(String propertyName);

    /* ----------------------------------------------------------------------------------------- */

    /**
     * Sets the value of the property with the specified name to the specified value.
     *
     * @param propertyName the name of the property whose value to set.
     * @param propertyValue the new property value.
     * @throws RuntimeException if the property could not be written to.
     */
    public void setPropertyValue(String propertyName, Object propertyValue);

    /* ----------------------------------------------------------------------------------------- */

    /**
     * Returns the value of the properties with the specified property names.
     *
     * @param propertyNames the names of the properties whose value to return.
     * @return the value of the properties with the specified property names.
     * @throws RuntimeException if one of the properties could not be read from.
     */
    public List<Object> getPropertyValues(List<String> propertyNames);
    
    /* ----------------------------------------------------------------------------------------- */
    
    /**
     * Sets the value of the properties with the specified names to the specified values.
     * <p>
     * The two lists must be of the same length.
     *
     * @param propertyNames the names of the properties whose value to set.
     * @param propertyValues the new property values.
     * @throws RuntimeException if one of the properties could not be written to, or the length of
     * the lists are not equal.
     */
    public void setPropertyValues(List<String> propertyNames, List<? extends Object> propertyValues);

    /* ----------------------------------------------------------------------------------------- */
}