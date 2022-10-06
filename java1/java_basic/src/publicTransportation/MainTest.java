package publicTransportation;

public class MainTest {

	public static void main(String[] args) {
		
		People people1 = new People ("성인1" , 25);
		People people2 = new People ("청소년1" , 17);
		People people3 = new People ("아동1" , 8);
		Bus bus111 = new Bus (111);
		Subway subway1 = new Subway(1);
		
		people1.busTake(bus111);
		people2.busTake(bus111);
		people1.showInfo();
		people2.showInfo();
		bus111.showInfo();
	
		people2.subwayTake(subway1);
		people2.showInfo();
		subway1.showInfo();
		
		
		
		
		

	}

}
