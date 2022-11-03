package ch03;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class MainTest2 {

	public static void main(String[] args) {

		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("name", "홍길동");
		jsonObject.addProperty("age", 10);

		JsonObject jsonObject1 = jsonObject.deepCopy();
		JsonObject jsonObject2 = jsonObject.deepCopy();
		JsonObject jsonObject3 = jsonObject.deepCopy();
		jsonObject3.addProperty("name", "티모");
		jsonObject3.addProperty("age", "100");

		// {} {} {}

		// 리스트 계열
		JsonArray jsonArray = new JsonArray();
		jsonArray.add(jsonObject1);
		jsonArray.add(jsonObject2);
		jsonArray.add(jsonObject3);
		System.out.println(jsonArray);

		System.out.println("----------------------");
		System.out.println(jsonArray.get(2));
		System.out.println("----------------------");

		// [ {} {} {} ]
		// { "arr" : [ {} {} {} ] }
		JsonObject mainObject = new JsonObject();
		// mainObject.addProperty("arr", jsonArray);

		mainObject.add("arr", jsonArray);
		System.out.println(mainObject);

		// 문제 ! mainObject 안에 있는 --> 리스트 안에 있는 마지막 오브젝트를 꺼내보시오

		System.out.println("----------------------");
		int lastInfo = mainObject.getAsJsonArray("arr").size() - 1;
		System.out.println(mainObject.getAsJsonArray("arr").get(lastInfo));
		System.out.println(mainObject.getAsJsonArray("arr").get(lastInfo).getAsJsonObject().get("name"));
		System.out.println(mainObject.getAsJsonArray("arr").get(lastInfo).getAsJsonObject().get("age"));

	}

}
