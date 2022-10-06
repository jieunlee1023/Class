package ch04;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class ColorChangeFrame3 extends JFrame {

	JButton button1;
	JButton button2;

	ActionListener listener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button1) {
				System.out.println("button1이 눌러 졌네요 !");
			} else {
				System.out.println("button2가 눌러 졌네요 !");
			}
		}
	};

	public ColorChangeFrame3() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("button1");
		button2 = new JButton("button2");
	}

	private void setInitLayout() {
		setVisible(true);
		this.setLayout(new FlowLayout());
		add(button1);
		add(button2);

	}

	private void addEventListener() {

		button1.addActionListener(listener);
		button2.addActionListener(listener);

//		// temp - 구현 클래스
//		ActionListener temp = new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//
//			}
//		}; < 대신 여기 ;이 있다

		// 익명 구현 클래스
		// 추상클래스나 인터페이스를 new 때릴 수 있다.

		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("button1이 눌러졌습니다.");
			}
		});

		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("button2이 눌러졌습니다.");

			}
		});

	}

	// 추상 클래스나 인터페이스도 구현 클래스로 만들어서 new 키워드를 사용할 수 있다.
	// 단, 추상 메서드가 있으면 일반 메서드로 구현해야한다. (강제)

	public static void main(String[] args) {
		// 익명 클래스
		new ColorChangeFrame3();
		ColorChangeFrame3 myColor = new ColorChangeFrame3();
		ColorChangeFrame3 myColor2 = new ColorChangeFrame3();
	} // end of main

}// end of class
