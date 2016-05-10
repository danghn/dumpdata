package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

public class EventActionDetailTypeBeanInfo extends SimpleBeanInfo {
    
    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------
    
    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {
    
        BeanDescriptor beanDescriptor = new BeanDescriptor(EventActionDetailType.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] { EventActionDetailType.PROPERTY_NAME_id, EventActionDetailType.PROPERTY_NAME_name, EventActionDetailType.PROPERTY_NAME_description, EventActionDetailType.PROPERTY_NAME_hasParamFloat1, EventActionDetailType.PROPERTY_NAME_paramFloat1Description, EventActionDetailType.PROPERTY_NAME_hasParamFloat2, EventActionDetailType.PROPERTY_NAME_paramFloat2Description, EventActionDetailType.PROPERTY_NAME_hasParamParticipantId1, EventActionDetailType.PROPERTY_NAME_paramParticipantId1Description, EventActionDetailType.PROPERTY_NAME_hasParamString1, EventActionDetailType.PROPERTY_NAME_paramString1Description, EventActionDetailType.PROPERTY_NAME_paramString1PossibleValues, EventActionDetailType.PROPERTY_NAME_hasParamBoolean1, EventActionDetailType.PROPERTY_NAME_paramBoolean1Description });
        
        return beanDescriptor;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    // override default implementation
    public PropertyDescriptor[] getPropertyDescriptors() {
    
        try {
            
            PropertyDescriptor id = new PropertyDescriptor(EventActionDetailType.PROPERTY_NAME_id, EventActionDetailType.class);
            
            PropertyDescriptor name = new PropertyDescriptor(EventActionDetailType.PROPERTY_NAME_name, EventActionDetailType.class);
            
            PropertyDescriptor description = new PropertyDescriptor(EventActionDetailType.PROPERTY_NAME_description, EventActionDetailType.class);
            
            PropertyDescriptor hasParamFloat1 = new PropertyDescriptor(EventActionDetailType.PROPERTY_NAME_hasParamFloat1, EventActionDetailType.class);
            
            PropertyDescriptor paramFloat1Description = new PropertyDescriptor(EventActionDetailType.PROPERTY_NAME_paramFloat1Description, EventActionDetailType.class);
            
            PropertyDescriptor hasParamFloat2 = new PropertyDescriptor(EventActionDetailType.PROPERTY_NAME_hasParamFloat2, EventActionDetailType.class);
            
            PropertyDescriptor paramFloat2Description = new PropertyDescriptor(EventActionDetailType.PROPERTY_NAME_paramFloat2Description, EventActionDetailType.class);
            
            PropertyDescriptor hasParamParticipantId1 = new PropertyDescriptor(EventActionDetailType.PROPERTY_NAME_hasParamParticipantId1, EventActionDetailType.class);
            
            PropertyDescriptor paramParticipantId1Description = new PropertyDescriptor(EventActionDetailType.PROPERTY_NAME_paramParticipantId1Description, EventActionDetailType.class);
            
            PropertyDescriptor hasParamString1 = new PropertyDescriptor(EventActionDetailType.PROPERTY_NAME_hasParamString1, EventActionDetailType.class);
            
            PropertyDescriptor paramString1Description = new PropertyDescriptor(EventActionDetailType.PROPERTY_NAME_paramString1Description, EventActionDetailType.class);
            
            PropertyDescriptor paramString1PossibleValues = new PropertyDescriptor(EventActionDetailType.PROPERTY_NAME_paramString1PossibleValues, EventActionDetailType.class);
            
            PropertyDescriptor hasParamBoolean1 = new PropertyDescriptor(EventActionDetailType.PROPERTY_NAME_hasParamBoolean1, EventActionDetailType.class);
            
            PropertyDescriptor paramBoolean1Description = new PropertyDescriptor(EventActionDetailType.PROPERTY_NAME_paramBoolean1Description, EventActionDetailType.class);
            
            return new PropertyDescriptor[] { id, name, description, hasParamFloat1, paramFloat1Description, hasParamFloat2, paramFloat2Description, hasParamParticipantId1, paramParticipantId1Description, hasParamString1, paramString1Description, paramString1PossibleValues, hasParamBoolean1, paramBoolean1Description };
            
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }
    
    /* ----------------------------------------------------------------------------------------- */
}
