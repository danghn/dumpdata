package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

/**
 * This is a <code>BeanInfo</code> for the <code>EventAction</code> bean.
 * 
 * @author Morten Helles
 */
public class EventActionBeanInfo extends SimpleBeanInfo {

    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------
    
    // overrides superclass implementation
    @Override
    public BeanDescriptor getBeanDescriptor() {
    
        BeanDescriptor beanDescriptor = new BeanDescriptor(EventAction.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] {//
        EventAction.PROPERTY_NAME_id, //
        EventAction.PROPERTY_NAME_typeId, //
        EventAction.PROPERTY_NAME_eventId, //
        EventAction.PROPERTY_NAME_providerId, //
        EventAction.PROPERTY_NAME_sourceId, //
        EventAction.PROPERTY_NAME_eventPartId, //
        EventAction.PROPERTY_NAME_paramFloat1, //
        EventAction.PROPERTY_NAME_paramParticipantId1, //
        EventAction.PROPERTY_NAME_paramParticipantId2 //
        });
        
        return beanDescriptor;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    // override default implementation
    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
    
        try {
            
            PropertyDescriptor id = new PropertyDescriptor(EventAction.PROPERTY_NAME_id, EventAction.class);
            
            PropertyDescriptor typeId = new PropertyDescriptor(EventAction.PROPERTY_NAME_typeId, EventAction.class);
            typeId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, EventActionType.class);
            
            PropertyDescriptor eventId = new PropertyDescriptor(EventAction.PROPERTY_NAME_eventId, EventAction.class);
            eventId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Event.class);
            
            PropertyDescriptor providerId = new PropertyDescriptor(EventAction.PROPERTY_NAME_providerId, EventAction.class);
            providerId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Provider.class);
            
            PropertyDescriptor sourceId = new PropertyDescriptor(EventAction.PROPERTY_NAME_sourceId, EventAction.class);
            sourceId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Source.class);
            
            PropertyDescriptor eventPartId = new PropertyDescriptor(EventAction.PROPERTY_NAME_eventPartId, EventAction.class);
            eventPartId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, EventPart.class);
            
            PropertyDescriptor paramFloat1 = new PropertyDescriptor(EventAction.PROPERTY_NAME_paramFloat1, EventAction.class);
            
            PropertyDescriptor paramParticipantId1 = new PropertyDescriptor(EventAction.PROPERTY_NAME_paramParticipantId1, EventAction.class);
            paramParticipantId1.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Participant.class);
            
            PropertyDescriptor paramParticipantId2 = new PropertyDescriptor(EventAction.PROPERTY_NAME_paramParticipantId2, EventAction.class);
            paramParticipantId2.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Participant.class);
            
            return new PropertyDescriptor[] { //
            id, //
            typeId, //
            eventId, //
            providerId, //
            sourceId, //
            eventPartId, //
            paramFloat1, //
            paramParticipantId1, // 
            paramParticipantId2 //
            };
            
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }
    
    /* ----------------------------------------------------------------------------------------- */
}