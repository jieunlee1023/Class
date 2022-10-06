package ch03;

public class MainTest2 {
	
	//메인 작업자 (메인 쓰래드)
	//코드의 시작점
	public static void main(String[] args) {
		
		// 산술 연산자
		int number1 = 5 + 3;
		int number2 = 5 - 3;
		int number3 = 5 * 3;
		//double  number4 = 5 / 3;
		//형변환 되어서 1이 되었고, double을 만나 1.0의 결과 도출
		//double  number4 = 5 / 3D; -> 되긴 하지만 !
		double  number4 = 5.0 / 3.0;
		int number5 = 5 % 3;
		
		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);
		System.out.println(number4);
		System.out.println(number5);
		
		System.out.println("-----------");
		//문제
		//1. (12 + 3) / 3 값을 출력하고 값이 맞는지 검증해 보세요
		int num1 = (12 + 3) / 3;
		System.out.println(num1);
		double num2 = (12.0 + 3.0) / 3.0;
		System.out.println(num2);
		
		//2. (25%2) 값을 화면에 출력해보세요
		int num3 = (25%2);
		
		System.out.println(num3);

	}//end of main

}//end of class
