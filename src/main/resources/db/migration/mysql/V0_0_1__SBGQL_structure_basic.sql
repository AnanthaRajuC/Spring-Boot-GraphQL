/*
 * Engine: MySQL
 * Version: 0.0.1
 * Description: Initial database structure
 */

/*
-- create schema
CREATE SCHEMA sbgql;

-- use schema
USE sbgql;

-- Create user 
create user 'sbgql'@'localhost' identified by 'sbgql';

-- Grant privileges to user
grant all privileges on *.* to 'sbgql'@'localhost' with grant option;
 */

--
-- Table structure for table `person`
--

CREATE TABLE `person` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `last_modified_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `age` integer(11) DEFAULT NULL,
  `date_of_birth` date DEFAULT NULL,
  `email` varchar(255) NOT NULL,
  `is_adult` bit(1) NOT NULL,
  `mobile_number` varchar(255) DEFAULT NULL,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_fwmwi44u55bo4rvwsv0cln012` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Table structure for table `books`
--

CREATE TABLE `books` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `last_modified_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `title` varchar(255) NOT NULL,
  `person_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK5w75tx731o2t3abhgesnobgih` (`person_id`),
  CONSTRAINT `FK5w75tx731o2t3abhgesnobgih` FOREIGN KEY (`person_id`) REFERENCES `person` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*
 * Data
 */

INSERT INTO `sbgql`.`person` (`age`,`email`,`mobile_number`,`name`,`is_adult`,`date_of_birth`) VALUES (30,"example1@domain1.com","10987654321","jane doe",1,"2021-09-16");
INSERT INTO `sbgql`.`person` (`age`,`email`,`mobile_number`,`name`,`is_adult`,`date_of_birth`) VALUES (28,"example2@domain2.com","10987654322","john doe",1,"1992-09-15");

/*
 * Data
 */

INSERT INTO `sbgql`.`books` (`title`,`person_id`) VALUES ("book1",1);
INSERT INTO `sbgql`.`books` (`title`,`person_id`) VALUES ("book2",1);
