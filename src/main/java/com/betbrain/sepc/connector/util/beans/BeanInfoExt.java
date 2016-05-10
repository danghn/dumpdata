package com.betbrain.sepc.connector.util.beans;

import java.beans.PropertyDescriptor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The <code>BeanInfoExt</code> is an extension to the <code>BeanInfo</code>.
 * <p>
 * Like the <code>BeanInfo</code>, the <code>BeanInfoExt</code> is tied to a specific bean class.
 * Indeed, the <code>BeanInfoExt</code> uses the <code>BeanInfo</code> associated with this bean
 * class.
 * <p>
 * Normally, the <code>BeanInfoExt</code> will not be used directly, but rather be hidden and only
 * accessed via the <code>BeanUtil</code> methods.
 * <p>
 * The <code>BeanInfoExt</code> is heavily cached for high-performance access. 
 * 
 * @author Morten Helles
 */
public class BeanInfoExt {

    // --------------------------------------------------------------------------------------------
    // Class fields 
    // --------------------------------------------------------------------------------------------

    /**
     * This attribute name provides a means for specifying the order of the property descriptors
     * returned by the </code>getPropertyDescriptors</code> method.
     * <p>
     * The attribute name is used in conjunction with the <code>BeanDescriptor</code>'s
     * <code>setValue</code> method. The corresponding value must be a <code>String[]</code> of
     * property names. The order of these property names specifies the order of the property
     * descriptors returned by the </code>getPropertyDescriptors</code> method.
     * <p>
     * The <code>String[]</code> value must be complete, that is, it must contain the names of all
     * the bean's properties, and these names only. If it does not, then a
     * <code>RuntimeException</code> is thrown. 
     */
    public static final String BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME = "BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME";
    
    // --------------------------------------------------------------------------------------------
    // Class methods 
    // --------------------------------------------------------------------------------------------

    private static List<String> getPropertyNames0(Class<?> beanClass) {
    	
        List<PropertyDescriptor> pds = getPropertyDescriptors0(beanClass);
        
        List<String> propertyNames = new ArrayList<String>(pds.size());
        
        for (int i = 0; i != pds.size(); i++) {
            PropertyDescriptor pd = pds.get(i);
            propertyNames.add(pd.getName());
        }
        
        return Collections.unmodifiableList(propertyNames);
    }
	
    /* ----------------------------------------------------------------------------------------- */

    private static List<PropertyDescriptor> getPropertyDescriptors0(Class<?> beanClass) {

        List<PropertyDescriptor> pds = Arrays.asList(BeanUtil.getBeanInfo(beanClass).getPropertyDescriptors());
        if ((pds == null) || pds.isEmpty())
            return Collections.emptyList();
        
        final String[] propertyOrder = (String[]) BeanUtil.getBeanInfo(beanClass).getBeanDescriptor().getValue(BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME);
        if (propertyOrder != null) {
            if (propertyOrder.length != pds.size())
                throw new RuntimeException("The BEAN_DESCRIPTOR_PROPERTY_ORDER_KEY String[] value length is different from the number of properties of bean class '" + beanClass.getName() + "'.");
            final Class<?> beanClassFinal = beanClass;
            Collections.sort(pds, new Comparator<PropertyDescriptor>() {
                public int compare(PropertyDescriptor pd1, PropertyDescriptor pd2) {
                    return getPropertyOrderIndex(pd1.getName()) - getPropertyOrderIndex(pd2.getName());
                }
                public int getPropertyOrderIndex(String name) {
                    for (int i = 0; i != propertyOrder.length; i++)
                        if (propertyOrder[i].equals(name))
                            return i;
                    throw new RuntimeException("The BEAN_DESCRIPTOR_PROPERTY_ORDER_KEY String[] value does not contain the property name '" + name + "' of bean class '" + beanClassFinal.getName() + "'.");
                }
            }); 
        }

        return Collections.unmodifiableList(pds);
    }

    /* ----------------------------------------------------------------------------------------- */

    private static List<PropertyDescriptor> getReadablePropertyDescriptors0(Class<?> beanClass) {

        List<PropertyDescriptor> pds = getPropertyDescriptors0(beanClass);
            
        List<PropertyDescriptor> resultList = new ArrayList<PropertyDescriptor>(pds.size());
        
        for (int i = 0; i != pds.size(); i++) {
            PropertyDescriptor pd = pds.get(i);
            if (pd.getReadMethod() != null)
                resultList.add(pd);
        }

        return Collections.unmodifiableList(resultList);
    }

    /* ----------------------------------------------------------------------------------------- */

    private static List<PropertyDescriptor> getWritablePropertyDescriptors0(Class<?> beanClass) {

        List<PropertyDescriptor> pds = getPropertyDescriptors0(beanClass);
            
        List<PropertyDescriptor> resultList = new ArrayList<PropertyDescriptor>(pds.size());
        
        for (int i = 0; i != pds.size(); i++) {
            PropertyDescriptor pd = pds.get(i);
            if (pd.getWriteMethod() != null)
                resultList.add(pd);
        }

        return Collections.unmodifiableList(resultList);
    }

    /* ----------------------------------------------------------------------------------------- */

    private static List<PropertyDescriptor> getReadableAndWritablePropertyDescriptors0(Class<?> beanClass) {

        List<PropertyDescriptor> pds = getPropertyDescriptors0(beanClass);
            
        List<PropertyDescriptor> resultList = new ArrayList<PropertyDescriptor>(pds.size());
        
        for (int i = 0; i != pds.size(); i++) {
            PropertyDescriptor pd = pds.get(i);
            if ((pd.getReadMethod() != null) && (pd.getWriteMethod() != null))
                resultList.add(pd);
        }

        return Collections.unmodifiableList(resultList);
    }
    
    // --------------------------------------------------------------------------------------------
    // Instance fields 
    // --------------------------------------------------------------------------------------------

    public Class<?> _beanClass;
    public List<String> _propertyNames;
    public List<PropertyDescriptor> _propertyDescriptors;
    public List<PropertyDescriptor> _readablePropertyDescriptors;
    public List<PropertyDescriptor> _writablePropertyDescriptors;
    public List<PropertyDescriptor> _readableAndWritablePropertyDescriptiors;
    public Map<String,PropertyDescriptor> _propertyNameToDescriptorMap;

    // --------------------------------------------------------------------------------------------
    // Constructors 
    // --------------------------------------------------------------------------------------------

    /**
     * Default constructor.
     * 
     * @param beanClass the bean class. 
     */
    public BeanInfoExt(Class<?> beanClass) {
        
    	_beanClass = beanClass;
        _propertyNames = getPropertyNames0(beanClass);
        _propertyDescriptors = getPropertyDescriptors0(beanClass);
        _readablePropertyDescriptors = getReadablePropertyDescriptors0(beanClass);
        _writablePropertyDescriptors = getWritablePropertyDescriptors0(beanClass);
        _readableAndWritablePropertyDescriptiors = getReadableAndWritablePropertyDescriptors0(beanClass);
        _propertyNameToDescriptorMap = new HashMap<String,PropertyDescriptor>();
        for (PropertyDescriptor pd : _propertyDescriptors)
            _propertyNameToDescriptorMap.put(pd.getName(), pd);
    }

    // --------------------------------------------------------------------------------------------
    // Instance methods 
    // --------------------------------------------------------------------------------------------

    /**
     * Returns the underlying bean class.
     *
     * @return the underlying bean class.
     */
    public Class<?> getBeanClass() {
    	
        return _beanClass;
    }

    /* ----------------------------------------------------------------------------------------- */
    
    /**
     * Returns the property names associated with the underlying bean class.
     *
     * @return the property names associated with the underlying bean class.
     */
    public List<String> getPropertyNames() {
    	
        return _propertyNames;
    }

    /* ----------------------------------------------------------------------------------------- */
    
    /**
     * Returns the property descriptors associated with the underlying bean class.
     *
     * @return the property descriptors associated with the underlying bean class.
     */
    public List<PropertyDescriptor> getPropertyDescriptors() {

        return _propertyDescriptors;
    }

    /* ----------------------------------------------------------------------------------------- */

    /**
     * Returns the readable property descriptors associated with the underlying bean class.
     *
     * @return the readable property descriptors associated with the underlying bean class.
     */
    public List<PropertyDescriptor> getReadablePropertyDescriptors() {

        return _readablePropertyDescriptors;
    }

    /* ----------------------------------------------------------------------------------------- */

    /**
     * Returns the writable property descriptors associated with the underlying bean class.
     *
     * @return the writable property descriptors associated with the underlying bean class.
     */
    public List<PropertyDescriptor> getWritablePropertyDescriptors() {

        return _writablePropertyDescriptors;
    }

    /* ----------------------------------------------------------------------------------------- */

    /**
     * Returns the readable and writable property descriptors associated with the underlying bean
     * class.
     *
     * @return the readable and writable property descriptors associated with the underlying bean
     * class.
     */
    public List<PropertyDescriptor> getReadableAndWritablePropertyDescriptors() {

        return _readableAndWritablePropertyDescriptiors;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    /**
     * Returns the property descriptor that is associated with the underlying bean class and has
     * the specified name.
     *
     * @param propertyName the property name.
     * @return the property descriptor that is associated with the underlying bean class and has
     * the specified name.
     * @throws RuntimeException if there is no such property descriptor.
     */
    public PropertyDescriptor getPropertyDescriptor(String propertyName) {

    	PropertyDescriptor pd = _propertyNameToDescriptorMap.get(propertyName);
    	if (pd == null)
    		throw new RuntimeException("No property with name '" + propertyName + "' in bean class '" + _beanClass.getName() + "'.");
    	
    	return pd;
    }

    /* ----------------------------------------------------------------------------------------- */
}