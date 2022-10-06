package io_ex.ch04;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainTest extends JFrame implements ActionListener {
	JButton button = new JButton("추가하기");
	JButton button2 = new JButton("불러오기");
	JButton button3 = new JButton("검색하기");
	JLabel label = new JLabel("전화번호부 목록");
	JLabel label2 = new JLabel("입력창");
	JLabel label3 = new JLabel("전화번호부");
	static JTextArea textArea = new JTextArea();
	JTextField textField = new JTextField("index num");
	JTextField textField2 = new JTextField("이름");
	JTextField textField3 = new JTextField("전화번호 ");
	JTextField textField4 = new JTextField("검색할 index num ");
	
	HashMap<String, List> phoneBookMap = new HashMap<>();
	

	public MainTest() {
		initDate();
		setInitLayout();
		addActionListener();
	}

	private void initDate() {
		setSize(500, 500);
		setTitle("전화번호부");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(null);
		textArea.setSize(300, 200);
		textField.setSize(300, 20);
		textField2.setSize(300, 20);
		textField3.setSize(300, 20);
		textField4.setSize(300, 20);
		button.setSize(100, 50);
		button2.setSize(100, 50);
		button3.setSize(100, 50);
		label.setSize(100, 10);
		label2.setSize(50, 10);
		label3.setSize(200, 50);
		label3.setFont(new Font("Serif", Font.BOLD, 24));
		label3.setForeground(Color.BLUE);

		textArea.setLocation(50, 90);
		textField.setLocation(50, 330);
		textField2.setLocation(50, 360);
		textField3.setLocation(50, 390);
		textField4.setLocation(50, 420);

		button.setLocation(360, 330);
		button2.setLocation(360, 390);
		button3.setLocation(360, 270);

		label.setLocation(40, 70);
		label2.setLocation(40, 310);
		label3.setLocation(170, 10);
		add(textArea);
		add(textField);
		add(textField2);
		add(textField3);
		add(textField4);
		add(button);
		add(button2);
		add(button3);
		add(label);
		add(label2);
		add(label3);
	}

	private void addActionListener() {
		button.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == button) {
			//리스트의 위치 중요!! 지역변수로 사용해야 함 멤버변수면 이전데이터도 다들어감  
			List<String> list = new ArrayList<>();
			write("PhoneBook", textField.getText());
			write("PhoneBook", textField2.getText());
			write("PhoneBook", textField3.getText());

			list.add(textField2.getText());
			list.add(textField3.getText());
			//맵계열에 key와 벨류로 리스트를 넣음   
			phoneBookMap.put(textField.getText(), list);
			textArea.setText(textField.getText() + "번 추가되었습니다");
		} else if (e.getSource() == button2) {
			read("PhoneBook");
		} 
		if(e.getSource() == button3){
			textArea.setText(phoneBookMap.get(textField4.getText()).toString());
		
		}

	}

	public static void copy(String readData, String writeData) {
		try (FileReader fr = new FileReader(readData)) {
			try (FileWriter fw = new FileWriter(writeData)) {
				int i;
				while ((i = fr.read()) != -1) {

					fw.write((char) i);
				}
			}
		} catch (Exception e) {
			System.out.println("에러");
		}

	}

	// read 메서드
	public static void read(String readData) {
		try (FileReader fr = new FileReader(readData)) {
			int i;
			String a = null;
			while ((i = fr.read()) != -1) {
				System.out.print((char) i);
				// string 으로 받기위해 a의 값을 더해줌
				a = a + (char) i;
			}
			// 텍스트 에리어 화면에 띄움
			textArea.setText(a);
		} catch (Exception e) {
			System.out.println("에러");
		}

	}

//write 메서드 
	public static void write(String writeData, String data) {
		try (FileWriter fw = new FileWriter(writeData, true)) {
			fw.write(data + "\n");
		} catch (Exception e) {
			System.out.println("에러");
		}
	}

	// 메인 스레드 시작
	public static void main(String[] args) {
		new MainTest();
	}
}