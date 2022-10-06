package ch09;

public class WarriorWizard {

	// 1번 누르면 warrior 생성 , 2번 누르면 wizard 생성

	String name;
	int power;
	int damage = 100;

	public WarriorWizard() {
	}

	public void charName(String name) {
		this.name = name;
	}

	public void attack(int power) {
		// 0
		// this.power = power;
		if (power >= 100) {
			System.out.println("사용할 수 있는 공격력의 범위를 넘었습니다.");
		} else {
			this.power += power;
		}
	}

	public void beAttack(int damage) {
		int minusDamage = this.damage - damage;
		if (minusDamage <= 0) {
			System.out.println("죽었습니다. 게임오버!");
		} else {
			this.damage -= damage;
		}
	}

	public void wizardInfo() {
		System.out.println("=====상태창=====");
		System.out.println("이름 : " + name);
		if (power >= 100 || power <= 0) {
			System.out.println("현재 공격력 : 0");
		} else {
			System.out.println("전사가 " + power + "만큼 공격했습니다.");
		}
		if (damage>=100) {
			System.out.println("현재 체력 : 0");
		}else {
			System.out.println("체력이 "+ damage + "남았습니다.");
		}
		System.out.println("==============");
	}

}
