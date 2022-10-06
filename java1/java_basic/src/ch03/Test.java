package ch03;

public class Test {
	
	public static void main(String[] args) {
		//short circuit 문제를 직접 만들어서 카페에 올려주세요
				// 논리곱 문제 생성
		
				int num1 = 10;
				int num2 = 20;
				
				boolean num = ((num1 = num1*3)>100) && ((num2 = num2/5)>5);
				System.out.println(num1);
				System.out.println(num2);
				System.out.println(num);
				// 1. 변수 num1 출력 값을 구하시오.
				// 2. 변수 num2 출력 값을 구하시오.
				// 3. 논리형 변수 num 출력 값을 구하시오.
			
				
				int x = 10;
				int y = 20;
				
				boolean z = ((x+=2) > 15) &&( (y++) > 15);
				System.out.println(x);
				System.out.println(y);
				System.out.println(z);
				
				// 1. 변수 x의 출력 값을 구하시오.
				// 2. 변수 y의 출력 값을 구하시오.
				// 3. 변수 z 출력 값을 구하시오.
				
				// 논리합 문제 생성
				final int MAX_NUM = 100;
				final int MIN_NUM = 50;
				
				boolean nValue = ((MAX_NUM + 10) >100) || ( (MIN_NUM + 10) < 100);
				System.out.println(MAX_NUM);
				System.out.println(MIN_NUM);
				System.out.println(nValue);
				
				// 1. 상수 MAX_NUM출력 값을 구하시오.
				// 2. 상수 MIN_NUM 출력 값을 구하시오.
				// 3. 논리형 변수 nValue 출력 값을 구하시오.
				
	}

}
