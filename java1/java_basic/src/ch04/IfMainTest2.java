package ch04;

import java.util.Scanner;

public class IfMainTest2 {
	// 메인 작업자 (메인 스레드)
	public static void main(String[] args) {

		System.out.println("성적을 입력해 주세요!");
		Scanner scanner = new Scanner(System.in);
		int point = scanner.nextInt();
		char result = 'Z';
		
		// 비교, 논리 연산자를 활용해서 실행에 흐름을 만들어주세요.
		// 1. 100~91점 A학점입니다. 단, 논리곱 연산을 활용해주세요.
		// 2. 90~81 점 B학점입니다. 단, 논리곱 연산을 활용해주세요.
		// 3. 80~71점 C학점입니다. 단, 논리곱 연산을 활용해주세요.
		// 4. F학점 입니다.

		if ((point <= 100) && (point > 90)) {
			result = 'A'; 
		} else if ((point <= 90) && (point > 80)) {
			result = 'B';	
		} else if ((point <= 80) && (point > 70)) {
			result = 'C';
		} else if (point < 70 && point >= 0) {
			result = 'F';
		}
		
		//방어적 코드
		if (result != 'Z') { //result의 값이 'Z'가 아니라면 = result의 값이 'A' , 'B', 'C',  'F'의 값이라면
			System.out.println(result + "학점 입니다.");
		} else {
			System.out.println("잘못된 값을 입력 하였습니다.");
		}

	}// end of main

}// end of class
