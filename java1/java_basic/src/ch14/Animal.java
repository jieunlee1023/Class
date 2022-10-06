package ch14;

//다형성의 개념 : 클래스를 다양한 형태로 바라볼 수 있는 개념 - 배!

public class Animal {

	public void move() {
		System.out.println("동물이 움직입니다.");
	}

	public void eaeting() {
	}

}// end of Animal class

class Human extends Animal {

	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}

	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}

}// end of Human class

class Tiger extends Animal {
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 걷습니다.");
	}

	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}// end of Tiger class

class Eagle extends Animal {
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}

	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 날아갑니다.");
	}
}
