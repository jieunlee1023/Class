package ch11;
//변수를 초기화

//생성자에서 초기화

public class NumberPrinter {

	private int id;
	private static int waitNumber;

	public NumberPrinter(int id) {
		this.id = id;
		this.waitNumber = 1;
	}

	// 번호표를 출력하는 기능
	public void printWaitNumber() {
		System.out.println(id + "기기의 대기 순번 : " + waitNumber);
		waitNumber++;
	}

	public static void main(String[] args) {
		NumberPrinter numberPrinter1 = new NumberPrinter(1);
		NumberPrinter numberPrinter2 = new NumberPrinter(2);
		// 왼쪽기계
		numberPrinter1.printWaitNumber();
		numberPrinter2.printWaitNumber();
		numberPrinter1.printWaitNumber();
		
//		numberPrinter1.printWaitNumber();
//		numberPrinter1.printWaitNumber();
		// 오른쪽기계
//		numberPrinter2.printWaitNumber();
//		numberPrinter2.printWaitNumber();
//		numberPrinter2.printWaitNumber();

	}
}
