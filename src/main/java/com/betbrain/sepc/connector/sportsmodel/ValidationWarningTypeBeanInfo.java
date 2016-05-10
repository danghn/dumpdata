package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

/**
 * This is a <code>BeanInfo</code> for the <code>ValidationWarningType</code> bean.
 * 
 * @author Morten Helles
 */
public class ValidationWarningTypeBeanInfo extends SimpleBeanInfo {

    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------

    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {
        
        BeanDescriptor beanDescriptor = new BeanDescriptor(ValidationWarningType.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] {
            ValidationWarningType.PROPERTY_NAME_id,
            ValidationWarningType.PROPERTY_NAME_name,
            ValidationWarningType.PROPERTY_NAME_description,
            ValidationWarningType.PROPERTY_NAME_paramEntityTypeId1,
            ValidationWarningType.PROPERTY_NAME_paramEntityId1Description,
            ValidationWarningType.PROPERTY_NAME_paramEntityTypeId2,
            ValidationWarningType.PROPERTY_NAME_paramEntityId2Description,
            ValidationWarningType.PROPERTY_NAME_paramEntityTypeId3,
            ValidationWarningType.PROPERTY_NAME_paramEntityId3Description,
        });
        
        return beanDescriptor;
    }

    /* ----------------------------------------------------------------------------------------- */

    // override default implementation
    public PropertyDescriptor[] getPropertyDescriptors() {

        try {

            PropertyDescriptor id = new PropertyDescriptor(ValidationWarningType.PROPERTY_NAME_id, ValidationWarningType.class);
            
            PropertyDescriptor name = new PropertyDescriptor(ValidationWarningType.PROPERTY_NAME_name, ValidationWarningType.class);

            PropertyDescriptor description = new PropertyDescriptor(ValidationWarningType.PROPERTY_NAME_description, ValidationWarningType.class);
            
            PropertyDescriptor paramEntityTypeId1 = new PropertyDescriptor(ValidationWarningType.PROPERTY_NAME_paramEntityTypeId1, ValidationWarningType.class);
            paramEntityTypeId1.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, EntityType.class);

            PropertyDescriptor paramEntityId1Description = new PropertyDescriptor(ValidationWarningType.PROPERTY_NAME_paramEntityId1Description, ValidationWarningType.class);
            
            PropertyDescriptor paramEntityTypeId2 = new PropertyDescriptor(ValidationWarningType.PROPERTY_NAME_paramEntityTypeId2, ValidationWarningType.class);
            paramEntityTypeId2.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, EntityType.class);

            PropertyDescriptor paramEntityId2Description = new PropertyDescriptor(ValidationWarningType.PROPERTY_NAME_paramEntityId2Description, ValidationWarningType.class);

            PropertyDescriptor paramEntityTypeId3 = new PropertyDescriptor(ValidationWarningType.PROPERTY_NAME_paramEntityTypeId3, ValidationWarningType.class);
            paramEntityTypeId3.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, EntityType.class);

            PropertyDescriptor paramEntityId3Description = new PropertyDescriptor(ValidationWarningType.PROPERTY_NAME_paramEntityId3Description, ValidationWarningType.class);

            return new PropertyDescriptor[] {
                id,
                name,
                description,
                paramEntityTypeId1,
                paramEntityId1Description,
                paramEntityTypeId2,
                paramEntityId2Description,
                paramEntityTypeId3,
                paramEntityId3Description
            };
            
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }

    /* ----------------------------------------------------------------------------------------- */
}