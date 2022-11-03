package ch03;

import com.google.gson.JsonObject;

public class MainTest1 {

	public static void main(String[] args) {

		JsonObject jsonObject1 = new JsonObject();
		jsonObject1.addProperty("bookId", 1);
		jsonObject1.addProperty("bookTitle", "플러터 UI 실전");
		jsonObject1.addProperty("author", "김근호");
		jsonObject1.addProperty("page", 268);

		System.out.println(jsonObject1);

		// 얕은 복사
		JsonObject jsonObject2 = jsonObject1;
		jsonObject1.addProperty("출판사", "앤써북");
		System.out.println("2 : " + jsonObject2);
		System.out.println("------------------------");

		// 깊은 복사
		JsonObject jsonObject3 = jsonObject1.deepCopy();
		jsonObject3.addProperty("출간일", "2021. 8. 20");
		System.out.println("1 : " + jsonObject1);
		System.out.println("------------------------");
		System.out.println("3 : " + jsonObject3);

	}

}

class Book {

	int bookId;
	String bookTitle;
	String author;
	int page;

}
