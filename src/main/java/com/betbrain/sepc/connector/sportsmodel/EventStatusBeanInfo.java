package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

/**
 * This is a <code>BeanInfo</code> for the <code>EventStatus</code> bean.
 * 
 * @author Morten Helles
 */
public class EventStatusBeanInfo extends SimpleBeanInfo {

	// --------------------------------------------------------------------------------------------
	// Instance methods
	// --------------------------------------------------------------------------------------------

    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {
        
        BeanDescriptor beanDescriptor = new BeanDescriptor(EventStatus.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] {
            EventStatus.PROPERTY_NAME_id,
            EventStatus.PROPERTY_NAME_name,
            EventStatus.PROPERTY_NAME_description
        });
        
        return beanDescriptor;
    }

    /* ----------------------------------------------------------------------------------------- */

    // override default implementation
    public PropertyDescriptor[] getPropertyDescriptors() {

        try {

            PropertyDescriptor id = new PropertyDescriptor(EventStatus.PROPERTY_NAME_id, EventStatus.class);

            PropertyDescriptor name = new PropertyDescriptor(EventStatus.PROPERTY_NAME_name, EventStatus.class);

            PropertyDescriptor description = new PropertyDescriptor(EventStatus.PROPERTY_NAME_description, EventStatus.class);

            return new PropertyDescriptor[] {
                id,
                name,
                description
            };
            
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }

    /* ----------------------------------------------------------------------------------------- */
}