package com.betbrain.sepc.connector.sportsmodel;


/**
 * See the Sports Model documentation.
 * 
 * @author Morten Helles
 */
@javax.persistence.Entity
public class ParticipantUsage extends Entity {

    // --------------------------------------------------------------------------------------------
    // Class fields
    // --------------------------------------------------------------------------------------------

    private static final long serialVersionUID = 2L;

    public static final String PROPERTY_NAME_participantId = "participantId";
    public static final String PROPERTY_NAME_sportId = "sportId";
    
    // --------------------------------------------------------------------------------------------
    // Instance fields
    // --------------------------------------------------------------------------------------------
    
    private long _participantId;
    private long _sportId;

    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------
    
    public ParticipantUsage() {
        
    }

    // --------------------------------------------------------------------------------------------
    // Instance methods
    // --------------------------------------------------------------------------------------------

    public long getParticipantId() {
        
        return _participantId;
    }
    
    /* ----------------------------------------------------------------------------------------- */
    
    public void setParticipantId(long participantId) {
        
        _participantId = participantId;
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
