package Assignment;

import Assignment.Enum.PositionName;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		Position position = new Position();
		position.id = 1;
		position.name = PositionName.POSITION_TEST.getPositionName();

		Position position1 = new Position();
		position1.id = 2;
		position1.name = PositionName.POSITION_DEV.getPositionName();

		Position position2 = new Position();
		position2.id = 3;
		position2.name = PositionName.POSITION_DEV.getPositionName();

		// thêm 3 Position Account
		Account acc1 = new Account();
		acc1.id = 1;
		acc1.fullName = "Nguyễn A";
		acc1.username = "vana";
		acc1.email = "a@gmail.com";
		acc1.position = position1;
		acc1.department = dep1;

		Account acc2 = new Account();
		acc2.id = 2;
		acc2.fullName = "Nguyễn B";
		acc2.username = "vanb";
		acc2.email = "b@gmail.com";
		acc2.position = position1;
		acc2.groups = new Group[] { group1, group3 };
		acc2.department = dep3;
		Account acc3 = new Account();
		acc3.id = 3;
		acc3.fullName = "Nguyễn C";
		acc3.username = "vanc";
		acc3.email = "c@gmail.com";
		acc3.position = position2;
		acc3.department = dep2;
		group1.accounts = new Account[] { acc1, acc2 };
		question5(group1);
		Account[] acc = { acc1, acc2, acc3 };
		Department dep[] = { dep1, dep2, dep3 };
		// gọi hàm
//		question1(acc2);
//		question2(acc2);
//		question3(acc2);
//		question4(acc1);
//		question5( group1);
//		question6(acc2);
//		question7(acc1);
//		question8(acc);
//		question9(dep);
//		question10(acc);
//		question11(dep);
//		question12(dep);
//		question13(acc);
//		question14(acc);
//		question15();
//		question16_10(acc);
//		question16_11(dep);
//		question16_12(dep);
//		question16_13(acc);
//		question16_14(acc);
//		question16_15();
//		question17_10(acc);
//		question17_11(dep);
//		question17_12(dep);
//		question17_13(acc);
//		question17_14(acc);
//		question17_15();
	}

	

	// Kiểm tra account thứ 2
	// Nếu không có phòng ban (tức là department == null) thì sẽ in ra text
	// "Nhân viên này chưa có phòng ban"
	// Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là ..."
	public static void question1(Account acc2) {
		if (acc2.department == null) {
			System.out.println("nhan vien nay chua co phong ban");
		} else {
			System.out.println("phong ban cua nhan vien la" + acc2.department.name);
		}
	}

	// Kiểm tra account thứ 2
//	Nếu không có group thì sẽ in ra text "Nhân viên này chưa có group"
//	Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text "Group của nhân viên
//	này là Java Fresher, C# Fresher"
//	Nếu có mặt trong 3 Group thì sẽ in ra text "Nhân viên này là người
//	quan trọng, tham gia nhiều group"
//	Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là
//	người hóng chuyện, tham gia tất cả các group"
	public static void question2(Account account) {
		int count = account.groups == null ? 0 : account.groups.length;
		if (count == 0) {
			System.out.println("nhan vien nay chua co group");
		} else if (count == 1 || count == 2) {
			System.out.println("group cua nhan vien nay la javafresher,C#fresher");
		} else if (count == 3) {
			System.out.println("nhan vien nay la ng quan trong");
		} else {
			System.out.println("nhan vien nay la nguoi hong chuyen");
		}
	}

	// Sử dụng toán tử ternary để làm Question 1
	public static void question3(Account acc2) {
		System.out.println(acc2.department.name == null ? "nhan vien nay chua co phong ban"
				: "phong ban cua nhan vien la " + acc2.department.name);
	}

//	Question 4:
//		Sử dụng toán tử ternary để làm yêu cầu sau:
//		Kiểm tra Position của account thứ 1
//		Nếu Position = Dev thì in ra text "Đây là Developer"
//		Nếu không phải thì in ra text "Người này không phải là Developer"
	public static void question4(Account acc1) {
		System.out.println(acc1.position.name == "Dev" ? "day la developer" : "day khong phai la developer");
	}

//	Question 5:
//		Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau:
//		Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
//		Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên"
//		Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên"
//		Còn lại in ra "Nhóm có nhiều thành viên"
	public static void question5(Group group1) {
		int a = group1.accounts.length;
		switch (a) {
		case 0:
			System.out.println("nhom chua co thanh vien");
			break;
		case 1:
			System.out.println("nhom co 1 thanh vien");
			break;
		case 2:

			System.out.println("nhom co 2 thanh vien");
			break;
		case 3:
			System.out.println("nhom co 3 thanh vien");
			break;

		default:
			System.out.println("nhom co nhieu thanh vien");
			break;
		}
	}

	// Question 6:
	// Sử dụng switch case để làm lại Question 2
	public static void question6(Account acc2) {
		int b = acc2.groups.length;
		switch (b) {
		case 0:
			System.out.println("nhan vien chua co group");
			break;
		case 1:

			System.out.println("group cua nhan vien nay la java fresher,C#fresher");
			break;
		case 2:
			System.out.println("group cua nhan vien nay la java fresher,C#fresher");
			break;
		case 3:
			System.out.println("nhan vien nay la nguoi quan trong tham gia nhieu group");
			break;
		default:
			System.out.println("nhan vien nay la nguoi nhieu chuyen tham gia tat ca cac group");

			break;

		}
	}

//	Question 7:
//		Sử dụng switch case để làm lại Question4
	public static void question7(Account acc1) {
		String c = acc1.position.name.toString();
		switch (c) {
		case "Dev":
			System.out.println("day la developer");
			break;

		default:
			System.out.println("day khong phai developer");
			break;
		}
	}

//	Question 8:
//		In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của

	public static void question8(Account[] acc) {

		for (Account account : acc) {
			System.out.println("AccountId :" + account.id + "email : " + account.email + "Fullname :" + account.fullName
					+ "phong ban :" + account.department.name);
		}
	}

//	Question 9:
//		In ra thông tin các phòng ban bao gồm: id và name
	public static void question9(Department[] dep) {
		for (Department department : dep) {
			System.out.println("id phong ban :" + department.id + "ten phong ban " + department.name);
		}
	}

	// Question 10:
//	In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của
//	họ theo định dạng như sau:
//	Thông tin account thứ 1 là:
//	Email: NguyenVanA@gmail.com
//	Full name: Nguyễn Văn A
//	Phòng ban: Sale
//	Thông tin account thứ 2 là:
//	Email: NguyenVanB@gmail.com
//	Full name: Nguyễn Văn B
//	Phòng ban: Marketting
	public static void question10(Account[] acc) {
		for (int i = 0; i < acc.length; i++) {
			System.out.println("thong tin acc thu " + (i + 1) + "la :");
			System.out.println("ID : " + acc[i].id);
			System.out.println("Fullname :" + acc[i].fullName);
			System.out.println("phong ban : " + acc[i].department.name);
		}
	}

//	Question 11:
//		In ra thông tin các phòng ban bao gồm: id và name theo định dạng sau:
//		Thông tin department thứ 1 là:
//		Id: 1
//		Name: Sale
//		Thông tin department thứ 2 là:
//		Id: 2
//		Name: Marketing
	public static void question11(Department[] dep) {
		for (int i = 0; i < dep.length; i++) {
			System.out.println("thong tin phong ban thu  " + (i + 1) + " la");
			System.out.println("id : " + dep[i].id);
			System.out.println("phong ban : " + dep[i].name);
		}
	}

//	Question 12:
//		Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10
	public static void question12(Department[] dep) {
		for (int i = 0; i < dep.length; i++) {
			System.out.println("thong tin phong ban thu  " + (i + 1) + " la");
			System.out.println("id : " + dep[i].id);
			System.out.println("phong ban : " + dep[i].name);
			if (i == 1) {
				break;
			}
		}
	}

//	Question 13:
//		In ra thông tin tất cả các account ngoại trừ account thứ 2
	public static void question13(Account[] acc) {
		for (int i1 = 0; i1 < acc.length; i1++) {
			if (i1 != 1) {

				System.out.println("thong tin acc thu " + (i1 + 1) + "la :");
				System.out.println("ID : " + acc[i1].id);
				System.out.println("Fullname :" + acc[i1].fullName);
				System.out.println("phong ban : " + acc[i1].department.name);

			}
		}
	}

//	Question 14:
//		In ra thông tin tất cả các account có id < 4
	public static void question14(Account[] acc) {
		for (int i = 0; i < acc.length; i++) {
			if (acc[i].id < 4) {
				System.out.println("Thông tin account thứ " + (i + 1)

						+ " là:");

				System.out.println("Email: " + acc[i].email);
				System.out.println("Full name: " +

						acc[i].fullName);

				System.out.println("Phòng ban: " +

						acc[i].department.name);

			}
		}
	}

//	Question 15:
//		In ra các số chẵn nhỏ hơn hoặc bằng 20
	public static void question15() {
		for (int i = 1; i < 21; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

//	Question 16:
//		Làm lại các Question ở phần FOR bằng cách sử dụng WHILE kết hợp với
//		lệnh break, continue
	// Q16-10 // In ra thông tin các account bao gồm: Email, FullName và tên phòng
	// ban của
	public static void question16_10(Account[] acc) {
		int i2 = 0;
		while (i2 < acc.length) {
			System.out.println("thong tin acc thu " + (i2 + 1) + "la :");
			System.out.println("ID : " + acc[i2].id);
			System.out.println("Fullname :" + acc[i2].fullName);
			System.out.println("phong ban : " + acc[i2].department.name);
			i2++;
		}
	}

	// Q16-11 In ra thông tin các phòng ban bao gồm: id và name theo định dạng sau:
//	Thông tin department thứ 1 là:
//	Id: 1
//	Name: Sale
//	Thông tin department thứ 2 là:
//	Id: 2
//	Name: Marketing
	public static void question16_11(Department[] dep) {
		int i5 = 0;
		while (i5 < dep.length) {
			System.out.println("thong tin phong ban thu  " + (i5 + 1) + " la");
			System.out.println("id : " + dep[i5].id);
			System.out.println("phong ban : " + dep[i5].departmentName);
			i5++;
		}
	}

	// Q16-12 Question 12:
	// Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10
	public static void question16_12(Department[] dep) {
		int i6 = 0;
		while (i6 < 2) {
			System.out.println("thong tin phong ban thu  " + (i6 + 1) + " la");
			System.out.println("id : " + dep[i6].id);
			System.out.println("phong ban : " + dep[i6].departmentName);
			i6++;
		}
	}

	// Q16-13
	// In ra thông tin tất cả các account ngoại trừ account thứ 2
	public static void question16_13(Account[] acc) {
		int i7 = 0;
		while (i7 < acc.length) {
			if (i7 != 1) {
				System.out.println("thong tin acc thu " + (i7 + 1) + "la :");
				System.out.println("ID : " + acc[i7].id);
				System.out.println("Fullname :" + acc[i7].fullName);
				System.out.println("phong ban : " + acc[i7].department.name);

			}
			i7++;
		}

	}

	// Q16-14
	// Question 14:
	// In ra thông tin tất cả các account có id < 4
	public static void question16_14(Account[] acc) {
		int i = 0;

		while (acc[i].id < 4) {
			System.out.println("Thông tin account thứ " + (i + 1)

					+ " là:");

			System.out.println("Email: " + acc[i].email);
			System.out.println("Full name: " +

					acc[i].fullName);

			System.out.println("Phòng ban: " +

					acc[i].department.name);

		}
	}

	// Q16-15
	// Question 15:
	// In ra các số chẵn nhỏ hơn hoặc bằng 20
	public static void question16_15() {
		int i = 1;
		while (i <= 20) {
			if (i % 2 == 0) {
				System.out.println(i);
				i++;
			}
		}
	}

	// Question 17 làm lại các câu trong for = do while
	// q17_10
	public static void question17_10(Account[] acc) {

		int i = 0;
		do {
			System.out.println("Thông tin account thứ " + (i + 1) + "là:");
			System.out.println("Email: " + acc[i].email);
			System.out.println("Full name: " + acc[i].fullName);
			System.out.println("Phòng ban: " + acc[i].department.name);
			i++;
		} while (i < acc.length);
	}

	// q17_11
	public static void question17_11(Department dep[]) {
		int j = 0;
		do {
			System.out.println("Thông tin department thứ " + (j + 1) + "là:");
			System.out.println("Id: " + dep[j].id);
			System.out.println("Name: " + dep[j].name);
			j++;
		} while (j < dep.length);
	}

	// q17_12
	public static void question17_12(Department dep[]) {
		int i = 0;
		do {
			System.out.println("Thông tin department thứ " + (i + 1) + " là:");
			System.out.println("Id: " + dep[i].id);
			System.out.println("Name: " + dep[i].name);
			i++;
		} while (i < 2);

	}

	// q17_13
	public static void question17_13(Account[] acc) {
		int i = 0;
		do {
			if (i != 1) {
				System.out.println("Thông tin account thứ " + (i + 1) + " là:");
				System.out.println("Email: " + acc[i].email);
				System.out.println("Full name: " + acc[i].fullName);
				System.out.println("Phòng ban: " + acc[i].department.name);
			}
			i++;
		} while (i < acc.length);

	}

	// q17_14
	public static void question17_14(Account[] acc) {
		int i = 0;
		do {
			if (acc[i].id < 4) {
				System.out.println("Thông tin account thứ " + (i + 1) + " là:");
				System.out.println("Email: " + acc[i].email);
				System.out.println("Full name: " + acc[i].fullName);
				System.out.println("Phòng ban: " + acc[i].department.name);
			}
			i++;
		} while (i < acc.length);
	}

	// q17_15
	public static void question17_15() {
		int i = 1;
		do {
			if (i % 2 == 0) {
				System.out.println(i);
				i++;
		
			}
		}while(i <= 20);
		
		
	
		}
}

