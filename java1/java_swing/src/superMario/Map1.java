package superMario;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Map1 extends JFrame implements DefineInfo{

//	DefinedInfo definedInfo;

	private BufferedImage bgImage;
	private BufferedImage mario_right;
	private BufferedImage mario_right1;
	private BufferedImage mario_left;
	private BufferedImage mario_left1;
	private BufferedImage mario_current;

	private BufferedImage coin1;
	private BufferedImage coin2;
	private BufferedImage coin3;
	private BufferedImage enemy1;
	private BufferedImage enemy2;
	MyDrawPanel mydrawpanel;
	JButton button = new JButton("button");
	int mario_X = 0;
	int mario_Y = 380;
	int enemy_X = 300;
	int enemy_Y = 120;
	int enemy_X1 = 800;
	int enemy_Y1 = 415;
	boolean flag = true;


	public Map1() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("super Mario");
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			bgImage = ImageIO.read(new File("Mario/map1.png"));
			mario_current = ImageIO.read(new File("Mario/mairo_right.png"));
			mario_right = ImageIO.read(new File("Mario/mairo_right.png"));
			mario_right1 = ImageIO.read(new File("Mario/right.png"));
			mario_left = ImageIO.read(new File("Mario/mairo_left.png"));
			mario_left1 = ImageIO.read(new File("Mario/left.png"));
			coin1 = ImageIO.read(new File("Mario/coin.png"));
			coin2 = ImageIO.read(new File("Mario/coin.png"));
			coin3 = ImageIO.read(new File("Mario/coin.png"));
			enemy1 = ImageIO.read(new File("Mario/attacker.png"));
			enemy2 = ImageIO.read(new File("Mario/attacker.png"));

		} catch (IOException e) {
			System.exit(0);
		}
		mydrawpanel = new MyDrawPanel();
	}

	private void setInitLayout() {
		setVisible(true);
		setResizable(true);
		this.add(mydrawpanel);

	}

	private void addEventListener() {
		this.addKeyListener(new MyListener());
	}

	private class MyListener extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			if (keyCode == KeyEvent.VK_RIGHT) {
				flag = !flag;
				System.out.println(flag);

				if (flag == false) {
					mario_current = mario_right1;
					mario_X = (mario_X < FRAME_WIDTH - 50) ? mario_X + 10 : FRAME_WIDTH - 50;
					died();
				} else {
					mario_current = mario_right;
					mario_X = (mario_X < FRAME_WIDTH - 50) ? mario_X + 10 : FRAME_WIDTH - 50;
					if (mario_X == 1150) {
						new Map2();
					}
				}
			} else if (keyCode == KeyEvent.VK_LEFT) {
				flag = !flag;
				System.out.println(flag);

				if (flag == false) {
					mario_current = mario_left;
					mario_X = (mario_X < 0) ? 0 : mario_X - 10;
					died();

				} else {
					mario_current = mario_left1;
					mario_X = (mario_X < 0) ? 0 : mario_X - 10;
					died();

				}
			} else if (keyCode == KeyEvent.VK_SPACE) {
				if (mario_current == mario_left || mario_current == mario_left1) {
					System.out.println("dd");
					// jump ? 순간이동?
					mario_Y -= 50;
					threadSleep(500);
					repaint();
					mario_X -= 150;
					threadSleep(500);
					repaint();
					mario_Y += 50;
					died();
				} else {
					mario_Y -= 50;
					threadSleep(500);
					repaint();
					mario_X += 150;
					threadSleep(500);
					repaint();
					mario_Y += 50;
					died();
				}
			}

			repaint();
		}
	}

	private class MyDrawPanel extends JPanel {

		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawImage(bgImage, 0, 0, FRAME_WIDTH, FRAME_HEIGHT, null);
			g.drawImage(mario_current, mario_X, mario_Y, MARIO_WIDTH, MARIO_HEIGHT, null);
			g.drawImage(coin1, 450, 120, COIN_WIDTH, COIN_HEIGHT, null);
			g.drawImage(coin2, 160, 270, COIN_WIDTH, COIN_HEIGHT, null);
			g.drawImage(coin3, 710, 270, COIN_WIDTH, COIN_HEIGHT, null);
			g.drawImage(enemy1, enemy_X, 120, ENEMY_WIDTH, ENEMY_HEIGHT, null);
			g.drawImage(enemy2, enemy_X1, 415, ENEMY_WIDTH, ENEMY_HEIGHT, null);
		}
	}

	private void threadSleep(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
		}
	}

	private void died() {
		if (mario_X >= enemy_X - 25 && mario_X <= enemy_X + 25 && mario_Y == enemy_Y) {
			System.out.println("게임오lll버 창 띄우기  ");
			new End().lose();
			
		}
		if (mario_X >= enemy_X1 - 25 && mario_X <= enemy_X1 + 25 && mario_Y == mario_Y) {
			System.out.println("게임오lll버 창 띄우기  ");
			new End().lose();

		}
		if ((mario_X > 380 && mario_Y == mario_Y) && (mario_X < 490 && mario_Y == mario_Y)) {
			System.out.println("game over");
			new End().lose();
		}
	}

	public static void main(String[] args) {
		new Map1();
	}

}
