package com.betbrain.sepc.connector.util.beans;

import java.beans.BeanDescriptor;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

/**
 * This is a <code>BeanInfo</code> for the <code>AbstractBean</code> class.
 * 
 * @author Morten Helles
 */
public class AbstractBeanBeanInfo extends SimpleBeanInfo {

    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------

    // overrides superclass implementation
    public BeanDescriptor getBeanDescriptor() {

        return new BeanDescriptor(AbstractBean.class);
    }

    /* ----------------------------------------------------------------------------------------- */

    // overrides superclass implementation
    public PropertyDescriptor[] getPropertyDescriptors() {

        return new PropertyDescriptor[] { };
    }

    /* ----------------------------------------------------------------------------------------- */
}