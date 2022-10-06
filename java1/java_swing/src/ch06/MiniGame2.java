package ch06;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MiniGame2 extends JFrame implements KeyListener {

	final int FRAME_WIDTH = 500;
	final int FRAME_HEIGHT = 500;
	int playerX = 200;
	int playerY = 200;

	BufferedImage backgroundImage1;
	BufferedImage backgroundImage2;
	BufferedImage backgroundImage3;
	BufferedImage playerImage;

	MyDrawPanel myDrawPanel;

	int count;

	public MiniGame2() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("미니게임");
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			backgroundImage1 = ImageIO.read(new File("images/1.png"));
			backgroundImage2 = ImageIO.read(new File("images/2.png"));
			playerImage = ImageIO.read(new File("images/player.png"));
		} catch (IOException e) {
			System.out.println("파일명 및 경로 확장자 확인하기!");
			System.exit(0); // 프로그램 자동 종료
		}
		myDrawPanel = new MyDrawPanel();
	}

	private void setInitLayout() {
		setVisible(true);
		setResizable(false);
		this.add(myDrawPanel);
	}

	private void addEventListener() {
		this.addKeyListener(this);
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		if (keyCode == KeyEvent.VK_LEFT) {
			playerX = (playerX < 10) ? 10 : playerX - 10;
			playerX -= 10;
		} else if (keyCode == KeyEvent.VK_RIGHT) {
			playerX = (playerX > 380) ? 380 : playerX + 10;
			playerX += 10;
		} else if (keyCode == KeyEvent.VK_UP) {
			playerY = (playerY < 10) ? 10 : playerY - 10;
			playerY -= 10;
		} else if (keyCode == KeyEvent.VK_DOWN) {
			playerY = (playerY > 320) ? 320 : playerY + 10;
			playerY += 10;
		} else if (keyCode == KeyEvent.VK_SPACE) {
			if (count == 0) {
				backgroundImage3 = backgroundImage1;
				backgroundImage1 = backgroundImage2;
				count++;
			}
			if (count == 1) {
				backgroundImage2 = backgroundImage3;
				count = 0;
			}
		}
		repaint(); // 그림을 다시 그려주다
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	// inner class
	private class MyDrawPanel extends JPanel {

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundImage1, 0, 0, FRAME_WIDTH, FRAME_HEIGHT, null);
			g.drawImage(playerImage, playerX, playerY, 100, 130, null);
		}

	} // end of inner class

	public static void main(String[] args) {
		new MiniGame2();
	}

}
