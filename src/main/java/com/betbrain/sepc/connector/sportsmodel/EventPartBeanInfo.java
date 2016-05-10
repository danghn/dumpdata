package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

/**
 * This is a <code>BeanInfo</code> for the <code>EventPart</code> bean.
 * 
 * @author Morten Helles
 */
public class EventPartBeanInfo extends SimpleBeanInfo {

	// --------------------------------------------------------------------------------------------
	// Instance methods
	// --------------------------------------------------------------------------------------------

    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {
        
        BeanDescriptor beanDescriptor = new BeanDescriptor(EventPart.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] {
            EventPart.PROPERTY_NAME_id,
            EventPart.PROPERTY_NAME_name,
            EventPart.PROPERTY_NAME_description,
            EventPart.PROPERTY_NAME_parentId, 
            EventPart.PROPERTY_NAME_orderNum,
            EventPart.PROPERTY_NAME_isDrawPossible
        });
        
        return beanDescriptor;
    }

    /* ----------------------------------------------------------------------------------------- */

    // override default implementation
    public PropertyDescriptor[] getPropertyDescriptors() {

        try {

            PropertyDescriptor id = new PropertyDescriptor(EventPart.PROPERTY_NAME_id, EventPart.class);
            
            PropertyDescriptor name = new PropertyDescriptor(EventPart.PROPERTY_NAME_name, EventPart.class);

            PropertyDescriptor description = new PropertyDescriptor(EventPart.PROPERTY_NAME_description, EventPart.class);
            
            PropertyDescriptor parentId = new PropertyDescriptor(EventPart.PROPERTY_NAME_parentId, EventPart.class);
            parentId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, EventPart.class);

            PropertyDescriptor orderNum = new PropertyDescriptor(EventPart.PROPERTY_NAME_orderNum, EventPart.class);
            
            PropertyDescriptor isDrawPossible = new PropertyDescriptor(EventPart.PROPERTY_NAME_isDrawPossible, EventPart.class);

            return new PropertyDescriptor[] {
                id,
                name,
                description,
                parentId,
                orderNum,
                isDrawPossible
            };
            
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }

    /* ----------------------------------------------------------------------------------------- */
}