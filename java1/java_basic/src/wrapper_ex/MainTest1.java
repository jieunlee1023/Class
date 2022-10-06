package wrapper_ex;

public class MainTest1 {

	public static void main(String[] args) {

		Integer num = new Integer(3); // 박싱
//		Number number = 3;

		int n = num; // 자동 언박싱
//		int n = num.intValue(); // 기본 변형
		
		System.out.println(n);

	}

}
