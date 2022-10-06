package ch03;

import java.util.Scanner;

public class MainTest8 {
	//메인 작업자 (메인스레드)
	//코드의 시작점
	public static void main(String[] args) {
		
		//클론 코딩 (소수점을 비교해서 큰 수를 화면에 출력하시오!!)
		//조건1.  Scanner를 사용해주세요
		//조건2.  삼항 연산자를 사용해서 판별해 주세요
		Scanner sc = new Scanner(System.in);
		double max = 0;
		System.out.println("첫번째 수를 입력하시오: ");
//		int x = sc.nextInt();
		double x = sc.nextDouble();
		System.out.println("두번째 수를 입력하시오: ");
		double y = sc.nextDouble();
		
		max = (x > y) ? x : y ;
		System.out.println("두 수 중 더 큰 수는 "+max+ " 입니다. ");
		
		short j = sc.nextShort();
		long i = sc.nextLong();

	}//end of main

}//end of class
