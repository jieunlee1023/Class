package test.ex00;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bubble extends JLabel {

	private Player player;

	private int x;
	private int y;

	// 움직임 상태
	private boolean left;
	private boolean right;
	private boolean up;
	private boolean down;

	// 이미지
	private ImageIcon bubble;
	private ImageIcon bubbled;
	private ImageIcon bumb;

	public Bubble(Player player) {
		this.player = player;
		initDate();
		setInitLayout();
	}

	private void initDate() {
		bubble = new ImageIcon("images/bubble.png");
		bubbled = new ImageIcon("images/bubbled.png");
		bumb = new ImageIcon("images/bumb.png");
	}

	private void setInitLayout() {
		left = false;
		right = false;
		up = false;

		x = player.getX();
		y = player.getY();

		setIcon(bubble);
		setSize(50, 50);

	}

}
