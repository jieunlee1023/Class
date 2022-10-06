package ch03;

public class MainTest5_ex {
	//메인 작업자 (메인 스레드)
	//코드의 시작점
	public static void main(String[] args) {

		//관계 연산자
		int number1 = 5;
		int number2 = 3;
		
		boolean result = 5 > 3 ;
		System.out.println(result);
		boolean result1 = 5 < 3;
		System.out.println(result1);
		boolean result2 = (number1==number2);
		System.out.println(result2);
		boolean result3 = (number1!=number2);
		System.out.println(result3);
		
	}//end of main

}//end of class
