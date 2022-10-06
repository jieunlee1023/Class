package ch02;

import java.awt.FlowLayout;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyComponents extends JFrame {

	private JButton button1;
	private JLabel label; // 글자를 넣어서 화면에 띄울 수 있다.
	private JTextField textField; // 사용자에 입력 값을 받을 수 있는 컴포넌스
	private JPasswordField passwordField; // 사용자의 비번을 받는 컴포넌트
	private JCheckBox checkBox;

	public MyComponents() {
		initData();
		setInitLayout();
	}

	public void inputScannerData(String text) {
		this.textField.setText(text);
	}

	private void initData() {
		setTitle("컴포넌트 확인");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		button1 = new JButton("JButton");
		label = new JLabel("로그인 하기");
		textField = new JTextField("아이디 입력", 20);
		passwordField = new JPasswordField("비번 입력", 20);
		checkBox = new JCheckBox("동의");

	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(null);
		
		add(button1);
		button1.setSize(100, 100);
		button1.setLocation(350, 170);

		add(label);
		label.setSize(50, 200);
		label.setLocation(40, 50);

		add(textField);
		textField.setSize(300, 50);
		textField.setLocation(40, 170);

		add(passwordField);
		passwordField.setSize(300, 50);
		passwordField.setLocation(40, 230);

		add(checkBox);
		checkBox.setSize(50, 50);
		checkBox.setLocation(40, 280);

	}

}
