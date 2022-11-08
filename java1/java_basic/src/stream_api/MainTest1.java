package stream_api;

import java.util.Arrays;

/**
 * 
 * Stream API -> stream과는 다른 개념 (파일 I/O, 소켓 X - 다른 개념임)
 * java 8 버전부터 추가된 유용한 클래스 입니다.
 * 자바에서는 많은 양의 데이터를 저장하기 위해서 배열이나 컬렉션 프레임 워크를 사용한다.
 * 코드의 길이가 너무 길어지고. 가독성도 떨어지며 코드의 재사용이 거의 불가능 하다.
 * 
 * 반복자 (iterator) -> 스트림 API를 도입했다.
 * 스트림 API를 이용하면 배열이나 컬렉션 등 모두 거의 같은 방법으로 다룰 수 있게 된다.
 * 
 * 스트림 API의 동작 흐름
 * 1. 스트림이라는 클래스가 생성
 * 2. 스트림의 중간 연산
 * 3. 스트림의 최종 연산
 * 
 * 추가 개념
 * 한번 생성한 스트림은 재사용이 불가능하다.
 * 단, 한번만 사용 가능 하다.
 * 스트림은 원본 데이터를 변경하지 않는다.
 * 스트림은 연산은 필터 - 맵 기반의 API를 사용하여 
 * 지연(Lazy) 연산을 통해 성능을 최전화 한다.
 *  
 */

public class MainTest1 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int sumValue = Arrays.stream(arr).sum(); // 배열 요소의 합
		long count = Arrays.stream(arr).count(); // 배열 요소가 몇 개가 있는지
		
		System.out.println(sumValue);
		System.out.println(count);

	}
}
