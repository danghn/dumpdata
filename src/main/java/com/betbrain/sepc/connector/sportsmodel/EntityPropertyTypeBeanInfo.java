package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

/**
 * This is a <code>BeanInfo</code> for the <code>EntityPropertyType</code> bean.
 * 
 * @author Morten Helles
 */
public class EntityPropertyTypeBeanInfo extends SimpleBeanInfo {

    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------

    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {
        
        BeanDescriptor beanDescriptor = new BeanDescriptor(EntityPropertyType.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] {
            EntityPropertyType.PROPERTY_NAME_id,
            EntityPropertyType.PROPERTY_NAME_name,
            EntityPropertyType.PROPERTY_NAME_description
        });
        
        return beanDescriptor;
    }

    /* ----------------------------------------------------------------------------------------- */

    // override default implementation
    public PropertyDescriptor[] getPropertyDescriptors() {

        try {

            PropertyDescriptor id = new PropertyDescriptor(EntityPropertyType.PROPERTY_NAME_id, EntityPropertyType.class);
            
            PropertyDescriptor name = new PropertyDescriptor(EntityPropertyType.PROPERTY_NAME_name, EntityPropertyType.class);

            PropertyDescriptor description = new PropertyDescriptor(EntityPropertyType.PROPERTY_NAME_description, EntityPropertyType.class);
            
            return new PropertyDescriptor[] {
                id,
                name,
                description
            };
            
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }

    /* ----------------------------------------------------------------------------------------- */
}