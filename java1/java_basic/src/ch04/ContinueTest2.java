package ch04;

public class ContinueTest2 {

	// 코드의 시작점 (메인 함수, 메인 스레드)
	public static void main(String[] args) {

		// 상수를 활용해서 코드에 가독성을 높혀보자!
		final int MULTIPLE = 7;
		final int MAX = 1000;

		int num = 0;
		int count = 0;
		for (num = 1; num <= MAX; num++) {
			// 만약 3의 배수이면 화면에 출력하지 마세요
			if (num % MULTIPLE == 0) {
				count++;
				continue;
			}
			// System.out.println("현재 값: "+num);
		}
		System.out.println(MULTIPLE + "의 배수는 " + count + "개 입니다.");

	}// end of main

}// end of class
