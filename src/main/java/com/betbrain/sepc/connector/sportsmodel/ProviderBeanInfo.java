package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

/**
 * This is a <code>BeanInfo</code> for the <code>Provider</code> bean.
 * 
 * @author Morten Helles
 */
public class ProviderBeanInfo extends SimpleBeanInfo {

	// --------------------------------------------------------------------------------------------
	// Instance methods
	// --------------------------------------------------------------------------------------------

    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {
        
        BeanDescriptor beanDescriptor = new BeanDescriptor(Provider.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] {
            Provider.PROPERTY_NAME_id,
            Provider.PROPERTY_NAME_name,
            Provider.PROPERTY_NAME_locationId,
            Provider.PROPERTY_NAME_url,
            Provider.PROPERTY_NAME_isBookmaker,
            Provider.PROPERTY_NAME_isBettingExchange,
            Provider.PROPERTY_NAME_bettingCommissionVACs,            
            Provider.PROPERTY_NAME_isLiveOddsApproved,
            Provider.PROPERTY_NAME_isNewsSource,
            Provider.PROPERTY_NAME_isEnabled,
            Provider.PROPERTY_NAME_note
        });
        
        return beanDescriptor;
    }

    /* ----------------------------------------------------------------------------------------- */

    // override default implementation
    public PropertyDescriptor[] getPropertyDescriptors() {

        try {

            PropertyDescriptor id = new PropertyDescriptor(Provider.PROPERTY_NAME_id, Provider.class);
            
            PropertyDescriptor name = new PropertyDescriptor(Provider.PROPERTY_NAME_name, Provider.class);

            PropertyDescriptor locationId = new PropertyDescriptor(Provider.PROPERTY_NAME_locationId, Provider.class);
            locationId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Location.class);
            
            PropertyDescriptor url = new PropertyDescriptor(Provider.PROPERTY_NAME_url, Provider.class);

            PropertyDescriptor isBookmaker = new PropertyDescriptor(Provider.PROPERTY_NAME_isBookmaker, Provider.class);
            
            PropertyDescriptor isBettingExchange = new PropertyDescriptor(Provider.PROPERTY_NAME_isBettingExchange, Provider.class);
            
            PropertyDescriptor bettingCommissionVACs = new PropertyDescriptor(Provider.PROPERTY_NAME_bettingCommissionVACs, Provider.class);

            PropertyDescriptor isLiveOddsApproved = new PropertyDescriptor(Provider.PROPERTY_NAME_isLiveOddsApproved, Provider.class);
            
            PropertyDescriptor isNewsSource = new PropertyDescriptor(Provider.PROPERTY_NAME_isNewsSource, Provider.class);
            
            PropertyDescriptor isEnabled = new PropertyDescriptor(Provider.PROPERTY_NAME_isEnabled, Provider.class);

            PropertyDescriptor note = new PropertyDescriptor(Provider.PROPERTY_NAME_note, Provider.class);
            
            return new PropertyDescriptor[] {
                id,
                name,
                locationId,
                url,
                isBookmaker,
                isBettingExchange,
                bettingCommissionVACs,                
                isLiveOddsApproved,
                isNewsSource,
                isEnabled,
                note
            };
            
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }

    /* ----------------------------------------------------------------------------------------- */
}