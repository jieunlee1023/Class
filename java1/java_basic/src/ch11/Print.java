package ch11;
//디자인 패턴

//싱글톤 패턴 (유일성을 보장, 단 하나만 객체가 존재해야 할 때)

//1. 생성자를 private로 만든다.
//2. static 변수를 활용해서 내부에서 객체를 생성한다
//3. 외부에서 유일하게 참조변수 (인스턴스변스)에 접근 가능한 public 메서드를 제공한다.

public class Print {
	public int desk;

	private Print() {
	}

	private static Print instance = new Print();

	public static Print getInstance() {
		if (instance == null) {
			instance = new Print();
		}
		return instance;
	}

}
