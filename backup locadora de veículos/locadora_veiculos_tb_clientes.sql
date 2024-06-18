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
-- Table structure for table `tb_clientes`
--

DROP TABLE IF EXISTS `tb_clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_clientes` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) DEFAULT NULL,
  `sobrenome` varchar(100) DEFAULT NULL,
  `rg` varchar(30) DEFAULT NULL,
  `cpf` varchar(14) DEFAULT NULL,
  `email` varchar(200) NOT NULL,
  `celular` varchar(30) DEFAULT NULL,
  `cep` varchar(100) DEFAULT NULL,
  `endereco` varchar(255) DEFAULT NULL,
  `numero` int DEFAULT NULL,
  `complemento` varchar(200) DEFAULT NULL,
  `bairro` varchar(100) DEFAULT NULL,
  `cidade` varchar(100) DEFAULT NULL,
  `uf` varchar(2) DEFAULT NULL,
  `veiculo_locado` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_clientes`
--

LOCK TABLES `tb_clientes` WRITE;
/*!40000 ALTER TABLE `tb_clientes` DISABLE KEYS */;
INSERT INTO `tb_clientes` VALUES (1,'João','Silva','1234567','123.456.789-00','joao@email.com','(12) 9 9456-7890','12345-678','Rua das Flores',123,'Apto 101','Centro','São Paulo','SP',0),(2,'Maria','Santos','7654321','987.654.321-00','maria@email.com','(11) 9 9876-5432','54321-876','Av. Principal',456,'Casa 2','Bairro Novo','Rio de Janeiro','RJ',0),(3,'Carlos','Santana','9876543','456.789.123-00','carlos@email.com','(31) 9 9876-5432','54321-098','Rua das Árvores',456,'Bloco A','Jardim Botânico','Brasília','DF',0),(4,'Fernanda','Oliveira','2345678','321.654.987-00','fernanda@email.com','(11) 9 8765-4321','12345-678','Av. dos Bandeirantes',789,'Casa 3','Vila Mariana','São Paulo','SP',0),(5,'Gabriel','Silveira','8765432','987.654.321-00','gabriel@email.com','(21) 9 7654-3210','54321-987','Rua das Palmeiras',321,'Apto 202','Copacabana','Rio de Janeiro','RJ',0),(6,'José','Oliveira','4567890','456.789.012-34','jose@email.com','(41) 9 5678-9012','45678-901','Rua C',300,'Casa 303','Bairro Y','Cidade C','PR',0),(7,'Ana','Silveira','7654321','765.432.109-87','ana@email.com','(41) 9 6543-2109','76543-210','Avenida D',400,'Sala 404','Bairro Z','Cidade D','PR',0),(8,'Pedro','Cruz','2345678','234.567.890-12','pedro@email.com','(41) 9 3456-7890','23456-789','Rua E',500,'Bloco F','Bairro W','Cidade E','PR',0),(9,'Mariana','Costa','6789012','678.901.234-56','mariana@email.com','(41) 9 7890-1234','67890-123','Avenida G',600,'Loja H','Bairro V','Cidade F','PR',0),(10,'Luiz','Almeida','8901234','890.123.456-78','luiz@email.com','(41) 9 9012-3456','89012-345','Rua I',700,'Apartamento J','Bairro U','Cidade G','PR',0),(11,'Carla','Ferreira','3456789','345.678.901-23','carla@email.com','(41) 9 4567-8901','34567-890','Avenida K',800,'Cobertura L','Bairro T','Cidade H','PR',0),(12,'Marcos','Nunes','6789012','678.901.234-88','marcos@email.com','(41) 9 7890-1234','67890-123','Rua M',900,'Galpão N','Bairro S','Cidade I','PR',0),(13,'Juliana','Lima','9012345','901.234.567-89','juliana@email.com','(41) 9 9123-4567','90123-456','Avenida O',1000,'Sobrado P','Bairro R','Cidade J','PR',0),(14,'Aureliano','Ribeiro','87654321','765.432.109-01','aureliano.ribeiro@email.com','(11) 9 8765-4321','01234-567','Rua dos Girassóis',123,'Bloco C','Jardim das Flores','Campinas','SP',0),(15,'Maristela','Lima','34567890','654.321.098-02','maristela.lima@email.com','(11) 9 9234-5678','09876-543','Avenida da Praia',456,'Casa Amarela','Praia Grande','Santos','SP',1),(16,'Cleofas','Ferreira','98765432','543.210.987-03','cleofas.ferreira@email.com','(11) 9 8654-3210','05678-912','Travessa das Árvores',789,'Apartamento 2B','Bela Vista','Belo Horizonte','MG',0),(17,'Apolonio','Gomes','23456789','432.109.876-04','apolonio.gomes@email.com','(11) 9 6543-2109','02345-678','Rua do Comércio',567,'Sala 5','Industrial','Curitiba','PR',0),(18,'Léia','Pereira','67891234','321.098.765-05','leia.pereira@email.com','(11) 9 5432-1098','04567-890','Avenida das Palmeiras',890,'Bloco D','Vila Olímpia','São Paulo','SP',0),(19,'Eugênio','Santos','12345678','210.987.654-06','eugenio.santos@email.com','(11) 9 4321-0987','05678-901','Praça Central',321,'Apartamento 3C','Centro','Porto Alegre','RS',0),(20,'Loredana','Oliveira','87654321','098.765.432-07','loredana.oliveira@email.com','(11) 9 3210-9876','08976-543','Alameda dos Ipês',654,'Casa Azul','Jardim Botânico','Brasília','DF',0),(21,'Gonzalo','Martins','54321098','876.543.210-08','gonzalo.martins@email.com','(11) 9 2109-8765','01234-567','Rua das Pedras',987,'Apartamento 4A','Centro Histórico','Salvador','BA',0),(22,'Letícia','Rocha','89012345','765.432.109-09','leticia.rocha@email.com','(11) 9 1098-7654','04567-890','Travessa das Rosas',210,'Sala 7','Jardim Europa','São Paulo','SP',0),(23,'Ramon','Silva','45678901','654.321.098-10','ramon.silva@email.com','(11) 9 0987-6543','06789-012','Avenida dos Eucaliptos',543,'Bloco E','Jardim América','Goiânia','GO',0);
/*!40000 ALTER TABLE `tb_clientes` ENABLE KEYS */;
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
