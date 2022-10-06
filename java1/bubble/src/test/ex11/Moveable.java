package test.ex11;

/**
 * 
 * default를 사용하면 인터페이스도 몸체가 있는 메서드를 만들 수 있다. 어댑터 패턴 대용으로 사용하기도 한다.
 * 
 */

public interface Moveable {

	public abstract void left();

	public abstract void right();

	public abstract void up();

	// 인터페이스 (추상 메서드, 상수 만 가진다)
	// default를 사용하면 일반 메서드로도 사용 할 수 있다.
	default public void down() {
	};
	// ; -> 문장에 끝을 나타낸다

}
