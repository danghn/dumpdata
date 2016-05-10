package com.betbrain.sepc.connector.sportsmodel;

/**
 * See the Sports Model documentation.
 *
 * @author Morten Helles
 */
@javax.persistence.Entity
public class EventActionType extends Entity {
    // --------------------------------------------------------------------------------------------
    // Class fields
    // --------------------------------------------------------------------------------------------
    
    private static final long serialVersionUID = 1L;
    
    public static final String PROPERTY_NAME_name = "name";
    public static final String PROPERTY_NAME_description = "description";
    public static final String PROPERTY_NAME_hasParamFloat1 = "hasParamFloat1";
    public static final String PROPERTY_NAME_paramFloat1Description = "paramFloat1Description";
    public static final String PROPERTY_NAME_hasParamParticipantId1 = "hasParamParticipantId1";
    public static final String PROPERTY_NAME_paramParticipantId1Description = "paramParticipantId1Description";
    public static final String PROPERTY_NAME_hasParamParticipantId2 = "hasParamParticipantId2";
    public static final String PROPERTY_NAME_paramParticipantId2Description = "paramParticipantId2Description";
    
    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------
    
    private String _name;
    private String _description;
    private Boolean _hasParamFloat1;
    private String _paramFloat1Description;
    private Boolean _hasParamParticipantId1;
    private String _paramParticipantId1Description;
    private Boolean _hasParamParticipantId2;
    private String _paramParticipantId2Description;
    
    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------
    
    public EventActionType() {
    
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
    
    public Boolean getHasParamParticipantId2() {
    
        return _hasParamParticipantId2;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setHasParamParticipantId2(Boolean hasParamParticipantId2) {
    
        _hasParamParticipantId2 = hasParamParticipantId2;
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
}
