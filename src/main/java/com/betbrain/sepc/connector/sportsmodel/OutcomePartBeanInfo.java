package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

/**
 * This is a <code>BeanInfo</code> for the <code>OutcomePart</code> bean.
 * 
 * @author Morten Helles
 */
public class OutcomePartBeanInfo extends SimpleBeanInfo {

	// --------------------------------------------------------------------------------------------
	// Instance methods
	// --------------------------------------------------------------------------------------------

    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {
        
        BeanDescriptor beanDescriptor = new BeanDescriptor(OutcomePart.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] {
            OutcomePart.PROPERTY_NAME_id, 
            OutcomePart.PROPERTY_NAME_outcomePartitionId,
            OutcomePart.PROPERTY_NAME_outcomeId,
            OutcomePart.PROPERTY_NAME_probability
        });
        
        return beanDescriptor;
    }

    /* ----------------------------------------------------------------------------------------- */

    // override default implementation
    public PropertyDescriptor[] getPropertyDescriptors() {

        try {

            PropertyDescriptor id = new PropertyDescriptor(OutcomePart.PROPERTY_NAME_id, OutcomePart.class);
            
            PropertyDescriptor outcomePartitionId = new PropertyDescriptor(OutcomePart.PROPERTY_NAME_outcomePartitionId, OutcomePart.class);
            outcomePartitionId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, OutcomePartition.class);

            PropertyDescriptor outcomeId = new PropertyDescriptor(OutcomePart.PROPERTY_NAME_outcomeId, OutcomePart.class);
            outcomeId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Outcome.class);

            PropertyDescriptor probability = new PropertyDescriptor(OutcomePart.PROPERTY_NAME_probability, OutcomePart.class);
            
            return new PropertyDescriptor[] {
                id,
                outcomePartitionId,
                outcomeId,
                probability
            };
            
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }

    /* ----------------------------------------------------------------------------------------- */
}