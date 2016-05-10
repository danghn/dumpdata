package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

public class EventParticipantInfoDetailTypeBeanInfo extends SimpleBeanInfo {
    
 // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------

    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {
        
        BeanDescriptor beanDescriptor = new BeanDescriptor(EventParticipantInfoDetailType.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] {
            EventParticipantInfoDetailType.PROPERTY_NAME_id,
            EventParticipantInfoDetailType.PROPERTY_NAME_name,
            EventParticipantInfoDetailType.PROPERTY_NAME_description,
            EventParticipantInfoDetailType.PROPERTY_NAME_hasParamFloat1,
            EventParticipantInfoDetailType.PROPERTY_NAME_paramFloat1Description,
            EventParticipantInfoDetailType.PROPERTY_NAME_hasParamParticipantId1,
            EventParticipantInfoDetailType.PROPERTY_NAME_paramParticipantId1Description,
            EventParticipantInfoDetailType.PROPERTY_NAME_hasParamBoolean1,
            EventParticipantInfoDetailType.PROPERTY_NAME_paramBoolean1Description
        });
        
        return beanDescriptor;
    }

    /* ----------------------------------------------------------------------------------------- */

    // override default implementation
    public PropertyDescriptor[] getPropertyDescriptors() {

        try {

            PropertyDescriptor id = new PropertyDescriptor(EventParticipantInfoDetailType.PROPERTY_NAME_id, EventParticipantInfoDetailType.class);
            
            PropertyDescriptor name = new PropertyDescriptor(EventParticipantInfoDetailType.PROPERTY_NAME_name, EventParticipantInfoDetailType.class);

            PropertyDescriptor description = new PropertyDescriptor(EventParticipantInfoDetailType.PROPERTY_NAME_description, EventParticipantInfoDetailType.class);
            
            PropertyDescriptor hasParamFloat1 = new PropertyDescriptor(EventParticipantInfoDetailType.PROPERTY_NAME_hasParamFloat1, EventParticipantInfoDetailType.class);

            PropertyDescriptor paramFloat1Description = new PropertyDescriptor(EventParticipantInfoDetailType.PROPERTY_NAME_paramFloat1Description, EventParticipantInfoDetailType.class);

            PropertyDescriptor hasParamParticipantId1 = new PropertyDescriptor(EventParticipantInfoDetailType.PROPERTY_NAME_hasParamParticipantId1, EventParticipantInfoDetailType.class);

            PropertyDescriptor paramParticipantId1Description = new PropertyDescriptor(EventParticipantInfoDetailType.PROPERTY_NAME_paramParticipantId1Description, EventParticipantInfoDetailType.class);
            
            PropertyDescriptor hasParamBoolean1 = new PropertyDescriptor(EventParticipantInfoDetailType.PROPERTY_NAME_hasParamBoolean1, EventParticipantInfoDetailType.class);

            PropertyDescriptor paramBoolean1Description = new PropertyDescriptor(EventParticipantInfoDetailType.PROPERTY_NAME_paramBoolean1Description, EventParticipantInfoDetailType.class);
            
            return new PropertyDescriptor[] {
                id,
                name,
                description,
                hasParamFloat1,
                paramFloat1Description,
                hasParamParticipantId1,
                paramParticipantId1Description,
                hasParamBoolean1,
                paramBoolean1Description
            };
            
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }

    /* ----------------------------------------------------------------------------------------- */
    
}
