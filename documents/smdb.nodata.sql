-- MySQL dump 10.13  Distrib 5.6.24, for Linux (x86_64)
--
-- Host: localhost    Database: smdb_snapshot_20160426060701
-- ------------------------------------------------------
-- Server version	5.6.24

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bettingoffer`
--

DROP TABLE IF EXISTS `bettingoffer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bettingoffer` (
  `id` bigint(20) unsigned NOT NULL,
  `providerId` bigint(20) unsigned NOT NULL,
  `sourceId` bigint(20) unsigned NOT NULL,
  `outcomeId` bigint(20) unsigned NOT NULL,
  `bettingTypeId` bigint(20) unsigned NOT NULL,
  `statusId` bigint(20) unsigned NOT NULL,
  `isLive` tinyint(1) DEFAULT NULL,
  `odds` double unsigned DEFAULT NULL,
  `multiplicity` int(11) DEFAULT NULL,
  `volume` double unsigned DEFAULT NULL,
  `volumeCurrencyId` bigint(20) unsigned DEFAULT NULL,
  `couponKey` varchar(255) DEFAULT NULL,
  `slotNum` int(10) unsigned NOT NULL,
  `lastChangedTime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `bettingofferstatus`
--

DROP TABLE IF EXISTS `bettingofferstatus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bettingofferstatus` (
  `id` bigint(20) unsigned NOT NULL,
  `name` varchar(255) NOT NULL,
  `isAvailable` tinyint(1) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `bettingtype`
--

DROP TABLE IF EXISTS `bettingtype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bettingtype` (
  `id` bigint(20) unsigned NOT NULL,
  `name` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `bettingtypeusage`
--

DROP TABLE IF EXISTS `bettingtypeusage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bettingtypeusage` (
  `id` bigint(20) unsigned NOT NULL,
  `bettingTypeId` bigint(20) unsigned NOT NULL,
  `eventTypeId` bigint(20) unsigned NOT NULL,
  `sportId` bigint(20) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `currency`
--

DROP TABLE IF EXISTS `currency`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `currency` (
  `id` bigint(20) unsigned NOT NULL,
  `name` varchar(255) NOT NULL,
  `code` char(3) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `databaseproperty`
--

DROP TABLE IF EXISTS `databaseproperty`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `databaseproperty` (
  `name` varchar(255) NOT NULL,
  `value` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `entityproperty`
--

DROP TABLE IF EXISTS `entityproperty`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `entityproperty` (
  `id` bigint(20) unsigned NOT NULL,
  `typeId` bigint(20) unsigned NOT NULL,
  `entityTypeId` bigint(20) unsigned NOT NULL,
  `name` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `entitypropertytype`
--

DROP TABLE IF EXISTS `entitypropertytype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `entitypropertytype` (
  `id` bigint(20) unsigned NOT NULL,
  `name` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `entitypropertyvalue`
--

DROP TABLE IF EXISTS `entitypropertyvalue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `entitypropertyvalue` (
  `id` bigint(20) unsigned NOT NULL,
  `entityPropertyId` bigint(20) unsigned NOT NULL,
  `entityId` bigint(20) unsigned NOT NULL,
  `value` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `entitytype`
--

DROP TABLE IF EXISTS `entitytype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `entitytype` (
  `id` bigint(20) unsigned NOT NULL,
  `name` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `event`
--

DROP TABLE IF EXISTS `event`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `event` (
  `id` bigint(20) unsigned NOT NULL,
  `typeId` bigint(20) unsigned NOT NULL,
  `isComplete` tinyint(1) NOT NULL,
  `sportId` bigint(20) unsigned NOT NULL,
  `templateId` bigint(20) unsigned DEFAULT NULL,
  `promotionId` bigint(20) unsigned DEFAULT NULL,
  `parentId` bigint(20) unsigned DEFAULT NULL,
  `parentPartId` bigint(20) unsigned DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `startTime` datetime DEFAULT NULL,
  `endTime` datetime DEFAULT NULL,
  `deleteTimeOffset` bigint(20) unsigned NOT NULL,
  `venueId` bigint(20) unsigned DEFAULT NULL,
  `statusId` bigint(20) unsigned NOT NULL,
  `hasLiveStatus` tinyint(1) NOT NULL DEFAULT '0',
  `rootPartId` bigint(20) unsigned NOT NULL,
  `currentPartId` bigint(20) unsigned DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `popularity` int(10) unsigned DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  `allowChildren` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `eventaction`
--

DROP TABLE IF EXISTS `eventaction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `eventaction` (
  `id` bigint(20) unsigned NOT NULL,
  `typeId` bigint(20) unsigned NOT NULL,
  `eventId` bigint(20) unsigned NOT NULL,
  `providerId` bigint(20) unsigned NOT NULL,
  `sourceId` bigint(20) unsigned NOT NULL,
  `eventPartId` bigint(20) unsigned NOT NULL,
  `paramFloat1` double DEFAULT NULL,
  `paramParticipantId1` bigint(20) unsigned DEFAULT NULL,
  `paramParticipantId2` bigint(20) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `eventactiondetail`
--

DROP TABLE IF EXISTS `eventactiondetail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `eventactiondetail` (
  `id` bigint(20) unsigned NOT NULL,
  `typeId` bigint(20) unsigned NOT NULL,
  `eventActionId` bigint(20) unsigned NOT NULL,
  `paramFloat1` double DEFAULT NULL,
  `paramFloat2` double DEFAULT NULL,
  `paramParticipantId1` bigint(20) unsigned DEFAULT NULL,
  `paramString1` varchar(255) DEFAULT NULL,
  `paramBoolean1` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `eventactiondetailtype`
--

DROP TABLE IF EXISTS `eventactiondetailtype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `eventactiondetailtype` (
  `id` bigint(20) unsigned NOT NULL,
  `name` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `hasParamFloat1` tinyint(1) DEFAULT NULL,
  `paramFloat1Description` varchar(255) DEFAULT NULL,
  `hasParamFloat2` tinyint(1) DEFAULT NULL,
  `paramFloat2Description` varchar(255) DEFAULT NULL,
  `hasParamParticipantId1` tinyint(1) DEFAULT NULL,
  `paramParticipantId1Description` varchar(255) DEFAULT NULL,
  `hasParamString1` tinyint(1) DEFAULT NULL,
  `paramString1Description` varchar(255) DEFAULT NULL,
  `paramString1PossibleValues` varchar(255) DEFAULT NULL,
  `hasParamBoolean1` tinyint(1) DEFAULT NULL,
  `paramBoolean1Description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `eventactiondetailtypeusage`
--

DROP TABLE IF EXISTS `eventactiondetailtypeusage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `eventactiondetailtypeusage` (
  `id` bigint(20) unsigned NOT NULL,
  `eventActionDetailTypeId` bigint(20) unsigned NOT NULL,
  `eventActionTypeId` bigint(20) unsigned NOT NULL,
  `sportId` bigint(20) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `eventactiontype`
--

DROP TABLE IF EXISTS `eventactiontype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `eventactiontype` (
  `id` bigint(20) unsigned NOT NULL,
  `name` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `hasParamFloat1` tinyint(1) DEFAULT NULL,
  `paramFloat1Description` varchar(255) DEFAULT NULL,
  `hasParamParticipantId1` tinyint(1) DEFAULT NULL,
  `paramParticipantId1Description` varchar(255) DEFAULT NULL,
  `hasParamParticipantId2` tinyint(1) DEFAULT NULL,
  `paramParticipantId2Description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `eventactiontypeusage`
--

DROP TABLE IF EXISTS `eventactiontypeusage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `eventactiontypeusage` (
  `id` bigint(20) unsigned NOT NULL,
  `eventActionTypeId` bigint(20) unsigned NOT NULL,
  `eventTypeId` bigint(20) unsigned NOT NULL,
  `eventPartId` bigint(20) unsigned NOT NULL,
  `sportId` bigint(20) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `eventinfo`
--

DROP TABLE IF EXISTS `eventinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `eventinfo` (
  `id` bigint(20) unsigned NOT NULL,
  `typeId` bigint(20) unsigned NOT NULL,
  `eventId` bigint(20) unsigned NOT NULL,
  `providerId` bigint(20) unsigned NOT NULL,
  `sourceId` bigint(20) unsigned NOT NULL,
  `eventPartId` bigint(20) unsigned NOT NULL,
  `paramFloat1` double DEFAULT NULL,
  `paramFloat2` double DEFAULT NULL,
  `paramParticipantId1` bigint(20) unsigned DEFAULT NULL,
  `paramParticipantId2` bigint(20) unsigned DEFAULT NULL,
  `paramEventPartId1` bigint(20) unsigned DEFAULT NULL,
  `paramString1` varchar(255) DEFAULT NULL,
  `paramBoolean1` tinyint(1) DEFAULT NULL,
  `paramEventStatusId1` bigint(20) unsigned DEFAULT NULL,
  `paramTime1` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `eventinfotype`
--

DROP TABLE IF EXISTS `eventinfotype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `eventinfotype` (
  `id` bigint(20) unsigned NOT NULL,
  `name` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `hasParamFloat1` tinyint(1) DEFAULT NULL,
  `paramFloat1Description` varchar(255) DEFAULT NULL,
  `hasParamFloat2` tinyint(1) DEFAULT NULL,
  `paramFloat2Description` varchar(255) DEFAULT NULL,
  `hasParamParticipantId1` tinyint(1) DEFAULT NULL,
  `paramParticipantId1Description` varchar(255) DEFAULT NULL,
  `hasParamParticipantId2` tinyint(1) DEFAULT NULL,
  `paramParticipantId2Description` varchar(255) DEFAULT NULL,
  `hasParamEventPartId1` tinyint(1) DEFAULT NULL,
  `paramEventPartId1Description` varchar(255) DEFAULT NULL,
  `hasParamString1` tinyint(1) DEFAULT NULL,
  `paramString1Description` varchar(255) DEFAULT NULL,
  `paramString1PossibleValues` varchar(255) DEFAULT NULL,
  `hasParamBoolean1` tinyint(1) DEFAULT NULL,
  `paramBoolean1Description` varchar(255) DEFAULT NULL,
  `hasParamEventStatusId1` tinyint(1) DEFAULT NULL,
  `paramEventStatusId1Description` varchar(255) DEFAULT NULL,
  `hasParamTime1` tinyint(1) DEFAULT NULL,
  `paramTime1Description` varchar(255) DEFAULT NULL,
  `paramParticipantIdsMustBeOrdered` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `eventinfotypeusage`
--

DROP TABLE IF EXISTS `eventinfotypeusage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `eventinfotypeusage` (
  `id` bigint(20) unsigned NOT NULL,
  `eventInfoTypeId` bigint(20) unsigned NOT NULL,
  `eventTypeId` bigint(20) unsigned NOT NULL,
  `eventPartId` bigint(20) unsigned NOT NULL,
  `sportId` bigint(20) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `eventpart`
--

DROP TABLE IF EXISTS `eventpart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `eventpart` (
  `id` bigint(20) unsigned NOT NULL,
  `name` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `parentId` bigint(20) unsigned DEFAULT NULL,
  `orderNum` int(10) unsigned NOT NULL,
  `isDrawPossible` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `eventpartdefaultusage`
--

DROP TABLE IF EXISTS `eventpartdefaultusage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `eventpartdefaultusage` (
  `id` bigint(20) unsigned NOT NULL,
  `parentEventId` bigint(20) unsigned DEFAULT NULL,
  `eventTypeId` bigint(20) unsigned DEFAULT NULL,
  `sportId` bigint(20) unsigned DEFAULT NULL,
  `rootPartId` bigint(20) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `eventparticipantinfo`
--

DROP TABLE IF EXISTS `eventparticipantinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `eventparticipantinfo` (
  `id` bigint(20) unsigned NOT NULL,
  `typeId` bigint(20) unsigned NOT NULL,
  `eventId` bigint(20) unsigned NOT NULL,
  `providerId` bigint(20) unsigned NOT NULL,
  `sourceId` bigint(20) unsigned NOT NULL,
  `eventPartId` bigint(20) unsigned NOT NULL,
  `participantId` bigint(20) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `eventparticipantinfodetail`
--

DROP TABLE IF EXISTS `eventparticipantinfodetail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `eventparticipantinfodetail` (
  `id` bigint(20) unsigned NOT NULL,
  `typeId` bigint(20) unsigned NOT NULL,
  `eventParticipantInfoId` bigint(20) unsigned NOT NULL,
  `paramFloat1` double DEFAULT NULL,
  `paramParticipantId1` bigint(20) unsigned DEFAULT NULL,
  `paramBoolean1` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `eventparticipantinfodetailtype`
--

DROP TABLE IF EXISTS `eventparticipantinfodetailtype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `eventparticipantinfodetailtype` (
  `id` bigint(20) unsigned NOT NULL,
  `name` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `hasParamFloat1` tinyint(1) DEFAULT NULL,
  `paramFloat1Description` varchar(255) DEFAULT NULL,
  `hasParamParticipantId1` tinyint(1) DEFAULT NULL,
  `paramParticipantId1Description` varchar(255) DEFAULT NULL,
  `hasParamBoolean1` tinyint(1) DEFAULT NULL,
  `paramBoolean1Description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `eventparticipantinfodetailtypeusage`
--

DROP TABLE IF EXISTS `eventparticipantinfodetailtypeusage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `eventparticipantinfodetailtypeusage` (
  `id` bigint(20) unsigned NOT NULL,
  `eventParticipantInfoDetailTypeId` bigint(20) unsigned NOT NULL,
  `eventParticipantInfoTypeId` bigint(20) unsigned NOT NULL,
  `sportId` bigint(20) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `eventparticipantinfotype`
--

DROP TABLE IF EXISTS `eventparticipantinfotype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `eventparticipantinfotype` (
  `id` bigint(20) unsigned NOT NULL,
  `name` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `eventparticipantinfotypeusage`
--

DROP TABLE IF EXISTS `eventparticipantinfotypeusage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `eventparticipantinfotypeusage` (
  `id` bigint(20) unsigned NOT NULL,
  `eventParticipantInfoTypeId` bigint(20) unsigned NOT NULL,
  `eventTypeId` bigint(20) unsigned NOT NULL,
  `eventPartId` bigint(20) unsigned NOT NULL,
  `sportId` bigint(20) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `eventparticipantrelation`
--

DROP TABLE IF EXISTS `eventparticipantrelation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `eventparticipantrelation` (
  `id` bigint(20) unsigned NOT NULL,
  `eventId` bigint(20) unsigned NOT NULL,
  `eventPartId` bigint(20) unsigned NOT NULL,
  `participantId` bigint(20) unsigned NOT NULL,
  `participantRoleId` bigint(20) unsigned NOT NULL,
  `parentParticipantId` bigint(20) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `eventparticipantrestriction`
--

DROP TABLE IF EXISTS `eventparticipantrestriction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `eventparticipantrestriction` (
  `id` bigint(20) unsigned NOT NULL,
  `eventId` bigint(20) unsigned NOT NULL,
  `participantTypeId` bigint(20) unsigned NOT NULL,
  `participantIsMale` tinyint(1) DEFAULT NULL,
  `participantMinAge` int(10) unsigned DEFAULT NULL,
  `participantMaxAge` int(10) unsigned DEFAULT NULL,
  `participantPartOfLocationId` bigint(20) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `eventstatus`
--

DROP TABLE IF EXISTS `eventstatus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `eventstatus` (
  `id` bigint(20) unsigned NOT NULL,
  `name` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `eventtemplate`
--

DROP TABLE IF EXISTS `eventtemplate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `eventtemplate` (
  `id` bigint(20) unsigned NOT NULL,
  `name` varchar(255) NOT NULL,
  `eventTypeId` bigint(20) unsigned NOT NULL,
  `sportId` bigint(20) unsigned NOT NULL,
  `url` varchar(255) DEFAULT NULL,
  `venueId` bigint(20) unsigned DEFAULT NULL,
  `rootPartId` bigint(20) unsigned DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `eventtype`
--

DROP TABLE IF EXISTS `eventtype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `eventtype` (
  `id` bigint(20) unsigned NOT NULL,
  `name` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `eventtypeusage`
--

DROP TABLE IF EXISTS `eventtypeusage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `eventtypeusage` (
  `id` bigint(20) unsigned NOT NULL,
  `eventTypeId` bigint(20) unsigned NOT NULL,
  `sportId` bigint(20) unsigned NOT NULL,
  `templateId` bigint(20) unsigned DEFAULT NULL,
  `minPrimaryParticipantTimeBetweenEvents` bigint(20) unsigned DEFAULT NULL,
  `minEventDuration` bigint(20) unsigned NOT NULL,
  `maxEventDuration` bigint(20) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `location`
--

DROP TABLE IF EXISTS `location`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `location` (
  `id` bigint(20) unsigned NOT NULL,
  `typeId` bigint(20) unsigned NOT NULL,
  `name` varchar(255) NOT NULL,
  `code` varchar(255) DEFAULT NULL,
  `isHistoric` tinyint(1) NOT NULL,
  `url` varchar(255) DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `locationrelation`
--

DROP TABLE IF EXISTS `locationrelation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `locationrelation` (
  `id` bigint(20) unsigned NOT NULL,
  `typeId` bigint(20) unsigned NOT NULL,
  `fromLocationId` bigint(20) unsigned NOT NULL,
  `toLocationId` bigint(20) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `locationrelationtype`
--

DROP TABLE IF EXISTS `locationrelationtype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `locationrelationtype` (
  `id` bigint(20) unsigned NOT NULL,
  `name` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `locationtype`
--

DROP TABLE IF EXISTS `locationtype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `locationtype` (
  `id` bigint(20) unsigned NOT NULL,
  `name` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `hasCode` tinyint(1) DEFAULT NULL,
  `codeDescription` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `locationtypeusage`
--

DROP TABLE IF EXISTS `locationtypeusage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `locationtypeusage` (
  `id` bigint(20) unsigned NOT NULL,
  `locationTypeId` bigint(20) unsigned NOT NULL,
  `sportId` bigint(20) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `outcome`
--

DROP TABLE IF EXISTS `outcome`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `outcome` (
  `id` bigint(20) unsigned NOT NULL,
  `typeId` bigint(20) unsigned NOT NULL,
  `isComplete` tinyint(1) NOT NULL,
  `isNegation` tinyint(1) NOT NULL,
  `statusId` bigint(20) unsigned NOT NULL,
  `eventId` bigint(20) unsigned NOT NULL,
  `eventPartId` bigint(20) unsigned NOT NULL,
  `paramFloat1` double DEFAULT NULL,
  `paramFloat2` double DEFAULT NULL,
  `paramFloat3` double DEFAULT NULL,
  `paramBoolean1` tinyint(1) DEFAULT NULL,
  `paramString1` varchar(255) DEFAULT NULL,
  `paramParticipantId1` bigint(20) unsigned DEFAULT NULL,
  `paramParticipantId2` bigint(20) unsigned DEFAULT NULL,
  `paramParticipantId3` bigint(20) unsigned DEFAULT NULL,
  `paramEventPartId1` bigint(20) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `outcomeparticipantrelation`
--

DROP TABLE IF EXISTS `outcomeparticipantrelation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `outcomeparticipantrelation` (
  `id` bigint(20) unsigned NOT NULL,
  `outcomeId` bigint(20) unsigned NOT NULL,
  `participantId` bigint(20) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `outcomestatus`
--

DROP TABLE IF EXISTS `outcomestatus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `outcomestatus` (
  `id` bigint(20) unsigned NOT NULL,
  `name` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `outcometype`
--

DROP TABLE IF EXISTS `outcometype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `outcometype` (
  `id` bigint(20) unsigned NOT NULL,
  `name` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `hasParamFloat1` tinyint(1) DEFAULT NULL,
  `paramFloat1Description` varchar(255) DEFAULT NULL,
  `hasParamFloat2` tinyint(1) DEFAULT NULL,
  `paramFloat2Description` varchar(255) DEFAULT NULL,
  `hasParamFloat3` tinyint(1) DEFAULT NULL,
  `paramFloat3Description` varchar(255) DEFAULT NULL,
  `hasParamBoolean1` tinyint(1) DEFAULT NULL,
  `paramBoolean1Description` varchar(255) DEFAULT NULL,
  `hasParamString1` tinyint(1) DEFAULT NULL,
  `paramString1Description` varchar(255) DEFAULT NULL,
  `paramString1PossibleValues` varchar(255) DEFAULT NULL,
  `hasParamParticipantId1` tinyint(1) DEFAULT NULL,
  `paramParticipantId1Description` varchar(255) DEFAULT NULL,
  `paramParticipant1MustBePrimary` tinyint(1) NOT NULL,
  `paramParticipant1MustBeRoot` tinyint(1) NOT NULL,
  `paramParticipant1MustHaveRoleId` bigint(20) unsigned DEFAULT NULL,
  `hasParamParticipantId2` tinyint(1) DEFAULT NULL,
  `paramParticipantId2Description` varchar(255) DEFAULT NULL,
  `paramParticipant2MustBePrimary` tinyint(1) NOT NULL,
  `paramParticipant2MustBeRoot` tinyint(1) NOT NULL,
  `paramParticipant2MustHaveRoleId` bigint(20) unsigned DEFAULT NULL,
  `hasParamParticipantId3` tinyint(1) DEFAULT NULL,
  `paramParticipantId3Description` varchar(255) DEFAULT NULL,
  `paramParticipant3MustBePrimary` tinyint(1) NOT NULL,
  `paramParticipant3MustBeRoot` tinyint(1) NOT NULL,
  `paramParticipant3MustHaveRoleId` bigint(20) unsigned DEFAULT NULL,
  `hasParamEventPartId1` tinyint(1) DEFAULT NULL,
  `paramEventPartId1Description` varchar(255) DEFAULT NULL,
  `minParticipantRelations` int(10) unsigned NOT NULL,
  `maxParticipantRelations` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `outcometypebettingtyperelation`
--

DROP TABLE IF EXISTS `outcometypebettingtyperelation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `outcometypebettingtyperelation` (
  `id` bigint(20) unsigned NOT NULL,
  `outcomeTypeId` bigint(20) unsigned NOT NULL,
  `bettingTypeId` bigint(20) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `outcometypeusage`
--

DROP TABLE IF EXISTS `outcometypeusage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `outcometypeusage` (
  `id` bigint(20) unsigned NOT NULL,
  `outcomeTypeId` bigint(20) unsigned NOT NULL,
  `eventTypeId` bigint(20) unsigned NOT NULL,
  `eventPartId` bigint(20) unsigned NOT NULL,
  `sportId` bigint(20) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `outcomevalidation`
--

DROP TABLE IF EXISTS `outcomevalidation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `outcomevalidation` (
  `id` bigint(20) unsigned NOT NULL,
  `typeId` bigint(20) unsigned NOT NULL,
  `outcomeTypeId` bigint(20) unsigned NOT NULL,
  `eventTypeId` bigint(20) unsigned NOT NULL,
  `eventPartId` bigint(20) unsigned NOT NULL,
  `sportId` bigint(20) unsigned NOT NULL,
  `paramString1` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `outcomevalidationtype`
--

DROP TABLE IF EXISTS `outcomevalidationtype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `outcomevalidationtype` (
  `id` bigint(20) unsigned NOT NULL,
  `name` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `hasParamString1` tinyint(1) DEFAULT NULL,
  `paramString1Description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `participant`
--

DROP TABLE IF EXISTS `participant`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `participant` (
  `id` bigint(20) unsigned NOT NULL,
  `typeId` bigint(20) unsigned NOT NULL,
  `name` varchar(255) NOT NULL,
  `firstName` varchar(255) DEFAULT NULL,
  `lastName` varchar(255) DEFAULT NULL,
  `isMale` tinyint(1) DEFAULT NULL,
  `birthTime` datetime DEFAULT NULL,
  `countryId` bigint(20) unsigned DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `retirementTime` datetime DEFAULT NULL,
  `lastEventParticipationTime` datetime DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `participantrelation`
--

DROP TABLE IF EXISTS `participantrelation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `participantrelation` (
  `id` bigint(20) unsigned NOT NULL,
  `typeId` bigint(20) unsigned NOT NULL,
  `fromParticipantId` bigint(20) unsigned NOT NULL,
  `toParticipantId` bigint(20) unsigned NOT NULL,
  `startTime` datetime DEFAULT NULL,
  `endTime` datetime DEFAULT NULL,
  `paramParticipantRoleId` bigint(20) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `participantrelationtype`
--

DROP TABLE IF EXISTS `participantrelationtype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `participantrelationtype` (
  `id` bigint(20) unsigned NOT NULL,
  `name` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `hasParamParticipantRoleId` tinyint(1) DEFAULT NULL,
  `paramParticipantRoleIdDescription` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `participantrole`
--

DROP TABLE IF EXISTS `participantrole`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `participantrole` (
  `id` bigint(20) unsigned NOT NULL,
  `name` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `isPrimary` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `participanttype`
--

DROP TABLE IF EXISTS `participanttype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `participanttype` (
  `id` bigint(20) unsigned NOT NULL,
  `name` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `isIndividual` tinyint(1) NOT NULL,
  `hasName` tinyint(1) DEFAULT NULL,
  `hasFirstName` tinyint(1) DEFAULT NULL,
  `hasLastName` tinyint(1) DEFAULT NULL,
  `hasIsMale` tinyint(1) DEFAULT NULL,
  `hasBirthTime` tinyint(1) DEFAULT NULL,
  `hasCountryId` tinyint(1) DEFAULT NULL,
  `hasRetirementTime` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `participanttyperoleusage`
--

DROP TABLE IF EXISTS `participanttyperoleusage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `participanttyperoleusage` (
  `id` bigint(20) unsigned NOT NULL,
  `participantTypeId` bigint(20) unsigned NOT NULL,
  `participantRoleId` bigint(20) unsigned NOT NULL,
  `sportId` bigint(20) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `participantusage`
--

DROP TABLE IF EXISTS `participantusage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `participantusage` (
  `id` bigint(20) unsigned NOT NULL,
  `participantId` bigint(20) unsigned NOT NULL,
  `sportId` bigint(20) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `provider`
--

DROP TABLE IF EXISTS `provider`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `provider` (
  `id` bigint(20) unsigned NOT NULL,
  `name` varchar(255) NOT NULL,
  `locationId` bigint(20) unsigned NOT NULL,
  `url` varchar(255) DEFAULT NULL,
  `isBookmaker` tinyint(1) NOT NULL,
  `isBettingExchange` tinyint(1) NOT NULL,
  `bettingCommissionVACs` double NOT NULL,
  `includeBettingVACs` tinyint(1) NOT NULL DEFAULT '1',
  `isLiveOddsApproved` tinyint(1) NOT NULL DEFAULT '0',
  `isNewsSource` tinyint(1) NOT NULL,
  `isEnabled` tinyint(1) NOT NULL,
  `note` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `providerentitymapping`
--

DROP TABLE IF EXISTS `providerentitymapping`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `providerentitymapping` (
  `id` bigint(20) unsigned NOT NULL,
  `providerId` bigint(20) unsigned NOT NULL,
  `providerEntityTypeId` varchar(255) NOT NULL,
  `providerEntityId` varchar(255) NOT NULL,
  `providerEntityName` varchar(255) DEFAULT NULL,
  `entityTypeId` bigint(20) unsigned NOT NULL,
  `entityId` bigint(20) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `providereventrelation`
--

DROP TABLE IF EXISTS `providereventrelation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `providereventrelation` (
  `id` bigint(20) unsigned NOT NULL,
  `providerId` bigint(20) unsigned NOT NULL,
  `eventId` bigint(20) unsigned NOT NULL,
  `startTime` datetime DEFAULT NULL,
  `endTime` datetime DEFAULT NULL,
  `timeQualityRank` int(11) NOT NULL,
  `offersLiveOdds` tinyint(1) NOT NULL,
  `offersLiveTV` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `source`
--

DROP TABLE IF EXISTS `source`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `source` (
  `id` bigint(20) unsigned NOT NULL,
  `collectorId` bigint(20) unsigned NOT NULL,
  `providerId` bigint(20) unsigned NOT NULL,
  `sourceKey` varchar(255) NOT NULL,
  `lastCollectedTime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `lastUpdatedTime` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `sport`
--

DROP TABLE IF EXISTS `sport`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sport` (
  `id` bigint(20) unsigned NOT NULL,
  `name` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `parentId` bigint(20) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `systemmessage`
--

DROP TABLE IF EXISTS `systemmessage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `systemmessage` (
  `id` bigint(20) unsigned NOT NULL,
  `typeId` bigint(20) unsigned NOT NULL,
  `description` varchar(255) NOT NULL,
  `createdTime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `paramLong1` bigint(20) DEFAULT NULL,
  `paramTime1` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `systemmessagetype`
--

DROP TABLE IF EXISTS `systemmessagetype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `systemmessagetype` (
  `id` bigint(20) unsigned NOT NULL,
  `name` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `hasParamLong1` tinyint(1) DEFAULT NULL,
  `paramLong1Description` varchar(255) DEFAULT NULL,
  `hasParamTime1` tinyint(1) DEFAULT NULL,
  `paramTime1Description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `validationwarning`
--

DROP TABLE IF EXISTS `validationwarning`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `validationwarning` (
  `id` bigint(20) unsigned NOT NULL,
  `typeId` bigint(20) unsigned NOT NULL,
  `description` varchar(255) NOT NULL,
  `createdTime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `accepted` tinyint(1) NOT NULL,
  `paramEntityId1` bigint(20) unsigned DEFAULT NULL,
  `paramEntityId2` bigint(20) unsigned DEFAULT NULL,
  `paramEntityId3` bigint(20) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `validationwarningtype`
--

DROP TABLE IF EXISTS `validationwarningtype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `validationwarningtype` (
  `id` bigint(20) unsigned NOT NULL,
  `name` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `paramEntityTypeId1` bigint(20) unsigned DEFAULT NULL,
  `paramEntityId1Description` varchar(255) DEFAULT NULL,
  `paramEntityTypeId2` bigint(20) unsigned DEFAULT NULL,
  `paramEntityId2Description` varchar(255) DEFAULT NULL,
  `paramEntityTypeId3` bigint(20) unsigned DEFAULT NULL,
  `paramEntityId3Description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-04-26  6:23:07
