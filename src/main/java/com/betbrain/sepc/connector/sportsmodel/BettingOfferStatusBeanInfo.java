package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

/**
 * This is a <code>BeanInfo</code> for the <code>BettingOfferStatus</code> bean.
 * 
 * @author Morten Helles
 */
public class BettingOfferStatusBeanInfo extends SimpleBeanInfo {

	// --------------------------------------------------------------------------------------------
	// Instance methods
	// --------------------------------------------------------------------------------------------

    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {
        
        BeanDescriptor beanDescriptor = new BeanDescriptor(BettingOfferStatus.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] {
            BettingOfferStatus.PROPERTY_NAME_id,
            BettingOfferStatus.PROPERTY_NAME_name,
            BettingOfferStatus.PROPERTY_NAME_isAvailable,
            BettingOfferStatus.PROPERTY_NAME_description
        });
        
        return beanDescriptor;
    }

    /* ----------------------------------------------------------------------------------------- */

    // override default implementation
    public PropertyDescriptor[] getPropertyDescriptors() {

        try {

            PropertyDescriptor id = new PropertyDescriptor(BettingOfferStatus.PROPERTY_NAME_id, BettingOfferStatus.class);
            
            PropertyDescriptor name = new PropertyDescriptor(BettingOfferStatus.PROPERTY_NAME_name, BettingOfferStatus.class);

            PropertyDescriptor isAvailable = new PropertyDescriptor(BettingOfferStatus.PROPERTY_NAME_isAvailable, BettingOfferStatus.class);

            PropertyDescriptor description = new PropertyDescriptor(BettingOfferStatus.PROPERTY_NAME_description, BettingOfferStatus.class);
            
            return new PropertyDescriptor[] {
                id,
                name,
                isAvailable,
                description
            };
            
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }

    /* ----------------------------------------------------------------------------------------- */
}