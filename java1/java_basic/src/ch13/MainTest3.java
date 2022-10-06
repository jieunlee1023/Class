package ch13;

public class MainTest3 {

	public static void main(String[] args) {

		Customer customerLee = new Customer();
		customerLee.setCustomerName("이순신");
		customerLee.setCutomerId(100);
		customerLee.calcPrice(10_000);
		System.out.println(customerLee.showCustomerInfo());

		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerName("김유신");
		customerKim.setCutomerId(200);
		customerKim.calcPrice(10_000);
		System.out.println(customerKim.showCustomerInfo());

	}

}
