package ch01;

public class DataType2_ex {
	//코드의 시작점
	public static void main(String[] args) {
		
		char name;
		char a;
		char initial;
		
		name = 'A'; //값을 초기화 하는 방법

		//name = "A"; 오류발생  (char type은 홑 따옴표를 사용해야 한다)
		//name = 'AB'; 오류발생 ( char type은 단 하나의 문자를 저장할 수 있다)

		System.out.println(name);
		
		//문제
		//1. name 변수를 화면에 출력하시오
		System.out.println(name);
		//2. 문자 a를 화면에 출력하시오
		System.out.println('A') ;
		//3. 문자 b를 화면에 출력하시오
		System.out.println('B') ;
		//4. 문자 c를 화면에 출력하시오
		System.out.println('C') ;
		

	}

}
