package ch14;

public class MainTest1 {

	public static void main(String[] args) {

		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();

		hAnimal.move();
		//컴파일 시점 : 문법이 맞는지 안맞는지 확인 (타입만 확인) Animal의 move();  
		//런타임 시점 : Human();의 주소값이 담겨서 Human의 move();를 동작시킴
		
		Animal eAnimal = new Eagle();
		eAnimal.move();

	}
}
