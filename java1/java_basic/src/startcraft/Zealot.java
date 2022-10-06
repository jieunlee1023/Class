package startcraft;

public class Zealot {

	// private int id;
	private String name;
	private int power;
	private int hp;

	public Zealot(String name) {
		this.name = name;
		this.power = 10;
		this.hp = 100;
	}
	

	public String getName() {
		return name;
	}

	public int getPower() {
		return power;
	}

	public int getHp() {
		return hp;
	}

	// 마린을 공격합니다
	public void attackMarine(Marine marine) {
		System.out.println(this.name + "이(가) " + marine.getName() + "을 공격합니다.");
		// 질럿의 공격력 this.power
		marine.beAttacked(this.power);
	}

	// 저글링을 공격합니다.
	public void attackZergling(Zergling zergling) {
		System.out.println(this.name + "이(가) " + zergling.getName() + "을 공격합니다.");
		zergling.beAttacked(this.power);

	}

	// 공격을 당합니다
	public void beAttacked(int power) {
		this.hp -= power;
		if (hp <= 0) {
			System.out.println(this.name + "은 사망하였습니다.");
			hp = 0;
		} else {
			System.out.println(this.name + "이 공격 당했습니다.");
		}
	}

	public void showInfo() {
		System.out.println("--------정보창--------");
		System.out.println("이름 : " + name);
		System.out.println("공격력 : " + power);
		System.out.println("생명력 : " + hp);
	}

}
