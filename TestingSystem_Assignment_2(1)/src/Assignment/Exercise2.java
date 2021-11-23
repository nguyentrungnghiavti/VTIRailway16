package Assignment;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Exercise2 {

	public static void main(String[] args) {
		//gọi hàm
		question1() ;
		question2() ;
		question3() ;
		question4() ;
		question5() ;
	}
//		Question 1:
//			Khai báo 1 số nguyên = 5 và sử dụng lệnh System out printf để in ra số
//			nguyên đó
	public static void question1() {
			
			int i = 5;
			System.out.printf("%d%n", i);
		

	}
//	Question 2:
//		Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System out printf để in
//		ra số nguyên đó thành định dạng như sau: 100,000,000
	
	public static void question2() {
		int num = 100000000;
		System.out.printf(Locale.US, "%,d%n",num);
	}
	public static void question3() {
		float c = 5.567098f;
		System.out.printf("%5.4f%n", c);
		
	}
//	Khai báo Họ và tên của 1 học sinh và in ra họ và tên học sinh đó theo định
//	dạng như sau:
//	Họ và tên: "Nguyễn Văn A" thì sẽ in ra trên console như sau:
//	Tên tôi là "Nguyễn Văn A" và tôi đang độc thân.
	public static void question4() {
		String name = "Nguyễn Văn A";
		System.out.printf("Tên tôi là \"" + name + " và tôi đang độc thân"

		);
	}
//	Question 5:
//		Lấy thời gian bây giờ và in ra theo định dạng sau:
//		24/04/2020 11h:16p:20s
	public static void question5() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat formatterHH = new SimpleDateFormat("HH");
		SimpleDateFormat formattermm = new SimpleDateFormat("mm");
		SimpleDateFormat formatterss = new SimpleDateFormat("ss");
		Date date = new Date();
		System.out.printf("%s %sh %sm %ss" ,formatter.format(date),formatterHH.format(date),formattermm.format(date),formatterss.format(date));
	}
}
	
