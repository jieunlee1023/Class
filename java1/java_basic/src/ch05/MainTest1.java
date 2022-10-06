package ch05;

public class MainTest1 {

	// 코드의 시작점 (메인 함수, 메인 스레드, 메인 작업자)
	public static void main(String[] args) {

		System.out.println("프로그램을 시작합니다.");

		int num1; // 변수의 선언
		int num2 = 10; // 변수의 선언과 초기화

		// Student s1; // 변수의 선언
		// new로 heap에 올림
		Student s1 = new Student(); // 변수의 선언과 초기화
		Student s2 = new Student();

		System.out.println(s1);
		System.out.println(num2);
		System.out.println(s2);

		// ( . ) 연산자 : 객체 안으로 들어간다
		// 참조 타입에 값을 할당하는 방법
		s1.name = "이순신";
		s1.height = 190;
		s1.weight = 100.5;

		// 참조 타입 s1에 값을 화면에 출력하는 방법
		System.out.println("===============");
		System.out.println(s1.name);
		System.out.println(s1.height);
		System.out.println(s1.weight);

		s2.name = "홍길동";
		s2.height = 170;
		s2.weight = 80.0;

		// heap이라는 메모리 영역에 접근해서 출력
		System.out.println("===============");
		System.out.println(s2.name);
		System.out.println(s2.height);
		System.out.println(s2.weight);

	}// end of main

}// end of class
