package ch04;

public class ContinueTest1 {

	// 코드의 시작점 (메인 함수, 메인 스레드)
	public static void main(String[] args) {

		// 예약어 continue
		// 무시하고 진행하는 continue

		// final int MULTIPLE = 7;

		int num = 0;
		int count = 0;
		//1부터 10안에 2의 배수의 갯수를 출력하시오~
		for (num = 1; num <= 77; num++) {
			if (num % 2 == 0) {
				//2의 배수이다
				count++;
				//count = count + 1;
				continue;
			}
			//2의 배수는 출력하지 마시오.
			System.out.println("num: "+num);
		}
		System.out.println("2의 배수는 " + count + "개 입니다.");

	}// end of main

}// end of class
