package ch01;

public class DataType4 {
	
	//코드의 시작점
	public static void main(String[] args) {
		
		//기본 자료형 -> 논리형 (사실을 관찰하고 결과값이 참, 거짓인지 판별)
		boolean isMarried = false; // 변수의 선언과 동시에 초기화
		System.out.println(isMarried);
		
		isMarried = true;
		//isMarried = 0; : 오류
		//isMarried = (boolean)0; : 형변환도 불가!
		System.out.println(isMarried);
		
		
	} //end of main

} //end of class
