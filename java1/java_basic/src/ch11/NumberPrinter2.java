package ch11;

public class NumberPrinter2 {

	public int id;
	/*private*/ public static int waitNumber;
	//static도 접근 제어 지시자에 영향을 받음

	// 번호표를 출력하는 기능
	public void printWaitNumber() {
		System.out.println(id + "기기의 대기 순번 : " + waitNumber);
		waitNumber++;
	}
	
	//static 메서드 안에서는 멤버 변수를 활용할 수 없다.
	// 객체가 메모리에 올라 갔다라는 보장을 하지 못하기 때문이다
	public static int getWaitNumber() {
//		id = 100; : 멤버번수는 new해서 객체를 만들어야 사용 가능
		return waitNumber;
	}
	public static int setWaitNumber() {
		return waitNumber;
	}
}
