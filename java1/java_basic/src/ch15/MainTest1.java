package ch15;

public class MainTest1 {

	public static void main(String[] args) {
		
		//Animal animal = new Animal();
		
		Animal pAnimal = new Person();
		pAnimal.name = "홍길동";
		pAnimal.move();
		pAnimal.hunt();
		System.out.println(pAnimal.name);
		
	}
}
