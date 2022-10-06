package ch01;

public class DataType1_ex {
	//코드의 시작점
	public static void main(String[] args) {
		// 데이터 타입의 종류 (2가지)
		//1. 기본 데이터 타입
		//2. 참조 타입
		
		//기본 데이터 타입
		byte b ; //1바이트 크기 (8bit)
//		//b=128; -> byte 로 받을 수 있는 크기를 넘어섰다.
		b=127;
		b=-128;
		short s ; //2바이트 크기(16bit)
		int i ; //4바이트 (32bit)
		long l ; // 8바이트 (64bit)
		
//		i=21000000000; -> int 로 받을 수 있는 +-21억을 넘어섰다.
//		l=21000000000; 
//		-> 정수의 기본단위는 int , long의 경우 접미사를 사용해야한다 
//		(대소문자 구분없음, 다만 대문자를 선호)
		l = 21000000000L;
		
		double d ;
		float f;
		
		d=3.14;
//		f=3.14; -> 실수의 기본단위는 double , float의 경우 점미사를 사용해야한다.
//		(대소문자 구분없음, 다만 대문자 선호)
		f= 3.14F;
		
		// 기본 연산자 : 정수(int)  실수 (double)
		
	} //end of main

} //end of class
//블록의 범위는 절대적이다