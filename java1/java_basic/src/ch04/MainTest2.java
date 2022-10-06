package ch04;

import java.util.Scanner;

public class MainTest2 {

	public static void main(String[] args) {
		// 2. 문제 MainTest2
		// 시작값, 종료값을 받아서 (사용자입력) 연산에 합을 출력해보세요.
		Scanner sc = new Scanner(System.in);

		System.out.println("시작 값을 입력하시오 : ");
		int start = sc.nextInt();
		System.out.println("마지막 값을 입력하시오 : ");
		int end = sc.nextInt();

		int sum = 0;
		// 값을 넣는 순간 초기화가 됨을 잊지 말자!
		// 넣을 곳이 없다면 새로운 변수를 선언하기!
		// 새로운 변수를 선언하는 것을 두려워하지 말자!
		int i = start;
		for (i=0; start <= end; start++) {
			sum = sum + start;
		}
		System.out.println(sum);
	}

}
