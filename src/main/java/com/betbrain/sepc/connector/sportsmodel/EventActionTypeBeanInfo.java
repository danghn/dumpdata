package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

/**
 * This is a <code>BeanInfo</code> for the <code>EventActionType</code> bean.
 * 
 * @author Morten Helles
 */
public class EventActionTypeBeanInfo extends SimpleBeanInfo {
    
    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------
    
    // overrides superclass implementation
    @Override
    public BeanDescriptor getBeanDescriptor() {
    
        BeanDescriptor beanDescriptor = new BeanDescriptor(EventActionType.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] { //
        EventActionType.PROPERTY_NAME_id, //
        EventActionType.PROPERTY_NAME_name, //
        EventActionType.PROPERTY_NAME_description, //
        EventActionType.PROPERTY_NAME_hasParamFloat1, //
        EventActionType.PROPERTY_NAME_paramFloat1Description, //
        EventActionType.PROPERTY_NAME_hasParamParticipantId1, //
        EventActionType.PROPERTY_NAME_paramParticipantId1Description, //
        EventActionType.PROPERTY_NAME_hasParamParticipantId2, //
        EventActionType.PROPERTY_NAME_paramParticipantId2Description //
        });
        
        return beanDescriptor;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    // override default implementation
    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
    
        try {
            
            PropertyDescriptor id = new PropertyDescriptor(EventActionType.PROPERTY_NAME_id, EventActionType.class);
            
            PropertyDescriptor name = new PropertyDescriptor(EventActionType.PROPERTY_NAME_name, EventActionType.class);
            
            PropertyDescriptor description = new PropertyDescriptor(EventActionType.PROPERTY_NAME_description, EventActionType.class);
            
            PropertyDescriptor hasParamFloat1 = new PropertyDescriptor(EventActionType.PROPERTY_NAME_hasParamFloat1, EventActionType.class);
            
            PropertyDescriptor paramFloat1Description = new PropertyDescriptor(EventActionType.PROPERTY_NAME_paramFloat1Description, EventActionType.class);
            
            PropertyDescriptor hasParamParticipantId1 = new PropertyDescriptor(EventActionType.PROPERTY_NAME_hasParamParticipantId1, EventActionType.class);
            
            PropertyDescriptor paramParticipantId1Description = new PropertyDescriptor(EventActionType.PROPERTY_NAME_paramParticipantId1Description, EventActionType.class);
            
            PropertyDescriptor hasParamParticipantId2 = new PropertyDescriptor(EventActionType.PROPERTY_NAME_hasParamParticipantId2, EventActionType.class);
            
            PropertyDescriptor paramParticipantId2Description = new PropertyDescriptor(EventActionType.PROPERTY_NAME_paramParticipantId2Description, EventActionType.class);
            
            return new PropertyDescriptor[] { //
            id, //
            name, //
            description, //
            hasParamFloat1, //
            paramFloat1Description, //
            hasParamParticipantId1, //
            paramParticipantId1Description, //
            hasParamParticipantId2, //
            paramParticipantId2Description //
            };
            
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }
    
    /* ----------------------------------------------------------------------------------------- */
}