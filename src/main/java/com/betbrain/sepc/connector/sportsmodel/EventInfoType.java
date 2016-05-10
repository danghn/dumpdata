package com.betbrain.sepc.connector.sportsmodel;

@javax.persistence.Entity
public class EventInfoType extends Entity {
    
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
    public static final String PROPERTY_NAME_hasParamParticipantId2 = "hasParamParticipantId2";
    public static final String PROPERTY_NAME_paramParticipantId2Description = "paramParticipantId2Description";
    public static final String PROPERTY_NAME_hasParamEventPartId1 = "hasParamEventPartId1";
    public static final String PROPERTY_NAME_paramEventPartId1Description = "paramEventPartId1Description";
    public static final String PROPERTY_NAME_hasParamString1 = "hasParamString1";
    public static final String PROPERTY_NAME_paramString1Description = "paramString1Description";
    public static final String PROPERTY_NAME_paramString1PossibleValues = "paramString1PossibleValues";
    public static final String PROPERTY_NAME_hasParamBoolean1 = "hasParamBoolean1";
    public static final String PROPERTY_NAME_paramBoolean1Description = "paramBoolean1Description";
    public static final String PROPERTY_NAME_hasParamEventStatusId1 = "hasParamEventStatusId1";
    public static final String PROPERTY_NAME_paramEventStatusId1Description = "paramEventStatusId1Description";
    public static final String PROPERTY_NAME_hasParamTime1 = "hasParamTime1";
    public static final String PROPERTY_NAME_paramTime1Description = "paramTime1Description";
    public static final String PROPERTY_NAME_paramParticipantIdsMustBeOrdered = "paramParticipantIdsMustBeOrdered";
    
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
    private Boolean _hasParamParticipantId2;
    private String _paramParticipantId2Description;
    private Boolean _hasParamEventPartId1;
    private String _paramEventPartId1Description;
    private Boolean _hasParamString1;
    private String _paramString1Description;
    private String _paramString1PossibleValues;
    private Boolean _hasParamBoolean1;
    private String _paramBoolean1Description;
    private Boolean _hasParamEventStatusId1;
    private String _paramEventStatusId1Description;
    private Boolean _hasParamTime1;
    private String _paramTime1Description;
    private boolean _paramParticipantIdsMustBeOrdered;
    
    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------
    
    public EventInfoType() {
    
    }
    
    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------
    
    @Override
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
    
    public String getParamParticipantId2Description() {
    
        return _paramParticipantId2Description;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParamParticipantId2Description(String paramParticipantId2Description) {
    
        _paramParticipantId2Description = paramParticipantId2Description;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public Boolean getHasParamParticipantId2() {
    
        return _hasParamParticipantId2;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setHasParamParticipantId2(Boolean hasParamParticipantId2) {
    
        _hasParamParticipantId2 = hasParamParticipantId2;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public Boolean getHasParamEventPartId1() {
    
        return _hasParamEventPartId1;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setHasParamEventPartId1(Boolean hasParamEventPartId1) {
    
        _hasParamEventPartId1 = hasParamEventPartId1;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public String getParamEventPartId1Description() {
    
        return _paramEventPartId1Description;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParamEventPartId1Description(String paramEventPartId1Description) {
    
        _paramEventPartId1Description = paramEventPartId1Description;
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
    
    public Boolean getHasParamEventStatusId1() {
    
        return _hasParamEventStatusId1;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setHasParamEventStatusId1(Boolean hasParamEventStatusId1) {
    
        _hasParamEventStatusId1 = hasParamEventStatusId1;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public String getParamEventStatusId1Description() {
    
        return _paramEventStatusId1Description;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParamEventStatusId1Description(String paramEventStatusId1Description) {
    
        _paramEventStatusId1Description = paramEventStatusId1Description;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public boolean getParamParticipantIdsMustBeOrdered() {
    
        return _paramParticipantIdsMustBeOrdered;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParamParticipantIdsMustBeOrdered(boolean paramParticipantIdsMustBeOrdered) {
    
        _paramParticipantIdsMustBeOrdered = paramParticipantIdsMustBeOrdered;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public Boolean getHasParamTime1() {
    
        return _hasParamTime1;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setHasParamTime1(Boolean hasParamTime1) {
    
        _hasParamTime1 = hasParamTime1;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public String getParamTime1Description() {
    
        return _paramTime1Description;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParamTime1Description(String paramTime1Description) {
    
        _paramTime1Description = paramTime1Description;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
}
