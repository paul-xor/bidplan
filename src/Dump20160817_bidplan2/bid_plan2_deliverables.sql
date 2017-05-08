-- MySQL dump 10.13  Distrib 5.7.14, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: bid_plan2
-- ------------------------------------------------------
-- Server version	5.5.5-10.1.16-MariaDB

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
-- Table structure for table `deliverables`
--

DROP TABLE IF EXISTS `deliverables`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `deliverables` (
  `dID` int(11) NOT NULL AUTO_INCREMENT,
  `conTid` varchar(15) NOT NULL,
  `owner` varchar(45) NOT NULL,
  `deliverable` varchar(45) NOT NULL,
  `descreption` varchar(255) DEFAULT NULL,
  `dstart` date DEFAULT NULL,
  `dend` date DEFAULT NULL,
  `dstatus` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`dID`),
  KEY `delivTicketFK_idx` (`conTid`),
  CONSTRAINT `delivTicketFK` FOREIGN KEY (`conTid`) REFERENCES `tickets` (`tid`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `deliverables`
--

LOCK TABLES `deliverables` WRITE;
/*!40000 ALTER TABLE `deliverables` DISABLE KEYS */;
INSERT INTO `deliverables` VALUES (1,'160725CSSC43731',' Sergey Kharchenko','TSD','Technical Description','2010-08-20','2030-08-20','pending'),(2,'160725CSSC43731',' Sergey Kharchenko','TSD','Technical Description','2016-08-10','2016-08-28','pending'),(3,'160725CSSC43731',' Sergey Kharchenko','SoC','xGW reqirements.xls','2016-09-05','2016-09-15','pending'),(4,'160711CSSC43369','Viktor Golovko','SoC','General Requirements','2016-09-12','2016-09-28','on-going');
/*!40000 ALTER TABLE `deliverables` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-08-17 15:26:47
