package ch01;

public class MainTest {
	
	public static void main(String[] args) {
		
		char ch1 = 'A';
		System.out.println(ch1);
		
		// 형변환 (데이터 타입을 변환한다)
		System.out.println((int)ch1);
		
		char ch2 = 'F';
		System.out.println((int)ch2);
		
		char ch3 = 66;
		System.out.println(ch3);
		
		//문제
		// 안녕하세요를 정수형으로 변환하고 출력해보세요
		char ch4 = '안';
		char ch5 = '녕';
		char ch6 = '하';
		char ch7 = '세';
		char ch8 = '요';
		System.out.println((int)ch4);
		System.out.println((int)ch5);
		System.out.println((int)ch6);
		System.out.println((int)ch7);
		System.out.println((int)ch8);
		
		
	}

}
