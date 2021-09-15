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

CREATE TABLE `person` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `last_modified_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `age` int(11) DEFAULT NULL,
  `dob` datetime DEFAULT NULL,
  `email` varchar(255) NOT NULL,
  `is_adult` bit(1) NOT NULL,
  `mobile_number` varchar(255) DEFAULT NULL,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_fwmwi44u55bo4rvwsv0cln012` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `sbgql`.`person` (`age`,`email`,`mobile_number`,`name`,`is_adult`) VALUES (30,"example@domain.com","10987654321","jane doe",1);
