package ch04;

public class WhileMainTest {
	// 코드의 시작점 (메인 함수, 메인 스레드)
	public static void main(String[] args) {

		// 1~10까지 연산
		// while (조건식)
		// 무한 반복을 조심하자!
		int num = 1;
		int sum = 0;

		while (num <= 10) {
			System.out.println("현재값 : " + num);
			sum = sum + num;
			num++;

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

		while (num <= 50) {
			System.out.print("-");
			try {
				//메인 쓰래드 (0.01초 잠들고 일어나서 다시 수행해!)
				Thread.sleep(100);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			num++;
		}
		System.out.println("연산에 대한 결과 값은 : " + sum + "입니다.");

	}// end of main

}// end of class
