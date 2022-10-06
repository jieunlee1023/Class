package ch04;

import java.util.Scanner;

public class ForMainTest2 {

	// 메인 시작점 (메인 함수, 메인 쓰레드)
	public static void main(String[] args) {

		// 1부터 100까지 연산에 합을 화면에 출력해보세요. 단 반복문을 활용해주세요!
		// 1+2+3+...+100 = ?
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println("1부터 100까지의 합의 결과는 " + sum + " 입니다!");
//
//		// 선생님 풀이!
//		int result = 0;
//		int maxNumber = 90;
//		for (int i = 1; i <= maxNumber; i++) {
//			// 연산한 값을 담아 줘야해 !!!
//			// 기존에 있던 값에 +1을 해야 식이 완성된다.
//			// System.out.println(" result : " + result + " , i : " + i);
//			result = result + i;
//		}
//		System.out.println("1부터 " + maxNumber+ "까지의 합의 결과는 " + result + " 입니다!");
//		

		// 사용자가 입력한 값을 받아서 처리할 수 있도록 코드를 수정 해주세요.
		Scanner sc = new Scanner(System.in);
		int result = 0;
		System.out.println(" 숫자를 입력하시오 : ");
		int maxNumber = sc.nextInt();
		for (int i = 1; i <= maxNumber; i++) {
			// 연산한 값을 담아 줘야해 !!!
			// 기존에 있던 값에 +1을 해야 식이 완성된다.
			// System.out.println(" result : " + result + " , i : " + i);
			result = result + i;
		}
		System.out.println("1부터 " + maxNumber + "까지의 합의 결과는 " + result + " 입니다!");

	} // end of main

} // end of class
