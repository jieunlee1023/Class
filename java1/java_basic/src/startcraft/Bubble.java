package startcraft;

public class Bubble {

	private String name;
	private String color;
	private int attack;

	public Bubble() {
		this.name = "기본 풍선";
		this.color = "하늘색";
		this.attack = 10;
	}

	public Bubble(String name, String color, int attack) {
		this.name = name;
		this.color = color;
		this.attack = attack;
	}

	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("색 : " + color);
		System.out.println("공격력 : " + attack);
	}

}
