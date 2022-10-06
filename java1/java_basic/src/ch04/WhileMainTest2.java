package ch04;

public class WhileMainTest2 {
	//코드의 시작점 (메인 함수, 메인 작업자, 메인 쓰레드)
	public static void main(String[] args) {
		
		/*
		while (조건식) {
			수행문;
		}
		
		do {
			수행문
		} while (조건식);
		
		*/
		
		int num = 1;
		int sum = 0;
		// 1 + 2 + 3 + ...+10
		
		// 10 + 9 + 8 + ... + 1
		do {
			System.out.println("현재의 값: "+num);
			sum = sum +num;
			num++;
		}while(num<=10);
		System.out.println("sum에 대한 결과 값은 : "+sum);
		
		// 문제 1. 
		// do - while 문을 활용해서
		//10 + 9 + 8 + ... +1 에 대한 연산을 하고 화면에 출력해주세요.
		//do-while문은 반드시 한번은 수행이 되어야 할 때 사용하는 구문 입니다.
		
		int input = 10;
		int inputSum = 0;
		
		do {
			System.out.println("현재의 값: " + input);
			inputSum = inputSum + input;
			input--;
		}while (input<=10 && input>0 /*input !=0*/);	
		//.. 식 작성
		System.out.println("inputSum의 결과값 : " + inputSum);
		
		
	} // end of main

} // end of class
