package test.ex10;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BubbleFrame extends JFrame {

	private BubbleFrame mContext = this;
//	private BubbleFrame mContext = new BubbleFrame();

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

		player = new Player(mContext);
		enemy = new Enemy(mContext);
	}

	private void setInitLayout() {
		setVisible(true);
		setResizable(false);
		setLayout(null);

		add(player);
		add(enemy);
//		enemy.left();

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
					if (!player.isUp() && !player.isDown()) {
						player.up();
					}
					break;

				case KeyEvent.VK_SPACE:
					player.attack();
					
					break;

				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
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

	// 메인 함수가 있는 코드는 모든 객체들에서 주소값을 알 수 있다.
	public static void main(String[] args) {
		new BubbleFrame();
	}
}
