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

public class ColorChangeFrame2 extends JFrame implements ActionListener {

	JPanel centerPanel;
	JPanel bottomJPanel;
	JButton button1;
	JButton button2;

	public ColorChangeFrame2() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		centerPanel = new JPanel();
		bottomJPanel = new JPanel();
		button1 = new JButton("빨강");
		button2 = new JButton("노랑");
	}

	private void setInitLayout() {
		setVisible(true);
		this.setLayout(new BorderLayout());
		this.add(centerPanel, BorderLayout.CENTER);
		this.add(bottomJPanel, BorderLayout.SOUTH);

		bottomJPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
		bottomJPanel.add(button1);
		bottomJPanel.add(button2);

		centerPanel.setBackground(Color.black);
	}

	private void addEventListener() {
		button1.addActionListener(this);
		button2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// 주소값을 통해서 구분
		if (e.getSource() == button1) {
			centerPanel.setBackground(Color.red);
			return;
		}
		centerPanel.setBackground(Color.yellow);

		// 객체에 멤버변수인 String 값을 비교
//		JButton selectedButton = (JButton)e.getSource();
//		if (selectedButton.getText().equals(button1.getText())) {
//			centerPanel.setBackground(Color.red);
//		}else {
//			centerPanel.setBackground(Color.blue);
//		}
	}

	public static void main(String[] args) {
		new ColorChangeFrame2();
	} // end of main

}// end of class
