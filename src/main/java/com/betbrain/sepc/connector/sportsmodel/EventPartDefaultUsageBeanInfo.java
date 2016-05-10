package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

/**
 * This is a <code>BeanInfo</code> for the <code>EventPartDefaultUsage</code> bean.
 * 
 * @author Morten Helles
 */
public class EventPartDefaultUsageBeanInfo extends SimpleBeanInfo {

	// --------------------------------------------------------------------------------------------
	// Instance methods
	// --------------------------------------------------------------------------------------------

    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {
        
        BeanDescriptor beanDescriptor = new BeanDescriptor(EventPartDefaultUsage.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] {
            EventPartDefaultUsage.PROPERTY_NAME_id,
            EventPartDefaultUsage.PROPERTY_NAME_parentEventId,
            EventPartDefaultUsage.PROPERTY_NAME_eventTypeId, 
            EventPartDefaultUsage.PROPERTY_NAME_sportId, 
            EventPartDefaultUsage.PROPERTY_NAME_rootPartId
        });
        
        return beanDescriptor;
    }

    /* ----------------------------------------------------------------------------------------- */

    // override default implementation
    public PropertyDescriptor[] getPropertyDescriptors() {

        try {

            PropertyDescriptor id = new PropertyDescriptor(EventPartDefaultUsage.PROPERTY_NAME_id, EventPartDefaultUsage.class);

            PropertyDescriptor parentEventId = new PropertyDescriptor(EventPartDefaultUsage.PROPERTY_NAME_parentEventId, EventPartDefaultUsage.class);
            parentEventId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Event.class);

            PropertyDescriptor eventTypeId = new PropertyDescriptor(EventPartDefaultUsage.PROPERTY_NAME_eventTypeId, EventPartDefaultUsage.class);
            eventTypeId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, EventType.class);

            PropertyDescriptor sportId = new PropertyDescriptor(EventPartDefaultUsage.PROPERTY_NAME_sportId, EventPartDefaultUsage.class);
            sportId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Sport.class);

            PropertyDescriptor rootPartId = new PropertyDescriptor(EventPartDefaultUsage.PROPERTY_NAME_rootPartId, EventPartDefaultUsage.class);
            rootPartId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, EventPart.class);

            return new PropertyDescriptor[] {
                id,
                parentEventId,
                eventTypeId,
                sportId,
                rootPartId
            };
            
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }

    /* ----------------------------------------------------------------------------------------- */
}