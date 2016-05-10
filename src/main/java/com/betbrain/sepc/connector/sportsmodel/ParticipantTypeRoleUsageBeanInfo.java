package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

/**
 * This is a <code>BeanInfo</code> for the <code>ParticipantTypeRoleUsage</code> bean.
 * 
 * @author Morten Helles
 */
public class ParticipantTypeRoleUsageBeanInfo extends SimpleBeanInfo {

	// --------------------------------------------------------------------------------------------
	// Instance methods
	// --------------------------------------------------------------------------------------------

    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {
        
        BeanDescriptor beanDescriptor = new BeanDescriptor(ParticipantTypeRoleUsage.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] {
            ParticipantTypeRoleUsage.PROPERTY_NAME_id, 
            ParticipantTypeRoleUsage.PROPERTY_NAME_participantTypeId, 
            ParticipantTypeRoleUsage.PROPERTY_NAME_participantRoleId, 
            ParticipantTypeRoleUsage.PROPERTY_NAME_sportId
        });
        
        return beanDescriptor;
    }

    /* ----------------------------------------------------------------------------------------- */

    // override default implementation
    public PropertyDescriptor[] getPropertyDescriptors() {

        try {

            PropertyDescriptor id = new PropertyDescriptor(ParticipantTypeRoleUsage.PROPERTY_NAME_id, ParticipantTypeRoleUsage.class);
            
            PropertyDescriptor participantTypeId = new PropertyDescriptor(ParticipantTypeRoleUsage.PROPERTY_NAME_participantTypeId, ParticipantTypeRoleUsage.class);
            participantTypeId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, ParticipantType.class);

            PropertyDescriptor participantRoleId = new PropertyDescriptor(ParticipantTypeRoleUsage.PROPERTY_NAME_participantRoleId, ParticipantTypeRoleUsage.class);
            participantRoleId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, ParticipantRole.class);
            
            PropertyDescriptor sportId = new PropertyDescriptor(ParticipantTypeRoleUsage.PROPERTY_NAME_sportId, ParticipantTypeRoleUsage.class);
            sportId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Sport.class);
            
            return new PropertyDescriptor[] {
                id,
                participantTypeId,
                participantRoleId,
                sportId
            };
            
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }

    /* ----------------------------------------------------------------------------------------- */
}