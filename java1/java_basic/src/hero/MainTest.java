package hero;

public class MainTest {
	
	public static void main(String[] args) {
		
		Warrior warrior1 = new Warrior("전사1", 100);
		Archer archer1 = new Archer("궁수1",	50);
		Wizard wizard1 = new Wizard("마법사1", 150);
		
		warrior1.attack();
		warrior1.comboAttack();
		
		archer1.attack();
		archer1.fireArrow();
		
		wizard1.attack();
		wizard1.freezing();
	}

}
