package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

/**
 * This is a <code>BeanInfo</code> for the <code>NewsStoryRelation</code> bean.
 * 
 * @author Morten Helles
 */
public class NewsStoryRelationBeanInfo extends SimpleBeanInfo {

    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------

    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {
        
        BeanDescriptor beanDescriptor = new BeanDescriptor(NewsStoryRelation.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] {
            NewsStoryRelation.PROPERTY_NAME_id,
            NewsStoryRelation.PROPERTY_NAME_newsStoryId1,
            NewsStoryRelation.PROPERTY_NAME_newsStoryId2,
            NewsStoryRelation.PROPERTY_NAME_similarity
        });
        
        return beanDescriptor;
    }

    /* ----------------------------------------------------------------------------------------- */

    // override default implementation
    public PropertyDescriptor[] getPropertyDescriptors() {

        try {

            PropertyDescriptor id = new PropertyDescriptor(NewsStoryRelation.PROPERTY_NAME_id, NewsStoryRelation.class);
            
            PropertyDescriptor newsStoryId1 = new PropertyDescriptor(NewsStoryRelation.PROPERTY_NAME_newsStoryId1, NewsStoryRelation.class);
            newsStoryId1.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, NewsStory.class);

            PropertyDescriptor newsStoryId2 = new PropertyDescriptor(NewsStoryRelation.PROPERTY_NAME_newsStoryId2, NewsStoryRelation.class);
            newsStoryId2.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, NewsStory.class);

            PropertyDescriptor similarity = new PropertyDescriptor(NewsStoryRelation.PROPERTY_NAME_similarity, NewsStoryRelation.class);

            return new PropertyDescriptor[] {
                id,
                newsStoryId1,
                newsStoryId2,
                similarity
            };
            
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }

    /* ----------------------------------------------------------------------------------------- */
}