package ch16;

public abstract class Car {

	void startCar() {
		System.out.println("시동을 켭니다.");
	}

	public abstract void wiper();

	public abstract void drive();

	public abstract void stop();

	// 후크 메서드 : 필요하다면 가지고와서 재정의해서 써~!
	public void washCar() {
	}

	void turnOff() {
		System.out.println("시동을 끕니다.");
	}


	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}

}
