package test.ex00;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Enemy extends JLabel implements Moveable {

	// 위치 상태
	private int x;
	private int y;

	// 움직임 상태
	private boolean left;
	private boolean right;
	private boolean up;
	private boolean down;

	// 플레이어의 속도 상태
	private final int SPEED = 4;
	private final int JUMPSPEED = 2;

	private ImageIcon EnemyR, EnemyL;

	public Enemy() {
		initData();
		setInitLayout();
		new Thread(new BackgroundEnemyService(this)).start();
		right();

	}

	private void initData() {
		EnemyR = new ImageIcon("images/EnemyR.png");
		EnemyL = new ImageIcon("images/EnemyL.png");
		x = 520;
		y = 150;
		left = false;
		right = false;
		up = false;
		down = false;
	}

	private void setInitLayout() {
		setIcon(EnemyR); // 상속받은 JLabel의 기능을 이용
		setSize(50, 50);
		setLocation(x, y);

	}

	@Override
	public void left() {
		left = true;

		new Thread(new Runnable() {
			@Override
			public void run() {
				while (left) {
					setIcon(EnemyL);
					x = x - SPEED;
					setLocation(x, y);
					try {
						Thread.sleep(10); // 0.01초
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();

	}

	@Override
	public void right() {
		right = true;
		new Thread(new Runnable() {

			@Override
			public void run() {
				while (right) {
					setIcon(EnemyR);
					x = x + SPEED;
					setLocation(x, y);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();

	}

	@Override
	public void up() {
		up = true;
		new Thread(new Runnable() {

			@Override
			public void run() {

				for (int i = 0; i < 130 / JUMPSPEED; i++) {
					// 535 = 535 - 2;
					y = y - JUMPSPEED;
					setLocation(x, y);

					try {
						Thread.sleep(5);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				up = false;
				down();
			}
		}).start();

	}

	@Override
	public void down() {
		down = true;
		new Thread(new Runnable() {

			@Override
			public void run() {
				while (down) {
					y = y + JUMPSPEED;
					setLocation(x, y);
					try {
						Thread.sleep(5);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				down = false;
			}
		}).start();
	}
}
