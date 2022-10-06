package ch14;

public class MainTest2 {

	public static void main(String[] args) {
		
		//휴먼 배열 타입 
		Human[] humans = new Human[2];
		Tiger[] tigers = new Tiger[2];
		//하나의 코드가 여러 자료형으로 구현되어 실행되는 것
		
		humans[0] = new Human();
		humans[1] = new Human();
		
		tigers[0] = new Tiger();
		tigers[1] = new Tiger();

		Animal[] animals = new Animal[4];
		animals[0] = new Human();
		animals[1] = new Tiger();
		animals[2] = new Eagle();
		animals[3]= new Animal();
		
		for (int i = 0; i <animals.length; i++) {
			animals[i].move();
			//같은 코드에서 여러 다른 실행 결과가 나옴
		}
	}

}
