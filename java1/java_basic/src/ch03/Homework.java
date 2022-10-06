package ch03;

import java.util.Scanner;

public class Homework {
	// 메인 작업자 (메인 스레드)
	// 코딩의 시작점
	public static void main(String[] args) {
		// 연산자, 형변환 관련 문제 10개 만들고 해설까지
		// [연산자문제]
		// 증감, 감소 연산자 문제
		int num1 = 10;
		int num2 = num1++;
		
		//(1) 위 식에서 num1의 값과 num2의 값을 구하시오
		System.out.println(num1); //11
		System.out.println(num2); //10
		
		//(2-1) 아래 식이 이어지는 경우 num1의 값과 num2의 값을 구하시오 
		num2 = --num1;
		System.out.println(num1); //10
		System.out.println(num2); //10
		
		//(2-2) 아래 식이 이어지는 경우 num1의 값과 num2의 값을 구하시오 
		num2 = num1--;
		System.out.println(num1); //10
		System.out.println(num2); //11
		
		//해설 : 증감, 감소 연산자는 '변수에 접근해서' 변수의 값에 1을 더할 때 사용하는데,
		//statement를 기준으로 (++) (--)부호가 앞에 있을 때와 뒤에 있을 때 다르게 동작한다.
		//즉, 세미콜론이 끝나고 +1이 추가 된다.
		
		// (1)번 문제 : 변수 num1은 증감연산자의 영향으로 11의 값으로 바뀌지만, 변수 num2는 10이라는 결과 값을 갖게 된다.
		// (2-1)번 문제 : 현재 num1의 값은 11, num2의 값은 10 (+1) 이다. (--) 부호가 앞에 붙어 있으므로, 
		//                       num1은 감소 연산자의 영향을 받아 10이 되고, num2의 값 또한 영향을 받아 세미콜론 뒤에 추가된 1이 감소된 10이 된다.
		// (2-2)번 문제 : 현재 num1의 값은 11, num2의 값은 10 (+1) 이다. (--) 부호가 뒤에 붙어 있으므로,
		//                      num1은 감소 연산자의 영향을 받아 10이 되지만, num2의 값은 11이 된다. 세미콜론 뒤 (-1)이 추가 된다.
		
		// 논리 연산자 문제
		
		//(3)번 문제:
		//10은 2와 5의 배수인가? 논리 곱을 이용하여 식을 만들고, 결과 값을 구해보시오.
		int mul1 = 10;
		boolean result = (mul1%2==0) && (mul1%5==0);
		System.out.println(result); //true
		
		//해설 : 어떠한 숫자의 배수를 확인 하기 위해서는,
		//          그 수로 나누어 나머지가 0이면(나누어 떨어지면) 그 배수임을 확인 할 수 있다.
		//          논리 곱은 두 조건을 모두 만족했을 때 참인 논리 연산자이다.
		//          문제에서 10이 2와 5의 배수인가를 확인하기 위해서는
		//          정수인 변수 mul1에 10을 할당하고 2와 5로 나누어 나머지가 0인 경우 참이 된다.
		//          결과를 확인하면 true. 10은 2와 5의 배수이다.
		
		
		//(4)번 문제: 아래의 식에서 x,y,z 출력 값을 구하시오.
		int x = 5;
		int y = 10;
		boolean z = ((x+=30)>50) && ((y=20)==20);
		System.out.println(x); //35
		System.out.println(y); //10
		System.out.println(z); //flase
		
		//해설: 논리 곱(&&)은 하나라도 거짓이면 결과가 false(거짓)이다.
		//위 식에서 첫번째 항에 x가 5가 들어가서 35의 결과를 나타내지만,
		// 50보다 작기 때문에 첫번째 항은 false 이다. (해서, 논리 곱인 변수 z는 false의 결과를 갖는다)
		//따라서, 두번째 항인 y의 값을 컴퓨터는 계산 조차 하지 않게 되고,
		//그렇기 때문에 변수 y에 20의 수를 넣었더라도, 전에 할당한 10의 결과를 출력한다.
		
		//(5)번 문제: 아래의 식에서 a,b,c 출력 값을 구하시오.
		int a = 5;
		int b = 10;
		boolean c = ((a*=2)<100) || ((b=b+5)>10);
		System.out.println(a); //10
		System.out.println(b); //10
		System.out.println(c); //true
		
		//해설: 논리 합(||)은 하나라도 참이면 결과가 true(참)이다.
		//위 식에서 첫번째 항에 a = a*2 , a의 결과 값은 10이다. (참)
		// 논리 합이므로 첫번째 항이 참이므로 c의 값은 true가 된다.
		//따라서, 두번째 항인 b의 값을 컴퓨터는 계산 조차 하지 않게 되고, (이미 true존재)
		//그렇기 때문에 변수 b에 10의 수를 넣었더라도, 전에 할당한 10의 결과를 출력한다.
		

		//삼항 연산자 문제
		//(6)번 문제: 
		//정수형 4byte 데이터 타입으로 두 수를 입력받아, 두 수 중 더 작은 수를 출력하시오.
		//단, 삼항 연산자를 사용하여야함
		Scanner sc = new Scanner(System.in);
		int min = 0;
		System.out.println("*입력하신 두 수 중 작은 수를 골라드립니다*");
		System.out.println("첫번째 수를 입력하시오: ");
		int n = sc.nextInt();
		System.out.println("두번째 수를 입력하시오: ");
		int m = sc.nextInt();
		
		min = (n > m) ? m : n;
		System.out.println("입력하신 두 수 중 작은 수는 "+min+" 입니다!");
		
		//해설: 정수형 4byte 데이터 타입은 int 입니다.
		//        두 수를 '입력' 받아야하므로 java에서 import하는 Scanner을 불러옵니다.
		//        입력 받은 두 수를 비교 해 작은 수를 나타내 줄 변수를 설정합니다.
		//        두 정수를 입력 받을 수 있도록 코드를 작성합니다.
		//        삼항 연산자 공식 : (조건식) ? 결과값1 : 결과값2 ;
		//        두 수 중 작은 수를 결과로 도출 해야하므로 조건식 n > m 일 때
		//        결과값 1은 참일 때의 값이므로 m이
		//        결과값 2는 거짓일 때의 값으므로 n이 출력됩니다. 
		
		//[형변환 문제]
		// (7)번 문제 : 두 수를 소수점까지 곱셈 연산 하시오.
		int iNum = 20;
		double dNum = 30.123;
		
		double resultNum = iNum * dNum;
		System.out.println(resultNum);
		
		//해설 : 묵시적 (자동) 형 변환에 관한 문제이다.
		//          double (8byte) > int (4byte)
		
		//(8)번 문제 : 정수인 변수 i를 소수점으로 출력하시오. 단, 코드는 출력 코드만 나타내시오. 
		int i = 100;
		System.out.println((double)i);
		
		//해설 : 명시적 (강제) 형 변환을 묻는 문제이다. 
		
		// (9)번 문제 : 변수 p와 q를 더하시오. 단, 소수점은 나타내지 마시오.
		int p = 12345678;
		double q = 1.2345678;
		
		System.out.println(p+(int)q);
		
		//정답 12345679
		// 해설 : 명시적 (강제) 형 변환을 묻는 문제이다.
		//			  정수형으로 형 변환! (소수점의 경우 강제 형변환으로 데이터 손실 발생)

		
		// (10)번 문제 :
		// 정수 76, 79, 86, 69를 문자형으로 형변환 하면 어떤 단어가 나오는지 확인하시오. (출력시 줄바꿈 X)
		
		int ch1 = 76;
		int ch2 = 79;
		int ch3 = 86;
		int ch4 = 69;
		
		System.out.print((char)ch1);
		System.out.print((char)ch2);
		System.out.print((char)ch3);
		System.out.print((char)ch4);
		
		//정답 : LOVE
		//해설 : 명시적 (강제) 형변환을 묻는 문제이다. / 정수형을 문자형으로 형 변환 (디코딩)

	}// end of main

}// end of class
