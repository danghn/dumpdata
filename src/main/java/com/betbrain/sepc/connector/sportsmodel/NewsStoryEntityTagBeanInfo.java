package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

/**
 * This is a <code>BeanInfo</code> for the <code>NewsStoryEntityTag</code> bean.
 * 
 * @author Morten Helles
 */
public class NewsStoryEntityTagBeanInfo extends SimpleBeanInfo {

    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------

    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {
        
        BeanDescriptor beanDescriptor = new BeanDescriptor(NewsStoryEntityTag.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] {
            NewsStoryEntityTag.PROPERTY_NAME_id,
            NewsStoryEntityTag.PROPERTY_NAME_newsStoryId,
            NewsStoryEntityTag.PROPERTY_NAME_entityTypeId,
            NewsStoryEntityTag.PROPERTY_NAME_entityId,
            NewsStoryEntityTag.PROPERTY_NAME_strength
        });
        
        return beanDescriptor;
    }

    /* ----------------------------------------------------------------------------------------- */

    // override default implementation
    public PropertyDescriptor[] getPropertyDescriptors() {

        try {

            PropertyDescriptor id = new PropertyDescriptor(NewsStoryEntityTag.PROPERTY_NAME_id, NewsStoryEntityTag.class);
            
            PropertyDescriptor newsStoryId = new PropertyDescriptor(NewsStoryEntityTag.PROPERTY_NAME_newsStoryId, NewsStoryEntityTag.class);
            newsStoryId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, NewsStory.class);

            PropertyDescriptor entityTypeId = new PropertyDescriptor(NewsStoryEntityTag.PROPERTY_NAME_entityTypeId, NewsStoryEntityTag.class);
            entityTypeId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, EntityType.class);

            PropertyDescriptor entityId = new PropertyDescriptor(NewsStoryEntityTag.PROPERTY_NAME_entityId, NewsStoryEntityTag.class);
            
            PropertyDescriptor strength = new PropertyDescriptor(NewsStoryEntityTag.PROPERTY_NAME_strength, NewsStoryEntityTag.class);

            return new PropertyDescriptor[] {
                id,
                newsStoryId,
                entityTypeId,
                entityId,
                strength
            };
            
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }

    /* ----------------------------------------------------------------------------------------- */
}