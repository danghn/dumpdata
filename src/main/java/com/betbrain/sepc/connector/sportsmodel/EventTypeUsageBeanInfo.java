package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

/**
 * This is a <code>BeanInfo</code> for the <code>EventTypeUsage</code> bean.
 * 
 * @author Morten Helles
 */
public class EventTypeUsageBeanInfo extends SimpleBeanInfo {

	// --------------------------------------------------------------------------------------------
	// Instance methods
	// --------------------------------------------------------------------------------------------

    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {
        
        BeanDescriptor beanDescriptor = new BeanDescriptor(EventTypeUsage.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] {
            EventTypeUsage.PROPERTY_NAME_id,
            EventTypeUsage.PROPERTY_NAME_eventTypeId, 
            EventTypeUsage.PROPERTY_NAME_sportId,
            EventTypeUsage.PROPERTY_NAME_minPrimaryParticipantTimeBetweenEvents,
            EventTypeUsage.PROPERTY_NAME_minEventDuration,
            EventTypeUsage.PROPERTY_NAME_maxEventDuration
        });

        return beanDescriptor;
    }

    /* ----------------------------------------------------------------------------------------- */

    // override default implementation
    public PropertyDescriptor[] getPropertyDescriptors() {

        try {

            PropertyDescriptor id = new PropertyDescriptor(EventTypeUsage.PROPERTY_NAME_id, EventTypeUsage.class);
            
            PropertyDescriptor eventTypeId = new PropertyDescriptor(EventTypeUsage.PROPERTY_NAME_eventTypeId, EventTypeUsage.class);
            eventTypeId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, EventType.class);
            
            PropertyDescriptor sportId = new PropertyDescriptor(EventTypeUsage.PROPERTY_NAME_sportId, EventTypeUsage.class);
            sportId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Sport.class);

            PropertyDescriptor minPrimaryParticipantTimeBetweenEvents = new PropertyDescriptor(EventTypeUsage.PROPERTY_NAME_minPrimaryParticipantTimeBetweenEvents, EventTypeUsage.class);

            PropertyDescriptor minEventDuration = new PropertyDescriptor(EventTypeUsage.PROPERTY_NAME_minEventDuration, EventTypeUsage.class);

            PropertyDescriptor maxEventDuration = new PropertyDescriptor(EventTypeUsage.PROPERTY_NAME_maxEventDuration, EventTypeUsage.class);

            return new PropertyDescriptor[] {
                id,
                eventTypeId,
                sportId,
                minPrimaryParticipantTimeBetweenEvents,
                minEventDuration,
                maxEventDuration
            };
            
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }

    /* ----------------------------------------------------------------------------------------- */
}