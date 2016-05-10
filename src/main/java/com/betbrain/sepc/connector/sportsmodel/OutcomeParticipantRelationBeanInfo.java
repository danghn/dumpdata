package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

/**
 * This is a <code>BeanInfo</code> for the <code>OutcomeParticipantRelation</code> bean.
 * 
 * @author Morten Helles
 */
public class OutcomeParticipantRelationBeanInfo extends SimpleBeanInfo {

    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------

    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {
        
        BeanDescriptor beanDescriptor = new BeanDescriptor(OutcomeParticipantRelation.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] {
            OutcomeParticipantRelation.PROPERTY_NAME_id,
            OutcomeParticipantRelation.PROPERTY_NAME_outcomeId,
            OutcomeParticipantRelation.PROPERTY_NAME_participantId
        });
        
        return beanDescriptor;
    }

    /* ----------------------------------------------------------------------------------------- */

    // override default implementation
    public PropertyDescriptor[] getPropertyDescriptors() {

        try {

            PropertyDescriptor id = new PropertyDescriptor(OutcomeParticipantRelation.PROPERTY_NAME_id, OutcomeParticipantRelation.class);
            
            PropertyDescriptor outcomeId = new PropertyDescriptor(OutcomeParticipantRelation.PROPERTY_NAME_outcomeId, OutcomeParticipantRelation.class);
            outcomeId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Outcome.class);

            PropertyDescriptor participantId = new PropertyDescriptor(OutcomeParticipantRelation.PROPERTY_NAME_participantId, OutcomeParticipantRelation.class);
            participantId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Participant.class);
            
            return new PropertyDescriptor[] {
                id,
                outcomeId,
                participantId
            };
            
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }

    /* ----------------------------------------------------------------------------------------- */
}