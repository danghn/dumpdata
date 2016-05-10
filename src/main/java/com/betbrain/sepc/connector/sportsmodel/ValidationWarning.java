package com.betbrain.sepc.connector.sportsmodel;

import java.util.Date;

/**
 * See the Sports Model documentation.
 * 
 * @author Morten Helles
 */
@javax.persistence.Entity
public class ValidationWarning extends TypedEntity {

    // --------------------------------------------------------------------------------------------
    // Class fields
    // --------------------------------------------------------------------------------------------

    private static final long serialVersionUID = 1L;

    public static final String PROPERTY_NAME_description = "description";
    public static final String PROPERTY_NAME_createdTime = "createdTime";
    public static final String PROPERTY_NAME_accepted = "accepted";
    public static final String PROPERTY_NAME_paramEntityId1 = "paramEntityId1";
    public static final String PROPERTY_NAME_paramEntityId2 = "paramEntityId2";
    public static final String PROPERTY_NAME_paramEntityId3 = "paramEntityId3";

    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------
    
    private String _description;
    private Date _createdTime;
    private boolean _accepted;
    private Long _paramEntityId1;
    private Long _paramEntityId2;
    private Long _paramEntityId3;

    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------

    public ValidationWarning() {
        
    }

    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------
    
    public String getDescription() {
        
        return _description;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setDescription(String description) {
        
        _description = description;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public Date getCreatedTime() {
        
        return _createdTime;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setCreatedTime(Date createdTime) {
        
        _createdTime = createdTime;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public boolean getAccepted() {
        
        return _accepted;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setAccepted(boolean accepted) {
        
        _accepted = accepted;
    }

    /* ----------------------------------------------------------------------------------------- */

    public Long getParamEntityId1() {
        
        return _paramEntityId1;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParamEntityId1(Long paramEntityId1) {
        
        _paramEntityId1 = paramEntityId1;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public Long getParamEntityId2() {
        
        return _paramEntityId2;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParamEntityId2(Long paramEntityId2) {
        
        _paramEntityId2 = paramEntityId2;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public Long getParamEntityId3() {
        
        return _paramEntityId3;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParamEntityId3(Long paramEntityId3) {
        
        _paramEntityId3 = paramEntityId3;
    }
    
    /* ----------------------------------------------------------------------------------------- */
}