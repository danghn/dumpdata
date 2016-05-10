package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

/**
 * This is a <code>BeanInfo</code> for the <code>DataCollectionBatch</code> bean.
 * 
 * @author Morten Helles
 */
public class SourceBeanInfo extends SimpleBeanInfo {
    
    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------
    
    // overrides superclass implementation
    @Override
    public BeanDescriptor getBeanDescriptor() {
    
        BeanDescriptor beanDescriptor = new BeanDescriptor(Source.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] { //
        Source.PROPERTY_NAME_id, //
        Source.PROPERTY_NAME_collectorId, // 
        Source.PROPERTY_NAME_providerId, //
        Source.PROPERTY_NAME_sourceKey, //
        Source.PROPERTY_NAME_lastCollectedTime, //
        Source.PROPERTY_NAME_lastUpdatedTime //
        });
        
        return beanDescriptor;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    // override default implementation
    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
    
        try {
            
            PropertyDescriptor id = new PropertyDescriptor(Source.PROPERTY_NAME_id, Source.class);
            
            PropertyDescriptor collectorId = new PropertyDescriptor(Source.PROPERTY_NAME_collectorId, Source.class);
            
            PropertyDescriptor providerId = new PropertyDescriptor(Source.PROPERTY_NAME_providerId, Source.class);
            providerId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Provider.class);
            
            PropertyDescriptor sourceKey = new PropertyDescriptor(Source.PROPERTY_NAME_sourceKey, Source.class);
            
            PropertyDescriptor lastCollectedTime = new PropertyDescriptor(Source.PROPERTY_NAME_lastCollectedTime, Source.class);
            
            PropertyDescriptor lastUpdatedTime = new PropertyDescriptor(Source.PROPERTY_NAME_lastUpdatedTime, Source.class);
            
            return new PropertyDescriptor[] { //
            id, //
            collectorId, //
            providerId, //
            sourceKey, //
            lastCollectedTime, //
            lastUpdatedTime //
            };
            
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }
    
    /* ----------------------------------------------------------------------------------------- */
}