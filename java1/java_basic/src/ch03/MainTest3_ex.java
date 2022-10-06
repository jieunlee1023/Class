package ch03;

public class MainTest3_ex {

	//메인 작업자 (메인 스레드)
	//코딩의 시작점
	public static void main(String[] args) {
		
		//복합 대입 연산자
		int num1 = 1;
		num1  = num1 + 10;
		num1 +=10;
		System.out.println(num1);
		
		int num2 =1;
		num2 = num2-10;
		num2 -=10;
		System.out.println(num2);

		// 문제) 복합 연산자로 변경해 보세요
		num1 = num1 * 2;
		num1 *= 2;

		num1 = num1 / 2;
		num1 /= 2;

		num1 = num1 % 2;
		num1 %= 2;
	}//end of main

}//end of class
