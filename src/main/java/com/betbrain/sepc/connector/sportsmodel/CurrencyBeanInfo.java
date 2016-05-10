package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

/**
 * This is a <code>BeanInfo</code> for the <code>Currency</code> bean.
 * 
 * @author Morten Helles
 */
public class CurrencyBeanInfo extends SimpleBeanInfo {

	// --------------------------------------------------------------------------------------------
	// Instance methods
	// --------------------------------------------------------------------------------------------

    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {
        
        BeanDescriptor beanDescriptor = new BeanDescriptor(Currency.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] {
            Currency.PROPERTY_NAME_id,
            Currency.PROPERTY_NAME_name,
            Currency.PROPERTY_NAME_code
        });
        
        return beanDescriptor;
    }

    /* ----------------------------------------------------------------------------------------- */

    // override default implementation
    public PropertyDescriptor[] getPropertyDescriptors() {

        try {

            PropertyDescriptor id = new PropertyDescriptor(Currency.PROPERTY_NAME_id, Currency.class);
            
            PropertyDescriptor name = new PropertyDescriptor(Currency.PROPERTY_NAME_name, Currency.class);
        	
            PropertyDescriptor code = new PropertyDescriptor(Currency.PROPERTY_NAME_code, Currency.class);

            return new PropertyDescriptor[] {
                id,
            	name,
                code
            };
            
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }

    /* ----------------------------------------------------------------------------------------- */
}