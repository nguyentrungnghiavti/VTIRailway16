package Assignment;

import java.security.PublicKey;


import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import Assignment.Enum.PositionName;

public class Exercise5 {

	
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
				Group[] grArr = {group1,group2,group3};
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
				
				Account[] acc = { acc1, acc2, acc3 };
				Department dep[] = { dep1, dep2, dep3 };
//				question1();
//				question2();
		//	question3();
//				question4();
//				question5();
//				
//				question6();
//				question7();
			//question8();
		question9(acc,grArr );
//				question10(acc, null, null);
//				question11(acc, null, null);
	}
	
		// TODO Auto-generated method stub
		// viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình
	public static void question1() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("mời bạn nhập vào 3 số nguyên ");
		
		for (int i = 0; i <= 2; i++) {
			System.out.println("mời bạn nhập vào số thứ  " + (i + 1));
			int num = scanner.nextInt();
			
			System.out.println(num);
		}
	}
		// viết lệnh cho phép người dung nhập vào 2 số thực
		public static void question2() {
			Scanner scanner = new Scanner(System.in);
		System.out.println("mời bạn nhập vào 2 số  thực");
		for (int i1 = 0; i1 < 2; i1++) {

			System.out.println("mời bạn nhập số thứ " + (i1 + 1));
			float f = scanner.nextFloat();
		System.out.printf("%f%n", f);
		}
		}
		// viết lệnh cho người dùng nhập vào họ và tên
		public static void question3() { 
			Scanner scanner = new Scanner(System.in);
		System.out.println("mời bạn nhập vào họ ");
		String ho = scanner.next();
		System.out.println("mời bạn nhập tên ");
		String ten = scanner.next();
		System.out.println("tên của bạn là " + ho + " " + ten);
		}

		// viết lệnh cho phép người dùng nhập vào ngày tháng năm sinh
		public static void question4() {
			Scanner scanner = new Scanner(System.in);
		System.out.println("mời bạn nhập ngày sinh ");
		int day = scanner.nextInt();
		System.out.println("mời bạn nhập tháng sinh ");
		int month = scanner.nextInt();
		System.out.println("mời bạn nhập năm sinh ");
		int year = scanner.nextInt();
		LocalDate birthDay = LocalDate.of(year, month, day);
		System.out.println("ngày tháng năm sinh của bạn là " + birthDay);
		
		
	}
		////viết lệnh cho phép người dung tạo account
			//đối với chọn position nếu nguoif dùng nhập 1,2,3,4 sẽ chuyển thành position tương ứng
		public static void question5() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Mời bạn nhập thông tin account ");
			Account account = new Account();
			
			System.out.println("ID");
			
			account.id = sc.nextByte();
			System.out.println("Email ");
			account.email= sc.next();
			System.out.println("Username");
			account.username = sc.next();
			System.out.println(" Fullname");
			account.fullName = sc.next();
			System.out.println("Position : nhập các số từ 1 đến 4");
			int pNum = sc.nextInt();
			switch (pNum) {
			case 1:
				Position p1 = new Position();
				p1.name = PositionName.POSITION_DEV.getPositionName();
				account.position = p1;
				break;
			case 2 :
			Position p2 = new Position();
			p2.name = PositionName.POSITION_TEST.getPositionName();
			account.position = p2;
			break;
			
			case 3 : 
				Position p3 = new Position();
				p3.name = PositionName.POSITION_SCRUM_MASTER.getPositionName();
				account.position = p3;
				break;
			case 4 : 
				Position p4 = new Position();
				p4.name = PositionName.POSITION_PM.getPositionName();
				account.position = p4;
		
				break;
			}
			System.out.println("thông tin account của bạn là :");
			System.out.println("ID :" + account.id);
			System.out.println("Email :" + account.email);
			System.out.println("Username: " + account.username);
			System.out.println("Fullname :" + account.fullName);
			System.out.println("position "+ account.position.name);
		}
		//question6 viết lệnh cho người dung tạo department
		private static void question6() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Mời bạn nhập thông tin department ");
			Department dep = new Department();
			System.out.println("ID :");
			dep.id = sc.nextInt();
			System.out.println("Tên phòng ban: ");
			dep.departmentName = sc.next();
			System.out.println("Thông tin department bạn vừa tạo :" + "\nID " +dep.id
					+ "\nTên phòng ban: " +dep.departmentName);
			
		}
		//question7 viết lệnh cho người dùng nhập vào số chẵn
		private static void question7() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Mời bạn nhập vào 1 sỗ chẵn ");
			
			int a = sc.nextInt();
			if (a%2==0) {
				System.out.println(a);
				return;
			}else {
				System.out.println("đây không phải số chẵn");
			}
		}
		
//		Question 8:
//			Viết chương trình thực hiện theo flow sau:
//			Bước 1:
//			Chương trình in ra text "mời bạn nhập vào chức năng muốn sử
//			dụng"
//			Bước 2:
//			Nếu người dùng nhập vào 1 thì sẽ thực hiện tạo account
//			Nếu người dùng nhập vào 2 thì sẽ thực hiện chức năng tạo
//			department
//			Nếu người dùng nhập vào số khác thì in ra text "Mời bạn nhập
//			lại" và quay trở lại bước 1
		public static void question8() {
			Scanner scanner = new Scanner(System.in);
			boolean isOk = false;
			while (isOk == false) {
				System.out.println("mời bạn nhập vào chức năng muốn sử dụng: ");
				int num = scanner.nextInt();

				if (num == 1) {
					question5(); // tạo account
					isOk = true;
				} else if (num == 2) {
					question6(); // tạo department
					isOk = true;
				} else {
					System.out.println("Mời bạn nhập lại: ");
				}
			}
		}
//		Question 9:
//			Viết method cho phép người dùng thêm group vào account theo flow sau:
//			Bước 1:
//			In ra tên các usernames của user cho người dùng xem
//			Bước 2:
//			Yêu cầu người dùng nhập vào username của account
//			Bước 3:
//			In ra tên các group cho người dùng xem
//			Bước 4:
//			Yêu cầu người dùng nhập vào tên của group
//			Bước 5:
//			Dựa vào username và tên của group người dùng vừa chọn, hãy
//			thêm account vào group đó .
		public static void question9(Account[] accArr, Group[] grArr) {
			Scanner scanner = new Scanner(System.in);
			
			boolean isCheckGr = false;
			boolean isCheckAcc = false;
			for (Account acc : accArr) {
				System.out.println("Tên các username: " + acc.username);
			}

			System.out.println("mời bạn nhập vào username của account: ");
			String userName = scanner.next();
			
			for (Group gr : grArr) {
				System.out.println("Tên các group: " + gr.name);
			}
			scanner.nextLine();
			System.out.println("mời bạn nhập vào tên của Group: ");
			String groupName = scanner.nextLine();

			Group groupAdd = null;
			for (Group gr : grArr) {
				if (groupName.equals(gr.name)) {
					groupAdd = gr;
					isCheckGr = true;
				}
			}
			for (Account acc : accArr) {
				if (userName.equals(acc.username)) {
					
					acc.groups = Arrays.copyOf(acc.groups, acc.groups.length + 1);
					acc.groups[acc.groups.length - 1] = groupAdd;
					System.out.println("account " + acc.username + " đã thêm vào group " + groupAdd.name);
					System.out.println("kết quả: account " + acc.username + "có mặt trong những group: ");
					for (Group gr : acc.groups) {
						System.out.println("\t" + gr.name);
					}

				}
			}
			if(!isCheckGr) {
				System.out.println("Group bạn nhập không tồn tại trên hệ thống");
			}
			if(!isCheckAcc) {
				System.out.println("Account bạn nhập không tồn tại trên hệ thống");
			}
		}
//		Question 10: Tiếp tục Question 8 và Question 9
//		Bổ sung thêm vào bước 2 của Question 8 như sau:
//		Nếu người dùng nhập vào 3 thì sẽ thực hiện chức năng thêm group vào
//		account
//		Bổ sung thêm Bước 3 của Question 8 như sau:
//		Sau khi người dùng thực hiện xong chức năng ở bước 2 thì in ra dòng
//		text để hỏi người dùng "Bạn có muốn thực hiện chức năng khác
//		không?". Nếu người dùng chọn "Có" thì quay lại bước 1, nếu người
//		dùng chọn "Không" thì kết thúc chương trình (sử dụng lệnh return để
//		kết thúc chương trình)
		public static void question10(Account[] accArr, Group[] grArr) {
			Scanner scanner = new Scanner(System.in);
			boolean isOk = false;
			while (isOk == false) {
				System.out.println("mời bạn nhập vào chức năng muốn sử dụng: ");
				int num = scanner.nextInt();
				if (num == 1) {
					question5(); // tạo account
					isOk = true;
				} else if (num == 2) {
					question6(); // tạo department
					isOk = true;
				} else if (num == 3) {
					question9(accArr, grArr); // add group vào account
					isOk = true;
				} else {
					System.out.println("Mời bạn nhập lại: ");
				}

				if (isOk == true) {
					System.out.println("Bạn có muốn thực hiện chức năng khác không? Có: nhập 1, Không: nhập 0");
					int yN = scanner.nextInt();
					if (yN == 1) {
						isOk = false;
					} else {
						System.out.println("Kết thúc!");
						return;
					}
					
				}
			}
		}
//		Question 11: Tiếp tục Question 10
//		Bổ sung thêm vào bước 2 của Question 8 như sau:
//		Nếu người dùng nhập vào 4 thì sẽ thực hiện chức năng thêm account
//		vào 1 nhóm ngẫu nhiên, chức năng sẽ được cài đặt như sau:
//		Bước 1:
//		In ra tên các usernames của user cho người dùng xem
//		6
//		Bước 2:
//		Yêu cầu người dùng nhập vào username của account
//		Bước 3:
//		Sau đó chương trình sẽ chọn ngẫu nhiên 1 group
//		Bước 4:
//		Thêm account vào group chương trình vừa chọn ngẫu
//		nhiên
		public static void question11(Account[] accArr, Group[] grArr) {
			Scanner scanner = new Scanner(System.in);
			boolean isOk = false;
			while (!isOk) {
				System.out.println("mời bạn nhập vào chức năng muốn sử dụng: ");
				int num = scanner.nextInt();
				if (num == 1) {
					question5();// tạo account
					isOk = true;
				} else if (num == 2) {
					question6();// tạo department
					isOk = true;
				} else if (num == 3) {
					question9(accArr, grArr);// add group vào account
					isOk = true;
				} else if (num == 4) {
					for (Account acc : accArr) {
						System.out.println("Tên các username: " + acc.username);
					}

					System.out.println("mời bạn nhập vào username của account: ");
					String userName = scanner.next();	
					Random random = new Random();
					int i = random.nextInt(grArr.length);
					Group groupAdd = grArr[i];
					boolean isCheckAcc = false; // biến check account có tồn tại trong hệ thống không
					for (Account acc : accArr) {
						if (userName.equals(acc.username)) {
							groupAdd.accounts = Arrays.copyOf(groupAdd.accounts, groupAdd.accounts.length + 1);
							groupAdd.accounts[groupAdd.accounts.length - 1] = acc;
							System.out.println("account " + acc.username + " đã thêm vào group " + groupAdd.name);
							System.out.println("kết quả: group " + groupAdd.name + "có những account: ");
							for (Account acc1 : groupAdd.accounts) {
								System.out.println("\t" + acc1.username);
							}
							isCheckAcc = true; // nếu có tồn tại acc thì biến check = true
						}
					}
					if(isCheckAcc == false) {
						System.out.println("không có account trong hệ thống");
					}

					isOk = true;
				}else {
					System.out.println("Mời bạn nhập lại: ");
					isOk = false;
				}

				if (isOk) {
					System.out.println("Bạn có muốn thực hiện chức năng khác không? Có: nhập 1, Không: nhập 0");
					int yN = scanner.nextInt();
					if (yN == 1) {
						isOk = false;
					} else {
						System.out.println("Kết thúc!");
						return;
					}
				}
			}
		}
}