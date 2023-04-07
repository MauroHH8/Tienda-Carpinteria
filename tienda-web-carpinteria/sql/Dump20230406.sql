CREATE DATABASE  IF NOT EXISTS `tienda_carpinteria` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `tienda_carpinteria`;
-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: tienda_carpinteria
-- ------------------------------------------------------
-- Server version	8.0.30

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
-- Table structure for table `categories`
--

DROP TABLE IF EXISTS `categories`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categories` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `date_created` datetime(6) NOT NULL,
  `name` varchar(255) NOT NULL,
  `parent_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_t8o6pivur7nn124jehx7cygw5` (`name`),
  KEY `FKsaok720gsu4u2wrgbk10b5n8d` (`parent_id`),
  CONSTRAINT `FKsaok720gsu4u2wrgbk10b5n8d` FOREIGN KEY (`parent_id`) REFERENCES `categories` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categories`
--

LOCK TABLES `categories` WRITE;
/*!40000 ALTER TABLE `categories` DISABLE KEYS */;
INSERT INTO `categories` VALUES (1,'2023-01-01 00:00:00.000000','Cajas',NULL),(2,'2023-01-01 00:00:00.000000','Organizadores',NULL),(3,'2023-01-01 00:00:00.000000','Letras',NULL),(4,'2023-01-01 00:00:00.000000','Lapiceros',NULL),(5,'2023-01-01 00:00:00.000000','Bandejas',NULL);
/*!40000 ALTER TABLE `categories` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (6);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order_details`
--

DROP TABLE IF EXISTS `order_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `order_details` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `date_created` datetime(6) DEFAULT NULL,
  `date_deleted` datetime(6) DEFAULT NULL,
  `price` decimal(19,2) NOT NULL,
  `quantity` decimal(19,2) NOT NULL,
  `order_id` bigint DEFAULT NULL,
  `product_id` bigint DEFAULT NULL,
  `user` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKjyu2qbqt8gnvno9oe9j2s2ldk` (`order_id`),
  KEY `FK4q98utpd73imf4yhttm3w0eax` (`product_id`),
  KEY `FKlbtu2wmfdj4g6gdarwtyhfmjd` (`user`),
  CONSTRAINT `FK4q98utpd73imf4yhttm3w0eax` FOREIGN KEY (`product_id`) REFERENCES `products` (`id`),
  CONSTRAINT `FKjyu2qbqt8gnvno9oe9j2s2ldk` FOREIGN KEY (`order_id`) REFERENCES `orders` (`id`),
  CONSTRAINT `FKlbtu2wmfdj4g6gdarwtyhfmjd` FOREIGN KEY (`user`) REFERENCES `users` (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order_details`
--

LOCK TABLES `order_details` WRITE;
/*!40000 ALTER TABLE `order_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `order_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orders` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `date_created` datetime(6) NOT NULL,
  `date_deleted` datetime(6) DEFAULT NULL,
  `price` decimal(19,2) NOT NULL,
  `user_dni` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKppr2k35qakscaurxc7rq30of3` (`user_dni`),
  CONSTRAINT `FKppr2k35qakscaurxc7rq30of3` FOREIGN KEY (`user_dni`) REFERENCES `users` (`dni`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (5,'2023-04-06 18:21:40.151000',NULL,650.00,39768978),(6,'2023-04-06 18:26:30.431000',NULL,750.00,39768978),(7,'2023-04-06 18:30:04.635000',NULL,750.00,39768978),(8,'2023-04-06 20:24:47.405000',NULL,0.00,39768978),(9,'2023-04-06 21:22:35.481000',NULL,0.00,39768978);
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `products` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `date_created` datetime(6) NOT NULL,
  `description` varchar(255) NOT NULL,
  `price` decimal(19,2) NOT NULL,
  `quantity` int NOT NULL,
  `category_id` bigint NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_8nj97xe4vc5jmbxk2skrr0fam` (`description`),
  KEY `FKog2rp4qthbtt2lfyhfo32lsw9` (`category_id`),
  CONSTRAINT `FKog2rp4qthbtt2lfyhfo32lsw9` FOREIGN KEY (`category_id`) REFERENCES `categories` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES (1,'2023-01-01 00:00:00.000000','Caja tapa zapato 20 x 20',650.00,101,1),(2,'2023-01-01 00:00:00.000000','Caja tapa zapato calada 20 x 20',750.00,53,1),(3,'2023-01-01 00:00:00.000000','Caja de te 20 x 20',800.00,10,1),(5,'2023-01-01 00:00:00.000000','Bandeja 30 x 40 asa redonda',450.00,208,5),(6,'2023-01-01 00:00:00.000000','Bandeja 30 x 40 asa recta',500.00,180,5),(7,'2023-01-01 00:00:00.000000','Organizador inclinado 30 x 20',1800.00,50,2),(8,'2023-01-01 00:00:00.000000','Portacuadernos chico',300.00,22,2),(9,'2023-01-01 00:00:00.000000','Cajonera horizontal de 3',1200.00,15,2),(10,'2023-01-01 00:00:00.000000','Cajonera vertical de 6',1800.00,8,2),(11,'2023-01-01 00:00:00.000000','Lapicero recto',100.00,31,4),(12,'2023-01-01 00:00:00.000000','Lapicero mickey',280.00,30,4),(13,'2023-01-01 00:00:00.000000','Lapicero conejo',200.00,12,4),(14,'2023-01-01 00:00:00.000000','Letras bajas',300.00,100,3),(15,'2023-01-01 00:00:00.000000','Letras altas',400.00,100,3),(16,'2023-01-01 00:00:00.000000','Cartel con nombre',730.00,5,3);
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `dni` int NOT NULL,
  `address` varchar(255) NOT NULL,
  `date_created` datetime(6) NOT NULL,
  `date_deleted` datetime(6) DEFAULT NULL,
  `dob` datetime(6) DEFAULT NULL,
  `email` varchar(255) NOT NULL,
  `first_name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `role` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`dni`),
  UNIQUE KEY `UK_6dotkott2kjsp8vw4d0m25fb7` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (11111111,'admin','2023-03-20 00:38:55.068000',NULL,'2023-01-01 00:00:00.000000','admin@admin.com','admin','User','admin2023','ROLE_ADMIN'),(20124354,'Alvear 450','2023-04-06 13:59:57.960000',NULL,NULL,'albert450@gmail.com','Roberto','Gimenez','123456789',NULL),(39768978,'Peron 805','2023-05-01 00:00:00.000000',NULL,'1996-07-20 00:00:00.000000','mauroh1996@gmail.com','Mauro','Herrera','abcdefg','ROLE_USER'),(39786552,'Castelli 500','2023-05-01 00:00:00.000000',NULL,'1997-08-25 00:00:00.000000','camialvarez97@gmail.com','Camila','Alvarez','qwertyuiop','ROLE_USER'),(40000000,'Centenario 200','2023-04-06 14:50:37.397000',NULL,NULL,'sabrina90@gmail.com','Sabrina','Lopez','55555555','ROLE_USER'),(45000236,'Rivadavia 260','2023-05-01 00:00:00.000000',NULL,'2000-08-25 00:00:00.000000','adrian_quintana08@hotmail.com','Adrian','Quintana','1234567','ROLE_USER'),(50000000,'Gutierrez 1000','2023-04-06 15:06:40.725000',NULL,NULL,'macariv@gmail.com','Maca','Rivero','123456789',NULL),(58232145,'Santa Fe 20','2023-04-06 15:14:56.818000',NULL,NULL,'roquepena@gmail.com','Roque','Pena','123456789','ROLE_USER');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-04-06 22:02:53
