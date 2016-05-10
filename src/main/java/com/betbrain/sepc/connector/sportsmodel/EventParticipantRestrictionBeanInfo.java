package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

/**
 * This is a <code>BeanInfo</code> for the <code>EventParticipantRestriction</code> bean.
 * 
 * @author Morten Helles
 */
public class EventParticipantRestrictionBeanInfo extends SimpleBeanInfo {

	// --------------------------------------------------------------------------------------------
	// Instance methods
	// --------------------------------------------------------------------------------------------

    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {
        
        BeanDescriptor beanDescriptor = new BeanDescriptor(EventParticipantRestriction.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] {
    		EventParticipantRestriction.PROPERTY_NAME_id,
    		EventParticipantRestriction.PROPERTY_NAME_eventId, 
    		EventParticipantRestriction.PROPERTY_NAME_participantTypeId, 
    		EventParticipantRestriction.PROPERTY_NAME_participantIsMale, 
    		EventParticipantRestriction.PROPERTY_NAME_participantMinAge,
    		EventParticipantRestriction.PROPERTY_NAME_participantMaxAge,
    		EventParticipantRestriction.PROPERTY_NAME_participantPartOfLocationId
        });
        
        return beanDescriptor;
    }

    /* ----------------------------------------------------------------------------------------- */

    // override default implementation
    public PropertyDescriptor[] getPropertyDescriptors() {

        try {

            PropertyDescriptor id = new PropertyDescriptor(EventParticipantRestriction.PROPERTY_NAME_id, EventParticipantRestriction.class);
            
            PropertyDescriptor eventId = new PropertyDescriptor(EventParticipantRestriction.PROPERTY_NAME_eventId, EventParticipantRestriction.class);
            eventId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Event.class);

            PropertyDescriptor participantTypeId = new PropertyDescriptor(EventParticipantRestriction.PROPERTY_NAME_participantTypeId, EventParticipantRestriction.class);
            participantTypeId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, ParticipantType.class);

            PropertyDescriptor participantIsMale = new PropertyDescriptor(EventParticipantRestriction.PROPERTY_NAME_participantIsMale, EventParticipantRestriction.class);
            
            PropertyDescriptor participantMinAge = new PropertyDescriptor(EventParticipantRestriction.PROPERTY_NAME_participantMinAge, EventParticipantRestriction.class);

            PropertyDescriptor participantMaxAge = new PropertyDescriptor(EventParticipantRestriction.PROPERTY_NAME_participantMaxAge, EventParticipantRestriction.class);

            PropertyDescriptor participantPartOfLocationId = new PropertyDescriptor(EventParticipantRestriction.PROPERTY_NAME_participantPartOfLocationId, EventParticipantRestriction.class);
            participantPartOfLocationId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Location.class);
            
            return new PropertyDescriptor[] {
                id,
                eventId,
                participantTypeId,
                participantIsMale,
                participantMinAge,
                participantMaxAge,
                participantPartOfLocationId
            };
            
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }

    /* ----------------------------------------------------------------------------------------- */
}