package ch07;

public class Human {

	String name; // null
	int age;
	String gender;
	int height;
	int weight;

	public Human() {
		// 기능 호출
		this.showInfo();
		if (this.name == null) {
			System.out.println("값을 입력하세요!");
		}
	}

	public Human(int age, int height, int weight) {
		name = "Tomas";
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public Human(String name, int age, String gender, int height, int weight) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
	}

	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "살");
		System.out.println("성별 : " + gender);
		System.out.println("키 : " + height + "cm");
		System.out.println("몸무게 : " + weight + "kg");
	}
}
