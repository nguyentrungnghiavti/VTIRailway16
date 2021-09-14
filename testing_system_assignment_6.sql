use testingsystem;
-- tao view chua danh sach nv thuoc phong ban sales
DROP VIEW IF EXISTS sales;
CREATE VIEW sales AS 
SELECT * FROM t_account
JOIN department USING(departmentid)
WHERE DepartmentName = 'sales';

SELECT * FROM Sales;

-- tao view chua thong tin account tham gia nhieu group nhat

DROP VIEW IF EXISTS thamlam;
CREATE VIEW thamlam AS
SELECT * FROM t_account
JOIN groupaccount USING(Accountid)
GROUP BY AccountID
HAVING COUNT(AccountID) = (SELECT COUNT(AccountID)
							FROM `GroupAccount` 
							INNER JOIN t_account USING(AccountID)
							GROUP BY AccountID
                            ORDER BY COUNT(AccountID) DESC
                            LIMIT 1);
						
                        
                        
-- tao view chua nhung cau hoi qua dai va xoa no di


DROP VIEW IF EXISTS daiqua;
CREATE VIEW daiqua AS
SELECT * FROM question
WHERE length(content) > 20;

SET foreign_key_checks = 0;
DELETE  from daiqua;


-- tao view chua danh sach phong ban co nhieu nhan vien nhat\

DROP VIEW IF EXISTS dongvui;
CREATE VIEW dongvui AS
SELECT *, COUNT(departmentid), GROUP_CONCAT(AccountID)
FROM t_account
JOIN department using (departmentid)
GROUP BY DepartmentID
having COUNT(DepartmentID) = (SELECT  COUNT(DepartmentID) FROM t_account
                          
                            GROUP BY DepartmentID
                            ORDER BY  COUNT(DepartmentID) DESC LIMIT 1 );
		
        
	-- tao view chua dah sach cau hoi do nguoi ho nguyen tao
    
    DROP VIEW IF EXISTS nguyen;
    CREATE VIEW nguyen AS
    SELECT QuestionID,Content,FullName FROM question
    JOIN t_account ON question.CreatorID = t_account.AccountID
    WHERE substring_index(Fullname,' ',1) = 'Nguyen';
    
            