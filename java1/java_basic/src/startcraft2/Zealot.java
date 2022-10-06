package startcraft2;

public class Zealot {

	// private int id;
	private String name;
	private int power;
	private int hp;

	public Zealot(String name) {
		this.name = name;
		this.power = 10;
		this.hp = 100;

		// 메서드 오버로딩
//		System.out.println("질럿생성");
//		System.out.println(1);
//		System.out.println(1.0);
//		System.out.println(true);
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

	// 메서드 오버로딩
	// : 같은 이름으로 메서드를 선언하지만 매개변수 개수나 타입에 따라서 구분해서 호출할 수 있다.
	
	//강제 공격
	public void attack(Zealot zealot) {
		//질럿2의 주소값을 매개변수로 받아 놓은 상태..
		// this는 질럿1
		if (this == zealot) {
			System.out.println("자기 자신을 공격할 수 없습니다.");
			//1. return 값을 반환할 때 사용한다.
			//2. 실행의 흐름을 종료 시킬 때도 사용한다.
			return;
		}
		System.out.println(this.name + "이(가) " + zealot.getName() + "을 공격합니다.");
		// 질럿의 공격력 this.power
		zealot.beAttacked(this.power);
	}

	// 마린을 공격합니다
	public void attack(Marine marine) {
		System.out.println(this.name + "이(가) " + marine.getName() + "을 공격합니다.");
		// 질럿의 공격력 this.power
		marine.beAttacked(this.power);
	}

	// 저글링을 공격합니다.
	public void attack(Zergling zergling) {
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
