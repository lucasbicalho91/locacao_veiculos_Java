-- MariaDB dump 10.19  Distrib 10.4.28-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: locadora_veiculos
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
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
/*!40101 SET character_set_client = utf8 */;
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

--
-- Table structure for table `tb_funcionarios`
--

DROP TABLE IF EXISTS `tb_funcionarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_funcionarios` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) DEFAULT NULL,
  `sobrenome` varchar(100) DEFAULT NULL,
  `email` varchar(200) NOT NULL,
  `senha` varchar(10) NOT NULL,
  `cargo` varchar(100) DEFAULT NULL,
  `celular` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_funcionarios`
--

LOCK TABLES `tb_funcionarios` WRITE;
/*!40000 ALTER TABLE `tb_funcionarios` DISABLE KEYS */;
INSERT INTO `tb_funcionarios` VALUES (1,'Ana','Oliveira','ana@mail.com','senha123','Gerente','(21) 9 9876-5432'),(5,'Rafael','Wendersen','rafael@mail.com','123456','Atendente','(41) 9 9854-6113'),(6,'Pedro','Souza','pedro@mail.com','senha456','Vendedor','(45) 9 9865-4212');
/*!40000 ALTER TABLE `tb_funcionarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_locacao`
--

DROP TABLE IF EXISTS `tb_locacao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_locacao` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_cliente` int NOT NULL,
  `id_veiculo` int NOT NULL,
  `dias` int NOT NULL,
  `valor` double NOT NULL,
  `data_locacao` date NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_cliente` (`id_cliente`),
  KEY `id_veiculo` (`id_veiculo`),
  CONSTRAINT `tb_locacao_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `tb_clientes` (`id`),
  CONSTRAINT `tb_locacao_ibfk_2` FOREIGN KEY (`id_veiculo`) REFERENCES `tb_veiculos` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_locacao`
--

LOCK TABLES `tb_locacao` WRITE;
/*!40000 ALTER TABLE `tb_locacao` DISABLE KEYS */;
INSERT INTO `tb_locacao` VALUES (14,15,12,20,12000,'2024-06-09');
/*!40000 ALTER TABLE `tb_locacao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_veiculos`
--

DROP TABLE IF EXISTS `tb_veiculos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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

-- Dump completed on 2024-06-18 10:27:12
