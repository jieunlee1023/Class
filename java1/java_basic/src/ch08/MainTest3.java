package ch08;

public class MainTest3 {

	public static void main(String[] args) {
		Warrior goblin = new Warrior ("고블린");
		
		goblin.warriorInfo();
		
		System.out.println("------------");
		
		goblin.attack(10);
		goblin.warriorInfo();
		
		System.out.println("------------");
		goblin.beatteck(20);
		goblin.warriorInfo();

		System.out.println("------------");
		goblin.beatteck(90);
		goblin.warriorInfo();
		
		
	}

}
