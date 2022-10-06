package ch03;

import java.util.Scanner;

public class MainTest8_ex {
	//메인 작업자 (메인 스레드)
	//코딩의 시작점
	public static void main(String[] args) {
		//클론 코딩 (소수점을 비교해서 큰 수를 화면에 출력하시오!!)
		//조건1.  Scanner를 사용해주세요
		//조건2.  삼항 연산자를 사용해서 판별해 주세요

		Scanner sc = new Scanner(System.in);
		System.out.println("입력받은 두 수를 비교하여 큰 수를 화면에 출력합니다.");
		double max = 0;
		System.out.println( "첫번째 실수를 입력하시오 : ");
		double a = sc.nextDouble();
		System.out.println( "두번째 실수를 입력하시오 : ");
		double b = sc.nextDouble();
		
		max = (a > b) ? a : b;
		System.out.println("입력 받은 두 수 중 큰 수는 " + max + " 입니다.");
	}//end of main

}//end of class
