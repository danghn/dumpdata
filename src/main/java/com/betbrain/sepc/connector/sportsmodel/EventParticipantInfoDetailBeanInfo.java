package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

public class EventParticipantInfoDetailBeanInfo extends SimpleBeanInfo {

 // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------

    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {
        
        BeanDescriptor beanDescriptor = new BeanDescriptor(EventParticipantInfoDetail.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] {
            EventParticipantInfoDetail.PROPERTY_NAME_id,
            EventParticipantInfoDetail.PROPERTY_NAME_typeId,
            EventParticipantInfoDetail.PROPERTY_NAME_eventParticipantInfoId,
            EventParticipantInfoDetail.PROPERTY_NAME_paramFloat1,
            EventParticipantInfoDetail.PROPERTY_NAME_paramParticipantId1,
            EventParticipantInfoDetail.PROPERTY_NAME_paramBoolean1
        });
        
        return beanDescriptor;
    }

    /* ----------------------------------------------------------------------------------------- */

    // override default implementation
    public PropertyDescriptor[] getPropertyDescriptors() {

        try {

            PropertyDescriptor id = new PropertyDescriptor(EventParticipantInfoDetail.PROPERTY_NAME_id, EventParticipantInfoDetail.class);

            PropertyDescriptor typeId = new PropertyDescriptor(EventParticipantInfoDetail.PROPERTY_NAME_typeId, EventParticipantInfoDetail.class);
            typeId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, EventParticipantInfoDetailType.class);

            PropertyDescriptor eventParticipantInfoId = new PropertyDescriptor(EventParticipantInfoDetail.PROPERTY_NAME_eventParticipantInfoId, EventParticipantInfoDetail.class);
            eventParticipantInfoId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, EventParticipantInfo.class);
            
            PropertyDescriptor paramFloat1 = new PropertyDescriptor(EventParticipantInfoDetail.PROPERTY_NAME_paramFloat1, EventParticipantInfoDetail.class);
            
            PropertyDescriptor paramParticipantId1 = new PropertyDescriptor(EventParticipantInfoDetail.PROPERTY_NAME_paramParticipantId1, EventParticipantInfoDetail.class);
            paramParticipantId1.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Participant.class);
            
            PropertyDescriptor paramBoolean1 = new PropertyDescriptor(EventParticipantInfoDetail.PROPERTY_NAME_paramBoolean1, EventParticipantInfoDetail.class);
            
            return new PropertyDescriptor[] {
                id,
                typeId,
                eventParticipantInfoId,
                paramFloat1,
                paramParticipantId1,
                paramBoolean1
            };
            
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }

    /* ----------------------------------------------------------------------------------------- */
    
}
