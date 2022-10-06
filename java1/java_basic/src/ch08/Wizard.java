package ch08;

public class Wizard {

	String name;
	int physical = 1000;
	int power;

	public Wizard(String name) {
		this.name = name;
		this.physical = physical;
	}

	public void attack(int power) {
		this.power += power;
	}

	//this.physical을 0으로 초기화 하지 않고, 식으로 어떻게?!
	public void damage(int physical) {
		if ((this.physical - physical) <= 0) {
			this.physical = 0;
			System.out.println("마법사가 죽었습니다.");
		} else {
			this.physical -= physical;
			System.out.println("마법사의 현재 체력은 "+physical+"입니다.");
		}
		System.out.println(this.physical);
	}

	public void wizardInfo() {
		System.out.println("=====상태창=====");
		System.out.println("마법사 이름 : " + name);
		System.out.println("마법사의 현재 체력: " + physical);
		System.out.println("마법사의 공격력: " + power);
	}
}
