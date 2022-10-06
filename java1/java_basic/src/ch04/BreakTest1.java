package ch04;

public class BreakTest1 {
	// 코드의 시작점 (메인 함수, 메인 쓰레드)
	public static void main(String[] args) {

		// 예약어 break;
		// 중간에 멈추는 break;
		for (int i = 1; i <= 10; i++) {
			System.out.println("i : " + i);
			// 만약 i 값이 소수 7이면 멈추어라.
			if (i % 7 == 0) {
				break;
			} //end of if
			
			//break 구문은 가장 가까운 하나의 for문을 종료시킨다.
			
		}//end of for

	}// end of main
	
}// end of class
