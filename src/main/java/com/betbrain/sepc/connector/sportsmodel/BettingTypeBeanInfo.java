package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

/**
 * This is a <code>BeanInfo</code> for the <code>BettingType</code> bean.
 * 
 * @author Morten Helles
 */
public class BettingTypeBeanInfo extends SimpleBeanInfo {

    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------

    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {
        
        BeanDescriptor beanDescriptor = new BeanDescriptor(BettingType.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] {
            BettingType.PROPERTY_NAME_id,
            BettingType.PROPERTY_NAME_name,
            BettingType.PROPERTY_NAME_description
        });
        
        return beanDescriptor;
    }

    /* ----------------------------------------------------------------------------------------- */

    // override default implementation
    public PropertyDescriptor[] getPropertyDescriptors() {

        try {

            PropertyDescriptor id = new PropertyDescriptor(BettingType.PROPERTY_NAME_id, BettingType.class);
            
            PropertyDescriptor name = new PropertyDescriptor(BettingType.PROPERTY_NAME_name, BettingType.class);

            PropertyDescriptor description = new PropertyDescriptor(BettingType.PROPERTY_NAME_description, BettingType.class);
            
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