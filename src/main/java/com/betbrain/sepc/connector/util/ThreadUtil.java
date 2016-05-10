package com.betbrain.sepc.connector.util;

import java.util.concurrent.TimeUnit;

/**
 * Provides various utility methods for <code>String</code>s. 
 * 
 * @author Morten Helles
 */
public class ThreadUtil {

    // --------------------------------------------------------------------------------------------
    // Class methods
    // --------------------------------------------------------------------------------------------

    public static void stop(Thread thread, long maxWait) throws InterruptedException {

        thread.interrupt();
        
        long startTime = System.currentTimeMillis();
        while (thread.isAlive()) {
            Thread.sleep(1);
            if ((System.currentTimeMillis() - startTime) >= maxWait)
                throw new InterruptedException(thread.getName() + " is still alive after " + maxWait + " milliseconds.");
        }
    }

    /* ----------------------------------------------------------------------------------------- */

    public static void stop(Thread thread) throws InterruptedException {

        stop(thread, TimeUnit.SECONDS.toMillis(10));
    }
    
    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------
    
    /**
     * Cannot be instantiated.
     */
    private ThreadUtil() {
        
    }
    
    /* ----------------------------------------------------------------------------------------- */
}