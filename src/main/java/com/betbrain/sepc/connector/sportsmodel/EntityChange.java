package com.betbrain.sepc.connector.sportsmodel;

import javax.persistence.MappedSuperclass;

import com.betbrain.sepc.connector.util.beans.AbstractBean;

/**
 * Represents a Sports Model entity change. 
 * 
 * @author Morten Helles
 */
@MappedSuperclass
public abstract class EntityChange extends AbstractBean {
    
    public abstract Class<? extends Entity> getEntityClass();
}