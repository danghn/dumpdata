package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

/**
 * This is a <code>BeanInfo</code> for the <code>EntityPropertyValue</code> bean.
 * 
 * @author Morten Helles
 */
public class EntityPropertyValueBeanInfo extends SimpleBeanInfo {

    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------

    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {
        
        BeanDescriptor beanDescriptor = new BeanDescriptor(EntityPropertyValue.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] {
            EntityPropertyValue.PROPERTY_NAME_id,
            EntityPropertyValue.PROPERTY_NAME_entityPropertyId,
            EntityPropertyValue.PROPERTY_NAME_entityId,
            EntityPropertyValue.PROPERTY_NAME_value
        });
        
        return beanDescriptor;
    }

    /* ----------------------------------------------------------------------------------------- */

    // override default implementation
    public PropertyDescriptor[] getPropertyDescriptors() {

        try {

            PropertyDescriptor id = new PropertyDescriptor(EntityPropertyValue.PROPERTY_NAME_id, EntityPropertyValue.class);
            
            PropertyDescriptor entityPropertyId = new PropertyDescriptor(EntityPropertyValue.PROPERTY_NAME_entityPropertyId, EntityPropertyValue.class);
            entityPropertyId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, EntityProperty.class);
            
            PropertyDescriptor entityId = new PropertyDescriptor(EntityPropertyValue.PROPERTY_NAME_entityId, EntityPropertyValue.class);

            PropertyDescriptor value = new PropertyDescriptor(EntityPropertyValue.PROPERTY_NAME_value, EntityPropertyValue.class);

            return new PropertyDescriptor[] {
                id,
                entityPropertyId,
                entityId,
                value
            };
            
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }

    /* ----------------------------------------------------------------------------------------- */
}