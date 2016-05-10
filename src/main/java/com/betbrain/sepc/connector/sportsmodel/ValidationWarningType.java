package com.betbrain.sepc.connector.sportsmodel;

/**
 * See the Sports Model documentation.
 * 
 * @author Morten Helles
 */
@javax.persistence.Entity
public class ValidationWarningType extends Entity {

    // --------------------------------------------------------------------------------------------
    // Class fields
    // --------------------------------------------------------------------------------------------

    private static final long serialVersionUID = 1L;

    public static final String PROPERTY_NAME_name = "name";
    public static final String PROPERTY_NAME_description = "description";
    public static final String PROPERTY_NAME_paramEntityTypeId1 = "paramEntityTypeId1";
    public static final String PROPERTY_NAME_paramEntityId1Description = "paramEntityId1Description";
    public static final String PROPERTY_NAME_paramEntityTypeId2 = "paramEntityTypeId2";
    public static final String PROPERTY_NAME_paramEntityId2Description = "paramEntityId2Description";
    public static final String PROPERTY_NAME_paramEntityTypeId3 = "paramEntityTypeId3";
    public static final String PROPERTY_NAME_paramEntityId3Description = "paramEntityId3Description";

    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------
    
    private String _name;
    private String _description;
    private Long _paramEntityTypeId1;
    private String _paramEntityId1Description;
    private Long _paramEntityTypeId2;
    private String _paramEntityId2Description;
    private Long _paramEntityTypeId3;
    private String _paramEntityId3Description;

    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------
    
    public ValidationWarningType() {
        
    }

    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------

    public String getName() {
        
        return _name;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setName(String name) {
        
        _name = name;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public String getDescription() {
        
        return _description;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setDescription(String description) {
        
        _description = description;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public Long getParamEntityTypeId1() {
        
        return _paramEntityTypeId1;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public void setParamEntityTypeId1(Long paramEntityTypeId1) {
        
        _paramEntityTypeId1 = paramEntityTypeId1;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public String getParamEntityId1Description() {
        
        return _paramEntityId1Description;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParamEntityId1Description(String paramEntityId1Description) {
        
        _paramEntityId1Description = paramEntityId1Description;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public Long getParamEntityTypeId2() {
        
        return _paramEntityTypeId2;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public void setParamEntityTypeId2(Long paramEntityTypeId2) {
        
        _paramEntityTypeId2 = paramEntityTypeId2;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public String getParamEntityId2Description() {
        
        return _paramEntityId2Description;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParamEntityId2Description(String paramEntityId2Description) {
        
        _paramEntityId2Description = paramEntityId2Description;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public Long getParamEntityTypeId3() {
        
        return _paramEntityTypeId3;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public void setParamEntityTypeId3(Long paramEntityTypeId3) {
        
        _paramEntityTypeId3 = paramEntityTypeId3;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public String getParamEntityId3Description() {
        
        return _paramEntityId3Description;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParamEntityId3Description(String paramEntityId3Description) {
        
        _paramEntityId3Description = paramEntityId3Description;
    }
    
    /* ----------------------------------------------------------------------------------------- */
}