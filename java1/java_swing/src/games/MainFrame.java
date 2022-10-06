package games;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {

	BufferedImage background;
	BufferedImage player;
	BufferedImage img;
	ImagePanel imagePanel;

	int playerX = 200;
	int playerY = 200;
	int imgX = 100;
	int imgY = 100;

	boolean flag = true;

	public MainFrame() {
		initDate();
		setInitLayout();
		addEventListener();

		Thread thread = new Thread(imagePanel);
		thread.start();
	}

	private void initDate() {
		setTitle("스레드를 활용한 미니게임");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			background = ImageIO.read(new File("background.png"));
			player = ImageIO.read(new File("player.png"));
			img = ImageIO.read(new File("img.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		imagePanel = new ImagePanel();

	}

	private void setInitLayout() {
		setVisible(true);
		setResizable(false);
		add(imagePanel);

	}

	private void addEventListener() {
		// 키보드 이벤트 추가
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();
				if (code == KeyEvent.VK_UP) {
					playerY -= 10;
				} else if (code == KeyEvent.VK_DOWN) {
					playerY += 10;
				} else if (code == KeyEvent.VK_LEFT) {
					playerX -= 10;
				} else if (code == KeyEvent.VK_RIGHT) {
					playerX += 10;
				} else if (code == KeyEvent.VK_SPACE) {
					flag = !flag;
					if (flag == false) {
					} else {
						new Thread(imagePanel).start();
					}
				}
//				System.out.println("key code : " + code);
				repaint();
			}
		});
	}

	// 내부 클래스
	private class ImagePanel extends JPanel implements Runnable {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(background, 0, 0, getWidth(), getHeight(), null);
			g.drawImage(player, playerX, playerY, 100, 130, null);
			g.drawImage(img, imgX, imgY, 50, 60, null);
		}

		@Override
		public void run() {

			boolean direction = true;
			// true : 오른쪽으로 가고 있는 상황
			// false : 왼쪽으로 가고 있는 상황

			// 1. 왔다갔다 반복 처리 (횟수 지정x) while
			while (true) {
				// 변수로 왔다 갔다 구현
				System.out.println("진행중");
				if (flag) {
					// 만약 direction이 true면 x 좌표 증가
					// 아니라면 즉 false 면 x 좌표 감소
					if (direction) {
						imgX += 10;
						if (imgX >= 530) {
							direction = false;
//							flag = false;
						}
					} else {
						imgX -= 10;
						if (imgX <= 10) {
							direction = true;
//							flag = true;
						}
					}
					// 만약 x 좌표가 500보다 크다면 direction 을 false로 변경한다
					// 그리고 x 좌표가 100보다 작다면 directon을 true로 변경한다.
					if (playerX == imgX && playerY == imgY) {
						System.out.println("부딪");
						player = null;
					}
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					// +10 이동후 그리기를 계속 반복
					repaint();
				} // end of if

			} // end of while
		} // end of run
	} // end of inner class

	public static void main(String[] args) {
		new MainFrame();
	}

}
