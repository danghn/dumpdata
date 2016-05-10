package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

/**
 * This is a <code>BeanInfo</code> for the <code>EventTemplate</code> bean.
 * 
 * @author Morten Helles
 */
public class EventTemplateBeanInfo extends SimpleBeanInfo {

	// --------------------------------------------------------------------------------------------
	// Instance methods
	// --------------------------------------------------------------------------------------------

    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {
        
        BeanDescriptor beanDescriptor = new BeanDescriptor(EventTemplate.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] {
            EventTemplate.PROPERTY_NAME_id,
            EventTemplate.PROPERTY_NAME_name,
            EventTemplate.PROPERTY_NAME_eventTypeId, 
            EventTemplate.PROPERTY_NAME_sportId, 
            EventTemplate.PROPERTY_NAME_url, 
            EventTemplate.PROPERTY_NAME_venueId, 
            EventTemplate.PROPERTY_NAME_rootPartId,
            EventTemplate.PROPERTY_NAME_note
        });
        
        return beanDescriptor;
    }

    /* ----------------------------------------------------------------------------------------- */

    // override default implementation
    public PropertyDescriptor[] getPropertyDescriptors() {

        try {

            PropertyDescriptor id = new PropertyDescriptor(EventTemplate.PROPERTY_NAME_id, EventTemplate.class);
            
            PropertyDescriptor name = new PropertyDescriptor(EventTemplate.PROPERTY_NAME_name, EventTemplate.class);

            PropertyDescriptor eventTypeId = new PropertyDescriptor(EventTemplate.PROPERTY_NAME_eventTypeId, EventTemplate.class);
            eventTypeId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, EventType.class);
            
            PropertyDescriptor sportId = new PropertyDescriptor(EventTemplate.PROPERTY_NAME_sportId, EventTemplate.class);
            sportId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Sport.class);
            
            PropertyDescriptor url = new PropertyDescriptor(EventTemplate.PROPERTY_NAME_url, EventTemplate.class);
            
            PropertyDescriptor venueId = new PropertyDescriptor(EventTemplate.PROPERTY_NAME_venueId, EventTemplate.class);
            venueId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Location.class);
            
            PropertyDescriptor rootPartId = new PropertyDescriptor(EventTemplate.PROPERTY_NAME_rootPartId, EventTemplate.class);
            rootPartId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, EventPart.class);

            PropertyDescriptor note = new PropertyDescriptor(EventTemplate.PROPERTY_NAME_note, EventTemplate.class);
            
            return new PropertyDescriptor[] {
                id,
                name,
                eventTypeId,
                sportId,
                url,
                venueId,
                rootPartId,
                note
            };
            
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }

    /* ----------------------------------------------------------------------------------------- */
}