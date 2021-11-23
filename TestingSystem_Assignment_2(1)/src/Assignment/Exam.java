package Assignment;


import java.util.Arrays;
import java.util.Date;
import java.util.Date;
public class Exam {
	int id;
	String title;
	String code;
	CategoryQuestion[] category;
	int duration ;
	Account creatorID;
	Date createdate;
	Question[] question;
	public static Date createDate;
	@Override
	public String toString() {
		return "Exam [id=" + id + ", name=" + title + ", code=" + code + ", category=" + Arrays.toString(category)
				+ ", duration=" + duration + ", creator=" + creatorID + ", createdate=" + createdate + ", question="
				+ Arrays.toString(question) + "]";
	}
}
