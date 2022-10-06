package ch09;

public class Hero {

	private String name;
	private int hp;
	private int power;
	private double defense;
	private int level;

	// getter , setter 메서드를 만들어주세요.
	// 단, setter메서드에 방어적 코드를 넣어주세요.
	// setName 메서드를 만들 때 2글자 이상 입력하게 만드시오. (.length)
	// setLevel 방어적 코드 0 보다 작은 수 입력을 막아주세요.

	public String getName() {
		return this.name;
	}

	public int getHp() {
		return this.hp;
	}

	public int getPower() {
		return this.power;
	}

	public double getDefense() {
		return this.defense;
	}

	public int getLever() {
		return this.level;
	}

	public void setName(String name) {
		if (name.length() < 2) {
			System.out.println("잘못입력하셨습니다. ");
			System.out.println("이름은 2글자 이상 입력해주세요!");
		} else {
			this.name = name;
		}
	}

	public void setHp(int hp) {
		if (hp <= 0) {
			System.out.println("영웅이 죽었습니다.");
		} else {
			this.hp = hp;
		}
	}

	public void setPower(int power) {
		if (power >= 100) {
			System.out.println("공격력의 범위를 넘어섰습니다.");
		} else {
			this.power = power;
		}
	}

	public void setDefense(double defense) {
		if (defense <= 0) {
			System.out.println("방어력0, 다시 이용하려면 체력을 채우세요");
		} else {
			this.defense = defense;
		}
	}

	public void setLevel(int level) {
		if (level < 0) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			this.level = level;
		}
	}

	public void heroInfo() {
		System.out.println("-------------------");
		System.out.println("전사의 이름 : " + name);
		System.out.println("전사의 현재 hp : " + hp);
		if (power == 0) {
			System.out.println("전사의 공격력 : -");
		} else {
			System.out.println("전사의 현재 공격력 : " + power);
		}
		System.out.println("전사의 현재 방어력 : " + defense);
		System.out.println("전사의 현재 레벨 : " + level);
	}
}
