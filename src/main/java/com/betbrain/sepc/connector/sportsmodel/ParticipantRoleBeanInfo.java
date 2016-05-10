package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

/**
 * This is a <code>BeanInfo</code> for the <code>ParticipantRole</code> bean.
 * 
 * @author Morten Helles
 */
public class ParticipantRoleBeanInfo extends SimpleBeanInfo {

	// --------------------------------------------------------------------------------------------
	// Instance methods
	// --------------------------------------------------------------------------------------------

    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {
        
        BeanDescriptor beanDescriptor = new BeanDescriptor(ParticipantRole.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] {
            ParticipantRole.PROPERTY_NAME_id,
            ParticipantRole.PROPERTY_NAME_name,
            ParticipantRole.PROPERTY_NAME_description,
            ParticipantRole.PROPERTY_NAME_isPrimary
        });
        
        return beanDescriptor;
    }

    /* ----------------------------------------------------------------------------------------- */

    // override default implementation
    public PropertyDescriptor[] getPropertyDescriptors() {

        try {

            PropertyDescriptor id = new PropertyDescriptor(ParticipantRole.PROPERTY_NAME_id, ParticipantRole.class);
            
            PropertyDescriptor name = new PropertyDescriptor(ParticipantRole.PROPERTY_NAME_name, ParticipantRole.class);

            PropertyDescriptor description = new PropertyDescriptor(ParticipantRole.PROPERTY_NAME_description, ParticipantRole.class);
            
            PropertyDescriptor isPrimary = new PropertyDescriptor(ParticipantRole.PROPERTY_NAME_isPrimary, ParticipantRole.class);
            
            return new PropertyDescriptor[] {
                id,
                name,
                description,
                isPrimary
            };
            
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }

    /* ----------------------------------------------------------------------------------------- */
}