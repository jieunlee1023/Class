package threadex;

// 1. 스레드를 생성하는 첫번째 방법 ( 상속을 이용하기 )
class MyThread1 extends Thread {
	String name;

	public MyThread1(String name) {
		this.name = name;
	}

	// ★ (약속) : 새로운 작업자한테 일을 시키려면 특정한 메소드 안에서 코드를 해주어야한다.

	@Override
	public void run() {
		int i;
		for (i = 0; i < 50; i++) {
			System.out.println(this.name + " : " + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
} // end of MyThread1

public class ThreadTest2 {

	// 메인 스레드
	public static void main(String[] args) {
		System.out.println("현재 스레드 정보 얻기 : " + Thread.currentThread());
		System.out.println("메인 스레드가 화면에 글자를 출력합니다.");
		MyThread1 thread1 = new MyThread1("서브 작업자1");
		// 메인 작업자가 서브 작업자한테 일을 시작해 (run()메서드를 호출하면 된다)
		// thread1.run();

		MyThread1 thread2 = new MyThread1("서브 작업자2");
		// thread2.run();

		// 동시에 일을 시키려면 start 메서드를 사용하면 된다.
		thread1.start();
		thread2.start();
		
		MyThread1 thread3 = new MyThread1("서브 작업자3");
		thread3.start();

		System.out.println("메인 스레드(메인 작업자) 일 종료");
		// 메인작업자의 일은 끝났기 때문에 처음에 나옴
	}

}

// 서브 작업자를 만들어 내는 방법
// run() 이라는 메서드 안에 일을 구현해놓으면 된다.
// 일을 동시에 시키는 방법
// start() 라는 메서드를 호출하면 된다.
