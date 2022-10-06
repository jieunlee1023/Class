package ch02;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyFramePanelEx2 extends JFrame {

	private JPanel panel;

	private JLabel naver;
	private JLabel id;
	private JLabel password;
	private JLabel passwordChecked;
	private JLabel name;
	private JLabel birth;
	private JLabel gender;
	private JLabel eMail;
	private JLabel phone;

	private JTextField idField;
	private JPasswordField passwordField;
	private JPasswordField passwordFieldChecked;
	private JTextField nameField;
	private JTextField birthFieldYear;
	private JTextField birthFieldMonth;
	private JTextField birthFieldDay;

	private JCheckBox checkBoxMan;
	private JCheckBox checkBoxWoman;
	private JCheckBox checkBoxNoGender;

	private JTextField eMailField;
	private JTextField countryCode;
	private JTextField phoneField;
	private JButton certificationNumber;
	private JTextField certificationNumberField;
	private JButton join;

	private FlowLayout flowLayout;

	public MyFramePanelEx2() {
		initData();
		setInitLayout();
	}

	public void initData() {
		setTitle("회원가입창");
		setSize(500, 760);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon image = new ImageIcon("C:\\workspace/1.png");
		naver = new JLabel(image);
		id = new JLabel("아이디");
		idField = new JTextField();
		password = new JLabel("비밀번호");
		passwordField = new JPasswordField();
		passwordChecked = new JLabel("비밀번호 재확인");
		passwordFieldChecked = new JPasswordField();
		name = new JLabel("이름");
		nameField = new JPasswordField();
		birth = new JLabel("생년월일");
		birthFieldYear = new JTextField("  년(4자)");
		birthFieldMonth = new JTextField("  월");
		birthFieldDay = new JTextField("  일");
		gender = new JLabel("성별");
		checkBoxMan = new JCheckBox("남자");
		checkBoxWoman = new JCheckBox("여자");
		checkBoxNoGender = new JCheckBox("선택안함");
		eMail = new JLabel("본인 확인 이메일 (선택)");
		eMailField = new JTextField("선택입력");
		phone = new JLabel("휴대전화");
		countryCode = new JTextField("대한민국 +82");
		phoneField = new JTextField("전화번호 입력");
		certificationNumber = new JButton("인증번호 받기");
		certificationNumberField = new JTextField("인증번호 입력하세요.");
		join = new JButton("가입하기");

//		flowLayout = new FlowLayout();
	}

	public void setInitLayout() {
		setVisible(true);
		setLayout(null);

		add(naver);
		naver.setSize(300, 50);
		naver.setLocation(90, 30);

		add(id);
		id.setSize(200, 50);
		id.setLocation(60, 80);

		add(idField);
		idField.setSize(360, 30);
		idField.setLocation(60, 120);

		add(password);
		password.setSize(360, 30);
		password.setLocation(60, 150);

		add(passwordField);
		passwordField.setSize(360, 30);
		passwordField.setLocation(60, 180);

		add(passwordChecked);
		passwordChecked.setSize(360, 30);
		passwordChecked.setLocation(60, 210);

		add(passwordFieldChecked);
		passwordFieldChecked.setSize(360, 30);
		passwordFieldChecked.setLocation(60, 240);

		add(name);
		name.setSize(360, 30);
		name.setLocation(60, 270);

		add(nameField);
		nameField.setSize(360, 30);
		nameField.setLocation(60, 300);

		add(birth);
		birth.setSize(360, 30);
		birth.setLocation(60, 330);

		add(birthFieldYear);
		birthFieldYear.setSize(110, 30);
		birthFieldYear.setLocation(60, 360);

		add(birthFieldMonth);
		birthFieldMonth.setSize(110, 30);
		birthFieldMonth.setLocation(185, 360);

		add(birthFieldDay);
		birthFieldDay.setSize(110, 30);
		birthFieldDay.setLocation(310, 360);

		add(gender);
		gender.setSize(360, 30);
		gender.setLocation(60, 390);

		add(checkBoxMan);
		checkBoxMan.setSize(110, 30);
		checkBoxMan.setLocation(60, 420);

		add(checkBoxWoman);
		checkBoxWoman.setSize(110, 30);
		checkBoxWoman.setLocation(185, 420);

		add(checkBoxNoGender);
		checkBoxNoGender.setSize(110, 30);
		checkBoxNoGender.setLocation(310, 420);

		add(eMail);
		eMail.setSize(360, 30);
		eMail.setLocation(60, 450);

		add(eMailField);
		eMailField.setSize(360, 30);
		eMailField.setLocation(60, 480);

		add(phone);
		phone.setSize(360, 30);
		phone.setLocation(60, 510);

		add(countryCode);
		countryCode.setSize(360, 30);
		countryCode.setLocation(60, 540);

		add(phoneField);
		phoneField.setSize(235, 30);
		phoneField.setLocation(60, 575);

		add(certificationNumber);
		Color color = new Color(0, 200, 0);
		certificationNumber.setBackground(color);
		certificationNumber.setForeground(Color.white);
		certificationNumber.setSize(115, 30);
		certificationNumber.setLocation(305, 575);

		add(certificationNumberField);
		certificationNumberField.setSize(360, 30);
		certificationNumberField.setLocation(60, 610);

		add(join);
		Color joinColor = new Color(0, 200, 0);
		join.setBackground(joinColor);
		join.setForeground(Color.white);
		join.setFont(getFont().deriveFont(18.0f));
		join.setSize(360, 30);
		join.setLocation(60, 650);

	}

	public static void main(String[] args) {
		new MyFramePanelEx2();
	}
}
