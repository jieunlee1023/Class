package ch04;

public class ForMainTest3 {

	// 코드의 시작점 (메인 함수, 메인 스레드)
	public static void main(String[] args) {

		for (int num = 2; num <= 9; num++) {
//			System.out.println("num : " + num);
			// 문제 이중 for문을 활용해서 구구단을 완성해주세요.
			//처음과 끝에는 ---------표시하지 마시오
			for (int count = 1; count <= 9; count++) {
				System.out.println(num + "단 : " + num + " * " + count + " = " + num * count);
			}
			//5단과 6단 사이에 -------------값을 출력 마시오
			//
			//단 , 예약어를 사용해주세요
			if (num==5) {
				continue;
			}
			if (num!=9) {
				System.out.println("------------");
			}


		}

	}// end of main

}// end of class
