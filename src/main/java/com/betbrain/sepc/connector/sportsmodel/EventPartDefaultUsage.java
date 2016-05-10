package com.betbrain.sepc.connector.sportsmodel;


/**
* See the Sports Model documentation.
*
* @author Morten Helles
*/
@javax.persistence.Entity
public class EventPartDefaultUsage extends Entity {

   // --------------------------------------------------------------------------------------------
   // Class fields
   // --------------------------------------------------------------------------------------------

   private static final long serialVersionUID = 1L;

   public static final String PROPERTY_NAME_parentEventId = "parentEventId";
   public static final String PROPERTY_NAME_eventTypeId = "eventTypeId";
   public static final String PROPERTY_NAME_sportId = "sportId";
   public static final String PROPERTY_NAME_rootPartId = "rootPartId";
   
   // --------------------------------------------------------------------------------------------
   // Instance fields
   // --------------------------------------------------------------------------------------------
   
   private Long _parentEventId;
   private Long _eventTypeId;
   private Long _sportId;
   private long _rootPartId;
   
   // --------------------------------------------------------------------------------------------
   // Constructors
   // --------------------------------------------------------------------------------------------
   
   public EventPartDefaultUsage() {
       
   }

   // --------------------------------------------------------------------------------------------
   // Instance methods
   // --------------------------------------------------------------------------------------------

   public Long getParentEventId() {
       
       return _parentEventId;
   }
   
   /* ----------------------------------------------------------------------------------------- */
   
   public void setParentEventId(Long parentEventId) {
       
       _parentEventId = parentEventId;
   }
   
   /* ----------------------------------------------------------------------------------------- */
   
   public Long getEventTypeId() {
       
       return _eventTypeId;
   }
   
   /* ----------------------------------------------------------------------------------------- */
   
   public void setEventTypeId(Long eventTypeId) {
       
       _eventTypeId = eventTypeId;
   }
   
   /* ----------------------------------------------------------------------------------------- */

   public Long getSportId() {
       
       return _sportId;
   }
   
   /* ----------------------------------------------------------------------------------------- */
   
   public void setSportId(Long sportId) {
       
       _sportId = sportId;
   }
   
   /* ----------------------------------------------------------------------------------------- */

   public long getRootPartId() {
       
       return _rootPartId;
   }
   
   /* ----------------------------------------------------------------------------------------- */
   
   public void setRootPartId(long rootPartId) {
       
       _rootPartId = rootPartId;
   }
   
   /* ----------------------------------------------------------------------------------------- */
}
