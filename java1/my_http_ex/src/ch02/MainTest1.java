package ch02;

import com.google.gson.JsonObject;

public class MainTest1 {

	public static void main(String[] args) {

		// Gson --> 자바 코드로 변환 방법

		// JSON Object
		JsonObject jsonObject1 = new JsonObject();
		jsonObject1.addProperty("name", "홍길동");
		jsonObject1.addProperty("age", 24);
		jsonObject1.addProperty("job", "개발자");

		System.out.println(jsonObject1);

		// 하나씩 꺼내보자
		System.out.println(jsonObject1.get("name"));
		System.out.println(jsonObject1.get("age"));
		System.out.println(jsonObject1.get("job"));

		System.out.println("-------------------------");
		// 깊은 복사와 얕은 복사 개념 !!

		// 얕은 복사 : 주소값만 복사된 것
		// 1에서 변경하든 2에서 변경하든 같은 주소값의 값들이 변경되는 것
		JsonObject jsonObject2 = jsonObject1;
		System.out.println(jsonObject2);
		jsonObject1.addProperty("취미", "코딩");
		System.out.println("-------------------------");
		System.out.println("1 : " + jsonObject2);
		System.out.println("2 : " + jsonObject2);

		// 깊은 복사
		JsonObject jsonObject3 = jsonObject1.deepCopy();
		jsonObject3.addProperty("결혼여부", true);
		System.out.println("-------------------------");
		System.out.println("1 : " + jsonObject1);
		System.out.println("3 : " + jsonObject3);

	}

}
