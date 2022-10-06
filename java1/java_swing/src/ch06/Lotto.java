package ch06;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Lotto extends JFrame implements ActionListener {
	Scanner scanner = new Scanner(System.in);
	Random random = new Random();

	int[] lottoWinNum = new int[6];

	JPanel up;
	JPanel down;

	JLabel lottoBackground;
	JLabel concentrationImage;

	JButton start;
	JButton end;

	JTextArea winNum;
	JTextArea winText;

	public Lotto() {
		InitData();
		setInitLayout();
		addEventListener();
	}

	public void InitData() {
		setTitle("로또 당첨!");
		setSize(700, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		up = new JPanel();
		down = new JPanel();

		lottoBackground = new JLabel(new ImageIcon("Images/lottoBackground.png"));
		concentrationImage = new JLabel(new ImageIcon("Images/Concentration.png"));

		start = new JButton("추첨하기");
		end = new JButton("종료하기");
		winNum = new JTextArea();
		winText = new JTextArea("로 또 당 첨 번 호");

	}

	public void setInitLayout() {
		setVisible(true);
		this.setLayout(new BorderLayout());
		this.add(up, BorderLayout.CENTER);

		up.setLayout(null);

		up.add(lottoBackground);
		lottoBackground.setSize(685, 500);
		lottoBackground.setLocation(0, 0);

		up.add(concentrationImage);

		this.add(down, BorderLayout.SOUTH);
		down.add(start);
		down.add(end);

	}

	public void addEventListener() {
		start.addActionListener(this);
		end.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JButton targetButton = (JButton) e.getSource();
		if (targetButton.getText().equals(start.getText())) {
			System.out.println("시작 버튼이 눌러졌습니다.");
			lottonNumSelected();
			lottoBackground.setSize(0, 0);
			up.setBackground(Color.white);
			up.add(winNum);
			winNum.setSize(300, 50);
			winNum.setLocation(190, 250);
			winNum.setFont(new Font("SanSerif", Font.BOLD, 30));
			winNum.setBackground(Color.white);
			winNum.setForeground(Color.black);

			up.add(winText);
			winText.setSize(250, 50);
			winText.setLocation(220, 200);
			winText.setFont(new Font("SanSerif", Font.BOLD, 30));
			winText.setBackground(Color.white);
			winText.setForeground(Color.black);

			concentrationImage.setSize(685, 500);
		} else if (targetButton.getText().equals(end.getText())) {
			System.out.println("끝내기 버튼이 눌러 졌습니다.");
			System.exit(0);
		}
		winNum.setText(" " + lottoWinNum[0]);
		for (int i = 1; i < 6; i++) {
			winNum.append(", " + lottoWinNum[i]);
		}
	}

	public void lottonNumSelected() {
		// 로또 전체 번호 1~45개 중 랜덤 6개 , 중복 불가
		for (int i = 0; i < 6; i++) {
			lottoWinNum[i] = random.nextInt(45) + 1;

			for (int j = 0; j < i; j++) {
				if (lottoWinNum[i] == lottoWinNum[j]) {
					i--;
				}
				if (lottoWinNum[i] < lottoWinNum[j]) {
					int temp = lottoWinNum[i];
					lottoWinNum[i] = lottoWinNum[j];
					lottoWinNum[j] = temp;
				}
			}
		}
		System.out.println("* 로또 당첨 번호 : ");
		for (int i = 0; i < 6; i++) {
			if (i == 5) {
				System.out.print(lottoWinNum[i]);
			} else {
				System.out.print(lottoWinNum[i] + ", ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		new Lotto();
	}

}
