package ch11;

public class NumberPrinter2Main {

	public static void main(String[] args) {
		//NumberPrinter2.id = 10;
		NumberPrinter2.waitNumber = 10;
		//멤버 변수의 경우 객체를 생성 해야만 접근 가능한데
		//static의 경우 객체를 생성하지 않더라도 클래스 이름으로 접근 가능
		// static이 제일 먼저 뜨는 영역이기 때문
		
		System.out.println(NumberPrinter2.waitNumber);
		
		NumberPrinter2.getWaitNumber();
		//객체로 올라가지 않았지만, static이기 때문에 호출 가능하다
		
		NumberPrinter2 printer2 = new NumberPrinter2();
		printer2.printWaitNumber();
		printer2.id = 1;
		System.out.println(printer2.id);
		
		printer2.printWaitNumber();
	}

}
