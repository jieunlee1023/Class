package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class MainTest3 {

	public static void main(String[] args) {
		
		List<String> sList = new ArrayList<>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		Stream<String> stream = sList.stream();
		stream.forEach(s -> System.out.println(s + " ")); // 어떤 요소들이 있나 확인
		System.out.println("------------------------------");
		
		sList.stream().sorted().forEach(s -> System.out.println(s+ " ")); // sorted 정렬하는 기능 (오름차순)
		System.out.println("------------------------------");
		sList.stream().map(s -> s.length()).forEach(n -> System.out.println(n)); // 데이터를 변형 할 때 사용하는 map
		System.out.println("------------------------------");
		sList.stream().filter(s -> s.length() >= 5).forEach(m -> System.out.println(m)); // 5글자 보다 클 때
		
	}
	
}
 