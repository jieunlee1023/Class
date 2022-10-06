package test.ex01;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

//이미지로 생각 했던 것도 객체로 만든다는 생각!

public class Player extends JLabel implements Moveable {

	private int x;
	private int y;

	private ImageIcon playerR, playerL;

	public Player() {
		initData();
		setInitLayout();
	}

	private void initData() {
		playerR = new ImageIcon("images/playerR.png");
		playerL = new ImageIcon("images/playerL.png");
	}

	private void setInitLayout() {

		x = 55;
		y = 535;

		setIcon(playerR); // 상속받은 JLabel의 기능을 이용
		setSize(50, 50);
		setLocation(x, y);

	}

	@Override
	public void left() {
		setIcon(playerL);
		x = x - 10;
		setLocation(x, y); // JLabel 일 때 다시 그리는 방식
	}

	@Override
	public void right() {
		setIcon(playerR);
		x = x + 10;
		setLocation(x, y);

	}

	@Override
	public void up() {
		System.out.println("점프");
	}

	@Override
	public void down() {

	}
}
