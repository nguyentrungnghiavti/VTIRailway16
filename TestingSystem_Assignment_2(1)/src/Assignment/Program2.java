package Assignment;

import Assignment.Enum.PositionName;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tạo Group

		// Thêm 3 department
		Department department1 = new Department();
		department1.id = 1;
		department1.departmentName = "Sale";

		Department departmen2 = new Department();
		departmen2.id = 2;
		departmen2.name = "quanly";
		Department department3 = new Department();
		department3.id = 3;
		department3.departmentName = "HR";

		// in ra danh sách department
		System.out.println("Danh sách department: ");
		System.out.println("departmentID: " + department1.id + ", departmentName: " + department1.departmentName);
		System.out.println("departmentID: " + departmen2.id + ", departmentName: " + departmen2.departmentName);

		System.out.println("departmentID: " + department3.id + ", departmentName: " + department3.departmentName);
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

		// in ra danh sách position
		System.out.println("Danh sách position: ");
		System.out.println("positionID: " + position.id + ", positionName: " + position.name);
		System.out.println("positionID: " + position1.id + ", positionName: " + position1.name);
		System.out.println("positionID: " + position2.id + ", positionName: " + position2.name);
		System.out.println();

		// thêm 3 Position Account
		Account account = new Account();
		account.id = 1;
		account.fullName = "Nguyễn A";
		account.username = "vana";
		account.email = "a@gmail.com";
		account.position = position1;

		Account account1 = new Account();
		account1.id = 2;
		account1.fullName = "Nguyễn B";
		account1.username = "vanb";
		account1.email = "b@gmail.com";
		account1.position = position2;

		Account account2 = new Account();
		account2.id = 3;
		account2.fullName = "Nguyễn C";
		account2.username = "vanc";
		account2.email = "c@gmail.com";
		account2.position = position2;
		account2.department = department3;

		Account[] accounts = { account, account1, account2 };

		Group group1 = new Group();
		group1.id = 1;
		group1.name = "Testing System";
		// group1.accounts = accounts;
		Group group2 = new Group();
		group2.id = 2;
		group2.name = "Development";

		Group group3 = new Group();
		group3.id = 3;
		group3.name = "Sale";
		// account2.groups = new Group[] {};

		// kiem tra account thu 2
		// question2(account2);

		// kiem tra position cua account 1
		 question4(account1);

	}

	// viet ham question 2
	// kiem tra account thu 2
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

//kiem tra account 1
	public static void question4(Account account) {
		String posName = account.position.name.toString();
		System.out.println(posName == "dev" ? "day la developer" : "nguoi nay khong phai developer");
	}
	// lam dung yeu cau de bai. ten project, ten class
    //toi uu
	// tao function de de quan ly , chinh  suaa
	// dung for format code ctrl + shift + f
}
