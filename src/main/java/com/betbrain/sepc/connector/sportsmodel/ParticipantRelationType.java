package com.betbrain.sepc.connector.sportsmodel;

/**
 * See the Sports Model documentation.
 *
 * @author Morten Helles
 */
@javax.persistence.Entity
public class ParticipantRelationType extends Entity {
    
    // --------------------------------------------------------------------------------------------
    // Class fields
    // --------------------------------------------------------------------------------------------
    
    private static final long serialVersionUID = 1L;
    
    public static final String PROPERTY_NAME_name = "name";
    public static final String PROPERTY_NAME_description = "description";
    public static final String PROPERTY_NAME_hasParamParticipantRoleId = "hasParamParticipantRoleId";
    public static final String PROPERTY_NAME_paramParticipantRoleIdDescription = "paramParticipantRoleIdDescription";
    
    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------
    
    private String _name;
    private String _description;
    private Boolean _hasParamParticipantRoleId;
    private String _paramParticipantRoleIdDescription;
    
    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------
    
    public ParticipantRelationType() {
    
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
    
    public Boolean getHasParamParticipantRoleId() {
    
        return _hasParamParticipantRoleId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setHasParamParticipantRoleId(Boolean hasParamParticipantRoleId) {
    
        _hasParamParticipantRoleId = hasParamParticipantRoleId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public String getParamParticipantRoleIdDescription() {
    
        return _paramParticipantRoleIdDescription;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParamParticipantRoleIdDescription(String paramParticipantRoleIdDescription) {
    
        _paramParticipantRoleIdDescription = paramParticipantRoleIdDescription;
    }
    
    /* ----------------------------------------------------------------------------------------- */
}
