package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

/**
 * This is a <code>BeanInfo</code> for the <code>LocationType</code> bean.
 * 
 * @author Morten Helles
 */
public class LocationTypeBeanInfo extends SimpleBeanInfo {

	// --------------------------------------------------------------------------------------------
	// Instance methods
	// --------------------------------------------------------------------------------------------

    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {
        
        BeanDescriptor beanDescriptor = new BeanDescriptor(LocationType.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] {
            LocationType.PROPERTY_NAME_id, 
            LocationType.PROPERTY_NAME_name,
            LocationType.PROPERTY_NAME_description,
            LocationType.PROPERTY_NAME_hasCode,
            LocationType.PROPERTY_NAME_codeDescription
        });
        
        return beanDescriptor;
    }

    /* ----------------------------------------------------------------------------------------- */

    // override default implementation
    public PropertyDescriptor[] getPropertyDescriptors() {

        try {

            PropertyDescriptor id = new PropertyDescriptor(LocationType.PROPERTY_NAME_id, LocationType.class);
            
            PropertyDescriptor name = new PropertyDescriptor(LocationType.PROPERTY_NAME_name, LocationType.class);

            PropertyDescriptor description = new PropertyDescriptor(LocationType.PROPERTY_NAME_description, LocationType.class);
            
            PropertyDescriptor hasCode = new PropertyDescriptor(LocationType.PROPERTY_NAME_hasCode, LocationType.class);

            PropertyDescriptor codeDescription = new PropertyDescriptor(LocationType.PROPERTY_NAME_codeDescription, LocationType.class);
            
            return new PropertyDescriptor[] {
                id,
                name,
                description,
                hasCode,
                codeDescription
            };
            
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }

    /* ----------------------------------------------------------------------------------------- */
}