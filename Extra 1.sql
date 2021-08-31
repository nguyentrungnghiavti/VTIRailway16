DROP DATABASE IF EXISTS fresher;
CREATE DATABASE Fresher;
USE Fresher;
DROP TABLE IF EXISTS Trainee;
CREATE TABLE Trainee(
		traineeID  MEDIUMINT UNSIGNED AUTO_INCREMENT  PRIMARY KEY,
        Full_name 	NVARCHAR(50)  NOT NULL,
        Birth_date  DATE NOT NULL,
        Gender ENUM("male","female","unknown"),
        ET_IQ  TINYINT UNSIGNED CHECK(ET_IQ<=20),
        ET_math TINYINT UNSIGNED CHECK(ET_Math<=20),
        ET_English TINYINT UNSIGNED CHECK(ET_English<=50),
        Training_class VARCHAR(10) NOT NULL,
        Evalution_Notes  TEXT,
        VTI_Account  VARCHAR(50) NOT NULL UNIQUE KEY
        );
        
DROP TABLE IF EXISTS student;
CREATE TABLE Student(
		ID   MEDIUMINT  UNSIGNED AUTO_INCREMENT PRIMARY KEY,
        `name` VARCHAR(50),
        `code` CHAR(5),
        Modified_date DATETIME DEFAULT NOW()
        );
        
        
DROP TABLE IF EXISTS Teacher;
CREATE TABLE Teacher(
		ID  MEDIUMINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
        `name` VARCHAR(50) ,
        Birth_date DATE,
        Gender ENUM("0","1","unknown"),
        IsDeleteFlag BIT
        );
