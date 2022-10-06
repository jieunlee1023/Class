package ch04;

import java.util.Random;
import java.util.Scanner;

public class WhileMainTest4 {
	// 코드의 시작점 (메인 함수, 메인 작업자, 메인 쓰레드)
	public static void main(String[] args) {

		// 스캐너를 활용해서 간단한 콘솔 게임 만들기!
		Random random = new Random();
		int randomResult = random.nextInt(5) + 1; // 0 1 2 --> 0말고 1 2 3 원해

		// 야구 게임 (사용자한테 입력을 받아서 3번 안에 randomResult 값을 맞추는 게임)
		// 조건 3번안에 값을 맞추면 안타입니다. 화면에 출력, 3번 다 틀렸으면 아웃입니다. 화면에 출력
		Scanner scanner = new Scanner(System.in);
		int chance = 3;
		System.out.println("1~5까지 수 중 첫번째 숫자를 입력하세요!");

		int userNum;
		do {
			userNum = scanner.nextInt();

			if (userNum == randomResult) {
				System.out.println("입력숫자:" + userNum);
				System.out.println("랜덤숫자:" + randomResult);
				System.out.println("맞췄습니다! 안타입니다!");
				break;
			} else if (userNum != randomResult) {
				System.out.println("입력숫자:" + userNum);
				System.out.println("랜덤숫자:" + randomResult);
				System.out.println("틀렸습니다! 다시 입력하세요.");
				System.out.println("1~5까지 수 중 첫번째 숫자를 입력하세요!");
				// 만약 찬스가 1보다 작거나 같다면 아웃입니다.
				if (chance <= 1) {
					System.out.println("아웃입니다.");
					break;
				}
			} 
			chance--;
		} while (userNum != randomResult);

	} // end of main

} // end of class
