package threadex.ch02;

import javax.swing.JFrame;

//2. 서브 작업자르 만드는 두번째 방법 (인터페이스 활용)
public class MyFrame1 extends JFrame implements Runnable {

	@Override
	public void run() {
		// 병렬 처리 코드를 넣어 주면 된다.
		for (int i = 0; i < 10; i++) {
			System.out.print("i : " + i + "\t");
		}
	}
}
