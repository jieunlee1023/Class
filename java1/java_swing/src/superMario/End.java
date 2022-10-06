package superMario;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class End extends JFrame implements ActionListener {

	// 만약 깃발에 도착하면 win
	// 빠지거나 (좌표값 변경) , Attacker한테 데이면 lose
	// 다시하기 or 끝내기 버튼
	JLabel winImageLabel;
	JLabel loseImageLabel;
	JButton startButton;
	JButton exitButton;

	public End() {

		initData();
		setInitLayout();
		addEventListener();

	}

	public void initData() {
		setTitle("슈퍼마리오");
		setSize(1200, 520);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		winImageLabel = new JLabel(new ImageIcon("Mario/win.png"));
		loseImageLabel = new JLabel(new ImageIcon("Mario/lose.png"));
		startButton = new JButton(" RESTART ");
		exitButton = new JButton(" EXIT ");
	}

	public void setInitLayout() {
		setVisible(true);
		setLayout(null);

		add(startButton);
		startButton.setSize(200, 80);
		startButton.setLocation(950, 250);
		startButton.setFont(new Font("SanSerif", Font.BOLD, 30));
		startButton.setBackground(Color.orange);
		startButton.setBorder(new TitledBorder(new LineBorder(Color.black)));

		add(exitButton);
		exitButton.setSize(200, 80);
		exitButton.setLocation(950, 350);
		exitButton.setFont(new Font("SanSerif", Font.BOLD, 30));
		exitButton.setBackground(Color.orange);
		exitButton.setBorder(new TitledBorder(new LineBorder(Color.black)));

	}
	
	public void win() {
		add(winImageLabel);
		winImageLabel.setSize(1200, 520);
		winImageLabel.setLocation(0, 0);
		
		startButton.setBackground(Color.orange);
		exitButton.setBackground(Color.orange);
	}
	public void lose() {
		add(loseImageLabel);
		loseImageLabel.setSize(1200, 520);
		loseImageLabel.setLocation(0, 0);
		
		startButton.setBackground(Color.red);
		exitButton.setBackground(Color.red);
	}

	public void addEventListener() {
		startButton.addActionListener(this);
		exitButton.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton trgetButton = (JButton) e.getSource();
		if (trgetButton.getText().equals(startButton.getText())) {
			System.out.println("시작됩니다");

			new Map1();

		} else if (trgetButton.getText().equals(exitButton.getText())) {
			System.exit(0);
			System.out.println("종료됩니다.");
		}

	}

	public static void main(String[] args) {
		new End();
	}

}
