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
  `id` bigint(20) PRIMARY KEY AUTO_INCREMENT,
  `created_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `last_modified_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `age` integer(11) DEFAULT NULL,
  `date_of_birth` date DEFAULT NULL,
  `email` varchar(255) NOT NULL,
  `is_adult` bit(1) NOT NULL,
  `mobile_number` varchar(255) DEFAULT NULL,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO `person` (`age`,`email`,`mobile_number`,`name`,`is_adult`,`date_of_birth`) VALUES (30,'example1@domain1.com','10987654321','jane doe',1,'1989-08-16');
INSERT INTO `person` (`age`,`email`,`mobile_number`,`name`,`is_adult`,`date_of_birth`) VALUES (28,'example2@domain2.com','10987654322','John doe',0,'1992-09-15');

