package threadex.ch02;

// 3. 익명 구현 클래스 활용 방법
public class MainTest2 {

	public static void main(String[] args) {

		MyFrame2 myFrame2 = new MyFrame2();
		// Thread 동작 시켜보세요
		Thread thread = new Thread(myFrame2.runnable);
		thread.start();
		
		myFrame2.runnable.run();
	}

}
