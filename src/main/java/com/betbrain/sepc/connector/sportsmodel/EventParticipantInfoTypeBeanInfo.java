package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

public class EventParticipantInfoTypeBeanInfo extends SimpleBeanInfo {
    
    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------
    
    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {
    
        BeanDescriptor beanDescriptor = new BeanDescriptor(EventParticipantInfoType.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] { EventParticipantInfoType.PROPERTY_NAME_id, EventParticipantInfoType.PROPERTY_NAME_name, EventParticipantInfoType.PROPERTY_NAME_description });
        
        return beanDescriptor;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    // override default implementation
    public PropertyDescriptor[] getPropertyDescriptors() {
    
        try {
            
            PropertyDescriptor id = new PropertyDescriptor(EventParticipantInfoType.PROPERTY_NAME_id, EventParticipantInfoType.class);
            
            PropertyDescriptor name = new PropertyDescriptor(EventParticipantInfoType.PROPERTY_NAME_name, EventParticipantInfoType.class);
            
            PropertyDescriptor description = new PropertyDescriptor(EventParticipantInfoType.PROPERTY_NAME_description, EventParticipantInfoType.class);
            
            return new PropertyDescriptor[] { id, name, description };
            
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
}
