package test.ex04;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleFrame extends JFrame {
	// 포함관계 (컴포지션 관계)

	private JLabel backgroundMap;
	private Player player;

	public BubbleFrame() {
		initData();
		setInitLayout();
		addEventListener();
//		new BackgroundPlayerService(player); // Runnable
		new Thread(new BackgroundPlayerService(player)).start();

	}

	private void initData() {
		backgroundMap = new JLabel(new ImageIcon("images/backgroundMap.png"));
//		backgroundMap = new JLabel(new ImageIcon("images/test.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(backgroundMap); // add와 같은 기능
		setSize(1000, 640);

		player = new Player();

	}

	private void setInitLayout() {
		setVisible(true);
		setResizable(false);
		setLayout(null); // absoulte 레이아웃
		setLocationRelativeTo(null); // JFrame 가운데 배치하기

		add(player);

	}

	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println(e.getKeyCode());

				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:

					// L L L L L
					// 스레드 5개 생성 new L new L new L new L new L
					// 스레드 1번만 생성하기 위한 코드

					if (!player.isLeft()) {
						// boolean의 게터 셋터는 is가 들어감
						player.left();
					}

					break;
				case KeyEvent.VK_RIGHT:

					if (!player.isRight()) {
						player.right();
					}

					break;
				case KeyEvent.VK_UP:
					if (!player.isUp()) {
						player.up();
					}
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

	public static void main(String[] args) {
		new BubbleFrame();
	}
}
