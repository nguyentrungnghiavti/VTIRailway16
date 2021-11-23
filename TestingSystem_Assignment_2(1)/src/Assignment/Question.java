package Assignment;

import java.time.LocalDate;

public class Question {
	int id;
	String content;
	Typequestion type;
	Account creator;
	LocalDate createDate;
	@Override
	public String toString() {
		return "Question [id=" + id + ", content=" + content + ", type=" + type + ", creator=" + creator
				+ ", createDate=" + createDate + "]";
	}
}
