package ch04;

import java.util.Scanner;

public class WhileMainTest3 {
	// 코드의 시작점 (메인 함수, 메인 작업자, 메인 쓰레드)
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int userInput ;
		
		do { //반드시 한번은 실행 해야 할 .. !
			System.out.println("** ================ **");
			System.out.println("메뉴를 선택해주세요.");
			System.out.println("0번 : 프로그램 종료");
			System.out.println("1번 : 메인화면 출력");
			
			userInput = scanner.nextInt();
		}while (userInput !=0);
		System.out.println("프로그램을 종료합니다.");


	} // end of main

} // end of class
