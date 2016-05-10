package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

/**
 * This is a <code>BeanInfo</code> for the <code>OutcomeTypeBettingTypeRelation</code> bean.
 * 
 * @author Morten Helles
 */
public class OutcomeTypeBettingTypeRelationBeanInfo extends SimpleBeanInfo {

    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------

    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {

        BeanDescriptor beanDescriptor = new BeanDescriptor(OutcomeTypeBettingTypeRelation.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] {
            OutcomeTypeBettingTypeRelation.PROPERTY_NAME_id, 
            OutcomeTypeBettingTypeRelation.PROPERTY_NAME_outcomeTypeId,
            OutcomeTypeBettingTypeRelation.PROPERTY_NAME_bettingTypeId
        });
        
        return beanDescriptor;
    }

    /* ----------------------------------------------------------------------------------------- */

    // override default implementation
    public PropertyDescriptor[] getPropertyDescriptors() {

        try {

            PropertyDescriptor id = new PropertyDescriptor(OutcomeTypeBettingTypeRelation.PROPERTY_NAME_id, OutcomeTypeBettingTypeRelation.class);
            
            PropertyDescriptor outcomeTypeId = new PropertyDescriptor(OutcomeTypeBettingTypeRelation.PROPERTY_NAME_outcomeTypeId, OutcomeTypeBettingTypeRelation.class);
            outcomeTypeId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, OutcomeType.class);

            PropertyDescriptor bettingTypeId = new PropertyDescriptor(OutcomeTypeBettingTypeRelation.PROPERTY_NAME_bettingTypeId, OutcomeTypeBettingTypeRelation.class);
            bettingTypeId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, BettingType.class);

            return new PropertyDescriptor[] {
                id,
                outcomeTypeId,
                bettingTypeId
            };
            
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }

    /* ----------------------------------------------------------------------------------------- */
}