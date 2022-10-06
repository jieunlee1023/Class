package ch13;

public class Cal {

	public int sum(int n1, int n2) {
		return n1 + n2;
	}

	public int multiply(int n1, int n2) {
		System.out.println("cal 메소드 호출 ");
		return n1 * n2;
	}

}
class Cal2 extends Cal {

	public int minus(int n1, int n2) {
		return n1 - n2;
	}
	// 어노테이션 : 주석 + 힌트
	@Override //
	public int multiply(int n1, int n2) {
		if (n1 == 0 || n2 == 0) {
			System.out.println("0을 대입 할 수 없습니다.");
		}
		return super.multiply(n1, n2);
		// super. ~ : 긴 코드를 복 붙하지 않고 깔끔하게 부모클래스에서 불러올 수 있다.
	}

	public int multiply(int n1, int n2, int n3) {
		return n1 * n2 * n3;
	}

}
