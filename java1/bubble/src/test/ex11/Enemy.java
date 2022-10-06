package test.ex11;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Enemy extends JLabel implements Moveable {

	private BubbleFrame mContext;

	// 살아있는 상태 (0) , 물방울에 갇힌 상태 (1)
	private int state;

	// 위치 상태
	private int x;
	private int y;

	// 적군의 방향
	private EnemyWay enemyWay;

	// 움직임 상태
	private boolean left;
	private boolean right;
	private boolean up;
	private boolean down;

	// 적군 속도 상태
	private final int SPEED = 3;
	private final int JUMPSPEED = 1;

	private ImageIcon enemyR, enemyL;

	public Enemy(BubbleFrame mContext) {
		this.mContext = mContext;
		initDate();
		setInitLayout();
	}

	public Enemy() {
		initDate();
		setInitLayout();
	}

	private void initDate() {
		enemyR = new ImageIcon("images/enemyR.png");
		enemyL = new ImageIcon("images/enemyL.png");
		x = 720;
		y = 175;
		left = false;
		right = false;
		up = false;
		down = false;

		enemyWay = EnemyWay.LEFT;
		state = 0;
	}

	private void setInitLayout() {
		setIcon(enemyL); // 상속받은 JLabel의 기능을 이용
		setSize(50, 50);
		setLocation(x, y);

	}

	@Override
	public void left() {
		enemyWay = enemyWay.LEFT;
		left = true;
		new Thread(() -> {
			while (true) {
				setIcon(enemyL);
				x = x - SPEED;
				setLocation(x, y);

				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();

	}

	@Override
	public void right() {

		enemyWay = enemyWay.RIHGT;
		right = true;
		new Thread(() -> {
			while (true) {
				setIcon(enemyR);
				x = x + SPEED;
				setLocation(x, y);

				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();

	}

	@Override
	public void up() {

		up = true;
		new Thread(() -> {

			for (int i = 0; i < 130 / JUMPSPEED; i++) {

				y = y - JUMPSPEED;
				setLocation(x, y);

				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			up = false;
			down();
		}).start();
	}

	@Override
	public void down() {
		down = true;

		new Thread(new Runnable() {

			@Override
			public void run() {
				y = y + JUMPSPEED;
				setLocation(x, y);

				try {
					Thread.sleep(3);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				down = false;
			}
		}).start();
	}

//	public void clearEnemy() {
//		try {
//			Thread.sleep(1);
////			setIcon(bubbled);
////			Thread.sleep(500);
//			// BubbleFrame의 bubble 객체를 메모리에서 소멸 시켜버리기!
//			mContext.remove(this); // 메모리에서 내리기
//			mContext.repaint(); // BubbleFrame의 전체를 다시 그린다. 메모리에 없는 것은 그리지 않음
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//
//	}

}
