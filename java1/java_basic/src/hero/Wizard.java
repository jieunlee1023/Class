package hero;

public class Wizard extends Hero {

	public Wizard(String name, int hp) {
		super(name, hp);
	}

	public void freezing() {
		System.out.println("얼리기 공격");
	}

}
