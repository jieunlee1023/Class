package ch01;

import java.awt.Button;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx4 extends JFrame {
	
	// 배열, ArrayList (멤버변수 선언과 동시에 초기화)
	// 1. ArrayList로 도전~
	private ArrayList<JButton> JButtonArray = new ArrayList<>();
	private final int BUTTON_SIZE = 10;

	private FlowLayout flowLayout;

	public FlowLayoutEx4() {
		initData();
		setInitLayout();
	}

	// 초기화 과정 (값을 넣거나 클래스를 메모리에 올리는 과정)
	private void initData() {
		setTitle("FlowLayout 연습");
		setSize(800, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		for (int i = 0; i < BUTTON_SIZE; i++) {
			JButtonArray.add(new JButton("button" + (i + 1)));
		}
		flowLayout = new FlowLayout(FlowLayout.CENTER, 10, 210);

	}

	// GUI 프로그래밍에서 레이아웃을 설정하는 코드
	private void setInitLayout() {
		setVisible(true);

		setLayout(flowLayout); // 가로로 배치

		for (int i = 0; i < BUTTON_SIZE; i++) {
			add(JButtonArray.get(i));
		}
	}

	// 코드의 시작점
	public static void main(String[] args) {
		new FlowLayoutEx4();

	} // end of main

}
