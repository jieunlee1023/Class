package hero;

public class Warrior extends Hero {

	public Warrior(String name, int hp) {
		super(name, hp);
	}

	public void comboAttack() {
		System.out.println("콤보어택 공격");
	}

}
