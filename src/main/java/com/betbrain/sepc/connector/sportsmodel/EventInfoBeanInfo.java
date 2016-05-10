package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

public class EventInfoBeanInfo extends SimpleBeanInfo {
    
    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------
    
    @Override
    public BeanDescriptor getBeanDescriptor() {
    
        BeanDescriptor beanDescriptor = new BeanDescriptor(EventInfo.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] { EventInfo.PROPERTY_NAME_id, //
        EventInfo.PROPERTY_NAME_typeId, //
        EventInfo.PROPERTY_NAME_eventId, //
        EventInfo.PROPERTY_NAME_providerId, //
        EventInfo.PROPERTY_NAME_sourceId, //
        EventInfo.PROPERTY_NAME_eventPartId, //
        EventInfo.PROPERTY_NAME_paramFloat1, //
        EventInfo.PROPERTY_NAME_paramFloat2, //
        EventInfo.PROPERTY_NAME_paramParticipantId1, //
        EventInfo.PROPERTY_NAME_paramParticipantId2, //
        EventInfo.PROPERTY_NAME_paramEventPartId1, //
        EventInfo.PROPERTY_NAME_paramString1, //
        EventInfo.PROPERTY_NAME_paramBoolean1, //
        EventInfo.PROPERTY_NAME_paramEventStatusId1, //
        EventInfo.PROPERTY_NAME_paramTime1 //
        });
        
        return beanDescriptor;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
    
        try {
            
            PropertyDescriptor id = new PropertyDescriptor(EventInfo.PROPERTY_NAME_id, EventInfo.class);
            
            PropertyDescriptor typeId = new PropertyDescriptor(EventInfo.PROPERTY_NAME_typeId, EventInfo.class);
            typeId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, EventInfoType.class);
            
            PropertyDescriptor eventId = new PropertyDescriptor(EventInfo.PROPERTY_NAME_eventId, EventInfo.class);
            eventId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Event.class);
            
            PropertyDescriptor providerId = new PropertyDescriptor(EventInfo.PROPERTY_NAME_providerId, EventInfo.class);
            providerId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Provider.class);
            
            PropertyDescriptor sourceId = new PropertyDescriptor(EventInfo.PROPERTY_NAME_sourceId, EventInfo.class);
            sourceId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Source.class);
            
            PropertyDescriptor eventPartId = new PropertyDescriptor(EventInfo.PROPERTY_NAME_eventPartId, EventInfo.class);
            eventPartId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, EventPart.class);
            
            PropertyDescriptor paramFloat1 = new PropertyDescriptor(EventInfo.PROPERTY_NAME_paramFloat1, EventInfo.class);
            
            PropertyDescriptor paramFloat2 = new PropertyDescriptor(EventInfo.PROPERTY_NAME_paramFloat2, EventInfo.class);
            
            PropertyDescriptor paramParticipantId1 = new PropertyDescriptor(EventInfo.PROPERTY_NAME_paramParticipantId1, EventInfo.class);
            paramParticipantId1.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Participant.class);
            
            PropertyDescriptor paramParticipantId2 = new PropertyDescriptor(EventInfo.PROPERTY_NAME_paramParticipantId2, EventInfo.class);
            paramParticipantId2.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Participant.class);
            
            PropertyDescriptor paramEventPartId1 = new PropertyDescriptor(EventInfo.PROPERTY_NAME_paramEventPartId1, EventInfo.class);
            paramEventPartId1.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, EventPart.class);
            
            PropertyDescriptor paramString1 = new PropertyDescriptor(EventInfo.PROPERTY_NAME_paramString1, EventInfo.class);
            
            PropertyDescriptor paramBoolean1 = new PropertyDescriptor(EventInfo.PROPERTY_NAME_paramBoolean1, EventInfo.class);
            
            PropertyDescriptor paramEventStatusId1 = new PropertyDescriptor(EventInfo.PROPERTY_NAME_paramEventStatusId1, EventInfo.class);
            paramEventStatusId1.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, EventStatus.class);
            
            PropertyDescriptor paramTime1 = new PropertyDescriptor(EventInfo.PROPERTY_NAME_paramTime1, EventInfo.class);
            
            return new PropertyDescriptor[] { id, typeId, eventId, providerId, sourceId, eventPartId, paramFloat1, paramFloat2, paramParticipantId1, paramParticipantId2, paramEventPartId1, paramString1, paramBoolean1, paramEventStatusId1, paramTime1 };
            
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
}
