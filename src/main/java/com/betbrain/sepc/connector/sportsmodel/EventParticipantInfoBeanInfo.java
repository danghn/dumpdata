package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

public class EventParticipantInfoBeanInfo extends SimpleBeanInfo {

    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------

    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {
        
        BeanDescriptor beanDescriptor = new BeanDescriptor(EventParticipantInfo.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] {
            EventParticipantInfo.PROPERTY_NAME_id,
            EventParticipantInfo.PROPERTY_NAME_typeId,
            EventParticipantInfo.PROPERTY_NAME_eventId,
            EventParticipantInfo.PROPERTY_NAME_providerId,
            EventParticipantInfo.PROPERTY_NAME_sourceId,
            EventParticipantInfo.PROPERTY_NAME_eventPartId,
            EventParticipantInfo.PROPERTY_NAME_participantId
        });
        
        return beanDescriptor;
    }

    /* ----------------------------------------------------------------------------------------- */

    // override default implementation
    public PropertyDescriptor[] getPropertyDescriptors() {

        try {

            PropertyDescriptor id = new PropertyDescriptor(EventParticipantInfo.PROPERTY_NAME_id, EventParticipantInfo.class);

            PropertyDescriptor typeId = new PropertyDescriptor(EventParticipantInfo.PROPERTY_NAME_typeId, EventParticipantInfo.class);
            typeId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, EventParticipantInfoType.class);

            PropertyDescriptor eventId = new PropertyDescriptor(EventParticipantInfo.PROPERTY_NAME_eventId, EventParticipantInfo.class);
            eventId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Event.class);
            
            PropertyDescriptor providerId = new PropertyDescriptor(EventParticipantInfo.PROPERTY_NAME_providerId, EventParticipantInfo.class);
            providerId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Provider.class);
            
            PropertyDescriptor sourceId = new PropertyDescriptor(EventParticipantInfo.PROPERTY_NAME_sourceId, EventParticipantInfo.class);
            sourceId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Source.class);

            PropertyDescriptor eventPartId = new PropertyDescriptor(EventParticipantInfo.PROPERTY_NAME_eventPartId, EventParticipantInfo.class);
            eventPartId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, EventPart.class);
            
            PropertyDescriptor participantId = new PropertyDescriptor(EventParticipantInfo.PROPERTY_NAME_participantId, EventParticipantInfo.class);
            participantId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Participant.class);
            
            return new PropertyDescriptor[] {
                id,
                typeId,
                eventId,
                providerId,
                sourceId,
                eventPartId,
                participantId
            };
            
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }

    /* ----------------------------------------------------------------------------------------- */
    
}
