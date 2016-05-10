package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

/**
 * This is a <code>BeanInfo</code> for the <code>EventProviderRelation</code> bean.
 * 
 * @author Morten Helles
 */
public class ProviderEventRelationBeanInfo extends SimpleBeanInfo {

    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------

    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {
        
        BeanDescriptor beanDescriptor = new BeanDescriptor(ProviderEventRelation.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] {
            ProviderEventRelation.PROPERTY_NAME_id,
            ProviderEventRelation.PROPERTY_NAME_providerId,
            ProviderEventRelation.PROPERTY_NAME_eventId,
            ProviderEventRelation.PROPERTY_NAME_startTime,
            ProviderEventRelation.PROPERTY_NAME_endTime,
            ProviderEventRelation.PROPERTY_NAME_timeQualityRank,
            ProviderEventRelation.PROPERTY_NAME_offersLiveOdds,
            ProviderEventRelation.PROPERTY_NAME_offersLiveTV,
        });
        
        return beanDescriptor;
    }

    /* ----------------------------------------------------------------------------------------- */

    // override default implementation
    public PropertyDescriptor[] getPropertyDescriptors() {

        try {

            PropertyDescriptor id = new PropertyDescriptor(ProviderEventRelation.PROPERTY_NAME_id, ProviderEventRelation.class);
            
            PropertyDescriptor providerId = new PropertyDescriptor(ProviderEventRelation.PROPERTY_NAME_providerId, ProviderEventRelation.class);
            providerId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Provider.class);

            PropertyDescriptor eventId = new PropertyDescriptor(ProviderEventRelation.PROPERTY_NAME_eventId, ProviderEventRelation.class);
            eventId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Event.class);
            
            PropertyDescriptor startTime = new PropertyDescriptor(ProviderEventRelation.PROPERTY_NAME_startTime, ProviderEventRelation.class);
            
            PropertyDescriptor endTime = new PropertyDescriptor(ProviderEventRelation.PROPERTY_NAME_endTime, ProviderEventRelation.class);

            PropertyDescriptor timeQualityRank = new PropertyDescriptor(ProviderEventRelation.PROPERTY_NAME_timeQualityRank, ProviderEventRelation.class);

            PropertyDescriptor offersLiveOdds = new PropertyDescriptor(ProviderEventRelation.PROPERTY_NAME_offersLiveOdds, ProviderEventRelation.class);

            PropertyDescriptor offersLiveTV = new PropertyDescriptor(ProviderEventRelation.PROPERTY_NAME_offersLiveTV, ProviderEventRelation.class);


            return new PropertyDescriptor[] {
                id,
                providerId,
                eventId,
                startTime,
                endTime,
                timeQualityRank,
                offersLiveOdds,
                offersLiveTV,
            };
            
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }

    /* ----------------------------------------------------------------------------------------- */
}