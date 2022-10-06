package a;

public class Phone {

	private String name;
	private final String FIRST_NUM = "010";
	private int middleNum;
	private int lastNum;

	public Phone() {
	}

	public Phone(String name, int middleNum, int lastNum) {
		this.name = name;
		this.middleNum = middleNum;
		this.lastNum = lastNum;
	}

	public void showInfo() {
		System.out.println("-☏-☎-☏-☎-☏-☎-☏");
		System.out.println("☎ 전 화 번 호 부 ☎");
		System.out.println("이름 : " + name);
		System.out.println("휴대폰 번호 : " + FIRST_NUM + "-" + middleNum + "-" + lastNum);
		System.out.println("☎-☏-☎-☏-☎-☏-☎-☏");
	}

	public void showInfoName() {
		System.out.println("이름 : " + name);
	}

}
