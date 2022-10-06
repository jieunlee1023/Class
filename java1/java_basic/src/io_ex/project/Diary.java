package io_ex.project;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Diary extends JFrame implements ActionListener {

	private JLabel blackgroundImage = new JLabel(new ImageIcon("diary.jpg"));
	private JLabel lock = new JLabel(new ImageIcon("lock.png"));
	private JLabel notice = new JLabel("♥비밀일기장!♥");
	private JLabel passwordNotice = new JLabel("비밀번호를 입력 후 '♥' 버튼을 눌러주세요!");
	private JTextArea passwordField = new JTextArea();
	private JButton login = new JButton("♥");

	private JLabel diaryBackgroundImage = new JLabel(new ImageIcon("note.png"));
	private JTextArea secretDiary = new JTextArea("일기를 작성해주세요! ♥ \n작성 후 저장을 눌러주시면 txt 파일로 저장됩니다!");
	private JButton button = new JButton("일기 저장");

	private String diaryTxt = "diary.txt";
	private String passwordTxt = "password.txt";

	public Diary() {
		initData();
		setInitLayout();
		addActionListener();
	}

	private void initData() {
		setSize(500, 650);
		setTitle("비밀 일기장");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(null);

		notice.setSize(200, 150);
		notice.setLocation(220, 70);
		add(notice);

		passwordNotice.setSize(280, 150);
		passwordNotice.setLocation(150, 100);
		add(passwordNotice);

		lock.setSize(50, 85);
		lock.setLocation(230, 400);
		add(lock);

		passwordField.setSize(120, 30);
		passwordField.setLocation(170, 500);
		add(passwordField);

		login.setSize(50, 30);
		login.setLocation(300, 500);
		login.setBackground(Color.white);
		login.setForeground(Color.black);
		add(login);

		blackgroundImage.setSize(500, 650);
		blackgroundImage.setLocation(0, 0);
		add(blackgroundImage);

	}

	private void addActionListener() {
		login.addActionListener(this);
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if (passwordField.getText().equals(read(passwordTxt)) && event.getSource().equals(login)) {
			System.out.println("로그인 완료");

			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			lock.setVisible(false);
			notice.setVisible(false);
			passwordNotice.setVisible(false);
			passwordField.setVisible(false);
			login.setVisible(false);
			blackgroundImage.setVisible(false);

			button.setSize(120, 30);
			button.setLocation(300, 30);
			button.setBackground(Color.white);
			add(button);

			secretDiary.setSize(370, 495);
			secretDiary.setLocation(70, 80);
			add(secretDiary);

			diaryBackgroundImage.setSize(500, 650);
			diaryBackgroundImage.setLocation(0, 0);
			add(diaryBackgroundImage);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

		if (event.getSource().equals(button)) {
			String newText = secretDiary.getText();

			Date date = new Date();
			String patten = "yyyy년 MM월 dd일 HH:mm:ss";
			SimpleDateFormat dateFormat = new SimpleDateFormat(patten);
			String nowTime = dateFormat.format(date);

			write(diaryTxt, "\n");
			write(diaryTxt, nowTime);
			write(diaryTxt, "\n");
			write(diaryTxt, newText);
			write(diaryTxt, "\n");
			secretDiary.setText("");
		}
	}

	// 비밀번호를 입력 메소드
	// String값으로 반환받게 만들었습니다.

	public String read(String txt) {
		int i;
		String passwordChack = "";
		try (FileReader fr = new FileReader(txt)) {
			while ((i = fr.read()) != -1) {
				passwordChack = passwordChack + (char) i;
			}
		} catch (Exception e) {
		}
		System.out.println("비밀번호 리턴으로 나올 값 : " + passwordChack);
		return passwordChack;
	}

	// 출력 메소드
	// txt 파일에 일기 내용이 저장된다.
	public void write(String txt, String newText) {
		try (FileWriter fw = new FileWriter(txt, true)) {
			fw.write(newText);
		} catch (Exception e) {
		}

	}

	public static void main(String[] args) {
		new Diary();

	}

}
