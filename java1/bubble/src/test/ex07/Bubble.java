package test.ex07;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bubble extends JLabel implements Moveable {

//   의존성 컴포지션 관계
	Player player;

//   버블의 위치 상태
	private int x;
	private int y;

//   움직임 상태
	private boolean left;
	private boolean right;
	private boolean up;

//   적군을 맞춘 상태
	private int state; // 0(물방울) , 1 (적을 가둔 물방울)

	private ImageIcon bubble; // 물방울
	private ImageIcon bubbled; // 적을가둔물방울
	private ImageIcon bomb; // 물방울 터진 모양

	// 벽에 충돌한 상태
	private boolean leftWallCrash;
	private boolean rightWallCrash;
	private boolean topWallCrash;

	public Bubble(Player player) {
		this.player = player;
		initData();
		setInitLayout();
		initThread();
//		new Thread(new BackgroundBubbleService(this)).start();
	}

	private void initData() {
		bubble = new ImageIcon("images/bubble.png");
		bubbled = new ImageIcon("images/bubbled.png");
		bomb = new ImageIcon("images/bomb.png");

		left = false;
		right = false;
		up = false;
		state = 0;

	}

	private void setInitLayout() {
//      플레이어가 있는 위치에서 태어나야 한다.
		x = player.getX();
		y = player.getY();
		setIcon(bubble);
		setSize(50, 50);
		setLocation(x, y);
	}

	private void initThread() {
		// 버블은 스레드가 하나면 된다.
		new Thread(new Runnable() {

			@Override
			public void run() {
				if (player.getPWay() == PlayerWay.LEFT) {
					left();
				} else {
					right();
				}
			}
		}).start();
	}

	@Override
	public void left() {

		left = true;
		for (int i = 0; i < 400; i++) {
			x--;
			setLocation(x, y);

			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		up();
	}

	@Override
	public void right() {
		right = true;
		for (int i = 0; i < 400; i++) {
			x++;
			setLocation(x, y);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		up();

	}

	@Override
	public void up() {

		up = true;
		while (up) {
			y--;
			setLocation(x, y);

			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
