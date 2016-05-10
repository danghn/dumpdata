package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

/**
 * This is a <code>BeanInfo</code> for the <code>Participant</code> bean.
 * 
 * @author Morten Helles
 */
public class ParticipantBeanInfo extends SimpleBeanInfo {

	// --------------------------------------------------------------------------------------------
	// Instance methods
	// --------------------------------------------------------------------------------------------

    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {
        
        BeanDescriptor beanDescriptor = new BeanDescriptor(Participant.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] {
            Participant.PROPERTY_NAME_id,
            Participant.PROPERTY_NAME_typeId,
            Participant.PROPERTY_NAME_name, 
            Participant.PROPERTY_NAME_firstName, 
            Participant.PROPERTY_NAME_lastName, 
            Participant.PROPERTY_NAME_isMale, 
            Participant.PROPERTY_NAME_birthTime, 
            Participant.PROPERTY_NAME_countryId,
            Participant.PROPERTY_NAME_url,
            Participant.PROPERTY_NAME_retirementTime,            
            Participant.PROPERTY_NAME_note
        });
        
        return beanDescriptor;
    }

    /* ----------------------------------------------------------------------------------------- */

    // override default implementation
    public PropertyDescriptor[] getPropertyDescriptors() {

        try {

            PropertyDescriptor id = new PropertyDescriptor(Participant.PROPERTY_NAME_id, Participant.class);

            PropertyDescriptor typeId = new PropertyDescriptor(Participant.PROPERTY_NAME_typeId, Participant.class);
            typeId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, ParticipantType.class);
            
            PropertyDescriptor name = new PropertyDescriptor(Participant.PROPERTY_NAME_name, Participant.class);

            PropertyDescriptor firstName = new PropertyDescriptor(Participant.PROPERTY_NAME_firstName, Participant.class);
            
            PropertyDescriptor lastName = new PropertyDescriptor(Participant.PROPERTY_NAME_lastName, Participant.class);
            
            PropertyDescriptor isMale = new PropertyDescriptor(Participant.PROPERTY_NAME_isMale, Participant.class);
            
            PropertyDescriptor birthDate = new PropertyDescriptor(Participant.PROPERTY_NAME_birthTime, Participant.class);
            
            PropertyDescriptor countryId = new PropertyDescriptor(Participant.PROPERTY_NAME_countryId, Participant.class);
            countryId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Location.class);

            PropertyDescriptor url = new PropertyDescriptor(Participant.PROPERTY_NAME_url, Participant.class);

            PropertyDescriptor retirementTime = new PropertyDescriptor(Participant.PROPERTY_NAME_retirementTime, Participant.class);

            PropertyDescriptor note = new PropertyDescriptor(Participant.PROPERTY_NAME_note, Participant.class);
            
            return new PropertyDescriptor[] {
                id,
                typeId,
                name,
                firstName,
                lastName,
                isMale,
                birthDate,
                countryId,
                url,
                retirementTime,                
                note
            };
            
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }

    /* ----------------------------------------------------------------------------------------- */
}