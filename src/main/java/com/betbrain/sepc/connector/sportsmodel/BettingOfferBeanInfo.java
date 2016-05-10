package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

/**
 * This is a <code>BeanInfo</code> for the <code>BettingOffer</code> bean.
 * 
 * @author Morten Helles
 */
public class BettingOfferBeanInfo extends SimpleBeanInfo {

	// --------------------------------------------------------------------------------------------
	// Instance methods
	// --------------------------------------------------------------------------------------------

    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {
        
        BeanDescriptor beanDescriptor = new BeanDescriptor(BettingOffer.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] {
            BettingOffer.PROPERTY_NAME_id,
            BettingOffer.PROPERTY_NAME_providerId, 
            BettingOffer.PROPERTY_NAME_sourceId,
            BettingOffer.PROPERTY_NAME_outcomeId,
            BettingOffer.PROPERTY_NAME_bettingTypeId,
            BettingOffer.PROPERTY_NAME_statusId,
            BettingOffer.PROPERTY_NAME_isLive,
            BettingOffer.PROPERTY_NAME_odds,
            BettingOffer.PROPERTY_NAME_multiplicity,
            BettingOffer.PROPERTY_NAME_volume,
            BettingOffer.PROPERTY_NAME_volumeCurrencyId,
            BettingOffer.PROPERTY_NAME_couponKey,
            BettingOffer.PROPERTY_NAME_slotNum,
            BettingOffer.PROPERTY_NAME_lastChangedTime,
        });
        
        return beanDescriptor;
    }

    /* ----------------------------------------------------------------------------------------- */

    // override default implementation
    public PropertyDescriptor[] getPropertyDescriptors() {

        try {

            PropertyDescriptor id = new PropertyDescriptor(BettingOffer.PROPERTY_NAME_id, BettingOffer.class);
            
            PropertyDescriptor providerId = new PropertyDescriptor(BettingOffer.PROPERTY_NAME_providerId, BettingOffer.class);
            providerId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Provider.class);
            
            PropertyDescriptor sourceId = new PropertyDescriptor(BettingOffer.PROPERTY_NAME_sourceId, BettingOffer.class);
            sourceId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Source.class);
            
            PropertyDescriptor outcomeId = new PropertyDescriptor(BettingOffer.PROPERTY_NAME_outcomeId, BettingOffer.class);
            outcomeId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Outcome.class);

            PropertyDescriptor bettingTypeId = new PropertyDescriptor(BettingOffer.PROPERTY_NAME_bettingTypeId, BettingOffer.class);
            bettingTypeId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, BettingType.class);
            
            PropertyDescriptor statusId = new PropertyDescriptor(BettingOffer.PROPERTY_NAME_statusId, BettingOffer.class);
            statusId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, BettingOfferStatus.class);

            PropertyDescriptor isLive = new PropertyDescriptor(BettingOffer.PROPERTY_NAME_isLive, BettingOffer.class);

            PropertyDescriptor odds = new PropertyDescriptor(BettingOffer.PROPERTY_NAME_odds, BettingOffer.class);

            PropertyDescriptor multiplicity = new PropertyDescriptor(BettingOffer.PROPERTY_NAME_multiplicity, BettingOffer.class);

            PropertyDescriptor volume = new PropertyDescriptor(BettingOffer.PROPERTY_NAME_volume, BettingOffer.class);

            PropertyDescriptor volumeCurrencyId = new PropertyDescriptor(BettingOffer.PROPERTY_NAME_volumeCurrencyId, BettingOffer.class);
            volumeCurrencyId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Currency.class);

            PropertyDescriptor couponKey = new PropertyDescriptor(BettingOffer.PROPERTY_NAME_couponKey, BettingOffer.class);

            PropertyDescriptor slotNum = new PropertyDescriptor(BettingOffer.PROPERTY_NAME_slotNum, BettingOffer.class);

            PropertyDescriptor lastChangedTime = new PropertyDescriptor(BettingOffer.PROPERTY_NAME_lastChangedTime, BettingOffer.class);
            
            return new PropertyDescriptor[] {
                id,
                providerId,
                sourceId,
                outcomeId,
                bettingTypeId,
                statusId,
                isLive,
                odds,
                multiplicity,
                volume,
                volumeCurrencyId,
                couponKey,
                slotNum,
                lastChangedTime
            };
            
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }

    /* ----------------------------------------------------------------------------------------- */
}