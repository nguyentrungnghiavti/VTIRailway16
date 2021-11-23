package Assignment;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import Assignment.Enum.PositionName;

public class Exercise3 {

	public static void main(String[] args) {
		// Tạo Group

		Group group1 = new Group();
		group1.id = 1;
		group1.name = "Testing System";
		Group group2 = new Group();
		group2.id = 2;
		group2.name = "Development";
		Group group3 = new Group();
		group3.id = 3;
		group3.name = "Sale";

		// Thêm 3 department
		Department dep1 = new Department();
		dep1.id = 1;
		dep1.departmentName = "Sale";

		Department dep2 = new Department();
		dep2.id = 2;
		dep2.name = "quanly";
		Department dep3 = new Department();
		dep3.id = 3;
		dep3.departmentName = "HR";

		// in ra danh sách department
		System.out.println("Danh sách department: ");
		System.out.println("departmentID: " + dep1.id + ", departmentName: " + dep1.departmentName);
		System.out.println("departmentID: " + dep2.id + ", departmentName: " + dep2.departmentName);

		System.out.println("departmentID: " + dep3.id + ", departmentName: " + dep3.departmentName);
		System.out.println();

		// thêm 3 Position
		Position position1 = new Position();
		position1.id = 1;
		position1.name = PositionName.POSITION_TEST.getPositionName();

		Position position2 = new Position();
		position2.id = 2;
		position2.name = PositionName.POSITION_DEV.getPositionName();

		Position position3 = new Position();
		position3.id = 3;
		position3.name = PositionName.POSITION_DEV.getPositionName();

		// in ra danh sách position
		System.out.println("Danh sách position: ");
		System.out.println("positionID: " + position1.id + ", positionName: " + position1.name);
		System.out.println("positionID: " + position2.id + ", positionName: " + position2.name);
		System.out.println("positionID: " + position3.id + ", positionName: " + position3.name);
		System.out.println();

		Account acc1 = new Account();
		acc1.id = 1;
		acc1.email = "daonq1";
		acc1.username = "daonq1";
		acc1.fullName = "Dao Nguyen 1";
		acc1.department = dep1;
		acc1.position = position1;
		acc1.createDate = new Date();

		Account acc2 = new Account();
		acc2.id = 2;
		acc2.email = "daonq2";
		acc2.username = "daonq2";
		acc2.fullName = "Dao Nguyen 2";
		acc2.department = dep2;
		acc2.position = position2;
		acc2.createDate = new Date();
		acc2.groups = new Group[] { group1, group2 };
		Account acc3 = new Account();
		acc3.id = 3;
		acc3.email = "daonq3";
		acc3.username = "daonq3";
		acc3.fullName = "Dao Nguyen 3";
		acc3.department = dep3;
		acc3.position = position3;
		acc3.createDate = new Date();

		// tao exam
		Exam exam1 = new Exam();
		exam1.code = "1";
		exam1.createDate = new Date();
		exam1.creatorID = acc1;
		exam1.duration = 60;
		exam1.title = "thi cuoi ki";

		Exam exam2 = new Exam();
		exam2.code = "2";
		exam2.createDate = new Date();
		exam2.creatorID = acc2;
		exam2.duration = 30;
		exam2.title = "thi giua ki";

		Exam[] exams = { exam1, exam2 };
		question1(exam2);
		 question2(exams);
		 question3(null);
		 question4(null);
		 question5(null);

	}
//	Question 1:
//		In ra thông tin Exam thứ 1 và property create date sẽ được format theo định
//		dạng vietnamese
	public static void question1(Exam exam) {
		Locale locale = new Locale("vn", "VN");
		DateFormat dateformat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
		String date = dateformat.format(exam.createDate);
		System.out.println(exam.code + ": " + date);

	}
//	Question 2:
//		In ra thông tin: Exam đã tạo ngày nào theo định dạng
//		Năm – tháng – ngày – giờ – phút – giây
	public static Date[] question2(Exam[] exams) {

		Date[] dateArr = new Date[] {};
		for (int i = 0; i < exams.length; i++) {

			String p = "yyyy-MM-dd HH-mm-ss";
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(p);
			for (Exam exam : exams) {
				String date = simpleDateFormat.format(exam.createDate);
				System.out.println(exam.code + ":" + date);
				dateArr[i] = exams[i].createdate;

			}
		}
		return dateArr;
	}
//	Question 3:
//		Chỉ in ra năm của create date property trong Question 2
	public static void question3(Date[] dateArr) {
		for (Date date : dateArr) {

			String p = "yyyy";
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(p);
			String createYear = simpleDateFormat.format(date);
			System.out.println(createYear);
		}
	}
//	Question 4:
//		Chỉ in ra tháng và năm của create date property trong Question 2
	public static Date[] question4(Date[] dateArr) {
		for (Date date : dateArr) {

			String p = "yyyy-MM";
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(p);
			String createMonthYear = simpleDateFormat.format(date);
			System.out.println( createMonthYear);
	
		
	}
		return dateArr;
}
//	Question 5:
//		Chỉ in ra "MM-DD" của create date trong Question 2
	public static Date[] question5(Date[] dateArr) {
		for (Date date : dateArr) {

			String p = "MM-DD";
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(p);
			String createDayMonth = simpleDateFormat.format(date);
			System.out.println( createDayMonth);
	
		
	}
		return dateArr;
		
		
	}
}