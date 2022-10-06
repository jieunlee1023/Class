package game.component;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import game.BubbleFrame;
import game.interfaces.Moveable;
import game.service.BackgroundPlayerService;
import game.state.PlayerWay;
import lombok.Getter;
import lombok.Setter;

// new 가 가능한 녀석들 : 게임에 존재할 수 있다 (추상 메소드를 가질 수 없다.)
@Getter
@Setter

public class Player extends JLabel implements Moveable {

	BubbleFrame mContext;

	// player 위치 상태
	private int x;
	private int y;

	// 움직임 상태
	private boolean left;
	private boolean right;
	private boolean up;
	private boolean down;

	// 플레이어의 방 향 상 태
	PlayerWay pWay;

	// 벽에 충돌한 상태
	private boolean leftWallCrash;
	private boolean rightWallCrash;

	// 플레이어의 속도 상태
	private final int SPEED = 4;
	private final int JUMPSPEED = 2;

	private ImageIcon playerR, playerL, playerLdie, playerRdie;

	// 0: 살아있다.
	// 1 : 죽었다.
	private int state = 0;

	public Player(BubbleFrame mContext) {
		this.mContext = mContext;
		initDate();
		setInitLayout();
		new Thread(new BackgroundPlayerService(this)).start();
	}

	private void initDate() {
		playerR = new ImageIcon("images/playerR.png");
		playerL = new ImageIcon("images/playerL.png");
		playerLdie = new ImageIcon("images/playerLDie.png");
		playerRdie = new ImageIcon("images/playerRDie.png");

		x = 400;
		y = 535;
		left = false;
		right = false;
		up = false;
		down = false;
	}

	private void setInitLayout() {
		setIcon(playerR);
		pWay = PlayerWay.RIGHT; //
		setSize(50, 50);
		setLocation(x, y);
	}

	@Override
	public void left() {
		this.pWay = PlayerWay.LEFT;
		left = true;

		new Thread(new Runnable() {

			@Override
			public void run() {
				while (left && state == 0) {
					setIcon(playerL);
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
		this.pWay = PlayerWay.RIGHT;
		right = true;
		new Thread(new Runnable() {

			@Override
			public void run() {
				while (right && state == 0) {
					setIcon(playerR);
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
		System.out.println("점프");
		up = true;
		new Thread(new Runnable() {

			@Override
			public void run() {
				if (state == 0) {
					// 반복 = 65
					for (int i = 0; i < 130 / JUMPSPEED; i++) {
						// 535 = 535 - 2
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

			}
		}).start();

	}

	@Override
	public void down() {
		down = true;
		new Thread(new Runnable() {

			@Override
			public void run() {

				while (down && state == 0) {
					y = y + JUMPSPEED;
					setLocation(x, y);
					try {
						Thread.sleep(3);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				down = false;
				// 상태값을 다룰때는 상황이 변하면 확실하게 초기화 처리를 하자 !!!
			}
		}).start();
	}

	public void attack() {

		new Thread(() -> {
			Bubble bubble = new Bubble(mContext);
			mContext.add(bubble);
			if (pWay == PlayerWay.LEFT) {
				bubble.left();
			} else {
				bubble.right();
			}
		}).start();
	}

	public void die() {
		new Thread(() -> {
			setState(1);
			setIcon(PlayerWay.RIGHT == pWay ? playerRdie : playerLdie);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			mContext.remove(this); // 프레임에서 지우기
			mContext.repaint();
		}).start();
	}

}