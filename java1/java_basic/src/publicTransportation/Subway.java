package publicTransportation;

public class Subway {

	private int subwayNum;
	private int SubwayPassengerCount = 10;
	private int money;

	public Subway(int subwayNum) {
		this.subwayNum = subwayNum;
	}

	public int getSubwayNum() {
		return subwayNum;
	}

	public int getSubwatPassengerCount() {
		return SubwayPassengerCount;
	}

	public int getMoney() {
		return money;
	}

	// 태우다
	public void take(int money) {
		this.SubwayPassengerCount++;
		this.money += money;
	}

	// 내리다
	public void takeOff(int count) {
		if (SubwayPassengerCount < count) {
			System.out.println("잘못된 요청입니다.");
		} else {
			this.SubwayPassengerCount -= count;
			System.out.println(count + "명이 내립니다.");
		}
	}

	public void showInfo() {
		System.out.println("☆★☆지 하 철 상 태 창☆★☆");
		System.out.println("지하철 호선 : " + subwayNum + "호선");
		System.out.println("현재 승객수 : " + SubwayPassengerCount + "명");
		System.out.println("수익금 : " + money + "원");
		System.out.println("-------------------");
	}

}
