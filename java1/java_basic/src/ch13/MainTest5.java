package ch13;

public class MainTest5 {

	public static void main(String[] args) {

		Customer customer1 = new Customer();
		// customer1. : 보너스 포인트 보임, 보너스 비율 보임 , customerGrade 보임

		Customer customer2 = new VIPCustomer();
		// customer2. : 보너스 포인트 보임, 보너스 비율 보임, customerGrade 보임

		// 업 캐스팅 상태 : 컴파일러는 데이터 타입인 정도까지만 확인함
		// VIPCustomer로 했지만, Customer로 보고 사용가능
		// customer2.salesRatio = 10; // 다운캐스팅 해서 접근해야한다.
		((VIPCustomer) customer2).salesRatio = 10; // 다운캐스팅 (참조타입의 형변환)

		VIPCustomer vipCustomer1 = new VIPCustomer();
		// vipCustomer1. : 보너스 포인트 보임, 보너스 비율 보임, customerGrade 보임 , salesRation 보임

	}

}
