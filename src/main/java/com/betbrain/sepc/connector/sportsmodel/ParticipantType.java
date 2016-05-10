package com.betbrain.sepc.connector.sportsmodel;


/**
 * See the Sports Model documentation.
 * 
 * @author Morten Helles
 */
@javax.persistence.Entity
public class ParticipantType extends Entity {

    // --------------------------------------------------------------------------------------------
    // Class fields
    // --------------------------------------------------------------------------------------------

    private static final long serialVersionUID = 1L;

    public static final String PROPERTY_NAME_name = "name";
    public static final String PROPERTY_NAME_description = "description";
    public static final String PROPERTY_NAME_isIndividual = "isIndividual";
    public static final String PROPERTY_NAME_hasName = "hasName";
    public static final String PROPERTY_NAME_hasFirstName = "hasFirstName";
    public static final String PROPERTY_NAME_hasLastName = "hasLastName";
    public static final String PROPERTY_NAME_hasIsMale = "hasIsMale";
    public static final String PROPERTY_NAME_hasBirthTime = "hasBirthTime";
    public static final String PROPERTY_NAME_hasCountryId = "hasCountryId";
    public static final String PROPERTY_NAME_hasRetirementTime = "hasRetirementTime";
    
    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------
    
    private String _name;
    private String _description;
    private boolean _isIndividual;
    private Boolean _hasName;
    private Boolean _hasFirstName;
    private Boolean _hasLastName;
    private Boolean _hasIsMale;
    private Boolean _hasBirthTime;
    private Boolean _hasCountryId;
    private Boolean _hasRetirementTime;
    
    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------
    
    public ParticipantType() {
        
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

    public boolean getIsIndividual() {
        
        return _isIndividual;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setIsIndividual(boolean isIndividual) {
        
        _isIndividual = isIndividual;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public Boolean getHasName() {
        
        return _hasName;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public void setHasName(Boolean hasName) {
        
        _hasName = hasName;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public Boolean getHasFirstName() {
        
        return _hasFirstName;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public void setHasFirstName(Boolean hasFirstName) {
        
        _hasFirstName = hasFirstName;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public Boolean getHasLastName() {
        
        return _hasLastName;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public void setHasLastName(Boolean hasLastName) {
        
        _hasLastName = hasLastName;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public Boolean getHasIsMale() {
        
        return _hasIsMale;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public void setHasIsMale(Boolean hasIsMale) {
        
        _hasIsMale = hasIsMale;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public Boolean getHasBirthTime() {
        
        return _hasBirthTime;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public void setHasBirthTime(Boolean hasBirthTime) {
        
        _hasBirthTime = hasBirthTime;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public Boolean getHasCountryId() {
        
        return _hasCountryId;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public void setHasCountryId(Boolean hasCountryId) {
        
        _hasCountryId = hasCountryId;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public Boolean getHasRetirementTime() {
        
        return _hasRetirementTime;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public void setHasRetirementTime(Boolean hasRetirementTime) {
        
        _hasRetirementTime = hasRetirementTime;
    }
    
    /* ----------------------------------------------------------------------------------------- */
}