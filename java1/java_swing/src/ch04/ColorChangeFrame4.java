package ch04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ColorChangeFrame4 extends JFrame {

	JButton button1;
	JButton button2;

	public ColorChangeFrame4() {
		initData();
		setInitLayout();
		addActionListener();
	}

	public void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("버튼1");
		button2 = new JButton("버튼2");
	}

	public void setInitLayout() {
		setVisible(true);
		setLayout(new FlowLayout());
		add(button1);
		add(button2);
	}

	public void addActionListener() {
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼 1이 눌러졌습니다.");
			}
		});
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼 2가 눌러졌습니다");
			}
		});
	}
	
	public static void main(String[] args) {
		new ColorChangeFrame4();
	}
}
