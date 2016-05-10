package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

/**
 * This is a <code>BeanInfo</code> for the <code>ValidationWarning</code> bean.
 * 
 * @author Morten Helles
 */
public class ValidationWarningBeanInfo extends SimpleBeanInfo {

    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------

    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {
        
        BeanDescriptor beanDescriptor = new BeanDescriptor(ValidationWarning.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] {
            ValidationWarning.PROPERTY_NAME_id,
            ValidationWarning.PROPERTY_NAME_typeId,
            ValidationWarning.PROPERTY_NAME_description, 
            ValidationWarning.PROPERTY_NAME_createdTime,
            ValidationWarning.PROPERTY_NAME_accepted,
            ValidationWarning.PROPERTY_NAME_paramEntityId1,
            ValidationWarning.PROPERTY_NAME_paramEntityId2,
            ValidationWarning.PROPERTY_NAME_paramEntityId3
        });
        
        return beanDescriptor;
    }

    /* ----------------------------------------------------------------------------------------- */

    // override default implementation
    public PropertyDescriptor[] getPropertyDescriptors() {

        try {

            PropertyDescriptor id = new PropertyDescriptor(ValidationWarning.PROPERTY_NAME_id, ValidationWarning.class);

            PropertyDescriptor typeId = new PropertyDescriptor(ValidationWarning.PROPERTY_NAME_typeId, ValidationWarning.class);
            typeId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, ValidationWarningType.class);
            
            PropertyDescriptor description = new PropertyDescriptor(ValidationWarning.PROPERTY_NAME_description, ValidationWarning.class);

            PropertyDescriptor createdTime = new PropertyDescriptor(ValidationWarning.PROPERTY_NAME_createdTime, ValidationWarning.class);

            PropertyDescriptor accepted = new PropertyDescriptor(ValidationWarning.PROPERTY_NAME_accepted, ValidationWarning.class);
            
            PropertyDescriptor paramEntityId1 = new PropertyDescriptor(ValidationWarning.PROPERTY_NAME_paramEntityId1, ValidationWarning.class);

            PropertyDescriptor paramEntityId2 = new PropertyDescriptor(ValidationWarning.PROPERTY_NAME_paramEntityId2, ValidationWarning.class);
            
            PropertyDescriptor paramEntityId3 = new PropertyDescriptor(ValidationWarning.PROPERTY_NAME_paramEntityId3, ValidationWarning.class);
            
            return new PropertyDescriptor[] {
                id,
                typeId,
                description,
                createdTime,
                accepted,
                paramEntityId1,
                paramEntityId2,
                paramEntityId3
            };
            
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }

    /* ----------------------------------------------------------------------------------------- */
}