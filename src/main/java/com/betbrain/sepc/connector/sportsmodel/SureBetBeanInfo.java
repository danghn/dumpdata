package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

/**
 * This is a <code>BeanInfo</code> for the <code>SureBet</code> bean.
 * 
 * @author Morten Helles
 */
public class SureBetBeanInfo extends SimpleBeanInfo {

	// --------------------------------------------------------------------------------------------
	// Instance methods
	// --------------------------------------------------------------------------------------------

    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {
        
        BeanDescriptor beanDescriptor = new BeanDescriptor(SureBet.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] {
            SureBet.PROPERTY_NAME_id,
            SureBet.PROPERTY_NAME_bettingOfferIds,
            SureBet.PROPERTY_NAME_profit
        });
        
        return beanDescriptor;
    }

    /* ----------------------------------------------------------------------------------------- */

    // override default implementation
    public PropertyDescriptor[] getPropertyDescriptors() {

        try {

            PropertyDescriptor id = new PropertyDescriptor(SureBet.PROPERTY_NAME_id, SureBet.class);
            
            PropertyDescriptor bettingOfferIds = new PropertyDescriptor(SureBet.PROPERTY_NAME_bettingOfferIds, SureBet.class);
            bettingOfferIds.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITIES_REFERENCE_CLASS, BettingOffer.class);
            
            PropertyDescriptor profit = new PropertyDescriptor(SureBet.PROPERTY_NAME_profit, SureBet.class);

            return new PropertyDescriptor[] {
                id,
                bettingOfferIds,
                profit
            };
            
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }

    /* ----------------------------------------------------------------------------------------- */
}