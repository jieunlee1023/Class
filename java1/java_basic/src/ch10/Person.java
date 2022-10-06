package ch10;

public class Person {

	// this란
	// 1. 인스턴스(객체) 자신의 메모리를 가리킨다.
	// 2. 생성자에서 또 다른 생성자를 호출할 때 사용할 수 있다.
	// 3. 자신의 주소(참조값, 주소값) 를 반환시킬 수 있다. (반환 => return)

	String name;
	int age;
	int phone;
	String gender;
	String address;
	int weight;
	int height;

	public Person(String name, int age) {
		// 1. 자기 자신을 가르키는 this (변수에 접근할 때)
		this.name = name;
		this.age = age;
	}

	public Person() {
		// 2. 생성자에서 또 다른 생성자를 호출할 때 this를 사용할 수 있다.
//		this.name = "아무개";
//		this.age = 1;
//		이 코드들의 줄인 표현
		this("아무개", 1); // ()가 있으면 생성자 & 메서드 등임 , 모양 맞추기
	}

	public Person(String name, int age, int phone) {
//		this.name = name;
//		this.age = age;
//		this.phone = phone;
//		this();
		this(name, age);
		this.phone = phone;

	}

	public Person(String name, int age, int phone, String gender) {
		this(name, age, phone);
		this.gender = gender;

	}

	public Person(String name, int age, int phone, String gender, String address) {
		this(name, age, phone, gender);
		this.address = address;
	}

	public Person(String name, int age, int phone, String gender, String address, int weight, int height) {
		this(name, age, phone, gender, address);
		this.weight = weight;
		this.height = height;
	}

	// this 빌더패턴을 이해할 수 있다.
	// 3. 자신의 주소(참조값, 주소값) 를 반환시킬 수 있다.
	public Person getPerson() {
//		new Person(); // : 주소값
//		return new Person();
		return this; // : 주소값 반환
	}

	public void showInfo() {
		System.out.println("이름 : " + name + " 나이 : " + age);
	}

	// 함수(static이 붙어있음)는 잠시 자리를 빌려서 사용할 수 있다 why? 자바 문법
	public static void main(String[] args) {
		Person person1 = new Person();
	}

}
