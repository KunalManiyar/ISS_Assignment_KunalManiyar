-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: practicedb
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `dept`
--

DROP TABLE IF EXISTS `dept`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dept` (
  `DeptId` int NOT NULL,
  `DeptName` varchar(255) NOT NULL,
  PRIMARY KEY (`DeptId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dept`
--

LOCK TABLES `dept` WRITE;
/*!40000 ALTER TABLE `dept` DISABLE KEYS */;
INSERT INTO `dept` VALUES (1,'IT'),(2,'Finance'),(3,'Marketing');
/*!40000 ALTER TABLE `dept` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `EmployeeID` int NOT NULL AUTO_INCREMENT,
  `fname` varchar(255) NOT NULL,
  `LastName` varchar(255) NOT NULL,
  `Age` int NOT NULL,
  `City` varchar(255) NOT NULL,
  `DeptId` int DEFAULT NULL,
  PRIMARY KEY (`EmployeeID`),
  KEY `DeptId` (`DeptId`),
  CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`DeptId`) REFERENCES `dept` (`DeptId`),
  CONSTRAINT `employee_chk_1` CHECK ((`Age` >= 18))
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1,'Raj','Sheth',22,'Mumbai',1),(2,'Mitesh','Shah',25,'Jaipur',2),(3,'Virag','Kapadia',23,'Mumbai',3),(4,'Vikram','Sharma',22,'Pune',1),(5,'Vishal','Trivedi',30,'Ahmedabad',2),(7,'Kunal','Kathrani',22,'Mumbai',1),(8,'Mayank','Agarwal',35,'Chennai',3),(9,'Manan','Savla',27,'Mumbai',2);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employeecopy`
--

DROP TABLE IF EXISTS `employeecopy`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employeecopy` (
  `FirstName` varchar(255) NOT NULL,
  `LastName` varchar(255) NOT NULL,
  `Age` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employeecopy`
--

LOCK TABLES `employeecopy` WRITE;
/*!40000 ALTER TABLE `employeecopy` DISABLE KEYS */;
INSERT INTO `employeecopy` VALUES ('Raj','Sheth',22),('Mitesh','Shah',25),('Virag','Kapadia',23),('Vikram','Sharma',22),('Vishal','Trivedi',30);
/*!40000 ALTER TABLE `employeecopy` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `employeesalary`
--

DROP TABLE IF EXISTS `employeesalary`;
/*!50001 DROP VIEW IF EXISTS `employeesalary`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `employeesalary` AS SELECT 
 1 AS `fname`,
 1 AS `LastName`,
 1 AS `Salary`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `salary`
--

DROP TABLE IF EXISTS `salary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `salary` (
  `Id` int NOT NULL AUTO_INCREMENT,
  `EmployeeId` int DEFAULT NULL,
  `Salary` int NOT NULL,
  PRIMARY KEY (`Id`),
  KEY `EmployeeId` (`EmployeeId`),
  CONSTRAINT `salary_ibfk_1` FOREIGN KEY (`EmployeeId`) REFERENCES `employee` (`EmployeeID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salary`
--

LOCK TABLES `salary` WRITE;
/*!40000 ALTER TABLE `salary` DISABLE KEYS */;
INSERT INTO `salary` VALUES (1,1,30000),(2,2,40000),(3,3,15000),(4,4,10000),(5,5,50000);
/*!40000 ALTER TABLE `salary` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Final view structure for view `employeesalary`
--

/*!50001 DROP VIEW IF EXISTS `employeesalary`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `employeesalary` AS select `employee`.`fname` AS `fname`,`employee`.`LastName` AS `LastName`,`salary`.`Salary` AS `Salary` from (`salary` left join `employee` on((`employee`.`EmployeeID` = `salary`.`EmployeeId`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-12-28 22:23:22
