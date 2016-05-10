package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

/**
 * This is a <code>BeanInfo</code> for the <code>ParticipantType</code> bean.
 * 
 * @author Morten Helles
 */
public class ParticipantTypeBeanInfo extends SimpleBeanInfo {

	// --------------------------------------------------------------------------------------------
	// Instance methods
	// --------------------------------------------------------------------------------------------

    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {
        
        BeanDescriptor beanDescriptor = new BeanDescriptor(ParticipantType.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] {
            ParticipantType.PROPERTY_NAME_id,
            ParticipantType.PROPERTY_NAME_name,
            ParticipantType.PROPERTY_NAME_description,
            ParticipantType.PROPERTY_NAME_isIndividual,
            ParticipantType.PROPERTY_NAME_hasName,
            ParticipantType.PROPERTY_NAME_hasFirstName,
            ParticipantType.PROPERTY_NAME_hasLastName,
            ParticipantType.PROPERTY_NAME_hasIsMale,
            ParticipantType.PROPERTY_NAME_hasBirthTime,
            ParticipantType.PROPERTY_NAME_hasCountryId,
            ParticipantType.PROPERTY_NAME_hasRetirementTime
        });
        
        return beanDescriptor;
    }

    /* ----------------------------------------------------------------------------------------- */

    // override default implementation
    public PropertyDescriptor[] getPropertyDescriptors() {

        try {

            PropertyDescriptor id = new PropertyDescriptor(ParticipantType.PROPERTY_NAME_id, ParticipantType.class);
            
            PropertyDescriptor name = new PropertyDescriptor(ParticipantType.PROPERTY_NAME_name, ParticipantType.class);

            PropertyDescriptor description = new PropertyDescriptor(ParticipantType.PROPERTY_NAME_description, ParticipantType.class);
            
            PropertyDescriptor isIndividual = new PropertyDescriptor(ParticipantType.PROPERTY_NAME_isIndividual, ParticipantType.class);

            PropertyDescriptor hasName = new PropertyDescriptor(ParticipantType.PROPERTY_NAME_hasName, ParticipantType.class);

            PropertyDescriptor hasFirstName = new PropertyDescriptor(ParticipantType.PROPERTY_NAME_hasFirstName, ParticipantType.class);

            PropertyDescriptor hasLastName = new PropertyDescriptor(ParticipantType.PROPERTY_NAME_hasLastName, ParticipantType.class);

            PropertyDescriptor hasIsMale = new PropertyDescriptor(ParticipantType.PROPERTY_NAME_hasIsMale, ParticipantType.class);

            PropertyDescriptor hasBirthTime = new PropertyDescriptor(ParticipantType.PROPERTY_NAME_hasBirthTime, ParticipantType.class);

            PropertyDescriptor hasCountryId = new PropertyDescriptor(ParticipantType.PROPERTY_NAME_hasCountryId, ParticipantType.class);

            PropertyDescriptor hasRetirementTime = new PropertyDescriptor(ParticipantType.PROPERTY_NAME_hasRetirementTime, ParticipantType.class);

            return new PropertyDescriptor[] {
                id,
                name,
                description,
                isIndividual,
                hasName,
                hasFirstName,
                hasLastName,
                hasIsMale,
                hasBirthTime,
                hasCountryId,
                hasRetirementTime
            };
            
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }

    /* ----------------------------------------------------------------------------------------- */
}