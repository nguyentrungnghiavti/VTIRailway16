USE Testingsystem;

-- tao ham thu tuc de nguoi dung nhap vao ten phong ban va in ra tat ca account thuoc phong ban do

DROP PROCEDURE IF EXISTS getacc;
DELIMITER $$
CREATE PROCEDURE getacc(IN Dep_name NVARCHAR(50))
BEGIN
	SELECT *, departmentname
    FROM t_account
    JOIN department USING (departmentid)
    WHERE DepartmentName = dep_name;
    END $$
DELIMITER ;

-- tao ham thu tuc in ra so luong account trong moi group
DROP PROCEDURE IF EXISTS demacc;
DELIMITER $$
CREATE PROCEDURE demacc()
BEGIN
SELECT groupname, COUNT(accountid)
FROM groupaccount
JOIN t_group USING (groupid)
GROUP BY accountid;
END $$
DELIMITER ;

-- tao ham thu tuc thong ke moi loai cau hoi co bao nhieu cau dc tao trong thang hien tai

DROP PROCEDURE IF EXISTS CountQuestionTypeWithMonth;
DELIMITER //
CREATE PROCEDURE demcauhoi()
BEGIN  
      SELECT TypeName, COUNT(TypeID)
      FROM Question 
      JOIN TypeQuestion  USING (typeID1)
      WHERE Month(CreateDate) = Month(now()) AND Year(Q.CreateDate) = Year(now())
      GROUP BY TypeID;
      END//
DELIMITER ;

-- tao ham thu tuc de tra ra id cua loai cau hoi co nhieu cau hoi nhat
DROP PROCEDURE IF EXISTS lol;
DELIMITER $$
CREATE PROCEDURE lol ()
BEGIN
SELECT *, COUNT(typeid)
 FROM question
JOIN typequestion USING (typeid)
GROUP BY typeid
HAVING COUNT(TypeID) = (SELECT COUNT(typeid) AS soluong
						from question 
                        GROUP BY typeid
                        ORDER BY typeid desc LIMIT 1);
END $$
DELIMITER ;


-- su dung ham da tao o cau 4 de tim ra ten cua loai cau hoi do

DROP PROCEDURE IF EXISTS lol;
DELIMITER $$
CREATE PROCEDURE lol2 ()
BEGIN
SELECT TypeName, COUNT(typeid)
 FROM question
JOIN typequestion USING (typeid)
GROUP BY typeid
HAVING COUNT(TypeID) = (SELECT COUNT(typeid) AS soluong
						from question 
                        GROUP BY typeid
                        ORDER BY typeid desc LIMIT 1);
END $$
DELIMITER ;
-- viet ham thu tuc cho pphep nguoi dung nhap vao 1 chuoi va tra ve group co ten
-- chuoi cua nguoi dung nhap vao hoac tra ve user co user name chua chuoi cua nguoi dung nhap vao

 DROP PROCEDURE IF EXISTS nhapvao;
 DELIMITER $$
 CREATE PROCEDURE nhapvao (IN nhapvao VARCHAR(100))
 BEGIN 
  SELECT groupname FROM t_group
  WHERE t_group.GroupName  LIKE CONCAT("%",nhapvao,"%")
  UNION
  SELECT username FROM t_Account
  WHERE t_account.Username LIKE CONCAT ("%",nhapvao,"%");
  END $$
  DELIMITER ;
  
  
  -- Viết 1 store cho phép người dùng nhập vào thông tin fullName, email và
-- trong store sẽ tự động gán:

-- username sẽ giống email nhưng bỏ phần @..mail đi
-- positionID: sẽ có default là developer
-- departmentID: sẽ được cho vào 1 phòng chờ

-- Sau đó in ra kết quả tạo thành công

DROP PROCEDURE IF EXISTS	InsertInformation;
DELIMITER //
CREATE PROCEDURE InsertInformation( IN Emails VARCHAR(50),
									IN FullNames VARCHAR(50))
                                    
		BEGIN 
				DECLARE Usernames VARCHAR(50) DEFAULT SUBSTRING_INDEX(Emails, '@', 1); 
                DECLARE DepartmentIDs  TINYINT UNSIGNED DEFAULT 11; 
                DECLARE PositionIDs TINYINT UNSIGNED DEFAULT 1; 
				DECLARE CreateDates DATETIME DEFAULT now();
		INSERT INTO t_account (`Email`,   `Username`,  `FullName`,   `DepartmentID`,    `PositionID`,    `CreateDate`)  
        VALUES       (Emails,     Usernames,      Fullnames,          DepartmentIDs,          PositionIDs,         CreateDates); 
        
        END//
DELIMITER ;

-- tao ham thu tuc cho nguoi dung nhap vao loai cau hoi de xuat ra cau hoi daai nhat cua moi loai
DROP PROCEDURE IF EXISTS cauhoidai;
DELIMITER //
CREATE PROCEDURE cauhoidai(IN loaicauhoi NVARCHAR(50))
BEGIN 
	SELECT 
		question.Content AS LongestContent
	FROM
		question
	JOIN
		typequestion ON typequestion.TypeID = question.TypeID
	WHERE typequestion.TypeName = v_type_question
	HAVING LENGTH(question.Content)  = MAX(LENGTH(question.Content));
    
END//
DELIMITER ;

-- tao ham thu tuc cho phep xoa cau hoi bang id
DROP PROCEDURE IF EXISTS xoacauhoi;
DELIMITER //
CREATE PROCEDURE xoacauhoi(IN cauhoicanxoa SMALLINT)
BEGIN 
	DELETE FROM exam
    WHERE ExamID = cauhoicanxoa;
END//
DELIMITER ;

-- dem so cau hoi dc tao trong moi thang 
 DROP PROCEDURE IF EXISTS cauhoicuathang;
DELIMITER //
CREATE PROCEDURE cauhoicuathang()
BEGIN 
	SELECT 
		COUNT(QuestionID) AS cauhoicuathang
	FROM
		question
	WHERE
		MONTH(CreateDate) = MONTH(NOW())
	GROUP BY MONTH(CreateDate);
END//
DELIMITER ;
