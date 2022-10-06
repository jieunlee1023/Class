package ch06;

import java.awt.TextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MyFrame7 extends JFrame {

	private JTextArea area;

	public MyFrame7() {
		initData();
		setInitLayout();
		addEventListener();
	}

	public void initData() {
		setTitle("키보드 이벤트 연습");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		area = new JTextArea();
	}

	public void setInitLayout() {
		setVisible(true);
		setResizable(false);
		add(area);
	}

	public void addEventListener() {

		area.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				displayKeyInfo(e);
			}
		});
	}

	private void displayKeyInfo(KeyEvent e) {
		char c = e.getKeyChar();
		int keyCode = e.getKeyCode();
		String info = "c : " + c + "\t" + "keyCode : " + keyCode;
		System.out.println(info);
		area.append(info + "\n");
	}

	public static void main(String[] args) {
		new MyFrame7();
	}

}