package ch05;

public class MainTest2 {

	// 코드의 시작점 (메인 작업자, 메인 스레드, 메인 함수)
	public static void main(String[] args) {

		Warrior w1 = new Warrior();
		w1.name = "오크";
		w1.height = 10;
		w1.power = 100;
		w1.color = "초록색";

		// 변수 이름은 w2
		// 몬스터 하나 더 값을 할당해서 만들고
		// w2에 대한 정보를 화면에 출력해주세요.

		Warrior w2 = new Warrior();
		System.out.println(w2);
		w2.name = "엘프";
		w2.height = 20;
		w2.power = 200;
		w2.color = "하늘색";

		System.out.println("==========상태창==========");
		System.out.println("이름 : " + w2.name);
		System.out.println("키 : " + w2.height);
		System.out.println("공격력 : " + w2.power);
		System.out.println("색상 : " + w2.color);
		System.out.println("==========상태창==========");

	}// end of main

}// end of class
