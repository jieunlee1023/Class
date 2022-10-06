package test.ex00;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleFrame extends JFrame {
	// 포함관계 (컴포지션 관계)

	private JLabel backgroundMap;
	private Player player;
	private Enemy enemy;

	public BubbleFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		backgroundMap = new JLabel(new ImageIcon("images/backgroundMap.png"));
//		backgroundMap = new JLabel(new ImageIcon("images/test.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(backgroundMap); // add와 같은 기능
		setSize(1000, 640);

		player = new Player();
		enemy = new Enemy();

	}

	private void setInitLayout() {
		setVisible(true);
		setResizable(false);
		setLayout(null); // absoulte 레이아웃

		add(player);
		add(enemy);

	}

	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
//				System.out.println(e.getKeyCode());

				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:

					if (!player.isLeft() && !player.isLeftWallCrash()) {
						player.left();
					}
					break;
				case KeyEvent.VK_RIGHT:

					if (!player.isRight() && !player.isRightWallCrash()) {
						player.right();
					}

					break;
				case KeyEvent.VK_UP:
					if (!player.isUp()) {
						player.up();
					}
					break;
				case KeyEvent.VK_SPACE:
					Bubble bubble = new Bubble(player);
					add(bubble);
					break;
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					// 왼쪽으로 가는거 멈춰야해
					player.setLeft(false);

					break;
				case KeyEvent.VK_RIGHT:
					// 오른쪽으로 가는거 멈춰야해
					player.setRight(false);
					break;

				}
			}
		});

	}

	// 메인
	public static void main(String[] args) {
		new BubbleFrame();
	}// end of main

}
