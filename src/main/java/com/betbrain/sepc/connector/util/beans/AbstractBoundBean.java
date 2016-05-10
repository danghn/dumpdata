package com.betbrain.sepc.connector.util.beans;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

/**
 * This is an abstract support class for a bound bean implementation.
 * 
 * @author Morten Helles
 */
public abstract class AbstractBoundBean extends AbstractBean implements BoundBean {

    // --------------------------------------------------------------------------------------------
    // Class fields
    // --------------------------------------------------------------------------------------------

	private static final long serialVersionUID = 1L;
	
    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------

	private transient List<PropertyChangeListener> _listeners = null;

    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------

    // implements the BoundBean interface
    public void addPropertyChangeListener(PropertyChangeListener listener) {
    
        if (_listeners == null)
            _listeners = new ArrayList<PropertyChangeListener>(1);
        
        _listeners.add(listener);
    }

    /* ----------------------------------------------------------------------------------------- */

    // implements the BoundBean interface
    public void removePropertyChangeListener(PropertyChangeListener listener) {

        if (_listeners != null)
            _listeners.remove(listener);
    }

    /* ----------------------------------------------------------------------------------------- */

    /**
     * Fires the specified property change event.
     * 
     * @param propertyChangeEvent the property change event.
     */
    protected void firePropertyChangeEvent(PropertyChangeEvent propertyChangeEvent) {

        if ((_listeners == null) || _listeners.isEmpty())
            return;

        for (PropertyChangeListener listener : new ArrayList<PropertyChangeListener>(_listeners))
            listener.propertyChange(propertyChangeEvent);
    }

    /* ----------------------------------------------------------------------------------------- */

    /**
     * Fires a property change event with the specified values.
     * 
     * @param propertyName the name of the changed property.
     * @param oldValue the old value of the property.
     * @param newValue the new value of the property.
     */
    protected void firePropertyChangeEvent(String propertyName, Object oldValue, Object newValue) {

        firePropertyChangeEvent(new PropertyChangeEvent(this, propertyName, oldValue, newValue));
    }

    /* ----------------------------------------------------------------------------------------- */
}