package ch07;

public class OrderMain {

	public static void main(String[] args) {

		Order order1 = new Order(202106250003L);
		Order order2 = new Order(202106250003L, "01023450001", "부산시 해운대구 우동 111-333", 20210625, 130258, 35000, 0003);

		order1.orderInfo();
		System.out.println("============");
		order2.orderInfo();
	}
}
