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

public class ColorChangeFrame extends JFrame implements ActionListener {

	JPanel panel1;
	JPanel panel2;
	JButton button1;
	JButton button2;
	JButton button3;

	public ColorChangeFrame() {
		initData();
		setInitLayout();
		addEventListener();

	}

	private void initData() {
		setSize(700, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("button1");
		button2 = new JButton("button2");
		button3 = new JButton("button3");

		panel1 = new JPanel();
		panel2 = new JPanel();

	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(new BorderLayout());
		add(panel1, BorderLayout.CENTER);
		add(panel2, BorderLayout.SOUTH);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);

	}

	private void addEventListener() {
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton targetButton = (JButton) e.getSource();
		if (targetButton.getText().equals(button1.getText())) {
			System.out.println("button1이 눌러 졌습니다.");
			panel1.setBackground(Color.red);
		} else if (targetButton.getText().equals(button2.getText())) {
			System.out.println("button2가 눌러 졌습니다.");
			panel1.setBackground(Color.green);
		} else if (targetButton.getText().equals(button3.getText())) {
			System.out.println("button3이 눌러 졌습니다.");
			panel1.setBackground(Color.blue);
		}
	}

	public static void main(String[] args) {
		new ColorChangeFrame();
	}

}
