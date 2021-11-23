package Assignment;

import java.time.LocalDate;
import java.util.Random;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		question1();
		question2();
		question3();
		question4();
		question5();
		question6();
	}

	//// lay ngau nhien 1 so nguyen
	public static void question1() {
		Random random = new Random();
		int z = random.nextInt();
		System.out.println(z);
	}

	// lấy ngẫu nhiên 1 số thực
	public static void question2() {
		Random random = new Random();
		float c = random.nextFloat();
		System.out.println(c);
	}
	// khai bao 1 array gom ten cc ban trong lop
	// sau do in ra ngau nhien ten 1 ban

	public static void question3() {
		Random random = new Random();
		String nameArrays[] = { "huyen", "nga", "nam" };
		int i = random.nextInt(nameArrays.length);
		System.out.println("người được gọi tên là " + nameArrays[i]);
	}

	//// lấy ngẫu nhiên một ngày trong khoản thời gian từ 24/7/1995 đến
	// 20/12/1995
	public static void question4() {
		Random random = new Random();
		int minDay = (int) LocalDate.of(1995, 7, 24).toEpochDay();
		int maxDay = (int) LocalDate.of(1995, 12, 20).toEpochDay();
		long randomInt = minDay + random.nextInt(maxDay - minDay);
		LocalDate randomDay = LocalDate.ofEpochDay(randomInt);
		System.out.println("ngày ngẫu nhiên trong khoảng  thời gian từ 24/7/1995 đến 20/12/1995 la " + randomDay);

	}

	// lấy ngẫu nhiên ngày trong khoảng 1 năm trở lại đây
	public static void question5() {
		Random random = new Random();

		int now = (int) LocalDate.now().toEpochDay();
		int day = random.nextInt(365);
		int numDay = now - day;
		LocalDate randomDay1 = LocalDate.ofEpochDay(numDay);
		System.out.println("ngày ngẫu nhiên trong 1 năm gần đây là " + randomDay1);
		;
	}

	// lấy ngẫu nhiên 1 ngày trong quá khứ
	public static void question6() {
		Random random = new Random();
		int now = (int) LocalDate.now().toEpochDay();
		int randomDay = random.nextInt(now);
		LocalDate day = LocalDate.ofEpochDay(randomDay);
		System.out.println(day);
	}

}
