package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

/**
 * This is a <code>BeanInfo</code> for the <code>Event</code> bean.
 * 
 * @author Morten Helles
 */
public class EventBeanInfo extends SimpleBeanInfo {

	// --------------------------------------------------------------------------------------------
	// Instance methods
	// --------------------------------------------------------------------------------------------

    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {
        
        BeanDescriptor beanDescriptor = new BeanDescriptor(Event.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] {
            Event.PROPERTY_NAME_id,
            Event.PROPERTY_NAME_typeId,
            Event.PROPERTY_NAME_isComplete,
            Event.PROPERTY_NAME_sportId,
            Event.PROPERTY_NAME_templateId,
            Event.PROPERTY_NAME_promotionId,
            Event.PROPERTY_NAME_parentId,
            Event.PROPERTY_NAME_parentPartId,
            Event.PROPERTY_NAME_name,
            Event.PROPERTY_NAME_startTime,
            Event.PROPERTY_NAME_endTime,
            Event.PROPERTY_NAME_deleteTimeOffset,
            Event.PROPERTY_NAME_venueId,
            Event.PROPERTY_NAME_statusId,
            Event.PROPERTY_NAME_hasLiveStatus,
            Event.PROPERTY_NAME_rootPartId,
            Event.PROPERTY_NAME_currentPartId,
            Event.PROPERTY_NAME_url,
            Event.PROPERTY_NAME_popularity,
            Event.PROPERTY_NAME_note
        });
        
        return beanDescriptor;
    }

    /* ----------------------------------------------------------------------------------------- */

    // override default implementation
    public PropertyDescriptor[] getPropertyDescriptors() {

        try {

            PropertyDescriptor id = new PropertyDescriptor(Event.PROPERTY_NAME_id, Event.class);

            PropertyDescriptor typeId = new PropertyDescriptor(Event.PROPERTY_NAME_typeId, Event.class);
            typeId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, EventType.class);

            PropertyDescriptor isComplete = new PropertyDescriptor(Event.PROPERTY_NAME_isComplete, Event.class);
            
            PropertyDescriptor sportId = new PropertyDescriptor(Event.PROPERTY_NAME_sportId, Event.class);
            sportId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Sport.class);
            
            PropertyDescriptor templateId = new PropertyDescriptor(Event.PROPERTY_NAME_templateId, Event.class);
            templateId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, EventTemplate.class);

            PropertyDescriptor promotionId = new PropertyDescriptor(Event.PROPERTY_NAME_promotionId, Event.class);
            promotionId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Event.class);

            PropertyDescriptor parentId = new PropertyDescriptor(Event.PROPERTY_NAME_parentId, Event.class);
            parentId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Event.class);

            PropertyDescriptor parentPartId = new PropertyDescriptor(Event.PROPERTY_NAME_parentPartId, Event.class);
            parentPartId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, EventPart.class);
            
            PropertyDescriptor name = new PropertyDescriptor(Event.PROPERTY_NAME_name, Event.class);
            
            PropertyDescriptor startTime = new PropertyDescriptor(Event.PROPERTY_NAME_startTime, Event.class);
            
            PropertyDescriptor endTime = new PropertyDescriptor(Event.PROPERTY_NAME_endTime, Event.class);

            PropertyDescriptor deleteTimeOffset = new PropertyDescriptor(Event.PROPERTY_NAME_deleteTimeOffset, Event.class);
            
            PropertyDescriptor venueId = new PropertyDescriptor(Event.PROPERTY_NAME_venueId, Event.class);
            venueId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Location.class);
            
            PropertyDescriptor statusId = new PropertyDescriptor(Event.PROPERTY_NAME_statusId, Event.class);
            statusId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, EventStatus.class);

            PropertyDescriptor hasLiveStatus = new PropertyDescriptor(Event.PROPERTY_NAME_hasLiveStatus, Event.class);
            
            PropertyDescriptor rootPartId = new PropertyDescriptor(Event.PROPERTY_NAME_rootPartId, Event.class);
            rootPartId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, EventPart.class);
            
            PropertyDescriptor currentPartId = new PropertyDescriptor(Event.PROPERTY_NAME_currentPartId, Event.class);
            currentPartId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, EventPart.class);

            PropertyDescriptor popularity = new PropertyDescriptor(Event.PROPERTY_NAME_popularity, Event.class);
            
            PropertyDescriptor url = new PropertyDescriptor(Event.PROPERTY_NAME_url, Event.class);
            
            PropertyDescriptor note = new PropertyDescriptor(Event.PROPERTY_NAME_note, Event.class);
            
            return new PropertyDescriptor[] {
                id,
                typeId,
                isComplete,
                sportId,
                templateId,
                promotionId,
                parentId,
                parentPartId,
                name,
                startTime,
                endTime,
                deleteTimeOffset,
                venueId,
                statusId,
                hasLiveStatus,
                rootPartId,
                currentPartId,
                url,
                popularity,
                note
            };
            
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }

    /* ----------------------------------------------------------------------------------------- */
}