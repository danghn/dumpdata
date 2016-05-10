package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

/**
 * This is a <code>BeanInfo</code> for the <code>OutcomeType</code> bean.
 * 
 * @author Morten Helles
 */
public class OutcomeTypeBeanInfo extends SimpleBeanInfo {

	// --------------------------------------------------------------------------------------------
	// Instance methods
	// --------------------------------------------------------------------------------------------

    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {

        BeanDescriptor beanDescriptor = new BeanDescriptor(OutcomeType.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] {
            OutcomeType.PROPERTY_NAME_id, 
            OutcomeType.PROPERTY_NAME_name,
            OutcomeType.PROPERTY_NAME_description,
            OutcomeType.PROPERTY_NAME_hasParamFloat1,
            OutcomeType.PROPERTY_NAME_paramFloat1Description,
            OutcomeType.PROPERTY_NAME_hasParamFloat2,
            OutcomeType.PROPERTY_NAME_paramFloat2Description,
            OutcomeType.PROPERTY_NAME_hasParamFloat3,
            OutcomeType.PROPERTY_NAME_paramFloat3Description,
            OutcomeType.PROPERTY_NAME_hasParamBoolean1,
            OutcomeType.PROPERTY_NAME_paramBoolean1Description,
            OutcomeType.PROPERTY_NAME_hasParamString1,
            OutcomeType.PROPERTY_NAME_paramString1Description,
            OutcomeType.PROPERTY_NAME_paramString1PossibleValues,
            OutcomeType.PROPERTY_NAME_hasParamParticipantId1,
            OutcomeType.PROPERTY_NAME_paramParticipantId1Description,
            OutcomeType.PROPERTY_NAME_paramParticipant1MustBePrimary,
            OutcomeType.PROPERTY_NAME_paramParticipant1MustBeRoot,
            OutcomeType.PROPERTY_NAME_paramParticipant1MustHaveRoleId,
            OutcomeType.PROPERTY_NAME_hasParamParticipantId2,
            OutcomeType.PROPERTY_NAME_paramParticipantId2Description,
            OutcomeType.PROPERTY_NAME_paramParticipant2MustBePrimary,
            OutcomeType.PROPERTY_NAME_paramParticipant2MustBeRoot,
            OutcomeType.PROPERTY_NAME_paramParticipant2MustHaveRoleId,
            OutcomeType.PROPERTY_NAME_hasParamParticipantId3,
            OutcomeType.PROPERTY_NAME_paramParticipantId3Description,
            OutcomeType.PROPERTY_NAME_paramParticipant3MustBePrimary,
            OutcomeType.PROPERTY_NAME_paramParticipant3MustBeRoot,
            OutcomeType.PROPERTY_NAME_paramParticipant3MustHaveRoleId,
            OutcomeType.PROPERTY_NAME_hasParamEventPartId1,
            OutcomeType.PROPERTY_NAME_paramEventPartId1Description,
            OutcomeType.PROPERTY_NAME_minParticipantRelations,
            OutcomeType.PROPERTY_NAME_maxParticipantRelations,
        });
        
        return beanDescriptor;
    }

    /* ----------------------------------------------------------------------------------------- */

    // override default implementation
    public PropertyDescriptor[] getPropertyDescriptors() {

        try {

            PropertyDescriptor id = new PropertyDescriptor(OutcomeType.PROPERTY_NAME_id, OutcomeType.class);
            
            PropertyDescriptor name = new PropertyDescriptor(OutcomeType.PROPERTY_NAME_name, OutcomeType.class);

            PropertyDescriptor description = new PropertyDescriptor(OutcomeType.PROPERTY_NAME_description, OutcomeType.class);
            
            PropertyDescriptor hasParamFloat1 = new PropertyDescriptor(OutcomeType.PROPERTY_NAME_hasParamFloat1, OutcomeType.class);

            PropertyDescriptor paramFloat1Description = new PropertyDescriptor(OutcomeType.PROPERTY_NAME_paramFloat1Description, OutcomeType.class);
            
            PropertyDescriptor hasParamFloat2 = new PropertyDescriptor(OutcomeType.PROPERTY_NAME_hasParamFloat2, OutcomeType.class);

            PropertyDescriptor paramFloat2Description = new PropertyDescriptor(OutcomeType.PROPERTY_NAME_paramFloat2Description, OutcomeType.class);

            PropertyDescriptor hasParamFloat3 = new PropertyDescriptor(OutcomeType.PROPERTY_NAME_hasParamFloat3, OutcomeType.class);

            PropertyDescriptor paramFloat3Description = new PropertyDescriptor(OutcomeType.PROPERTY_NAME_paramFloat3Description, OutcomeType.class);
            
            PropertyDescriptor hasParamBoolean1 = new PropertyDescriptor(OutcomeType.PROPERTY_NAME_hasParamBoolean1, OutcomeType.class);

            PropertyDescriptor paramBoolean1Description = new PropertyDescriptor(OutcomeType.PROPERTY_NAME_paramBoolean1Description, OutcomeType.class);

            PropertyDescriptor hasParamString1 = new PropertyDescriptor(OutcomeType.PROPERTY_NAME_hasParamString1, OutcomeType.class);

            PropertyDescriptor paramString1Description = new PropertyDescriptor(OutcomeType.PROPERTY_NAME_paramString1Description, OutcomeType.class);

            PropertyDescriptor paramString1PossibleValues = new PropertyDescriptor(OutcomeType.PROPERTY_NAME_paramString1PossibleValues, OutcomeType.class);

            PropertyDescriptor hasParamParticipantId1 = new PropertyDescriptor(OutcomeType.PROPERTY_NAME_hasParamParticipantId1, OutcomeType.class);

            PropertyDescriptor paramParticipantId1Description = new PropertyDescriptor(OutcomeType.PROPERTY_NAME_paramParticipantId1Description, OutcomeType.class);

            PropertyDescriptor paramParticipant1MustBePrimary = new PropertyDescriptor(OutcomeType.PROPERTY_NAME_paramParticipant1MustBePrimary, OutcomeType.class);

            PropertyDescriptor paramParticipant1MustBeRoot = new PropertyDescriptor(OutcomeType.PROPERTY_NAME_paramParticipant1MustBeRoot, OutcomeType.class);

            PropertyDescriptor paramParticipant1MustHaveRoleId = new PropertyDescriptor(OutcomeType.PROPERTY_NAME_paramParticipant1MustHaveRoleId, OutcomeType.class);
            paramParticipant1MustHaveRoleId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, ParticipantRole.class);
            
            PropertyDescriptor hasParamParticipantId2 = new PropertyDescriptor(OutcomeType.PROPERTY_NAME_hasParamParticipantId2, OutcomeType.class);

            PropertyDescriptor paramParticipantId2Description = new PropertyDescriptor(OutcomeType.PROPERTY_NAME_paramParticipantId2Description, OutcomeType.class);

            PropertyDescriptor paramParticipant2MustBePrimary = new PropertyDescriptor(OutcomeType.PROPERTY_NAME_paramParticipant2MustBePrimary, OutcomeType.class);

            PropertyDescriptor paramParticipant2MustBeRoot = new PropertyDescriptor(OutcomeType.PROPERTY_NAME_paramParticipant2MustBeRoot, OutcomeType.class);

            PropertyDescriptor paramParticipant2MustHaveRoleId = new PropertyDescriptor(OutcomeType.PROPERTY_NAME_paramParticipant2MustHaveRoleId, OutcomeType.class);
            paramParticipant2MustHaveRoleId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, ParticipantRole.class);
            
            PropertyDescriptor hasParamParticipantId3 = new PropertyDescriptor(OutcomeType.PROPERTY_NAME_hasParamParticipantId3, OutcomeType.class);

            PropertyDescriptor paramParticipantId3Description = new PropertyDescriptor(OutcomeType.PROPERTY_NAME_paramParticipantId3Description, OutcomeType.class);
            
            PropertyDescriptor paramParticipant3MustBePrimary = new PropertyDescriptor(OutcomeType.PROPERTY_NAME_paramParticipant3MustBePrimary, OutcomeType.class);

            PropertyDescriptor paramParticipant3MustBeRoot = new PropertyDescriptor(OutcomeType.PROPERTY_NAME_paramParticipant3MustBeRoot, OutcomeType.class);

            PropertyDescriptor paramParticipant3MustHaveRoleId = new PropertyDescriptor(OutcomeType.PROPERTY_NAME_paramParticipant3MustHaveRoleId, OutcomeType.class);
            paramParticipant3MustHaveRoleId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, ParticipantRole.class);
            
            PropertyDescriptor hasParamEventPartId1 = new PropertyDescriptor(OutcomeType.PROPERTY_NAME_hasParamEventPartId1, OutcomeType.class);

            PropertyDescriptor paramEventPartId1Description = new PropertyDescriptor(OutcomeType.PROPERTY_NAME_paramEventPartId1Description, OutcomeType.class);
            
            PropertyDescriptor minParticipantRelations = new PropertyDescriptor(OutcomeType.PROPERTY_NAME_minParticipantRelations, OutcomeType.class);

            PropertyDescriptor maxParticipantRelations = new PropertyDescriptor(OutcomeType.PROPERTY_NAME_maxParticipantRelations, OutcomeType.class);
            
            return new PropertyDescriptor[] {
                id,
                name,
                description,
                hasParamFloat1,
                paramFloat1Description,
                hasParamFloat2,
                paramFloat2Description,
                hasParamFloat3,
                paramFloat3Description,
                hasParamBoolean1,
                paramBoolean1Description,
                hasParamString1,
                paramString1Description,
                paramString1PossibleValues,
                hasParamParticipantId1,
                paramParticipantId1Description,
                paramParticipant1MustBePrimary,
                paramParticipant1MustBeRoot,
                paramParticipant1MustHaveRoleId,
                hasParamParticipantId2,
                paramParticipantId2Description,
                paramParticipant2MustBePrimary,
                paramParticipant2MustBeRoot,
                paramParticipant2MustHaveRoleId,
                hasParamParticipantId3,
                paramParticipantId3Description,
                paramParticipant3MustBePrimary,
                paramParticipant3MustBeRoot,
                paramParticipant3MustHaveRoleId,
                hasParamEventPartId1,
                paramEventPartId1Description,
                minParticipantRelations,
                maxParticipantRelations
            };
            
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }

    /* ----------------------------------------------------------------------------------------- */
}