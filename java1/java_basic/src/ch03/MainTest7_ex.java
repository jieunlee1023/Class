package ch03;

import java.util.Scanner;

public class MainTest7_ex {
	//메인 작업자 (메인 스레드)
	// 코딩의 시작점
	public static void main(String[] args) {

		// 삼항 연산자
		// 조건식 () ? 결과1:결과2
		
		int num1 = ( 5 > 1 ) ? 10:20;
		System.out.println(num1);
		
		//JDK
		int max = 0;
		System.out.println("입력받은 두 수 중 큰 수를 입력하시오!");
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력하시오.");
		int x = sc.nextInt();
		System.out.println("두번째 정수를 입력하시오.");
		int y = sc.nextInt();
		
		max = (x > y) ? x : y ;
		System.out.println(" 두 수 중 더 큰 수는 "+ max+ " 입니다.");
		
		
		
		
	}//end of main

}//end of class
