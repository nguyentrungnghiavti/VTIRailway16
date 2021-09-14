USE testingsystem;
-- viet lenh de lay ra ds nhan vien va phong ban cua ho
SELECT * FROM t_Account
JOIN department USING (departmentid);

-- viet lenh de lay ra thong tin account dc tao sau ngay 20/12/2019

SELECT * FROM t_account
WHERE CreateDate > '2010-12-20';

-- viet lenh de lay ra tat ca developer

SELECT * from t_account
JOIN t_position using(positionid)
WHERE PositionName = 'dev';

-- viet lenh de lay ra cac phong ban co nhieu hon 3 nhan vien

SELECT *, COUNT(DepartmentID)AS soluong FROM t_account
JOIN department USING (departmentid)
GROUP BY DepartmentID
HAVING soluong > 3;

-- viet lenh de lay ra danh sach cau hoi co trong nhieu de thi nhat

SELECT *, COUNT(questionid) FROM examquestion
JOIN question USING (questionid)
GROUP BY QuestionID 
HAVING COUNT(QuestionID) = (SELECT COUNT(QuestionID) FROM examquestion
							GROUP BY QuestionID 
                            ORDER BY COUNT(QuestionID) DESC
                            LIMIT 1);
						
-- thong ke moi category question dc su dung trong bao nhieu cau hoi

SELECT * , COUNT(QuestionID)
FROM categoryquestion
JOIN question USING (categoryID)
GROUP BY CategoryID
ORDER BY COUNT(Questionid);

-- lay ra cau hoi co nhieu cau tra loi nhat

SELECT *, COUNT(QuestionID)
FROM answer
JOIN question USING (QuestionID)
GROUP BY QuestionID 
HAVING COUNT(QuestionID) = (SELECT COUNT(QuestionID) FROM answer
							GROUP BY answerID
                            ORDER BY COUNT(QuestionID) DESC LIMIT 1);
                            
-- thong ke so luong account trong moi group

SELECT GroupID, GroupName, COUNT(AccountID)
FROM t_group
INNER JOIN GroupAccount USING(GroupID)
GROUP BY GroupID;

-- tim chuc vu co it nguoi nhat

SELECT * , COUNT(Accountid)
FROM t_position
JOIN t_account USING (positionID)
GROUP BY PositionID
ORDER BY COUNT(accountid) ASC LIMIT 1;


-- thong ke moi phong ban co bao nhiue nhan vien
SELECT DepartmentName, COUNT(a.PositionID),positionname
FROM t_Account a 
JOIN department d ON a.DepartmentID = d.DepartmentID
JOIN t_position p ON a.PositionID = p.PositionID
GROUP BY a.DepartmentID, a.positionID;

-- lay thong tin chi tiet cua cau hoi

SELECT  q.*, a1.Fullname, a2.Content
FROM Question q
LEFT JOIN t_Account a1 ON q.CreatorID = a1.AccountID
LEFT JOIN Answer a2 USING(QuestionID)
ORDER BY QuestionID;

-- lay ra so luong cau hoi cua moi loai

SELECT TypeID,TypeName, COUNT(questionID)
FROM typequestion 
JOIN question USING(Typeid)
GROUP BY TypeID;

-- lay ra thong tin group ko co account nao

SELECT GroupID, GroupName FROM t_group
LEFT JOIN groupaccount USING (GroupID)
WHERE groupaccount.accountid IS NULL;


-- lay ra question ko co acau tra loi nao

SELECT questionid, Content,  answer.answerid
FROM question
LEFT JOIN answer USING(questionID)
WHERE answerID IS NULL;


-- lay ra cac account thuoc nhom 1 va 2 va ghep ket qua lai sao cho ko co record na otrung nhau
 select * from groupaccount
join t_account on t_account.accountID = groupaccount.accountID
WHERE groupID = 1
union 
select * from groupaccount
join t_account on t_account.accountID = groupaccount.accountID
where groupid = 2;

-- lay ra cac group co nhieu hon 5 thanh vien va  nho hon 7 thanh vien

select groupid from groupaccount
group by groupid having count(accountid)<7
UNION ALL
select accountid
from groupaccount
group by accountID having count(accountid)>5;





