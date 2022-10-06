package ch08;

public class MainTest4 {

	public static void main(String[] args) {

		Wizard wizard = new Wizard("마법사");

		wizard.attack(10);

		wizard.attack(30);

		wizard.damage(500);
		
		wizard.damage(500);

		wizard.wizardInfo();

		
	}

}
