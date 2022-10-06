package ch01;

import java.awt.Dimension;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

	// 인스턴스화 될 때 가장 먼저 실행되는 코드 : 생성자
	public MyFrame() {
		super.setTitle("MyFrame1"); // 제목
		super.setSize(500, 500); // 사이즈
		super.setVisible(true); // 화면에 보여주거나 안보여주거나
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 창이 꺼져도 프로그램은 실행중인 상태를 완전히 끝내버림

	}

}
