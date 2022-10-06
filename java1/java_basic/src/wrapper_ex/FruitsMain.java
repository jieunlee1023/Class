package wrapper_ex;

public class FruitsMain {

	public static void main(String[] args) {

		Fruits fruits = Fruits.STRAWBERRY;
		switch (fruits) {
		case APPLE:
			System.out.println("사과 입니다.");
			break;
		case BANANA:
			System.out.println("바나나 입니다");
			break;
		case STRAWBERRY:
			System.out.println("딸기 입니다.");
			break;
		default:
			System.out.println("현재 판매하지 않는 과일입니다.");
		}
	}

}
