package ch07;

public class HumanMain {

	public static void main(String[] args) {

		Human human1 = new Human(37, 180, 78);
		Human human2 = new Human("Tomas", 37, "남성", 180, 78);

		human1.showInfo();
		System.out.println("==============");
		human2.showInfo();

	}

}
