package ch06;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MiniGame extends JFrame implements KeyListener {

	final int FRAME_WIDTH = 500;
	final int FRAME_HEIGHT = 500;
	int playerX = 200;
	int playerY = 200;

	BufferedImage backgroundImage;
	BufferedImage playerImage;

	MyDrawPanel myDrawPanel;

	public MiniGame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("미니게임");
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			backgroundImage = ImageIO.read(new File("images/background.png"));
			playerImage = ImageIO.read(new File("images/player.png"));
		} catch (IOException e) {
			System.out.println("파일명 및 경로 확장자 확인하기!");
			System.exit(0); // 프로그램 자동 종료
		}

		myDrawPanel = new MyDrawPanel();
	}

	private void setInitLayout() {
		setVisible(true);
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
			playerX = (playerX < 0) ? 0 : playerX - 10;
//			playerX -= 10;
		} else if (keyCode == KeyEvent.VK_RIGHT) {
			playerX = (playerX >= FRAME_WIDTH) ? 0 : playerX + 10;
			playerX += 10;
		} else if (keyCode == KeyEvent.VK_UP) {
			playerY -= 10;
		} else if (keyCode == KeyEvent.VK_DOWN) {
//			playerX = (playerY < 0) ? 0 : playerY - 10; 대각선으로 움직임 ;;
			playerY += 10;
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
			g.drawImage(backgroundImage, 0, 0, FRAME_WIDTH, FRAME_HEIGHT, null);
			g.drawImage(playerImage, playerX, playerY, 100, 130, null);
		}

	} // end of inner class

}
