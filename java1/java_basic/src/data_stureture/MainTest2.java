package data_stureture;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MainTest2 {

	public static void main(String[] args) {

		Map map;

		// key와 value 구조로 데이터를 저장한다.
		HashMap<String, String> map1 = new HashMap<>();
		// [] --> list
		// {} --> map

		// 값을 추가하는 방법
		map1.put("A01", "김포공항정문");
		map1.put("A02", "김포공항후문");
		map1.put("A03", "김포공항로비");
		map1.put("A04", null);
		// key는 null 불가. value 만 null 가능
		map1.put("A04", "중복값");
		System.out.println(map1);
		// key는 중복 사용가능하나 결국 덮어쓰기 된다.

		// 값을 꺼내는 방법 : 키 값으로 찾는다
		System.out.println(map1.get("A01"));
		System.out.println(map1.get("C01")); // 없는 값이므로 null

		// null 값을 저장하고 싶지 않는 map 계열
//		Hashtable<String, String> hashTable = new Hashtable<>();
//		hashTable.put("h1", "안녕");
//		hashTable.put("h2", null); // 단점 .. 컴파일 시점에 확인되지 않는다! 
//		System.out.println(hashTable);

		// 값을 수정 : put이 이미 수정가능함 (덮어쓰기가능)
		map1.put("A01", "값수정");
		System.out.println(map1);

		// 값을 삭제
		map1.remove("A01");
		// 전체 삭제
		// map1.clear();
		System.out.println(map1);

		// map 인덱스 있나요 ?
		for (int i = 0; i < map1.size(); i++) {
			System.out.println("-----------");
			System.out.println(map1.get(i)); // 찾는 키 값이 없다
		}

		// map 계열을 반복문을 사용할 때 for -each 문을 많이 활용한다.
		// key 값만 가져올 수 있다.
		for (String key : map1.keySet()) {
			System.out.println("key : " + key);
			// 값을 꺼내고 싶으면 어떻게 코딩해야할까요 ?
			System.out.println("vlaue : " + map1.get(key));
		}

		// entry : key와 value를 동시가 가져 올 수 있다.
		// 연산의 순서를 적게 할 때 용이하다.
		for (Entry<String, String> entry : map1.entrySet()) {
			System.out.println("[key] : " + entry.getKey() + " , " + "[value] : " + entry.getValue());
		}

	}
}
