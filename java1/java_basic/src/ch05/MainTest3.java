package ch05;

public class MainTest3 {
	// MainTest3 영역
	//멤버 변수 (member variable)
	int num1; //멤버 변수 (값을 할당하지 않으면 멤버 변수는 기본값으로 알아서 초기화 해준다.)
	double num2;

	public static void main(String[] args) {
		// 메인 함수영역
		// 지역 변수 (local variable)
		int temp1;
		System.out.println();	
	}
	
	public static int addNum (int n1, int n2) {
		int result; //지역변수 ( 반환을 할려면 반드시 초기화를 해주어야한다.)
		result = 10;
		return result;
	}

}
