package superMario;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Map2 extends JFrame implements DefineInfo{

	private BufferedImage bgImage;
	private BufferedImage mario_right;
	private BufferedImage mario_right1;
	private BufferedImage mario_left;
	private BufferedImage mario_left1;
	private BufferedImage mario_current;
	
	private BufferedImage enemy1;
	private BufferedImage enemy2;
	
	int mario_X = 0;
	int mario_Y = 375;
	boolean flag = true;
	
	MarioImages marioImages;

	public Map2() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("마리오게임");
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			bgImage = ImageIO.read(new File("Mario/map2.png"));
			mario_current = ImageIO.read(new File("Mario/mairo_right.png"));
			mario_right = ImageIO.read(new File("Mario/mairo_right.png"));
			mario_right1 = ImageIO.read(new File("Mario/right.png"));
			mario_left = ImageIO.read(new File("Mario/mairo_left.png"));
			mario_left1 = ImageIO.read(new File("Mario/left.png"));
			enemy1 = ImageIO.read(new File("Mario/attacker.png"));
			enemy2 = ImageIO.read(new File("Mario/attacker.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		marioImages = new MarioImages();

	}

	private void setInitLayout() {
		setVisible(true);
		setResizable(true);
		this.add(marioImages);
	}

	private void addEventListener() {

		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				if (keyCode == KeyEvent.VK_RIGHT) {
					flag = !flag;
					System.out.println(flag);

					if (flag == false) {
						mario_current = mario_right1;
						mario_X = (mario_X < FRAME_WIDTH - 50) ? mario_X + 10 : FRAME_WIDTH - 50;
					} else {
						mario_current = mario_right;
						mario_X = (mario_X < FRAME_WIDTH - 50) ? mario_X + 10 : FRAME_WIDTH - 50;
						System.out.println(mario_X+"/"+mario_Y);
						if (mario_X >= 790) {
							new End().win();
						}
						if (mario_X == 320) {
							new End().lose();
						}
					}
				} else if (keyCode == KeyEvent.VK_LEFT) {
					flag = !flag;
					System.out.println(flag);

					if (flag == false) {
						mario_current = mario_left;
						mario_X = (mario_X < 0) ? 0 : mario_X - 10;

					} else {
						mario_current = mario_left1;
						mario_X = (mario_X < 0) ? 0 : mario_X - 10;


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
					} else {
						mario_Y -= 50;
						threadSleep(500);
						repaint();
						mario_X += 150;
						threadSleep(500);
						repaint();
						mario_Y += 50;
					}
				}

				repaint();
			}
		});
	}
	
	private void threadSleep(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
		}
	}


	// 내부클래스
	private class MarioImages extends JPanel {

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(bgImage, 0, 0, FRAME_WIDTH, FRAME_HEIGHT, null);
			g.drawImage(mario_current, mario_X, mario_Y, MARIO_WIDTH, MARIO_HEIGHT, null);


		}
	} // end of inner class

	public static void main(String[] args) {
		new Map2();
	}
}
