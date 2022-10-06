package generic_ex.ch01;

public class MainTest {

	public static void main(String[] args) {

		Powder powder = new Powder();
		Plastic plastic = new Plastic();
		ThreeDPrinter1 printer1 = new ThreeDPrinter1();
		ThreeDPrinter2 printer2 = new ThreeDPrinter2();
		ThreeDPrinter3 printer3 = new ThreeDPrinter3();

		// 1번기기
		// 재료를 넣기
		printer1.setMaterial(powder);
		// 재료 꺼내기
		System.out.println(printer1.getMaterial());

		// 2번기기
		// 재료를 넣기
		printer2.setMaterial(plastic);
		// 재료 꺼내기
		System.out.println(printer2.getMaterial());

		System.out.println("----------------");
		// 3번기기
		// 재료를 넣기
		printer3.setMaterial(plastic);
		printer3.setMaterial(powder);
		// 재료 꺼내기
		System.out.println(printer3.getMaterial());

		Plastic usePlastic = (Plastic) printer3.getMaterial();
		// 오브젝트는 최상위 클래스 플라스틱으로 형변환

	}

}
