package ch06;

import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Game extends JFrame {

	JLabel background;
	JLabel player;

	public Game() {
		initData();
		setInitLayout();
		addEventListener();
	}

	public void initData() {
		setTitle("호람쥐 움직이기");
		setSize(500, 500);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		background = new JLabel(new ImageIcon("background.png"));
		player = new JLabel(new ImageIcon("player.png"));
	}

	public void setInitLayout() {
		setVisible(true);
		setLayout(null);
		
		player.setSize(180, 200);
		player.setLocation(150, 120);
		add(player);

		background.setSize(500, 500);
		background.setLocation(0, 0);
		add(background);

	}

//왼쪽 37 위 38 오른쪽 39 아래 40
	private void addEventListener() {

		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				if (keyCode == 37) {
					System.out.println("호람쥐가 왼쪽으로 10만큼 움직입니다.");
					player.setLocation(player.getX() - 10, player.getY());
				} else if (keyCode == 38) {
					System.out.println("호람쥐가 위로 10만큼 움직입니다.");
					player.setLocation(player.getX(), player.getY() - 10);
				} else if (keyCode == 39) {
					System.out.println("호람쥐가 오른쪽으로 10만큼 움직입니다.");
					player.setLocation(player.getX() + 10, player.getY());
				} else if (keyCode == 40) {
					System.out.println("호람쥐가 아래로 10만큼 움직입니다.");
					player.setLocation(player.getX(), player.getY() + 10);
				} else {
					System.out.println("잘못 입력되었습니다.");
				}

				if (player.getX() < background.getX() && player.getY() < background.getY()) {
					System.out.println("호람쥐가 나갑니다.");
					player.setLocation(5, 10);
				} else if (player.getX() > background.getX() && player.getY() > background.getY()) {
					System.out.println("222호람쥐가 나갑니다.");
//					player.setLocation(5,10);

				}
			}
		});
	}

	public static void main(String[] args) {
		new Game();
	}
}