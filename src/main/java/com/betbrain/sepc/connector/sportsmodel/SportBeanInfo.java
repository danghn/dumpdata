package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

/**
 * This is a <code>BeanInfo</code> for the <code>Sport</code> bean.
 * 
 * @author Morten Helles
 */
public class SportBeanInfo extends SimpleBeanInfo {

	// --------------------------------------------------------------------------------------------
	// Instance methods
	// --------------------------------------------------------------------------------------------

    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {
        
        BeanDescriptor beanDescriptor = new BeanDescriptor(Sport.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] {
            Sport.PROPERTY_NAME_id, 
            Sport.PROPERTY_NAME_name,
            Sport.PROPERTY_NAME_description,
            Sport.PROPERTY_NAME_parentId
        });
        
        return beanDescriptor;
    }

    /* ----------------------------------------------------------------------------------------- */

    // override default implementation
    public PropertyDescriptor[] getPropertyDescriptors() {

        try {

            PropertyDescriptor id = new PropertyDescriptor(Sport.PROPERTY_NAME_id, Sport.class);
            
            PropertyDescriptor name = new PropertyDescriptor(Sport.PROPERTY_NAME_name, Sport.class);

            PropertyDescriptor description = new PropertyDescriptor(Sport.PROPERTY_NAME_description, Sport.class);
            
            PropertyDescriptor parentId = new PropertyDescriptor(Sport.PROPERTY_NAME_parentId, Sport.class);
            parentId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Sport.class);
            
            return new PropertyDescriptor[] {
                id,
                name,
                description,
                parentId
            };
            
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }

    /* ----------------------------------------------------------------------------------------- */
}