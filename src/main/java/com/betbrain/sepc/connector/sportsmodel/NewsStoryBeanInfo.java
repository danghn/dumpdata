package com.betbrain.sepc.connector.sportsmodel;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

import com.betbrain.sepc.connector.util.beans.BeanInfoExt;

/**
 * This is a <code>BeanInfo</code> for the <code>NewsStory</code> bean.
 * 
 * @author Morten Helles
 */
public class NewsStoryBeanInfo extends SimpleBeanInfo {

    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------

    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {
        
        BeanDescriptor beanDescriptor = new BeanDescriptor(NewsStory.class);
        beanDescriptor.setValue(BeanInfoExt.BEAN_DESCRIPTOR_PROPERTY_ORDER_ATTRIBUTE_NAME, new String[] {
            NewsStory.PROPERTY_NAME_id,
            NewsStory.PROPERTY_NAME_providerId,
            NewsStory.PROPERTY_NAME_sourceId,
            NewsStory.PROPERTY_NAME_headline,
            NewsStory.PROPERTY_NAME_summary,
            NewsStory.PROPERTY_NAME_url,
            NewsStory.PROPERTY_NAME_publicationTime,
            NewsStory.PROPERTY_NAME_lastRevisedTime
        });
        
        return beanDescriptor;
    }

    /* ----------------------------------------------------------------------------------------- */

    // override default implementation
    public PropertyDescriptor[] getPropertyDescriptors() {

        try {

            PropertyDescriptor id = new PropertyDescriptor(NewsStory.PROPERTY_NAME_id, NewsStory.class);
            
            PropertyDescriptor providerId = new PropertyDescriptor(NewsStory.PROPERTY_NAME_providerId, NewsStory.class);
            providerId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Provider.class);

            PropertyDescriptor sourceId = new PropertyDescriptor(NewsStory.PROPERTY_NAME_sourceId, NewsStory.class);
            sourceId.setValue(EntityBeanInfoUtil.PROPERTY_DESCRIPTOR_ENTITY_REFERENCE_CLASS, Source.class);

            PropertyDescriptor headline = new PropertyDescriptor(NewsStory.PROPERTY_NAME_headline, NewsStory.class);

            PropertyDescriptor summary = new PropertyDescriptor(NewsStory.PROPERTY_NAME_summary, NewsStory.class);

            PropertyDescriptor url = new PropertyDescriptor(NewsStory.PROPERTY_NAME_url, NewsStory.class);

            PropertyDescriptor publicationTime = new PropertyDescriptor(NewsStory.PROPERTY_NAME_publicationTime, NewsStory.class);

            PropertyDescriptor lastRevisedTime = new PropertyDescriptor(NewsStory.PROPERTY_NAME_lastRevisedTime, NewsStory.class);

            return new PropertyDescriptor[] {
                id,
                providerId,
                sourceId,
                headline,
                summary,
                url,
                publicationTime,
                lastRevisedTime
            };
            
        } catch (IntrospectionException e) {
            throw new RuntimeException(e);
        }
    }

    /* ----------------------------------------------------------------------------------------- */
}