package ch09;

public class MainTest1 {

	public static void main(String[] args) {
		
		Hero h1 = new Hero();
		Hero h2 = new Hero();

		String s1 = "반가워";
		String s2 = "반가워";
		String s3 = new String("반가워");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		//"반가워" 는 객체다. (= .(점) 연산자 사용가능)
		// .length : 문자열의 길이를 반환하는 기능
		int count = "반가워".length();
		System.out.println("count : "+count);
		System.out.println( "반가워".length());

		if (s2.equals(s3)) {
			System.out.println("같은 문자열 입니다.");
		} else {
			System.out.println("다른 문자열 입니다.");
		}

	}

}
