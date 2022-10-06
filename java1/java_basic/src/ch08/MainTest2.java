package ch08;

public class MainTest2 {

	public static void main(String[] args) {
		
		Subway subway = new Subway(1);
		subway.showInfo();
		
		subway.take(1000);
		subway.showInfo();

		subway.take(1000);
		subway.showInfo();
		
		subway.take(1500);
		subway.showInfo();
		
		subway.takeOff(1);
		subway.showInfo();
	}

}
