package threadex.ch01;

public class MainTest {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread());
		SubThread subThread1 = new SubThread();
		SubThread subThread2 = new SubThread();
		SubThread subThread3 = new SubThread();

		subThread1.start();
		subThread2.start();
		subThread3.start();

		// Thread 란 ?
		// process : 프로그램이 실행되면 OS로 부터 메모리를 할당 받아 프로세스 상태가 됨
		// thread : 하나의 프로세스에는 하나 이상의 작업자(스레드)를 가지게 되고, 실제 작업에 수행하는 단위는 thread 이다.

		// multi threading programming이란?
		// 여러 스레드가 동시에 수행되는 프로그래밍, 여러 작업이 동시에 실행되는 효과를 만들어 낼 수 있다.
		// thread는 각각 자신만의 변수, 메서드 즉, 자신만의 작업공간을 가진다.
		// 즉 , 자기자신에 context를 가진다

		// 멀티 스레딩 프로그램시 주의점
		// 각 thread 사이에서 공유하는 자원이 있을 수 있다.
		// 여러 thread가 자원을 공유하여 작업이 수행되는 경우
		// 서로 자원을 차지하려는 race condition이 발생할 수 있다. (의도하지 않은 결과를 만들어 낼 수 있다.)

		// 이렇게 여러 Thread가 공유하는 자원 중 경쟁이 발생하는 부분을 critical section 이라고 한다.
		// (임계 영역)
		// critical section은 문제가 발생할 수 있기 때문에,
		// 안정적인 프로그램을 처리하기 위해서는 동기화(일종의 순차적 수행) 처리를 해야한다.
		// 하지 않는다면 오류 발생 가능성이 높다.

	}
}
