package com.betbrain.sepc.connector.sportsmodel;


import java.util.HashMap;
import java.util.Map;

/**
 * Contains a selection of <code>EntityType</code> ids.
 * <p>
 * The selection includes all entity types that are explicitly referred to during processing.
 * 
 * @author Morten Helles
 */
public class EntityTypes {

    // --------------------------------------------------------------------------------------------
    // Class fields
    // --------------------------------------------------------------------------------------------

    public static final long Event_id = 1;
    public static final long EventParticipantRelation_id = 3;
    public static final long Location_id = 7;
    public static final long Participant_id = 2;
    public static final long SureBet_id = 4;
    public static final long Sport_id = 6;
    public static final long ValueBet_id = 5;

    private static Map<Long,Class<? extends Entity>> _ENTITY_TYPE_ID_TO_CLASS_MAP = new HashMap<Long,Class<? extends Entity>>();
    static {
        _ENTITY_TYPE_ID_TO_CLASS_MAP.put(Event_id, Event.class);
        _ENTITY_TYPE_ID_TO_CLASS_MAP.put(EventParticipantRelation_id, EventParticipantRelation.class);
        _ENTITY_TYPE_ID_TO_CLASS_MAP.put(Location_id, Location.class);
        _ENTITY_TYPE_ID_TO_CLASS_MAP.put(Participant_id, Participant.class);
        _ENTITY_TYPE_ID_TO_CLASS_MAP.put(SureBet_id, SureBet.class);
        _ENTITY_TYPE_ID_TO_CLASS_MAP.put(ValueBet_id, ValueBet.class);
        _ENTITY_TYPE_ID_TO_CLASS_MAP.put(Sport_id, Sport.class);
    }

    private static Map<Class<? extends Entity>,Long> _ENTITY_CLASS_TO_TYPE_ID_MAP = new HashMap<Class<? extends Entity>,Long>();
    static {
        for (Map.Entry<Long,Class<? extends Entity>> mapEntry : _ENTITY_TYPE_ID_TO_CLASS_MAP.entrySet())
            _ENTITY_CLASS_TO_TYPE_ID_MAP.put(mapEntry.getValue(), mapEntry.getKey());
    }
    
    // --------------------------------------------------------------------------------------------
    // Class methods
    // --------------------------------------------------------------------------------------------

    /**
     * Returns the entity class associated with the specified entity type id, or null if none.
     * 
     * @param entityTypeId the entity type id.
     * @return the entity class associated with the specified entity type id, or null if none.
     */
    public static Class<? extends Entity> getEntityClass(long entityTypeId) {

        return _ENTITY_TYPE_ID_TO_CLASS_MAP.get(entityTypeId);
    }

    /* ----------------------------------------------------------------------------------------- */

    /**
     * Returns the entity type id associated with the specified entity class, or null if none.
     * 
     * @param entityClass the entity class.
     * @return the entity type id associated with the specified entity class, or null if none.
     */
    public static Long getEntityTypeId(Class<? extends Entity> entityClass) {

        return _ENTITY_CLASS_TO_TYPE_ID_MAP.get(entityClass);
    }

    // --------------------------------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------------------------------

    /**
     * Cannot be instantiated.
     */
    private EntityTypes() {
        
    }
    
    /* ----------------------------------------------------------------------------------------- */
}
