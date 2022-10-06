package ch08;

public class Subway {

	// 노선 번호
	// 승객 수
	// 수익금
	int subwayNum;
	int passangerCount;
	int money;

	// 생성자

	public Subway(int subwayNum) {
		this.subwayNum = subwayNum;
	}

	// 타다
	public void take(int money) {
		this.passangerCount++;
		this.money += money;
	}

	// 내리다
	public void takeOff(int count) {
		if (passangerCount < count) {
			System.out.println("잘못된 값입니다.");
		} else {
//		this.passangerCount--;
			this.passangerCount -= count;
		}
	}

	// showInfo 메서드
	public void showInfo() {
		System.out.println("지하철 "+subwayNum+"호선");
		System.out.println("현재 승객수는 "+passangerCount+"명 입니다." );
		System.out.println("현재 수익금은 "+ money +"원 입니다.");
	}

}
