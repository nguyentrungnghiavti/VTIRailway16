DROP DATABASE IF EXISTS TestingSystem;
CREATE DATABASE TestingSystem;
USE TestingSystem;
CREATE TABLE Department(
	DepartmentID  INT,
	DepartmentName  VARCHAR(50)
    );
CREATE TABLE t_position(
	PositionID  INT,
    PositionName VARCHAR(50)
    );
CREATE TABLE T_account(
	AccountID INT,
    Email   VARCHAR(100),
    Username VARCHAR(100),
	FullName VARCHAR(100),
	DepartmentID INT,
	PositionID   INT,
    CreateDate DATE
    );
CREATE TABLE t_group(
	GroupID INT,
    GroupName VARCHAR(100),
    CreatorID INT,
    CreateDate DATE
    );
CREATE TABLE GroupAccount(
	groupID INT,
    accountID INT,
    JoinDate DATE
    );
CREATE TABLE Typequestion(
	TypeID  INT,
    TypeName VARCHAR(50)
    );
CREATE TABLE CategoryQuestion(
	CategoryID  INT,
    CategoryName VARCHAR(50)
    );
CREATE TABLE Question(
	QuestionID INT,
    Content VARCHAR(200),
    CategoryID INT,
    TypeID  INT,
    CreatorID INT,
    CreateDate DATE
    );
CREATE TABLE Answer(
	AnswerID INT,
    Content VARCHAR(200),
    QuetionID INT,
    isCorrect VARCHAR(10)
    );
CREATE TABLE Exam(
	ExamID INT,
    ExamCode INT,
    title VARCHAR(200),
    CategoryID INT,
    Duration TIME,
    CreatorID INT,
    CreateDate DATE
    );
CREATE TABLE ExamQuestion(
	ExamID INT,
    QuestionID INT
    );

    
    
    