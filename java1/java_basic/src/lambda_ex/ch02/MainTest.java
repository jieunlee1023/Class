package lambda_ex.ch02;

public class MainTest {

	public static void main(String[] args) {

		IMaxNumber iMaxNumber = (x, y) -> {

//			return (x > y) ? x : y  삼항연산자 깔끔~
			if (x > y) {
				return x;
			}
			return y;
		};
		System.out.println(iMaxNumber.getMax(100, 20));
		System.out.println(iMaxNumber.getMax(10, 20));

		// 결론 - 자바에서 람다 표현식이란?
		// 함수형 인터페이스를 제공하여 람다 표현식으로 생성 후에 사용할 수 있다.
		// 반복적인 코드를 줄일 수 있고, 즉 간소화 할 수 있고,
		// 순수 함수 사이드 이펙트 영향을 줄이는데 목적이 있다.
		// 단, 가독성이 떨어진다.

	}

}
