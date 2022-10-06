package games;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Game extends JFrame implements ActionListener {

	JPanel upPanel;
	JPanel downPanel;
	JButton startButton;
	JButton endButton;
	BufferedImage background;
	BufferedImage player;

	ImagePanel imagePanel;

	int playerX = 10;
	int playerY = 150;

	boolean flag = true;

	public Game() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("움직이기 게임");
		setSize(700, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		upPanel = new JPanel();
		downPanel = new JPanel();

		startButton = new JButton("START");
		endButton = new JButton("STOP");
		try {
			background = ImageIO.read(new File("background.png"));
			player = ImageIO.read(new File("player.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		imagePanel = new ImagePanel();
	}

	private void setInitLayout() {
		setVisible(true);
		setResizable(false);
		add(imagePanel);
//
//		this.setLayout(new BorderLayout());
//		this.add(upPanel, BorderLayout.CENTER);

//		upPanel.setLayout(null);

		this.add(downPanel, BorderLayout.SOUTH);
		downPanel.add(startButton);
		downPanel.add(endButton);

	}

	private void addEventListener() {
		startButton.addActionListener(this);
		endButton.addActionListener(this);
	}

	@Override

	public void actionPerformed(ActionEvent e) {
		JButton targetButton = (JButton) e.getSource();
		Thread thread = new Thread(imagePanel);
		if (targetButton.getText().equals(startButton.getText())) {
			System.out.println("시작");
			flag = true;
			thread.start();
		} else {
			System.out.println("멈춤");
			flag = false;
			thread.start();
		}

	}

	private class ImagePanel extends JPanel implements Runnable {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(background, 0, 0, getWidth(), getHeight(), null);
			g.drawImage(player, playerX, playerY, 100, 130, null);
		}

		@Override
		public void run() {

			boolean direction = true;
			while (flag) {
				if (direction) {
					playerX += 10;
					if (playerX >= 600) {
						direction = false;
					}
				} else {
					playerX -= 10;
					if (playerX <= 10) {
						direction = true;
					}

				}

				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				repaint();

			}

		}

	}

	public static void main(String[] args) {
		new Game();
	}

}
