package com.betbrain.sepc.connector.util;

/**
 * This interface indicates that instances are clonable by a <i>public</i> <code>clone</code>
 * method.
 * 
 * @author Morten Helles
 */
public interface PublicCloneable extends Cloneable {

    // --------------------------------------------------------------------------------------------
    // Interface methods
    // --------------------------------------------------------------------------------------------

    /**
     * Returns a clone.
     *
     * @return a clone.
     */
    public Object clone();

    /* ----------------------------------------------------------------------------------------- */
}