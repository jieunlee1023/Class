package Transportation;

public class MainTest {

	public static void main(String[] args) {
		
		Car car1 = new Car("BMW", 1004);
		Bus bus1 = new Bus ("1000번 버스", 1000);
		Airplane airplane1 = new Airplane("A-10", 1234);
		
		car1.take(4);
		car1.takeOff(2);
		car1.takeOff(1);
		car1.showInfo();
		
		bus1.take(35);
		bus1.takeOff(10);
		bus1.showInfo();
		
		
		airplane1.takeOff(3);
		airplane1.take(5);
		airplane1.fly();
	}

}
