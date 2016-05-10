package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

public class EventInfoTypeBeanInfo extends SimpleBeanInfo {

    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------
    
    // overrides superclass implementation
    @Override
    public BeanDescriptor getBeanDescriptor() {
    
        BeanDescriptor beanDescriptor = new BeanDescriptor(EventInfoType.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] { EventInfoType.PROPERTY_NAME_id, //
        EventInfoType.PROPERTY_NAME_name, //
        EventInfoType.PROPERTY_NAME_description, //
        EventInfoType.PROPERTY_NAME_hasParamFloat1, //
        EventInfoType.PROPERTY_NAME_paramFloat1Description, //
        EventInfoType.PROPERTY_NAME_hasParamFloat2, //
        EventInfoType.PROPERTY_NAME_paramFloat2Description, //
        EventInfoType.PROPERTY_NAME_hasParamParticipantId1, //
        EventInfoType.PROPERTY_NAME_paramParticipantId1Description, //
        EventInfoType.PROPERTY_NAME_hasParamParticipantId2, //
        EventInfoType.PROPERTY_NAME_paramParticipantId2Description, //
        EventInfoType.PROPERTY_NAME_hasParamEventPartId1, //
        EventInfoType.PROPERTY_NAME_paramEventPartId1Description, //
        EventInfoType.PROPERTY_NAME_hasParamString1, //
        EventInfoType.PROPERTY_NAME_paramString1Description, //
        EventInfoType.PROPERTY_NAME_paramString1PossibleValues, //
        EventInfoType.PROPERTY_NAME_hasParamBoolean1, //
        EventInfoType.PROPERTY_NAME_paramBoolean1Description, //
        EventInfoType.PROPERTY_NAME_hasParamEventStatusId1, //
        EventInfoType.PROPERTY_NAME_paramEventStatusId1Description, //
        EventInfoType.PROPERTY_NAME_hasParamTime1, //
        EventInfoType.PROPERTY_NAME_paramTime1Description, //
        EventInfoType.PROPERTY_NAME_paramParticipantIdsMustBeOrdered //
        });
        
        return beanDescriptor;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    // override default implementation
    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
    
        try {
            
            PropertyDescriptor id = new PropertyDescriptor(EventInfoType.PROPERTY_NAME_id, EventInfoType.class);
            
            PropertyDescriptor name = new PropertyDescriptor(EventInfoType.PROPERTY_NAME_name, EventInfoType.class);
            
            PropertyDescriptor description = new PropertyDescriptor(EventInfoType.PROPERTY_NAME_description, EventInfoType.class);
            
            PropertyDescriptor hasParamFloat1 = new PropertyDescriptor(EventInfoType.PROPERTY_NAME_hasParamFloat1, EventInfoType.class);
            
            PropertyDescriptor paramFloat1Description = new PropertyDescriptor(EventInfoType.PROPERTY_NAME_paramFloat1Description, EventInfoType.class);
            
            PropertyDescriptor hasParamFloat2 = new PropertyDescriptor(EventInfoType.PROPERTY_NAME_hasParamFloat2, EventInfoType.class);
            
            PropertyDescriptor paramFloat2Description = new PropertyDescriptor(EventInfoType.PROPERTY_NAME_paramFloat2Description, EventInfoType.class);
            
            PropertyDescriptor hasParamParticipantId1 = new PropertyDescriptor(EventInfoType.PROPERTY_NAME_hasParamParticipantId1, EventInfoType.class);
            
            PropertyDescriptor paramParticipantId1Description = new PropertyDescriptor(EventInfoType.PROPERTY_NAME_paramParticipantId1Description, EventInfoType.class);
            
            PropertyDescriptor hasParamParticipantId2 = new PropertyDescriptor(EventInfoType.PROPERTY_NAME_hasParamParticipantId2, EventInfoType.class);
            
            PropertyDescriptor paramParticipantId2Description = new PropertyDescriptor(EventInfoType.PROPERTY_NAME_paramParticipantId2Description, EventInfoType.class);
            
            PropertyDescriptor hasParamEventPartId1 = new PropertyDescriptor(EventInfoType.PROPERTY_NAME_hasParamEventPartId1, EventInfoType.class);
            
            PropertyDescriptor paramEventPartId1Description = new PropertyDescriptor(EventInfoType.PROPERTY_NAME_paramEventPartId1Description, EventInfoType.class);
            
            PropertyDescriptor hasParamString1 = new PropertyDescriptor(EventInfoType.PROPERTY_NAME_hasParamString1, EventInfoType.class);
            
            PropertyDescriptor paramString1Description = new PropertyDescriptor(EventInfoType.PROPERTY_NAME_paramString1Description, EventInfoType.class);
            
            PropertyDescriptor paramString1PossibleValues = new PropertyDescriptor(EventInfoType.PROPERTY_NAME_paramString1PossibleValues, EventInfoType.class);
            
            PropertyDescriptor hasParamBoolean1 = new PropertyDescriptor(EventInfoType.PROPERTY_NAME_hasParamBoolean1, EventInfoType.class);
            
            PropertyDescriptor paramBoolean1Description = new PropertyDescriptor(EventInfoType.PROPERTY_NAME_paramBoolean1Description, EventInfoType.class);
            
            PropertyDescriptor hasParamEventStatusId1 = new PropertyDescriptor(EventInfoType.PROPERTY_NAME_hasParamEventStatusId1, EventInfoType.class);
            
            PropertyDescriptor paramEventStatusId1Description = new PropertyDescriptor(EventInfoType.PROPERTY_NAME_paramEventStatusId1Description, EventInfoType.class);
            
            PropertyDescriptor hasTimeStatusId1 = new PropertyDescriptor(EventInfoType.PROPERTY_NAME_hasParamTime1, EventInfoType.class);
            
            PropertyDescriptor paramTime1Description = new PropertyDescriptor(EventInfoType.PROPERTY_NAME_paramTime1Description, EventInfoType.class);
            
            PropertyDescriptor paramParticipantIdsMustBeOrdered = new PropertyDescriptor(EventInfoType.PROPERTY_NAME_paramParticipantIdsMustBeOrdered, EventInfoType.class);
            
            return new PropertyDescriptor[] { id, name, description, hasParamFloat1, paramFloat1Description, hasParamFloat2, paramFloat2Description, hasParamParticipantId1, paramParticipantId1Description, hasParamParticipantId2, paramParticipantId2Description, hasParamEventPartId1, paramEventPartId1Description, hasParamString1, paramString1Description, paramString1PossibleValues, hasParamBoolean1, paramBoolean1Description, hasParamEventStatusId1, paramEventStatusId1Description, hasTimeStatusId1, paramTime1Description, paramParticipantIdsMustBeOrdered };
            
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
}
