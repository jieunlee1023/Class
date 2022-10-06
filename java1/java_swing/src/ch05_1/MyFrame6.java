package ch05_1;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class MyFrame6 extends JFrame {

	public MyFrame6() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("어댑터 클래스 이용");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void setInitLayout() {
		setVisible(true);
		setResizable(false); // 리사이즈 불가
	}

	private void addEventListener() {
		// 추상 메서드가 5개 (불필요한 코드가 많아서 가독성이 떨어짐)
		this.addMouseListener(new MyMouseListener());
	}

	// 내부 클래스 생성
	private class MyMouseListener extends MouseAdapter {
		// 사용하고 싶은 기능만 재정의 가능하다.
		@Override
		public void mouseClicked(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			System.out.println("x : " + x + ", y : " + y);
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			System.out.println("마우스 포커스가 프레임 안으로 들어왔습니다.");
		}

	} // end of inner class

	public static void main(String[] args) {
		new MyFrame6();
	}
}
