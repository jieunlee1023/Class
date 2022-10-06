package test.ex02;

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
	}

	private void initData() {
		backgroundMap = new JLabel(new ImageIcon("images/backgroundMap.png"));
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
					player.left();
					break;
				case KeyEvent.VK_RIGHT:
					player.right();
					break;
				case KeyEvent.VK_UP:
					player.up();
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
