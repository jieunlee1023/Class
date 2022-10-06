package generic_ex.ch04;

public class MainTest {

	public static void main(String[] args) {

//		 double result = 5 / 3;
//		double result = 5 / 3.0;
//		// 1.666666666
//		System.out.println(result);
//		double b = 100.0;
//		Number a = (double) b;
//		// 다양한 숫자들을 관리 할 수 있는 타입 : Number

		MyPoint<Integer, Double> p1 = new MyPoint<Integer, Double>(0, 0.0);
		MyPoint<Integer, Double> p2 = new MyPoint<Integer, Double>(20, 50.0);
		double result = makeRectangle(p1, p2);
		System.out.println(result);

	}

	public static <X, Y> double makeRectangle(MyPoint<X, Y> p1, MyPoint<X, Y> p2) {

		double left = ((Number) p1.getX()).doubleValue();
		double right = ((Number) p2.getX()).doubleValue();
		double top = ((Number) p1.getY()).doubleValue();
		double bottom = ((Number) p2.getY()).doubleValue();

		double width = right - left;
		double height = bottom - top;

		return width * height;
	}

}
