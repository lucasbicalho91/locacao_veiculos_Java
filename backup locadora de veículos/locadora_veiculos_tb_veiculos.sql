-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: locadora_veiculos
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
-- Table structure for table `tb_veiculos`
--

DROP TABLE IF EXISTS `tb_veiculos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_veiculos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `marca` varchar(50) NOT NULL,
  `modelo` varchar(50) NOT NULL,
  `categoria` varchar(50) DEFAULT NULL,
  `placa` varchar(10) NOT NULL,
  `ano` int NOT NULL,
  `valor_compra` decimal(10,2) NOT NULL,
  `tipo_veiculo` varchar(50) NOT NULL,
  `estado` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_veiculos`
--

LOCK TABLES `tb_veiculos` WRITE;
/*!40000 ALTER TABLE `tb_veiculos` DISABLE KEYS */;
INSERT INTO `tb_veiculos` VALUES (1,'Honda','CG_160','Popular','MNO-7890',2021,10000.00,'Motocicleta','Disponível'),(2,'Yamaha','Ninja_400','Luxo','PQR-1234',2022,20000.00,'Motocicleta','Disponível'),(3,'Suzuki','GSX_R1000','Luxo','EFG-1234',2023,30000.00,'Motocicleta','Disponível'),(4,'Kawasaki','Ninja_H2','Luxo','HIJ-5678',2022,40000.00,'Motocicleta','Vendido'),(5,'Toyota','Corolla','Intermediário','STU-4567',2022,75000.00,'Automóvel','Disponível'),(6,'Hyundai','Creta','Intermediário','VWX-8901',2023,80000.00,'Automóvel','Disponível'),(7,'Renault','Master','Luxo','YZA-2345',2021,100000.00,'Van','Disponível'),(8,'Peugeot','Expert','Luxo','BCD-6789',2020,95000.00,'Van','Disponível'),(9,'Volkswagen','Polo','Popular','ABC-1234',2023,60000.00,'Automóvel','Disponível'),(10,'Chevrolet','Onix','Popular','DEF-5678',2022,55000.00,'Automóvel','Disponível'),(11,'Fiat','Ducato','Luxo','GHI-9012',2020,120000.00,'Van','Disponível'),(12,'Mercedes','Sprinter','Luxo','JKL-3456',2021,150000.00,'Van','Locado'),(13,'Volkswagen','Polo','Intermediário','ABC-1234',2022,65000.00,'Automóvel','Disponível'),(14,'Chevrolet','Onix','Popular','DEF-5678',2023,55000.00,'Automóvel','Disponível'),(15,'Fiat','Strada','Luxo','GHI-9012',2021,75000.00,'Automóvel','Disponível'),(16,'Renault','Kwid','Popular','AAV-0090',2022,50650.00,'Automóvel','Disponível'),(17,'Honda','Biz','Popular','UHU-8728',2016,9860.60,'Motocicleta','Disponível'),(18,'Fiat','Ducato','Intermediário','OOI-4307',2020,120980.80,'Van','Disponível'),(19,'Chevrolet','Onix','Intermediário','LKL-0988',2023,70900.00,'Automóvel','Disponível'),(20,'Chevrolet','Onix','Intermediário','AAA-1758  ',2023,80000.00,'Automóvel','Vendido'),(21,'Volkswagen','Polo','Intermediário','RRE-4565',2022,65230.30,'Automóvel','Disponível'),(22,'Suzuki','Fazer_250','Popular','PLL-6985',2015,20200.00,'Motocicleta','Disponível'),(23,'Fiat','Argo','Popular','RRT-4532',2020,60600.00,'Automóvel','Vendido'),(24,'Chevrolet','Onix','Intermediário','SFW-4365',2016,60000.00,'Automóvel','Disponível'),(25,'Citroën','C3','Luxo','RED-4445',2023,50600.30,'Automóvel','Disponível'),(26,'Nissan','Kicks','Popular','JNT-6765',2015,63000.00,'Automóvel','Disponível'),(27,'Chevrolet','Onix','Luxo','FSF-4353',2016,60000.00,'Automóvel','Vendido');
/*!40000 ALTER TABLE `tb_veiculos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-18 10:05:45
