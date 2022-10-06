package Transportation;

public class Airplane extends Transportation{
	
	public Airplane(String name, int num) {
		this.name = name;
		this.num = num;
		PeopleCount = 0;
		this.maxPeopleCount = 100;
	}
	
	public void fly() {
		System.out.println("비행기가 이륙합니다.");
	}
	

}
