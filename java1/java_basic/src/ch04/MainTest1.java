package ch04;

import java.util.Scanner;

public class MainTest1 {

	// 메인 작업자 (메인 함수, 메인 스레드)
	public static void main(String[] args) {

		// 1. 문제 
		// a = 10 , b 변수에 20 담아 둔다.
		// a변수와 b 변수의 값을 서로 바꿔서 출력해보세요.

		int a = 10;
		int b = 20;

		a = b;
		System.out.println("a:"+a);
		
		b = 10;
		System.out.println("b:"+b);
		

		

	}// end of main

}// end of class
