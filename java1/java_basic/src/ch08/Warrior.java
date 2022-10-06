package ch08;

public class Warrior {

	String name;
	int power;
	int damage = 100;

	public Warrior(String name) {
		this.name = name;
	}

	// 공격하다
	public void attack(int power) {
		this.power += power;
	}

	// 공격당하다
	public void beatteck(int damage) {
		if (this.damage != 0) {
			this.damage -= damage;
		} else if (damage <= 0) {
			System.out.println("전사는 죽었습니다");
		} 
	}

	public void warriorInfo() {
		System.out.println("전사 이름 : " + name);
		System.out.println("전사가 " + power + "만큼 공격했습니다.");
		System.out.println("전사가 현재 " + damage + "만큼 데미지를 입었습니다.");
	}
}
