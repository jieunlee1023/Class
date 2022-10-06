package ch16;

public class MainTest {

	// 코드의 시작점 (메인 함수, 메인 스레드)
	public static void main(String[] args) {

		Car aiCar = new AICar(); // 업 캐스팅 상태, 다형성
		aiCar.run();

		System.out.println("----------------------");
		Car manualCar = new ManualCar();
		manualCar.run();
		// 템플릿 메서드 패턴 (final method)

		System.out.println(Define.MAX);
		System.out.println(Define.APPNAME);

	}// end of main
}// end of class
