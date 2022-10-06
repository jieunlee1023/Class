package ch01;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BoarderLayoutEx extends JFrame {

	private ArrayList<JButton> buttonArrayList = new ArrayList<>();
	private String strArr[] = { "동", "서", "남", "북", " 센터" };
	private final int BUTTON_SIZE = 5;
	String[] directions = { BorderLayout.WEST, BorderLayout.EAST, BorderLayout.SOUTH, BorderLayout.NORTH,
			BorderLayout.CENTER };

	private BorderLayout borderLayout;

	public BoarderLayoutEx() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("border Layout 연습");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// JButton 초기화 완료됨 (멤버 변수로 처리)
		borderLayout = new BorderLayout();
		for (int i = 0; i < strArr.length; i++) {
			buttonArrayList.add(new JButton(strArr[i]));
		}
	}

	private void setInitLayout() {

		setVisible(true);
		// 프레임에 add 하는 동작만 시켜 주면 됩니다.
		// 직접 코딩해 보세요!
		setLayout(borderLayout);

		for (int i = 0; i < BUTTON_SIZE; i++) {
			add(buttonArrayList.get(i), directions[i]);
		}
	}

	public static void main(String[] args) {
		new BoarderLayoutEx();
	} // end of main

} // end of class
