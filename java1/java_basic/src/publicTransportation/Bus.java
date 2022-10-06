package publicTransportation;

public class Bus {

	private int busNum;
	private int busPassengerCount = 10;
	private int money;

	public Bus(int busNum) {
		this.busNum = busNum;

	}

	public int getBusNum() {
		return busNum;
	}

	public int getBusPassengerCount() {
		return busPassengerCount;
	}

	public int getMoney() {
		return money;
	}

	// 태우다
	public void take(int money) {
		this.busPassengerCount++;
		this.money += money;
	}

	// 내리다
	public void takeOff(int count) {
		if (busPassengerCount < count) {
			System.out.println("잘못된 요청입니다.");
		} else {
			this.busPassengerCount -= count;
			System.out.println(count + "명이 내립니다.");
		}
	}

	public void showInfo() {
		System.out.println("☆★☆버 스 상 태 창☆★☆");
		System.out.println("버스번호 : " + busNum + "번");
		System.out.println("현재 승객수 : " + busPassengerCount + "명");
		System.out.println("수익금 : " + money + "원");
		System.out.println("-------------------");
	}

}
