package generic_ex.ch02;

import java.util.ArrayList;

import generic_ex.ch01.Plastic;
import generic_ex.ch01.Powder;

public class MainTest {

	public static void main(String[] args) {
		// 재료
		Powder powder = new Powder();
		Plastic plastic = new Plastic();

		// 제네릭 사용방법
		GenericPrinter<Powder> genericPrinter = new GenericPrinter<>();
		// ArrayList<Integer> arr = new ArrayList<>();
		// <> : 다이아몬드 연산자

		genericPrinter.setMaterial(powder);
//		genericPrinter.setMaterial(plastic); // 쓸때부터 오류확인된다. (현재 제네릭 타입이 Powder)
		Powder usePowder = genericPrinter.getMaterial();
		System.out.println(usePowder);

		// 플라스틱 사용하는 제네릭 프린터
		GenericPrinter<Plastic> genericPrinter2 = new GenericPrinter<>();
		genericPrinter2.setMaterial(plastic);
		Plastic usePlastic = genericPrinter2.getMaterial();
		System.out.println(usePlastic);

	}
}
