package ch05;

public class FunctionTest2 {

	public static void main(String[] args) {
		double total = .0;
		total = minus(100, 10);

		System.out.println("결과 값: " + total);
		double total2 = minus(100, 10);
		
		Student s1 ;
	}

	public static double minus(double n1, double n2) {
		//지역 변수 : 스택 메모리에 올라간 녀석을 지역 변수라고 한다.
		double result = n1 - n2;
		return result;
	}

}
