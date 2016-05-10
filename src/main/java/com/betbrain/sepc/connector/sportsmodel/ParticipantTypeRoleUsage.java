package com.betbrain.sepc.connector.sportsmodel;


/**
 * See the Sports Model documentation.
 * 
 * @author Morten Helles
 */
@javax.persistence.Entity
public class ParticipantTypeRoleUsage extends Entity {

    // --------------------------------------------------------------------------------------------
    // Class fields
    // --------------------------------------------------------------------------------------------

    private static final long serialVersionUID = 1L;

    public static final String PROPERTY_NAME_participantTypeId = "participantTypeId";
    public static final String PROPERTY_NAME_participantRoleId = "participantRoleId";
    public static final String PROPERTY_NAME_sportId = "sportId";
    
    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------
    
    private long _participantTypeId;
    private long _participantRoleId;
    private long _sportId;
    
    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------
    
    public ParticipantTypeRoleUsage() {
        
    }

    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------

    public long getParticipantTypeId() {
        
        return _participantTypeId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParticipantTypeId(long participantTypeId) {
        
        _participantTypeId = participantTypeId;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public long getParticipantRoleId() {
        
        return _participantRoleId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParticipantRoleId(long participantRoleId) {
        
        _participantRoleId = participantRoleId;
    }
    
    /* ----------------------------------------------------------------------------------------- */

    public long getSportId() {
        
        return _sportId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setSportId(long sportId) {
        
        _sportId = sportId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
}
