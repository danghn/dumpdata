package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

/**
 * This is a <code>BeanInfo</code> for the <code>ValueBet</code> bean.
 * 
 * @author Morten Helles
 */
public class ValueBetBeanInfo extends SimpleBeanInfo {

	// --------------------------------------------------------------------------------------------
	// Instance methods
	// --------------------------------------------------------------------------------------------

    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {
        
        BeanDescriptor beanDescriptor = new BeanDescriptor(ValueBet.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] {
            ValueBet.PROPERTY_NAME_id,
            ValueBet.PROPERTY_NAME_bettingOfferId,
            ValueBet.PROPERTY_NAME_value
        });
        
        return beanDescriptor;
    }

    /* ----------------------------------------------------------------------------------------- */

    // override default implementation
    public PropertyDescriptor[] getPropertyDescriptors() {

        try {

            PropertyDescriptor id = new PropertyDescriptor(ValueBet.PROPERTY_NAME_id, ValueBet.class);
            
            PropertyDescriptor bettingOfferId = new PropertyDescriptor(ValueBet.PROPERTY_NAME_bettingOfferId, ValueBet.class);
            bettingOfferId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, BettingOffer.class);

            PropertyDescriptor value = new PropertyDescriptor(ValueBet.PROPERTY_NAME_value, ValueBet.class);

            return new PropertyDescriptor[] {
                id,
                bettingOfferId,
                value
            };
            
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }

    /* ----------------------------------------------------------------------------------------- */
}