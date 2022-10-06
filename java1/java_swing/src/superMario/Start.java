package superMario;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
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

public class Start extends JFrame implements ActionListener {

	JLabel startImageLabel;
	JButton startButton;
	JButton exitButton;

	JLabel mario;

	public Start() {

		initData();
		setInitLayout();
		addEventListener();

	}

	public void initData() {
		setTitle("슈퍼마리오");
		setSize(1200, 520);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		startImageLabel = new JLabel(new ImageIcon("start.png"));
		startButton = new JButton(" START ");
		exitButton = new JButton(" EXIT ");

		mario = new JLabel(new ImageIcon("mairo_right.png"));

	}

	public void setInitLayout() {
		setVisible(true);
		setLayout(null);

		add(mario);

		add(startButton);
		startButton.setSize(200, 80);
		startButton.setLocation(950, 200);
		startButton.setFont(new Font("SanSerif", Font.BOLD, 30));
		startButton.setBackground(Color.yellow);
		startButton.setBorder(new TitledBorder(new LineBorder(Color.black)));

		add(exitButton);
		exitButton.setSize(200, 80);
		exitButton.setLocation(950, 300);
		exitButton.setFont(new Font("SanSerif", Font.BOLD, 30));
		exitButton.setBackground(Color.yellow);
		exitButton.setBorder(new TitledBorder(new LineBorder(Color.black)));

		add(startImageLabel);
		startImageLabel.setSize(1200, 520);
		startImageLabel.setLocation(0, 0);

	}

	public void addEventListener() {
		startButton.addActionListener(this);
		exitButton.addActionListener(this);
                    
		mario.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				if (keyCode == KeyEvent.VK_RIGHT) {
					System.out.println("움직입니다.");
					mario.setLocation(mario.getX() + 10, mario.getY());
				}
			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton trgetButton = (JButton) e.getSource();
		if (trgetButton.getText().equals(startButton.getText())) {
			System.out.println("시작됩니다");
			startButton.setSize(0, 0);
			exitButton.setSize(0, 0);
			startImageLabel.setSize(0, 0);

			new Map1();

		} else if (trgetButton.getText().equals(exitButton.getText())) {
			System.exit(0);
			System.out.println("종료됩니다.");
		}

	}
	
	public static void main(String[] args) {
		new Start();
	}

}
