package Transportation;

public class Car extends Transportation {

	public Car(String name, int num) {
		this.name = name;
		this.num = num;
		PeopleCount = 0;
		this.maxPeopleCount = 4;
	}


}
