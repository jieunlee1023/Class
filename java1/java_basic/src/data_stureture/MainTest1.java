package data_stureture;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MainTest1 {

	public static void main(String[] args) {

		// How, Why?

		// 순서가 있고(=인덱스가 있다) 중복이 가능하다.
		// - data들을 어떠한 알고리즘으로 저장할 것인가 ?
		List list0 = new LinkedList<>();

		List<Integer> list = new ArrayList<>(); // 다형성

		// 값 추가 방법
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list); // --> 결과 : [ 1, 2, 3]

		list.add(0, 1000);
		list.add(null); // null도 포함이 된다.
		list.add(0, 5000);
		System.out.println(list); // --> 결과 : [5000, 1000, 1, 2, 3, null]

		// 값 삭제하는 방법
		// 인덱스 번호로 삭제 또는 Object 단위로 삭제할 수 있다.
		list.remove(4); // 인덱스 번호로 요소 삭제하기
		System.out.println(list); // --> 결과 [5000, 1000, 1, 2, null]
		list.remove(new Integer(5000)); // 오브젝트 단위로 삭제 할 수있다.
		System.out.println(list); // --> 결과 : [1000, 1, 2, null]

		// 만약에 전체로 삭제하고 싶다면
//		 list.clear();

		// 사이즈 확인 방법
		System.out.println(list.size());

		// 값을 하나하나 출력하고 싶다면 ?
		// get 이라는 메서드를 사용한다
		System.out.println(list.get(0));
		// 인덱스의 크기는 n-1개 이다.
		System.out.println(list.get(list.size() - 1));

		// 수정하기
		list.set(0, 2000);
		System.out.println(list); // 결과 --> [2000, 1, 2, null]

		for (int i = 0; i < list.size(); i++) {
			System.out.println("---------");
			System.out.println(list.get(i));
		}

		// while
		// 요소 순회 (반복자) 컬렉션 프레임 워크에 저장된 요소들을 하나씩 참조해주는 녀석
		Iterator<Integer> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println("요소확인 : " + iter.next());
		}

		// 추가적으로 유용한 기능들
		// contains : 리스트안에 검색하려는 object가 있는지 확인해 주는 녀석
		System.out.println(list.contains(new Integer(2000)));
		System.out.println(list.contains(new Integer(2000)));
		// 2000이라는 녀석이 몇 번째 인덱스에 존재하는지 알고 싶다면
		// indexOf 를 사용하면 된다.
		System.out.println("인덱스 위치 확인 : " + list.indexOf(new Integer(2000)));
		System.out.println("인덱스 위치 확인 : " + list.indexOf(new Integer(2)));
		// 만약 리스트 안에 Object 존재하지 않으면 -1을 반환한다.
		System.out.println("인덱스 위치 확인 : " + list.indexOf(new Integer(100)));

		// List , add , remove , get , set , clear / for문 활용 , while문 활용 , contains ,
		// indexOf

		List<String> list2 = new LinkedList<>();
		list2.add("가");
		list2.add("나");
		list2.add("다");
		list2.add("가");
		System.out.println(list2);

	}

}
