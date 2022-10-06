package ch16;

public class ManualCar extends Car {

	@Override
	public void drive() {
		System.out.println("사람이 운전을 합니다.");
	}

	@Override
	public void stop() {
		System.out.println("브레이크를 밟아서 정지합니다.");
	}

	@Override
	public void wiper() {
		System.out.println("사람이 wiper 동작을 시킵니다.");
	}

}
