package com.betbrain.sepc.connector.util.beans;

import java.beans.BeanDescriptor;
import java.beans.BeanInfo;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

/**
 * This is a <code>BeanInfo</code> for the <code>AbstractBoundBean</code> class.
 * 
 * @author Morten Helles
 */
public class AbstractBoundBeanBeanInfo extends SimpleBeanInfo {

    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------

    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {

        return new BeanDescriptor(AbstractBoundBean.class);
    }

    /* ----------------------------------------------------------------------------------------- */

    // overrides superclass implementation
    public PropertyDescriptor[] getPropertyDescriptors() {

        return new PropertyDescriptor[] { };
    }

    /* ----------------------------------------------------------------------------------------- */

    // overrides superclass implementation
    public BeanInfo[] getAdditionalBeanInfo() {
        
        return new BeanInfo[] {
            new AbstractBeanBeanInfo()
        };
    }

    /* ----------------------------------------------------------------------------------------- */
}