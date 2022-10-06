package Transportation;

public class Bus extends Transportation{

	public Bus(String name, int num) {
		this.name = name;
		this.num = num;
		PeopleCount = 0;
		this.maxPeopleCount = 50;
	}
	

}
