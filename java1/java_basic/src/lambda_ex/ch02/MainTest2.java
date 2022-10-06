package lambda_ex.ch02;

public class MainTest2 {

	public static void main(String[] args) {

		// 매개변수의 데이터 타입을 생략해도 됩니다!

		// 수행문이 한 줄일 때만 중괄호가 생략 가능하다
		// 두 줄 일때는 생략 불가능!
		IPrint iPrint = (a, tocken) -> System.out.println(a + tocken); // 람다식을 선언
		// 사용해보기
		iPrint.print1("홍길동", "ㅡ");
		iPrint.print1("이순신", ":");
		iPrint.print1("야스오", ",");

		IPrint2 iPrint2 = () -> {
			return "반가워";
		};
		System.out.println(iPrint2.print2());
		System.out.println(iPrint2.print2());
		System.out.println(iPrint2.print2());
	}
}

@FunctionalInterface // 람다식을 쓰기 위함을 표시함
interface IPrint {
	void print1(String a, String token);
}

@FunctionalInterface
interface IPrint2 {
	String print2();
}