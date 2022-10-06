package publicTransportation;

public class People {

	private String name;
	private int age;
	private int money;

	public People(String name, int age) {
		this.name = name;
		this.age = age;
		this.money = 10000;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getMoney() {
		return money;
	}

	// 사람이 버스를 타다
	public void busTake(Bus bus) {
		int payMoney = 1500;
		System.out.println(this.name + "이(가) " + bus.getBusNum() + "번 버스를 탑니다.");
		if (age < 10) {
			payMoney = 1000;
		} else if (age >= 10 && age<20) {
			payMoney = 1500;
		} else if (age >= 20) {
			payMoney = 2000;
		}
		this.money -= payMoney;
		bus.take(payMoney);

	}

	//사람이 버스를 내리다
	public void busTakeOff(Bus bus) {
		System.out.println(this.name + "이(가) " + bus.getBusNum() + "번 버스를 내립니다.");

	}

	//사람이 지하철을 타다
	public void subwayTake(Subway subway) {
		System.out.println(this.name + "이(가) " + subway.getSubwayNum() + "호선을 탑니다.");
		int payMoney = 0;
		if (age < 10) {
			payMoney = 500;
		} else if (age < 20) {
			payMoney = 1000;
		} else if (age >= 20) {
			payMoney = 1500;
		}
		this.money -= payMoney;
		subway.take(payMoney);

	}

	//사람이 지하철을 내리다
	public void subwayTakeOff(Subway subway) {
		System.out.println(this.name + "이(가) " + subway.getSubwayNum()+"호선을 내립니다.");

	}

	// 인포
	public void showInfo() {
		System.out.println("☆★☆사 람 상 태 창☆★☆");
		System.out.println("사람 이름 : " + name);
		System.out.println("사람 나이 : " + age +"살");
		System.out.println("남은 돈 : " + money +"원");
		System.out.println("-------------------");
	}

}
