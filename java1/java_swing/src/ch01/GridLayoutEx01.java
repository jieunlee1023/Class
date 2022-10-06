package ch01;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutEx01 extends JFrame {

	private ArrayList<JButton> arrayList = new ArrayList<>();
	private String[] strArr = { "가", "나", "다", "라", "마", "바" };
	private final int BUTTON_SIZE = 6;

	private GridLayout gridLayout;

	public GridLayoutEx01() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("그리드 레이아웃 연습");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		for (int i = 0; i < strArr.length; i++) {
			arrayList.add(new JButton(strArr[i]));
		}
	}

	private void setInitLayout() {
		setVisible(true);
		// setLayout : JFrame의 배치 관리자를 지정한다.
		setLayout(new GridLayout(3, 2));

		for (int i = 0; i < BUTTON_SIZE; i++) {
			add(arrayList.get(i));
		}
	}

	public static void main(String[] args) {
		new GridLayoutEx01();
	} // end of main
}
