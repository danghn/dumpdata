package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

/**
 * This is a <code>BeanInfo</code> for the <code>Location</code> bean.
 * 
 * @author Morten Helles
 */
public class LocationBeanInfo extends SimpleBeanInfo {

	// --------------------------------------------------------------------------------------------
	// Instance methods
	// --------------------------------------------------------------------------------------------

    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {
        
        BeanDescriptor beanDescriptor = new BeanDescriptor(Location.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] {
            Location.PROPERTY_NAME_id,
            Location.PROPERTY_NAME_typeId, 
            Location.PROPERTY_NAME_name,
            Location.PROPERTY_NAME_code,
            Location.PROPERTY_NAME_isHistoric,
            Location.PROPERTY_NAME_url,
            Location.PROPERTY_NAME_note
        });
        
        return beanDescriptor;
    }

    /* ----------------------------------------------------------------------------------------- */

    // override default implementation
    public PropertyDescriptor[] getPropertyDescriptors() {

        try {

            PropertyDescriptor id = new PropertyDescriptor(Location.PROPERTY_NAME_id, Location.class);

            PropertyDescriptor typeId = new PropertyDescriptor(Location.PROPERTY_NAME_typeId, Location.class);
            typeId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, LocationType.class);
            
            PropertyDescriptor name = new PropertyDescriptor(Location.PROPERTY_NAME_name, Location.class);

            PropertyDescriptor code = new PropertyDescriptor(Location.PROPERTY_NAME_code, Location.class);

            PropertyDescriptor isHistoric = new PropertyDescriptor(Location.PROPERTY_NAME_isHistoric, Location.class);
            
            PropertyDescriptor url = new PropertyDescriptor(Location.PROPERTY_NAME_url, Location.class);

            PropertyDescriptor note = new PropertyDescriptor(Location.PROPERTY_NAME_note, Location.class);
            
            return new PropertyDescriptor[] {
                id,
                typeId,
                name,
                code,
                isHistoric,
                url,
                note
            };
            
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }

    /* ----------------------------------------------------------------------------------------- */
}