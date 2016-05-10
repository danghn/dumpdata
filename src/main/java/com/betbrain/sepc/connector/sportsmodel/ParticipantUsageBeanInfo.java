package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

/**
 * This is a <code>BeanInfo</code> for the <code>ParticipantUsage</code> bean.
 * 
 * @author Morten Helles
 */
public class ParticipantUsageBeanInfo extends SimpleBeanInfo {

	// --------------------------------------------------------------------------------------------
	// Instance methods
	// --------------------------------------------------------------------------------------------

    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {
        
        BeanDescriptor beanDescriptor = new BeanDescriptor(ParticipantUsage.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] {
            ParticipantUsage.PROPERTY_NAME_id,
            ParticipantUsage.PROPERTY_NAME_participantId, 
            ParticipantUsage.PROPERTY_NAME_sportId
        });
        
        return beanDescriptor;
    }

    /* ----------------------------------------------------------------------------------------- */

    // override default implementation
    public PropertyDescriptor[] getPropertyDescriptors() {

        try {

            PropertyDescriptor id = new PropertyDescriptor(ParticipantUsage.PROPERTY_NAME_id, ParticipantUsage.class);
            
            PropertyDescriptor participantId = new PropertyDescriptor(ParticipantUsage.PROPERTY_NAME_participantId, ParticipantUsage.class);
            participantId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Participant.class);
            
            PropertyDescriptor sportId = new PropertyDescriptor(ParticipantUsage.PROPERTY_NAME_sportId, ParticipantUsage.class);
            sportId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Sport.class);

            return new PropertyDescriptor[] {
                id,
                participantId,
                sportId
            };
            
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }

    /* ----------------------------------------------------------------------------------------- */
}