package com.betbrain.sepc.connector.sportsmodel;
@javax.persistence.Entity
public class EventActionDetailType  extends TypedEntity {
 // --------------------------------------------------------------------------------------------
    // Class fields
    // --------------------------------------------------------------------------------------------

    private static final long serialVersionUID = 1L;

    public static final String PROPERTY_NAME_name = "name";
    public static final String PROPERTY_NAME_description = "description";
    public static final String PROPERTY_NAME_hasParamFloat1 = "hasParamFloat1";
    public static final String PROPERTY_NAME_paramFloat1Description = "paramFloat1Description";
    public static final String PROPERTY_NAME_hasParamFloat2 = "hasParamFloat2";
    public static final String PROPERTY_NAME_paramFloat2Description = "paramFloat2Description";
    public static final String PROPERTY_NAME_hasParamParticipantId1 = "hasParamParticipantId1";
    public static final String PROPERTY_NAME_paramParticipantId1Description = "paramParticipantId1Description";
    public static final String PROPERTY_NAME_hasParamString1 = "hasParamString1";
    public static final String PROPERTY_NAME_paramString1Description = "paramString1Description";
    public static final String PROPERTY_NAME_paramString1PossibleValues = "paramString1PossibleValues";
    public static final String PROPERTY_NAME_hasParamBoolean1 = "hasParamBoolean1";
    public static final String PROPERTY_NAME_paramBoolean1Description = "paramBoolean1Description";
    
    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------
    
    private String _name;
    private String _description;
    private Boolean _hasParamFloat1;
    private String _paramFloat1Description;
    private Boolean _hasParamFloat2;
    private String _paramFloat2Description;
    private Boolean _hasParamParticipantId1;
    private String _paramParticipantId1Description;
    private Boolean _hasParamString1;
    private String _paramString1Description;
    private String _paramString1PossibleValues;
    private Boolean _hasParamBoolean1;
    private String _paramBoolean1Description;
    
    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------
    
    public EventActionDetailType() {
        
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
    
    public Boolean getHasParamFloat1() {
        
        return _hasParamFloat1;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setHasParamFloat1(Boolean hasParamFloat1) {
        
        _hasParamFloat1 = hasParamFloat1;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public String getParamFloat1Description() {
        
        return _paramFloat1Description;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParamFloat1Description(String paramFloat1Description) {
        
        _paramFloat1Description = paramFloat1Description;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public Boolean getHasParamFloat2() {
        
        return _hasParamFloat2;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setHasParamFloat2(Boolean hasParamFloat2) {
        
        _hasParamFloat2 = hasParamFloat2;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public String getParamFloat2Description() {
        
        return _paramFloat2Description;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParamFloat2Description(String paramFloat2Description) {
        
        _paramFloat2Description = paramFloat2Description;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public Boolean getHasParamParticipantId1() {
        
        return _hasParamParticipantId1;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setHasParamParticipantId1(Boolean hasParamParticipantId1) {
        
        _hasParamParticipantId1 = hasParamParticipantId1;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public String getParamParticipantId1Description() {
        
        return _paramParticipantId1Description;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParamParticipantId1Description(String paramParticipantId1Description) {
        
        _paramParticipantId1Description = paramParticipantId1Description;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public Boolean getHasParamString1() {
        
        return _hasParamString1;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setHasParamString1(Boolean hasParamString1) {
        
        _hasParamString1 = hasParamString1;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public String getParamString1Description() {
        
        return _paramString1Description;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParamString1Description(String paramString1Description) {
        
        _paramString1Description = paramString1Description;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public String getParamString1PossibleValues() {
        
        return _paramString1PossibleValues;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParamString1PossibleValues(String paramString1PossibleValues) {
        
        _paramString1PossibleValues = paramString1PossibleValues;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public Boolean getHasParamBoolean1() {
        
        return _hasParamBoolean1;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setHasParamBoolean1(Boolean hasParamBoolean1) {
        
        _hasParamBoolean1 = hasParamBoolean1;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public String getParamBoolean1Description() {
        
        return _paramBoolean1Description;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParamBoolean1Description(String paramBoolean1Description) {
        
        _paramBoolean1Description = paramBoolean1Description;
    }
    
    /* ----------------------------------------------------------------------------------------- */
}
