package stream_api;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/**
 * 
 * 중간 연산의 예
 * filter(), map()
 * 조건에 맞는 요소를 추출하고 싶다면 filter,
 * 해당하는 요소를 변형하고 싶다면 map을 사용한다 
 *
 */

public class MainTest2 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList();
		for (int i=1; i<8; i++) {
			list.add(i);
		}
		// 스트림 생성
		Stream<Integer> myStream = list.stream();		
		myStream.forEach(s1 -> System.out.println("s : " + s1 ));
		// 중간 연산이 filter나 map
		// 마지막 연산이 forEach
		
		myStream.filter(s -> (s >= 5)).forEach(n -> System.out.println(n));
		System.out.println(list);
	}

}
