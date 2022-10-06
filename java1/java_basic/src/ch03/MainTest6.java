package ch03;

public class MainTest6 {
	//메인 작업자 (메인 매소드)
	//코드의 시작점
	public static void main(String[] args) {

		//논리 연산자 
		
		int num1 = 10;
		int num2 = 20;
		
		//논리곱 && : 하나라도 거짓이 있으면 연산의 결과는 false이다.
		boolean flag1 = (num1 > 0) && (num2 > 0);
		System.out.println(flag1);
		
		flag1 = (num1 > 0) && (num2 < 0);
		System.out.println(flag1);
		
		//논리합 || : 하나라도 참이 있으면 연사느이 결과는 true이다.
		boolean flag2 = (num1 >0) || (num2 >0 );
		System.out.println(flag2);
		
		flag2 = (num1 < 0) || (num2 > 0 );
		System.out.println(flag2);
		
		flag2 = (num1 < 0) || (num2 < 0 );
		System.out.println(flag2);
		
		System.out.println("=================");
		System.out.println(!flag2); //부정
		
		System.out.println(flag2);
		System.out.println("=================");
		
		boolean flag3 = !(5 > 3);
		System.out.println(flag3);
		
		/////////////////////////////////////////////
		//short circuit 
		
		int n = 5;
		int i = 0;
		boolean mValue = ( ( n = n+10 ) > 10 ) && ( ( i = i + 2 ) < 10 );
		System.out.println(n);
		System.out.println(i);
		System.out.println(mValue);
		
//		boolean mValue = ( ( n = n+10 ) < 10 ) && ( ( i = i + 2 ) < 10 );
//		// 첫번째 식인 ( n = n+10 ) < 10 )  에서 이미 false면 뒤 식은 평가하지 않음
//		// 따라서 i의 값은 0으로 나타남 (2 아님)
//		System.out.println(n);
//		System.out.println(i);
//		System.out.println(mValue);		
//		
//		boolean mValue = ( ( n = n+10 ) < 10 ) || ( ( i = i + 2 ) < 10 );
//		System.out.println(n);
//		System.out.println(i);
//		System.out.println(mValue);		
		
		//short circuit 문제를 직접 만들어서 카페에 올려주세요
		// 논리곱 문제 생성
		int number1 = 10;
		int number2 = 20;
		
		boolean nValue = ((number1 = number1*3)>100) && ((number2 = number2/5)>5);
		System.out.println(number1);
		System.out.println(number2);
		System.out.println(nValue);
		
		final int MAX_NUM = 100;
		final int MIN_NUM = 50;
		
		boolean num = ((MAX_NUM+10)<100) && ( (MIN_NUM+10) >100);
	
		
	}//end of main

}//end of class
