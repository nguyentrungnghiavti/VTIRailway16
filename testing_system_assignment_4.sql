USE testingSystem;
-- lay ra cac phong ban
SELECT * FROM Department;
-- lay ra id cua phong ban sale
SELECT DepartmentID from department
WHERE DepartmentName = 'sale';
-- lay ra thong tin account co full name dai nhat
SELECT * FROM t_account
WHERE length(fullname) = (Select max(length(fullname)) From t_account);
-- lay ra thong tin account co fullname dai nhat thuoc phong ban co id = 3
SELECT * FROM t_account
WHERE length(fullname) = (SELECT max(length(fullname)) FROM t_account)
 AND DepartmentID = 3;
 -- lay ra ten  cua group da tham gia trc ngay 20-12-2019  
 Select groupname FROM t_group
 WHERE CreateDate < '2019-12-20';
 -- lay ra ma de thi co tg thi >=60p va dc tao trc ngay 20-12-2019
 SELECT examcode FROM exam
 WHERE duration >= 60 AND CreateDate < '2019-12-20';
 -- lay ra id cua cau hoi co tren 4 cau tra loi
 -- lay ra 5 group dc tao gan day
 SELECT * from t_group
 ORDER BY CreateDate DESC LIMIT 5;
 -- dem so nhan vien thuoc departmenid = 2
 SELECT COUNT (accountid) AS 'so nhan vien'
 From t_account
 WHERE departmentID = 2;
 -- lay ra nhan vien co ten bat dau bang chu 'D' va ket thuc bang chu 'o'
 SELECT fullname from t_account
 WHERE FullName LIKE 'D$o';
 -- xoa cac exam dc tao trc ngay 20-12-2019
 DELETE FROM exam
 WHERE CreateDate < '2019-12-20';
 -- xoa cac question co noi dung bat dau bang tu ' cau hoi'
 DELETE FROM question 
 WHERE content like 'cau hoi%';
 -- update thong tin cua accont co id=5 thanh ten nguyen ba loc va email thanh loc.nguyen@vti.com.vn
 UPDATE t_account
 SET fullname = N'nguyen ba loc' , email = 'loc.nguyen@vti.com.vn'
 WHERE AccountID = 5;
 -- update account co id=5 se thuon group co id=4
 UPDATE groupaccount
 SET  Groupid = 4 
 WHERE Groupid = 5;
 
 
 
 