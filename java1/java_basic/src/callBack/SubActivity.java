package callBack;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//(콜리) callLee 호출자 
// : 콜백 받는 객체의 주소값을 알고 있어야 한다.!!! 여기서 호출하기 때문에
public class SubActivity extends JFrame implements ActionListener {

	JButton plusbutton;
	JButton minusButton;

	// ★★ 호출자는 누구한테 메세지를 전달해야 하는지 알고 있어야 한다.
	// 1. 생성자로 만드는 방법
	// 2. 메서드를 통해서 만드는 방법

	// 1-1. 인터페이스 타입을 멤버변수로 선언한다.
	OnCallBackButtonAction onCallBackButtonAction;

	// 1-2. 생성자에 매개변수로 인터페이스 타입을 받는다
	public SubActivity(OnCallBackButtonAction onCallBackButtonAction) {
		this.onCallBackButtonAction = onCallBackButtonAction;
		setVisible(true);
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
//		setLayout(new GridLayout(2, 1));
		plusbutton = new JButton("더하기 버튼");
		minusButton = new JButton("빼기 버튼");

		plusbutton.addActionListener(this);
		minusButton.addActionListener(this);

		add(plusbutton);
		add(minusButton);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼이 눌러졌습니다.");
		// 1-3. 메서드를 호출
		if (e.getSource().equals(plusbutton)) {
			onCallBackButtonAction.clickPlusButton();
		} else {
			onCallBackButtonAction.clickMinusButton();
		}
	}
}
