package ch01;

public class MainTest_ex {
	//코드의 시작점
	public static void main(String[] args) {

		char ch1 = 'A';
		System.out.println(ch1);
		// 형변환
		System.out.println((int)ch1);
		
		// 안녕하세요를 정수형으로 변환하고 출력해보세요
		char ch2 ='안';
		char ch3 ='녕';
		char ch4 ='하';
		char ch5 ='세';
		char ch6 ='요';
		
		System.out.print((int)ch2);
		System.out.print((int)ch3);
		System.out.print((int)ch4);
		System.out.print((int)ch5);
		System.out.print((int)ch6);
		
	} //end of main

} //end of class

//블록의 범위는 절대적이다