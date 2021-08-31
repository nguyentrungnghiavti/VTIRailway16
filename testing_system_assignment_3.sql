USE TestingSystem;
INSERT INTO Department(departmentname)
VALUES  	(N'Bảo vệ'),
			(N'Nhân viên'),
            (N'Sales'),
            (N'Giám đốc'),
			(N'Lao công');
            
INSERT INTO t_position(positionname)
VALUES 		('Dev'),
			('test'),
            ('Scrum master'),
            ('PM');
            
INSERT INTO t_account(Email,				username,				fullname,					departmentID,					positionID)
VALUES 				('ntn01@gmail.com',		'ntn1',					'nguyentrungnghia',				'1',								'2'),
					('ntn02@gmail.com',		'ntn2',					'nguyenthanhnam',				'2',								'3'),
                    ('ntn03@gmail.com',		'ntn3',					'nguyentrongnhan',				'3',								'4'),
                    ('ntn4@gmail.com',		'ntn4', 				'nguyentrucnhan',				'4',								'1'),
                    ('ntn5@gmail.com',		'ntn5',					'nguyenthjennhan',				'5',								'2');
                    
INSERT INTO t_group (		GroupName,				creatorID)
VALUES				(		'java',						'1'),
					(		'c',						'2'),
                    (		'c#',						'3'),
                    (		'python',					'4'),
                    (		'PHP',						'5');
                    
INSERT INTO	groupaccount(groupId,			accountId,				joindate)
VALUES					('1',				'1',						'2020-01-01'),
						('2',				'3',						'2015-02-01'),
                        ('3',				'3',						'2021-01-05'),
                        ('4',				'2',						'2019-06-08'),
                        ('5',				'4',						'2017-10-10');
                        
INSERT INTO Typequestion( typename)
VALUES					('essay'),
						('multiple-choice');

INSERT INTO categoryquestion(Categoryname)
VALUES					('JAVA'),
						('Net'),
                        ('SQL'),
                        ('Postman'),
                        ('AI');
                        
INSERT INTO Question(content,			CategoryID,			TypeId,				CreatorID,				createdate)
VALUES				('abcx',				'1',				'1', 				'1',					'2020-01-12'),
					('axasd',				'2',				'2',				'1',					'2012-01-04'),
                    ('asdsa',				'2',				'1',				'4',					'2014-04-04'),
                    ('dasdsa',				'5',				'2',				'2',					'2002-02-21'),
                    ('sadsa',				'4',				'1',				'3',					'2011-01-08');
INSERT  INTO Answer(content,			questionID,			iscorrect)
VALUES				('dsa','1',0),
					('das','2',1),
                    ('adq','3',0),
                    ('sadsa','4',''),
                    ('sad','5',0);

                    

INSERT INTO Exam(examcode,				title,				categoryid,			duration,			creatorID,			Createdate)
VALUES  		('1',					'tn',					'1',				'45',				'1'	,			'2020-10-15'),
				('2',        			'tk',					'1',				'50',				'2',			'2020-11-10'),
                ('3',					'tx',					'2',				'10',				'3',			'2020-05-05'),
                ('4',					'tq',					'3',				'44',				'4',			'2020-12-11'),
                ('5',					'tw',					'4',				'20',				'5',			'2021-12-10');

INSERT INTO examquestion(ExamID, 		QuestionID)
VAlues ('1','2'),
		('2','2'),
		('3','1'),
        ('2','5'),
        ('4','4');

