package com.betbrain.sepc.connector.util.beans;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.betbrain.sepc.connector.util.ObjectUtil;

/**
 * Provides various utility methods for JavaBeans.
 * <p>
 * Note that any object can be a JavaBean. In particular, they do not need to implement the
 * <code>Bean</code> interface.
 * <p>
 * The <code>BeanUtil</code> uses caching to increase performance.
 * 
 * @author Morten Helles
 */
public class BeanUtil {

    // --------------------------------------------------------------------------------------------
    // Class fields
    // --------------------------------------------------------------------------------------------

    private static final Map<Class<?>,BeanInfoExt> _cacheMap = new HashMap<Class<?>,BeanInfoExt>();

    private static final Object[] EMPTY_OBJECT_ARRAY = new Object[0];
    private static final Object[] SINGLE_OBJECT_ARRAY = new Object[1];
    
    // --------------------------------------------------------------------------------------------
    // Class methods
    // --------------------------------------------------------------------------------------------

    /**
     * Returns the name associated with the specified bean class.
     * <p>
     * This method is a shortcut for
     * <code>BeanUtil.getBeanInfo(beanClass).getBeanDescriptor().getName()</code>.
     *
     * @param beanClass the bean class.
     * @return the name associated with the specified bean class.
     */
    public static String getName(Class<?> beanClass) {

        return getBeanInfo(beanClass).getBeanDescriptor().getName();
    }

    /* ----------------------------------------------------------------------------------------- */

    /**
     * Returns the display name associated with the specified bean class.
     * <p>
     * This method is a shortcut for
     * <code>BeanUtil.getBeanInfo(beanClass).getBeanDescriptor().getDisplayName()</code>.
     *
     * @param beanClass the bean class.
     * @return the display name associated with the specified bean class.
     */
    public static String getDisplayName(Class<?> beanClass) {

        return getBeanInfo(beanClass).getBeanDescriptor().getDisplayName();
    }

    /* ----------------------------------------------------------------------------------------- */

    /**
     * Returns the <code>BeanInfo</code> associated with the specified bean class. 
     * 
     * @param beanClass the bean class.
     * @return the <code>BeanInfo</code> associated with the specified bean class.
     */
    public static BeanInfo getBeanInfo(Class<?> beanClass) {

        try {
            return Introspector.getBeanInfo(beanClass);
        } catch (IntrospectionException e) {
            throw new RuntimeException("Introspection exception for bean class '" + beanClass.getName() + "': " + e.getMessage(), e);
        }
    }

    /* ----------------------------------------------------------------------------------------- */

    /**
     * Returns the <code>BeanInfoExt</code> associated with the specified bean class.
     *
     * @param beanClass the bean class.
     * @return the <code>BeanInfoExt</code> associated with the specified bean class.
     */
    public static BeanInfoExt getBeanInfoExt(Class<?> beanClass) {

    	synchronized (_cacheMap) {
    		BeanInfoExt beanInfoExt = _cacheMap.get(beanClass);
    		if (beanInfoExt == null) {
        		beanInfoExt = new BeanInfoExt(beanClass);
        		_cacheMap.put(beanClass, beanInfoExt);
    		}
			return beanInfoExt;
    	}
    }

    /* ----------------------------------------------------------------------------------------- */

    /**
     * Returns the property names associated with the specified bean class.
     *
     * @param beanClass the bean class.
     * @return the property names associated with the specified bean class.
     */
    public static List<String> getPropertyNames(Class<?> beanClass) {

    	return getBeanInfoExt(beanClass).getPropertyNames();
    }

    /* ----------------------------------------------------------------------------------------- */

    /**
     * Returns the property descriptors associated with the specified bean class.
     *
     * @param beanClass the bean class.
     * @return the property descriptors associated with the specified bean class.
     */
    public static List<PropertyDescriptor> getPropertyDescriptors(Class<?> beanClass) {

        return getBeanInfoExt(beanClass).getPropertyDescriptors();
    }

    /* ----------------------------------------------------------------------------------------- */

    /**
     * Returns the readable property descriptors associated with the specified bean class.
     *
     * @param beanClass the bean class.
     * @return the readable property descriptors associated with the specified bean class.
     */
    public static List<PropertyDescriptor> getReadablePropertyDescriptors(Class<?> beanClass) {

        return getBeanInfoExt(beanClass).getReadablePropertyDescriptors();
    }

    /* ----------------------------------------------------------------------------------------- */

    /**
     * Returns the writable property descriptors associated with the specified bean class.
     *
     * @param beanClass the bean class.
     * @return the writable property descriptors associated with the specified bean class.
     */
    public static List<PropertyDescriptor> getWritablePropertyDescriptors(Class<?> beanClass) {

        return getBeanInfoExt(beanClass).getWritablePropertyDescriptors();
    }

    /* ----------------------------------------------------------------------------------------- */

    /**
     * Returns the readable and writable property descriptors associated with the specified bean
     * class.
     *
     * @param beanClass the bean class.
     * @return the readable and writable property descriptors associated with the specified bean
     * class.
     */
    public static List<PropertyDescriptor> getReadableAndWritablePropertyDescriptors(Class<?> beanClass) {

        return getBeanInfoExt(beanClass).getReadableAndWritablePropertyDescriptors();
    }
    
    /* ----------------------------------------------------------------------------------------- */

    /**
     * Returns the property descriptor that is associated with the specified bean class and has
     * the specified name.
     *
     * @param propertyName the property name.
     * @return the property descriptor that is associated with the specified bean class and has
     * the specified name.
     * @throws RuntimeException if there is no such property descriptor.
     */
    public static PropertyDescriptor getPropertyDescriptor(Class<?> beanClass, String propertyName) {

        return getBeanInfoExt(beanClass).getPropertyDescriptor(propertyName);
    }

    /* ----------------------------------------------------------------------------------------- */
    
    /**
     * Returns the value of the property with the specified name and on the specified bean.
     * 
     * @param bean the bean.
     * @param propertyName the property name.
     * @throws RuntimeException if the property could not be read from.
     */
    public static Object getPropertyValue(Object bean, String propertyName) {

        PropertyDescriptor descriptor = getPropertyDescriptor(bean.getClass(), propertyName);

        Method readMethod = descriptor.getReadMethod();
        
        if (readMethod == null)
            throw new RuntimeException("Attempt to read from a non-readable property '" + propertyName + "'.");

        try {
            synchronized (EMPTY_OBJECT_ARRAY) {
                return readMethod.invoke(bean, EMPTY_OBJECT_ARRAY);
            }
        } catch (Exception e) {
            throw new RuntimeException("Read method invocation failed for property '" + propertyName + "' in bean class '" + bean.getClass().getName() + "': " + e.getMessage(), e);
        }
    }

    /* ----------------------------------------------------------------------------------------- */

    /**
     * Sets the value of the property with the specified name and on the specified bean.
     * 
     * @param bean the bean.
     * @param propertyName the property name.
     * @param propertyValue the property value.
     * @throws RuntimeException if the property could not be written to.
     */
    public static void setPropertyValue(Object bean, String propertyName, Object propertyValue) {

        PropertyDescriptor descriptor = getPropertyDescriptor(bean.getClass(), propertyName);

        Method writeMethod = descriptor.getWriteMethod();
        
        if (writeMethod == null)
            throw new RuntimeException("Attempt to write to a non-writable property '" + propertyName + "'.");

        try {
            synchronized (SINGLE_OBJECT_ARRAY) {
                SINGLE_OBJECT_ARRAY[0] = propertyValue;
                writeMethod.invoke(bean, SINGLE_OBJECT_ARRAY);
            }
        } catch (Exception e) {
            throw new RuntimeException("Write method invocation failed for property '" + propertyName + "' in bean class '" + bean.getClass().getName() + "': " + e.getMessage(), e);
        }
    }

    /* ----------------------------------------------------------------------------------------- */

    /**
     * Returns a deep clone of the specified bean.
     * <p>
     * Only properties that are both readable and writeable will be cloned.
     * 
     * @param bean the bean.
     * @return a deep clone of the specified bean.
     * @throws RuntimeException if the bean could not be cloned.
     */
    public static Object clone(Object bean) {

        try {
            Object clonedBean = (Object) bean.getClass().newInstance();
            List<PropertyDescriptor> pds = getReadableAndWritablePropertyDescriptors(bean.getClass());
            for (int i = 0; i != pds.size(); i++) {
                PropertyDescriptor pd = pds.get(i);
                Object clonedValue = ObjectUtil.clone(getPropertyValue(bean, pd.getName()));
                setPropertyValue(clonedBean, pd.getName(), clonedValue);
            }
            return clonedBean;
        } catch (Exception e) {
            throw new RuntimeException("Unable to clone bean of class '" + bean.getClass().getName() + "': " + e.getMessage(), e);
        }
    }

    /* ----------------------------------------------------------------------------------------- */

    /**
     * Returns true if the two specified beans are equal, and false otherwise.
     * <p>
     * Two beans are equal if
     * <ol>
     * <li>they have the same identity, or</li>
     * <li>they have the same bean class and all readable properties have the same value.</li>
     * </ol>
     * 
     * @param bean1 the first bean.
     * @param bean2 the second bean.
     * @return true if the two specified beans are equal, and false otherwise.
     */
    public static boolean equals(Object bean1, Object bean2) {

        // check identity equality
        if (bean1 == bean2)
            return true;

        // check bean class identity
        if (!bean1.getClass().equals(bean2.getClass()))
        	return false;
        
        // compare each (readable) property value, returning false if not equals
        List<PropertyDescriptor> pds = getReadablePropertyDescriptors(bean1.getClass());
        for (int i = 0; i != pds.size(); i++) {
            PropertyDescriptor pd = pds.get(i);
            Object bean1PropertyValue = getPropertyValue(bean1, pd.getName());
            Object bean2PropertyValue = getPropertyValue(bean2, pd.getName());
            if (!ObjectUtil.equal(bean1PropertyValue, bean2PropertyValue))
                return false;
        }

        return true;
    }

    /* ----------------------------------------------------------------------------------------- */

    /**
     * Returns the hash code of the specified bean.
     * <p>
     * Only readable properties will be included in the hash code.
     * 
     * @param bean the bean.
     * @return the hash code of the specified bean.
     */
    public static int hashCode(Object bean) {

        int hashCode = 1;

        // calculate the hash code from the readable bean property values
        List<PropertyDescriptor> pds = getReadablePropertyDescriptors(bean.getClass());
        for (int i = 0; i != pds.size(); i++) {
            PropertyDescriptor pd = pds.get(i);
            Object propertyValue = getPropertyValue(bean, pd.getName());
            if (propertyValue != null)
                hashCode += propertyValue.hashCode();
        }

        return hashCode;
    }

    /* ----------------------------------------------------------------------------------------- */

    /**
     * Returns a default string for the specified bean.
     * <p>
     * Only readable properties will be included in the string.
     * 
     * @param bean the bean.
     * @return a default string for the specified bean.
     */
    public static String toString(Object bean) {

        StringBuilder sb = new StringBuilder();

        // add class name
        sb.append(getName(bean.getClass()));
        sb.append("[");

        // add property values
        List<PropertyDescriptor> pds = getReadablePropertyDescriptors(bean.getClass());
        for (int i = 0; i != pds.size(); i++) {
            PropertyDescriptor pd = (PropertyDescriptor) pds.get(i);
            sb.append(pd.getName());
            sb.append("=\"");
            sb.append(getPropertyValue(bean, pd.getName()));
            sb.append("\"");
            if (i != (pds.size() - 1))
                sb.append(",");
        }

        sb.append("]");

        return sb.toString();
    }
    
    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------

    /**
     * Cannot be instantiated.
     */
    private BeanUtil() {
    	
    }
    
    /* ----------------------------------------------------------------------------------------- */
}