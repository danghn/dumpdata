package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

/**
 * This is a <code>BeanInfo</code> for the <code>EventParticipantRelation</code> bean.
 * 
 * @author Morten Helles
 */
public class EventParticipantRelationBeanInfo extends SimpleBeanInfo {

	// --------------------------------------------------------------------------------------------
	// Instance methods
	// --------------------------------------------------------------------------------------------

    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {
        
        BeanDescriptor beanDescriptor = new BeanDescriptor(EventParticipantRelation.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] {
            EventParticipantRelation.PROPERTY_NAME_id,
            EventParticipantRelation.PROPERTY_NAME_eventId,
            EventParticipantRelation.PROPERTY_NAME_eventPartId,
            EventParticipantRelation.PROPERTY_NAME_participantId, 
            EventParticipantRelation.PROPERTY_NAME_participantRoleId, 
            EventParticipantRelation.PROPERTY_NAME_parentParticipantId 
        });
        
        return beanDescriptor;
    }

    /* ----------------------------------------------------------------------------------------- */

    // override default implementation
    public PropertyDescriptor[] getPropertyDescriptors() {

        try {

            PropertyDescriptor id = new PropertyDescriptor(EventParticipantRelation.PROPERTY_NAME_id, EventParticipantRelation.class);
            
            PropertyDescriptor eventId = new PropertyDescriptor(EventParticipantRelation.PROPERTY_NAME_eventId, EventParticipantRelation.class);
            eventId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Event.class);

            PropertyDescriptor eventPartId = new PropertyDescriptor(EventParticipantRelation.PROPERTY_NAME_eventPartId, EventParticipantRelation.class);
            eventPartId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, EventPart.class);
            
            PropertyDescriptor participantId = new PropertyDescriptor(EventParticipantRelation.PROPERTY_NAME_participantId, EventParticipantRelation.class);
            participantId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Participant.class);

            PropertyDescriptor participantRoleId = new PropertyDescriptor(EventParticipantRelation.PROPERTY_NAME_participantRoleId, EventParticipantRelation.class);
            participantRoleId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, ParticipantRole.class);
            
            PropertyDescriptor parentParticipantId = new PropertyDescriptor(EventParticipantRelation.PROPERTY_NAME_parentParticipantId, EventParticipantRelation.class);
            parentParticipantId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Participant.class);

            return new PropertyDescriptor[] {
                id,
                eventId,
                eventPartId,
                participantId,
                participantRoleId,
                parentParticipantId
            };
            
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }

    /* ----------------------------------------------------------------------------------------- */
}