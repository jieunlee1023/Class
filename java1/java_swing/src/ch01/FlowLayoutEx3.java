package ch01;

import java.awt.Button;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx3 extends JFrame {

	// 배열로 만들어서 코드를 수정
	// 생성시 for문 활용
	// 정 가운데에 배치를 해주세요. (수직)

	// 배열, ArrayList (멤버변수 선언과 동시에 초기화)
	private JButton[] JButtonArray = new JButton[7];

	private FlowLayout flowLayout;

	public FlowLayoutEx3() {
		initData();
		setInitLayout();
	}

	// 초기화 과정 (값을 넣거나 클래스를 메모리에 올리는 과정)
	private void initData() {
		setTitle("FlowLayout 연습");
		setSize(800, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		for (int i = 0; i < JButtonArray.length; i++) {
			JButtonArray[i] = new JButton("button" + (i + 1));
		}
		flowLayout = new FlowLayout(FlowLayout.CENTER, 10, 210);

	}

	// GUI 프로그래밍에서 레이아웃을 설정하는 코드
	private void setInitLayout() {
		setVisible(true);

		setLayout(flowLayout); // 가로로 배치

		for (int i = 0; i < JButtonArray.length; i++) {
			add(JButtonArray[i]);
		}
	}

	// 코드의 시작점
	public static void main(String[] args) {
		new FlowLayoutEx3();

	} // end of main

}
