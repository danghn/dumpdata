package com.betbrain.sepc.connector.util.beans;

import java.beans.PropertyChangeListener;

/**
 * A <code>BoundBean</code> is a <code>Bean</code> whose properties are all bound.
 * 
 * @author Morten Helles
 */
public interface BoundBean extends Bean {

    // --------------------------------------------------------------------------------------------
    // Interface methods
    // --------------------------------------------------------------------------------------------

    /**
     * Adds the specified property change listener.
     * 
     * @param listener the property change listener to add.
     */
    public void addPropertyChangeListener(PropertyChangeListener listener);

    /* ----------------------------------------------------------------------------------------- */

    /**
     * Removes the specified property change listener.
     * 
     * @param listener the property change listener to remove.
     */
    public void removePropertyChangeListener(PropertyChangeListener listener);

    /* ----------------------------------------------------------------------------------------- */
}