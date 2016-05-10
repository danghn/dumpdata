package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

/**
 * This is a <code>BeanInfo</code> for the <code>LocationRelation</code> bean.
 * 
 * @author Morten Helles
 */
public class LocationRelationBeanInfo extends SimpleBeanInfo {

	// --------------------------------------------------------------------------------------------
	// Instance methods
	// --------------------------------------------------------------------------------------------

    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {
        
        BeanDescriptor beanDescriptor = new BeanDescriptor(LocationRelation.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] {
            LocationRelation.PROPERTY_NAME_id,
            LocationRelation.PROPERTY_NAME_typeId, 
            LocationRelation.PROPERTY_NAME_fromLocationId, 
            LocationRelation.PROPERTY_NAME_toLocationId
        });
        
        return beanDescriptor;
    }

    /* ----------------------------------------------------------------------------------------- */

    // override default implementation
    public PropertyDescriptor[] getPropertyDescriptors() {

        try {

            PropertyDescriptor id = new PropertyDescriptor(LocationRelation.PROPERTY_NAME_id, LocationRelation.class);
            
            PropertyDescriptor typeId = new PropertyDescriptor(LocationRelation.PROPERTY_NAME_typeId, LocationRelation.class);
            typeId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, LocationRelationType.class);
            
            PropertyDescriptor fromLocationId = new PropertyDescriptor(LocationRelation.PROPERTY_NAME_fromLocationId, LocationRelation.class);
            fromLocationId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Location.class);

            PropertyDescriptor toLocationId = new PropertyDescriptor(LocationRelation.PROPERTY_NAME_toLocationId, LocationRelation.class);
            toLocationId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Location.class);

            return new PropertyDescriptor[] {
                id,
                typeId,
                fromLocationId,
                toLocationId
            };
            
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }

    /* ----------------------------------------------------------------------------------------- */
}