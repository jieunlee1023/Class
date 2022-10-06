package ch11;

public class PrintMainTest {

	public static void main(String[] args) {

		Print print1 = Print.getInstance();
		Print print2 = Print.getInstance();
		Print print3 = Print.getInstance();

		System.out.println(print1);
		System.out.println(print2);
		System.out.println(print3);

		print1.desk = 1;
		System.out.println(print2.desk);
		
	}

}
