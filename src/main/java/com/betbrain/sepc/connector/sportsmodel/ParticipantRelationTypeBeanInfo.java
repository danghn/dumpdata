package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

/**
 * This is a <code>BeanInfo</code> for the <code>ParticipantRelationType</code> bean.
 * 
 * @author Morten Helles
 */
public class ParticipantRelationTypeBeanInfo extends SimpleBeanInfo {

	// --------------------------------------------------------------------------------------------
	// Instance methods
	// --------------------------------------------------------------------------------------------

    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {
        
        BeanDescriptor beanDescriptor = new BeanDescriptor(ParticipantRelationType.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] {
            ParticipantRelationType.PROPERTY_NAME_id,
            ParticipantRelationType.PROPERTY_NAME_name,
            ParticipantRelationType.PROPERTY_NAME_description,
            ParticipantRelationType.PROPERTY_NAME_hasParamParticipantRoleId,
            ParticipantRelationType.PROPERTY_NAME_paramParticipantRoleIdDescription
        });
        
        return beanDescriptor;
    }

    /* ----------------------------------------------------------------------------------------- */

    // override default implementation
    public PropertyDescriptor[] getPropertyDescriptors() {

        try {

            PropertyDescriptor id = new PropertyDescriptor(ParticipantRelationType.PROPERTY_NAME_id, ParticipantRelationType.class);
            
            PropertyDescriptor name = new PropertyDescriptor(ParticipantRelationType.PROPERTY_NAME_name, ParticipantRelationType.class);

            PropertyDescriptor description = new PropertyDescriptor(ParticipantRelationType.PROPERTY_NAME_description, ParticipantRelationType.class);
            
            PropertyDescriptor hasParamParticipantRoleId = new PropertyDescriptor(ParticipantRelationType.PROPERTY_NAME_hasParamParticipantRoleId, ParticipantRelationType.class);

            PropertyDescriptor paramParticipantRoleIdDescription = new PropertyDescriptor(ParticipantRelationType.PROPERTY_NAME_paramParticipantRoleIdDescription, ParticipantRelationType.class);
            
            return new PropertyDescriptor[] {
                id,
                name,
                description,
                hasParamParticipantRoleId,
                paramParticipantRoleIdDescription
            };
            
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }

    /* ----------------------------------------------------------------------------------------- */
}