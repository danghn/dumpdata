package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

/**
 * This is a <code>BeanInfo</code> for the <code>ProviderEntityMapping</code> bean.
 * 
 * @author Morten Helles
 */
public class ProviderEntityMappingBeanInfo extends SimpleBeanInfo {

    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------

    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {
        
        BeanDescriptor beanDescriptor = new BeanDescriptor(ProviderEntityMapping.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] {
            ProviderEntityMapping.PROPERTY_NAME_id,
            ProviderEntityMapping.PROPERTY_NAME_providerId,
            ProviderEntityMapping.PROPERTY_NAME_providerEntityTypeId,
            ProviderEntityMapping.PROPERTY_NAME_providerEntityId,
            ProviderEntityMapping.PROPERTY_NAME_entityTypeId,
            ProviderEntityMapping.PROPERTY_NAME_entityId
        });

        return beanDescriptor;
    }

    /* ----------------------------------------------------------------------------------------- */

    // override default implementation
    public PropertyDescriptor[] getPropertyDescriptors() {

        try {

            PropertyDescriptor id = new PropertyDescriptor(ProviderEntityMapping.PROPERTY_NAME_id, ProviderEntityMapping.class);
            
            PropertyDescriptor providerId = new PropertyDescriptor(ProviderEntityMapping.PROPERTY_NAME_providerId, ProviderEntityMapping.class);
            providerId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Provider.class);

            PropertyDescriptor providerEntityTypeId = new PropertyDescriptor(ProviderEntityMapping.PROPERTY_NAME_providerEntityTypeId, ProviderEntityMapping.class);

            PropertyDescriptor providerEntityId = new PropertyDescriptor(ProviderEntityMapping.PROPERTY_NAME_providerEntityId, ProviderEntityMapping.class);

            PropertyDescriptor entityTypeId = new PropertyDescriptor(ProviderEntityMapping.PROPERTY_NAME_entityTypeId, ProviderEntityMapping.class);
            entityTypeId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, EntityType.class);

            PropertyDescriptor entityId = new PropertyDescriptor(ProviderEntityMapping.PROPERTY_NAME_entityId, ProviderEntityMapping.class);
            
            return new PropertyDescriptor[] {
                id,
                providerId,
                providerEntityTypeId,
                providerEntityId,
                entityTypeId,
                entityId
            };

        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }

    /* ----------------------------------------------------------------------------------------- */
}