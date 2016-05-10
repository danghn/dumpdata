package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

/**
 * This is a <code>BeanInfo</code> for the <code>ParticipantRelation</code> bean.
 * 
 * @author Morten Helles
 */
public class ParticipantRelationBeanInfo extends SimpleBeanInfo {

	// --------------------------------------------------------------------------------------------
	// Instance methods
	// --------------------------------------------------------------------------------------------

    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {
        
        BeanDescriptor beanDescriptor = new BeanDescriptor(ParticipantRelation.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] {
            ParticipantRelation.PROPERTY_NAME_id, 
            ParticipantRelation.PROPERTY_NAME_typeId, 
            ParticipantRelation.PROPERTY_NAME_fromParticipantId, 
            ParticipantRelation.PROPERTY_NAME_toParticipantId, 
            ParticipantRelation.PROPERTY_NAME_startTime, 
            ParticipantRelation.PROPERTY_NAME_endTime, 
            ParticipantRelation.PROPERTY_NAME_paramParticipantRoleId
        });
        
        return beanDescriptor;
    }

    /* ----------------------------------------------------------------------------------------- */

    // override default implementation
    public PropertyDescriptor[] getPropertyDescriptors() {

        try {

            PropertyDescriptor id = new PropertyDescriptor(ParticipantRelation.PROPERTY_NAME_id, ParticipantRelation.class);

            PropertyDescriptor typeId = new PropertyDescriptor(ParticipantRelation.PROPERTY_NAME_typeId, ParticipantRelation.class);
            typeId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, ParticipantRelationType.class);
            
            PropertyDescriptor fromParticipantId = new PropertyDescriptor(ParticipantRelation.PROPERTY_NAME_fromParticipantId, ParticipantRelation.class);
            fromParticipantId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Participant.class);

            PropertyDescriptor toParticipantId = new PropertyDescriptor(ParticipantRelation.PROPERTY_NAME_toParticipantId, ParticipantRelation.class);
            toParticipantId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Participant.class);

            PropertyDescriptor startTime = new PropertyDescriptor(ParticipantRelation.PROPERTY_NAME_startTime, ParticipantRelation.class);

            PropertyDescriptor endTime = new PropertyDescriptor(ParticipantRelation.PROPERTY_NAME_endTime, ParticipantRelation.class);
            
            PropertyDescriptor participantRoleId = new PropertyDescriptor(ParticipantRelation.PROPERTY_NAME_paramParticipantRoleId, ParticipantRelation.class);
            participantRoleId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, ParticipantRole.class);

            return new PropertyDescriptor[] {
                id,
                typeId,
                fromParticipantId,
                toParticipantId,
                startTime,
                endTime,
                participantRoleId
            };
            
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }

    /* ----------------------------------------------------------------------------------------- */
}