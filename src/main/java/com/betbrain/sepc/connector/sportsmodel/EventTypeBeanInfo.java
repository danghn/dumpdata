package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

/**
 * This is a <code>BeanInfo</code> for the <code>EventType</code> bean.
 * 
 * @author Morten Helles
 */
public class EventTypeBeanInfo extends SimpleBeanInfo {

	// --------------------------------------------------------------------------------------------
	// Instance methods
	// --------------------------------------------------------------------------------------------

    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {
        
        BeanDescriptor beanDescriptor = new BeanDescriptor(EventType.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] {
            EventType.PROPERTY_NAME_id,
            EventType.PROPERTY_NAME_name,
            EventType.PROPERTY_NAME_description
        });
        
        return beanDescriptor;
    }

    /* ----------------------------------------------------------------------------------------- */

    // override default implementation
    public PropertyDescriptor[] getPropertyDescriptors() {

        try {

            PropertyDescriptor id = new PropertyDescriptor(EventType.PROPERTY_NAME_id, EventType.class);
            
            PropertyDescriptor name = new PropertyDescriptor(EventType.PROPERTY_NAME_name, EventType.class);

            PropertyDescriptor description = new PropertyDescriptor(EventType.PROPERTY_NAME_description, EventType.class);
            
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