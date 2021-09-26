package Assignment1;
import java.util.Date;


	
		




		public class Program {

			
			
			public static void main(String[] args) {
				 // Department:
		        Department department1 = new Department();
		        department1.id = 1;
		        department1.name = "mi tom";

		        Department department2 = new Department();
		        department2.id = 2;
		        department2.name = "bim bim";

		        Department department3 = new Department();
		        department3.id = 3;
		        department3.name = "banh mi";

		        // Position
		        Position position1 = new Position();
		        position1.id = 1;
		        position1.name = "Giam doc";

		        Position position2 = new Position();
		        position2.id = 2;
		        position2.name = "Pho giam doc";

		        Position position3 = new Position();
		        position3.id = 3;
		        position3.name = "Nhan vien";

		        // Account
		        Account account1 = new Account();
		        account1.id = 1;
		        account1.email = "levanluyen@gmail.com";
		        account1.username = "lvl";
		        account1.fullName = "le van luyen";
		        account1.departmentID = 1;
		        account1.positionID = 1;
		        account1.createDate = new Date("2021/04/14");

		        Account account2 = new Account();
		        account2.id = 1;
		        account2.email = "chauvietcuong@gmail.com";
		        account2.username = "cuongtoi";
		        account2.fullName = "chau viet cuong";
		        account2.departmentID = 2;
		        account2.positionID = 2;
		        account2.createDate = new Date("2020/12/26");

		        Account account3 = new Account();
		        account3.id = 1;
		        account3.email = "nghiemvietthanh@gmail.com";
		        account3.username = "nvt";
		        account3.fullName = "nghiem viet thanh";
		        account3.departmentID = 3;
		        account3.positionID = 3;
		        account3.createDate = new Date("2020/08/14");

		        // Group
		        Group group1 = new Group();
		        group1.id = 1;
		        group1.name = "an chay";
		        group1.creatorID = account1.id;
		        group1.createDate = new Date("2020/03/14");

		        Group group2 = new Group();
		        group2.id = 2;
		        group2.name = "an thit";
		        group2.creatorID = account3.id;
		        group2.createDate = new Date("2020/02/18");

		        Group group3 = new Group();
		        group3.id = 3;
		        group3.name = "ko an gi";
		        group3.creatorID = account3.id;
		        group3.createDate = new Date("2020/05/11");

		        GroupAccount ga1 = new GroupAccount();
		        ga1.id = 1;
		        ga1.accountID = account1.id;
		        ga1.joinDate = new Date("2019/11/12");

		        GroupAccount ga2 = new GroupAccount();
		        ga2.id = 2;
		        ga2.accountID = account3.id;
		        ga2.joinDate = new Date("2019/08/12");

		        GroupAccount ga3 = new GroupAccount();
		        ga3.id = 3;
		        ga3.accountID = account3.id;
		        ga3.joinDate = new Date("2019/09/11");

		        // TypeQuestion
		        Typequestion type1 = new Typequestion();
		        type1.id = 1;
		        type1.typeName = "easy";

		        Typequestion type2 = new Typequestion();
		        type2.id = 2;
		        type2.typeName = "medium";

		        Typequestion type3 = new Typequestion();
		        type3.id = 3;
		        type3.typeName = "hard";

		        // CategoryQuestion
		        CategoryQuestion categoryQuestion1 = new CategoryQuestion();
		        categoryQuestion1.categoryID = 1;
		        categoryQuestion1.name = "software";

		        CategoryQuestion categoryQuestion2 = new CategoryQuestion();
		        categoryQuestion2.categoryID = 2;
		        categoryQuestion2.name = "hardware";

		        CategoryQuestion categoryQuestion3 = new CategoryQuestion();
		        categoryQuestion3.categoryID = 3;
		        categoryQuestion3.name = "network";

		        // Question
		        Question question1 = new Question();
		        question1.id = 1;
		        question1.content = "ram la gi";
		        question1.categoryID = 1;
		        question1.typeID = 1;
		        question1.creatorID = account1.id;
		        question1.createdDate = new Date("2020/12/12");

		        Question question2 = new Question();
		        question2.id = 2;
		        question2.content = "ban phim la gi";
		        question2.categoryID = 2;
		        question2.typeID = 2;
		        question2.creatorID = account1.id;
		        question2.createdDate = new Date("2020/12/12");

		        Question question3 = new Question();
		        question3.id = 3;
		        question3.content = "internet la gi";
		        question3.categoryID = 3;
		        question3.typeID = 3;
		        question3.creatorID = account1.id;
		        question3.createdDate = new Date("2020/10/12");

		        // Answer
		        Answer answer1 = new Answer();
		        answer1.id = 1;
		        answer1.content = "t";
		        answer1.questionID = 1;
		        answer1.isCorrect = true;

		        Answer answer2 = new Answer();
		        answer2.id = 2;
		        answer2.content = "s";
		        answer2.questionID = 2;
		        answer2.isCorrect = false;

		        Answer answer3 = new Answer();
		        answer3.id = 3;
		        answer3.content = "K";
		        answer3.questionID = 3;
		        answer3.isCorrect = false;

		        // Exam
		        Exam exam1 = new Exam();
		        exam1.id = 1;
		        exam1.code = 1;
		        exam1.title = "thi cuoi ki";
		        exam1.categoryID = 1;
		        exam1.duration = 90;
		        exam1.creatorID = 1;
		        exam1.createdDate = new Date("2020/01/08");

		        Exam exam2 = new Exam();
		        exam2.id = 2;
		        exam2.code = 2;
		        exam2.title = "thi 45p";
		        exam2.categoryID = 2;
		        exam2.duration = 45;
		        exam2.creatorID = 2;
		        exam2.createdDate = new Date("2021/01/02");

		        Exam exam3 = new Exam();
		        exam3.id = 3;
		        exam3.code = 3;
		        exam3.title = "Thi 15p";
		        exam3.categoryID = 3;
		        exam3.duration = 15;
		        exam3.creatorID = 3;
		        exam3.createdDate = new Date("2021/02/02");

		        ExamQuestion examquestion1 = new ExamQuestion();
		        examquestion1.examID = 1;
		        examquestion1.questionID = 1;

		        ExamQuestion examquestion2 = new ExamQuestion();
		        examquestion2.examID = 2;
		        examquestion2.questionID = 2;

		        ExamQuestion examquestion3 = new ExamQuestion();
		        examquestion3.examID = 3;
		        examquestion3.questionID = 3;
		        
		    
			}

		


	}


