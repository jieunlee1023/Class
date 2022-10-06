package ch15;

public class FruitMainTest {

	public static void main(String[] args) {

		// 다양한 형태로 클래스를(타입을) 바라볼 수 있다. -> 다형성
		Fruit fruit1 = new Banana(); // 업 캐스팅 상태
		Fruit fruit2 = new Peach(); // 업 캐스팅 상태

//		fruit1.showInfo();
//		fruit2.showInfo();

		// 스캐너에 넘겨받은 값이 1이면 복숭아 2이면 바나나
		Fruit fruit;

		int userInput = 1;
		fruit = new Banana();
		// instanceof 키워드는 객체의 타입을 확인한다.
		if (fruit instanceof Banana) {
			System.out.println("바나나 타입이 맞습니다.");
			System.out.println("원산지 : " + ((Banana) fruit).orgin); // 다운 캐스팅

			// 화면에 원산지를 출력해주세요.
		} else if (fruit instanceof Peach) {
			System.out.println("복숭아 타입이 맞습니다.");
		}
		fruit.showInfo(); // 부모타입으로 바라봐서 하나의 코드로 정리가능~!
	}

}
