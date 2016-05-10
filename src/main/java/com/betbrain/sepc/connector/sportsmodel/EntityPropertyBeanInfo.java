package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

/**
 * This is a <code>BeanInfo</code> for the <code>EntityProperty</code> bean.
 * 
 * @author Morten Helles
 */
public class EntityPropertyBeanInfo extends SimpleBeanInfo {

    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------

    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {
        
        BeanDescriptor beanDescriptor = new BeanDescriptor(EntityProperty.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] {
            EntityProperty.PROPERTY_NAME_id,
            EntityProperty.PROPERTY_NAME_typeId,
            EntityProperty.PROPERTY_NAME_entityTypeId,
            EntityProperty.PROPERTY_NAME_name,
            EntityProperty.PROPERTY_NAME_description
        });
        
        return beanDescriptor;
    }

    /* ----------------------------------------------------------------------------------------- */

    // override default implementation
    public PropertyDescriptor[] getPropertyDescriptors() {

        try {

            PropertyDescriptor id = new PropertyDescriptor(EntityProperty.PROPERTY_NAME_id, EntityProperty.class);
            
            PropertyDescriptor typeId = new PropertyDescriptor(EntityProperty.PROPERTY_NAME_typeId, EntityProperty.class);
            typeId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, EntityPropertyType.class);

            PropertyDescriptor entityTypeId = new PropertyDescriptor(EntityProperty.PROPERTY_NAME_entityTypeId, EntityProperty.class);
            entityTypeId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, EntityType.class);

            PropertyDescriptor name = new PropertyDescriptor(EntityProperty.PROPERTY_NAME_name, EntityProperty.class);

            PropertyDescriptor description = new PropertyDescriptor(EntityProperty.PROPERTY_NAME_description, EntityProperty.class);
            
            return new PropertyDescriptor[] {
                id,
                typeId,
                entityTypeId,
                name,
                description
            };
            
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }

    /* ----------------------------------------------------------------------------------------- */
}