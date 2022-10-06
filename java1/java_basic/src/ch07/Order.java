package ch07;

public class Order {

	long OrderNum;
	String PhoneNum;
	String address;
	int date;
	int time;
	int price;
	int menuNum;

	public Order(long OrderNum) {
		this.OrderNum = OrderNum;
	}

	public Order(long OrderNum, String PhoneNum, String address, int date, int time, int price, int menuNum) {
		this.OrderNum = OrderNum;
		this.PhoneNum = PhoneNum;
		this.address = address;
		this.date = date;
		this.time = time;
		this.price = price;
		this.menuNum = menuNum;
	}

	public void orderInfo() {
		System.out.println("주문번호 : " + OrderNum);
		System.out.println("휴대폰 번호: " + PhoneNum);
		System.out.println("주소 : " + address);
		System.out.println("날짜 : " + date);
		System.out.println("시간 : " + time);
		System.out.println("가격 : " + price);
		System.out.println("메뉴번호 : " + menuNum);
	}

}
