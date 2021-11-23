package Assignment;

public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//gọi hàm
		question1();
		question2(null);
		question3();
		
	}
	//Tạo method để in ra các số chẵn nguyên dương nhỏ hơn 10
	private static void question1() {

		for (int i = 0; i < 10; i++) {
		if (i % 2 == 0) {
		System.out.print(i + " ");
		}
		}
		System.out.println("");
		}
	//tạo method in các account
	private static void question2(Account account) {
		Account acc1 = new Account();
		Account acc2 = new Account();
		Account acc3 = new Account();
		Account[] accAr= new Account[3];
		
		System.out.println("ID: " + account.id + " Email: " +

		account.email + " Username: " + account.username

		+ " FullName: " + account.fullName + " CreareDate: "

		+ account.createDate);
		}
	//tạo method in ra các số nguyên dương nhỏ hơn 10
	private static void question3() {

		for (int i = 0; i < 10; i++) {
		System.out.print(i + " ");
		}
}
}