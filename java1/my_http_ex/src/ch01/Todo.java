package ch01;

public class Todo {
	
	// 키 값이 똑같아야한다.
	
	int userId;
	int id;
	String title;
	boolean completed;
	@Override
	public String toString() {
		return "Todo [userId=" + userId + ", id=" + id + ", title=" + title + ", completed=" + completed + "]";
	}
	


}
