DROP DATABASE IF EXISTS trello_db;
CREATE DATABASE trello_db;
CREATE USER IF NOT EXISTS 'trello'@'localhost' IDENTIFIED BY 'trello';
GRANT ALL PRIVILEGES ON trello_db.* TO 'trello'@'localhost';
FLUSH PRIVILEGES;

USE trello_db;
ALTER DATABASE trello_db CHARACTER SET utf8 COLLATE utf8_general_ci;

CREATE TABLE IF NOT EXISTS `Board` (
  `BoardID` Integer NOT NULL AUTO_INCREMENT,
  `Title` Varchar(255),
  `Position` Integer NOT NULL,
  PRIMARY KEY (`BoardID`)
);

CREATE TABLE IF NOT EXISTS `Task` (
  `TaskID` Integer NOT NULL AUTO_INCREMENT,
  `BoardID` Integer NOT NULL,
  `Title` Varchar(255),
  `Description` Varchar (1000),
  PRIMARY KEY (`TaskID`),
  FOREIGN KEY (`BoardID`)
  REFERENCES Board(`BoardID`)
);



