package ch04;

import java.util.Scanner;

public class MainTest3 {

	public static void main(String[] args) {
		//3. 문제 MainTest3
		// 2번 문제 변수 하나를 상수로 변경해서 코드를 수정해 보세요.
		Scanner sc = new Scanner (System.in);
		System.out.println("시작 값을 입력하시오 : ");
		int start = sc.nextInt();
		System.out.println("마지막 값을 입력하시오 : ");
		final int END = sc.nextInt();
	
		int sum = 0;
		int i = start;
		for (i=0; start<=END ; start++) {
			sum = sum + start;
		}
		System.out.println( "입력받은 시작값과 종료값까지의 의 합은 : " +sum);
	}

}
