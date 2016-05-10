package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

public class EventActionDetailBeanInfo  extends SimpleBeanInfo {
    
 // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------

    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {
        
        BeanDescriptor beanDescriptor = new BeanDescriptor(EventActionDetail.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] {
            EventActionDetail.PROPERTY_NAME_id,
            EventActionDetail.PROPERTY_NAME_typeId,
            EventActionDetail.PROPERTY_NAME_eventActionId,
            EventActionDetail.PROPERTY_NAME_paramFloat1,
            EventActionDetail.PROPERTY_NAME_paramFloat2,
            EventActionDetail.PROPERTY_NAME_paramParticipantId1,
            EventActionDetail.PROPERTY_NAME_paramString1,
            EventActionDetail.PROPERTY_NAME_paramBoolean1
        });
        
        return beanDescriptor;
    }

    /* ----------------------------------------------------------------------------------------- */

    // override default implementation
    public PropertyDescriptor[] getPropertyDescriptors() {

        try {

            PropertyDescriptor id = new PropertyDescriptor(EventActionDetail.PROPERTY_NAME_id, EventActionDetail.class);

            PropertyDescriptor typeId = new PropertyDescriptor(EventActionDetail.PROPERTY_NAME_typeId, EventActionDetail.class);
            typeId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, EventActionDetailType.class);

            PropertyDescriptor eventActionId = new PropertyDescriptor(EventActionDetail.PROPERTY_NAME_eventActionId, EventActionDetail.class);
            eventActionId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, EventAction.class);
            
            PropertyDescriptor paramFloat1 = new PropertyDescriptor(EventActionDetail.PROPERTY_NAME_paramFloat1, EventActionDetail.class);
            
            PropertyDescriptor paramFloat2 = new PropertyDescriptor(EventActionDetail.PROPERTY_NAME_paramFloat2, EventActionDetail.class);
            
            PropertyDescriptor paramParticipantId1 = new PropertyDescriptor(EventActionDetail.PROPERTY_NAME_paramParticipantId1, EventActionDetail.class);
            paramParticipantId1.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Participant.class);
            
            PropertyDescriptor paramString1 = new PropertyDescriptor(EventActionDetail.PROPERTY_NAME_paramString1, EventActionDetail.class);
            
            PropertyDescriptor paramBoolean1 = new PropertyDescriptor(EventActionDetail.PROPERTY_NAME_paramBoolean1, EventActionDetail.class);
            
            return new PropertyDescriptor[] {
                id,
                typeId,
                eventActionId,
                paramFloat1,
                paramFloat2,
                paramParticipantId1,
                paramString1,
                paramBoolean1
            };
            
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }

    /* ----------------------------------------------------------------------------------------- */
}
