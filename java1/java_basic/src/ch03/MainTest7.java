package ch03;

//수입하다 (가지고오다)
 import java.util.Scanner;

public class MainTest7 {
	
	//메인 작업자 (메인 스레드)
	//코딩의 시작점
	public static void main(String[] args) {
		
		//삼항 연산자
		//조건식 ? 결과1 : 결과2
		
		int num1 = (5 > 1) ? 10 : 20;
//		System.out.println(num1);
		
		// JDK 
		int max = 0;
		System.out.println("입력 받은 두 수 중 큰 수를 출력하세요");
		
		Scanner sc = new Scanner(System.in);
		//Scanner : 키보드의 값을 입력 받을 수 있게 하는 기능
		System.out.println("입력 1 : ");
		int x = sc.nextInt(); //nextInt : 정수 값을 받을 수 있구나!
		System.out.println("입력 2 : ");
		int y = sc.nextInt();
		

		max = (x > y) ? x : y ;		
		//화면에 큰 수를 출력하고 싶다!! (사용자가 입력한 값을!!!)
		System.out.println("사용자가 입력한 x와 y의 값 중에 큰 수는 "+max+" 입니다");
		
		
		
	}//end of main

}//end of class
