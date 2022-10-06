package callBack;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

//콜백 받는 객체
public class MainActivity extends JFrame implements OnCallBackButtonAction {

	int count;
	JLabel label;

	SubActivity subActivity;

	public MainActivity() {
		count = 0;
		label = new JLabel(count + " ");
		setLayout(new FlowLayout());
		add(label);

		setVisible(true);
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		subActivity = new SubActivity(this);

	}

	public void addCount() {
		count++;
		label.setText(count + " ");
	}

	@Override
	public void clickPlusButton() {
		System.out.println("누군지는 모르겠는데 콜백되어져서 ++++ 메서드가 실행되었다.");
		count++;
		label.setText(count + "");
	}

	@Override
	public void clickMinusButton() {
		count--;
		System.out.println("누군지는 모르겠는데 콜백되어져서 ---- 메서드가 실행되었다.");
		label.setText(count + "");
	}
}
