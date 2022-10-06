package ch17;

public abstract class Doll {
	
	String name;
	int weight;
	int volume;
	
	LionDoll lionDoll;
	TeddyBear bearDoll;
	
	public Doll(String name) {
		this.name = name;
		System.out.println(name + "이 뽑혔습니다.");
	}

}
