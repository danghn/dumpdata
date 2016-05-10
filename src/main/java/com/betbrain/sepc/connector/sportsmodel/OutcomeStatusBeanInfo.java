package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

/**
 * This is a <code>BeanInfo</code> for the <code>OutcomeStatus</code> bean.
 * 
 * @author Morten Helles
 */
public class OutcomeStatusBeanInfo extends SimpleBeanInfo {

	// --------------------------------------------------------------------------------------------
	// Instance methods
	// --------------------------------------------------------------------------------------------

    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {
        
        BeanDescriptor beanDescriptor = new BeanDescriptor(OutcomeStatus.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] {
            OutcomeStatus.PROPERTY_NAME_id, 
            OutcomeStatus.PROPERTY_NAME_name,
            OutcomeStatus.PROPERTY_NAME_description
        });
        
        return beanDescriptor;
    }

    /* ----------------------------------------------------------------------------------------- */

    // override default implementation
    public PropertyDescriptor[] getPropertyDescriptors() {

        try {

            PropertyDescriptor id = new PropertyDescriptor(OutcomeStatus.PROPERTY_NAME_id, OutcomeStatus.class);
            
            PropertyDescriptor name = new PropertyDescriptor(OutcomeStatus.PROPERTY_NAME_name, OutcomeStatus.class);
            
            PropertyDescriptor description = new PropertyDescriptor(OutcomeStatus.PROPERTY_NAME_description, OutcomeStatus.class);
            
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