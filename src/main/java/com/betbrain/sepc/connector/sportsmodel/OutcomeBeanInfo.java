package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

/**
 * This is a <code>BeanInfo</code> for the <code>Outcome</code> bean.
 * 
 * @author Morten Helles
 */
public class OutcomeBeanInfo extends SimpleBeanInfo {

	// --------------------------------------------------------------------------------------------
	// Instance methods
	// --------------------------------------------------------------------------------------------

    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {
        
        BeanDescriptor beanDescriptor = new BeanDescriptor(Outcome.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] {
            Outcome.PROPERTY_NAME_id,
            Outcome.PROPERTY_NAME_typeId,
            Outcome.PROPERTY_NAME_isComplete,
            Outcome.PROPERTY_NAME_isNegation,
            Outcome.PROPERTY_NAME_statusId,
            Outcome.PROPERTY_NAME_eventId,
            Outcome.PROPERTY_NAME_eventPartId, 
            Outcome.PROPERTY_NAME_paramFloat1, 
            Outcome.PROPERTY_NAME_paramFloat2,
            Outcome.PROPERTY_NAME_paramFloat3,
            Outcome.PROPERTY_NAME_paramBoolean1,
            Outcome.PROPERTY_NAME_paramString1,
            Outcome.PROPERTY_NAME_paramParticipantId1, 
            Outcome.PROPERTY_NAME_paramParticipantId2,
            Outcome.PROPERTY_NAME_paramParticipantId3,
            Outcome.PROPERTY_NAME_paramEventPartId1
        });
        
        return beanDescriptor;
    }

    /* ----------------------------------------------------------------------------------------- */

    // override default implementation
    public PropertyDescriptor[] getPropertyDescriptors() {

        try {

            PropertyDescriptor id = new PropertyDescriptor(Outcome.PROPERTY_NAME_id, Outcome.class);
            
            PropertyDescriptor typeId = new PropertyDescriptor(Outcome.PROPERTY_NAME_typeId, Outcome.class);
            typeId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, OutcomeType.class);

            PropertyDescriptor isComplete = new PropertyDescriptor(Outcome.PROPERTY_NAME_isComplete, Outcome.class);

            PropertyDescriptor isNegation = new PropertyDescriptor(Outcome.PROPERTY_NAME_isNegation, Outcome.class);

            PropertyDescriptor statusId = new PropertyDescriptor(Outcome.PROPERTY_NAME_statusId, Outcome.class);
            statusId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, OutcomeStatus.class);

            PropertyDescriptor eventId = new PropertyDescriptor(Outcome.PROPERTY_NAME_eventId, Outcome.class);
            eventId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Event.class);
            
            PropertyDescriptor eventPartId = new PropertyDescriptor(Outcome.PROPERTY_NAME_eventPartId, Outcome.class);
            eventPartId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, EventPart.class);
            
            PropertyDescriptor paramFloat1 = new PropertyDescriptor(Outcome.PROPERTY_NAME_paramFloat1, Outcome.class);
            
            PropertyDescriptor paramFloat2 = new PropertyDescriptor(Outcome.PROPERTY_NAME_paramFloat2, Outcome.class);

            PropertyDescriptor paramFloat3 = new PropertyDescriptor(Outcome.PROPERTY_NAME_paramFloat3, Outcome.class);
            
            PropertyDescriptor paramBoolean1 = new PropertyDescriptor(Outcome.PROPERTY_NAME_paramBoolean1, Outcome.class);
            
            PropertyDescriptor paramString1 = new PropertyDescriptor(Outcome.PROPERTY_NAME_paramString1, Outcome.class);

            PropertyDescriptor paramParticipantId1 = new PropertyDescriptor(Outcome.PROPERTY_NAME_paramParticipantId1, Outcome.class);
            paramParticipantId1.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Participant.class);
            
            PropertyDescriptor paramParticipantId2 = new PropertyDescriptor(Outcome.PROPERTY_NAME_paramParticipantId2, Outcome.class);
            paramParticipantId2.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Participant.class);

            PropertyDescriptor paramParticipantId3 = new PropertyDescriptor(Outcome.PROPERTY_NAME_paramParticipantId3, Outcome.class);
            paramParticipantId3.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Participant.class);

            PropertyDescriptor paramEventPartId1 = new PropertyDescriptor(Outcome.PROPERTY_NAME_paramEventPartId1, Outcome.class);
            paramEventPartId1.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, EventPart.class);

            return new PropertyDescriptor[] {
                id,
                typeId,
                isComplete,
                isNegation,
                statusId,
                eventId,
                eventPartId,
                paramFloat1,
                paramFloat2,
                paramFloat3,
                paramBoolean1,
                paramString1,
                paramParticipantId1,
                paramParticipantId2,
                paramParticipantId3,
                paramEventPartId1
            };
            
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }

    /* ----------------------------------------------------------------------------------------- */
}