package threadex.ch02;

//인터페이스를 활용해서 Thread 생성 및 사용 방법
public class MainTest {

	public static void main(String[] args) {

		MyFrame1 myFrame1 = new MyFrame1();
		// 스레드를 구현한 상태 ! ! 그러면 동작은 어떻게 시켜야할까 ? ?
		// myFrame1.run();

		Thread t1 = new Thread(myFrame1);
		t1.start();
		Thread t2 = new Thread(myFrame1);
		t2.start();
	}

}
