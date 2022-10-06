package games;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Game2 extends JFrame implements ActionListener {

	JLabel player;

	JButton startButton;
	JButton stopButton;

	ImageLabel imageLabel;

	boolean flag = true;
	int playerX = 270;
	int playerY = 80;

	public Game2() {
		initData();
		setInitLayout();
		addEventListener();
	}

	public void initData() {

		setTitle("움직이기 복습");
		setSize(700, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		startButton = new JButton("움직이기");
		stopButton = new JButton("멈추기");

		player = new JLabel(new ImageIcon("player.png"));

		imageLabel = new ImageLabel();
	}

	public void setInitLayout() {
		setVisible(true);
		setResizable(false);

		setLayout(null);

		add(player);
		player.setSize(150, 200);
		player.setLocation(playerX, playerY);

		add(startButton);
		startButton.setSize(100, 50);
		startButton.setLocation(240, 350);
		add(stopButton);
		stopButton.setSize(100, 50);
		stopButton.setLocation(360, 350);

	}

	public void addEventListener() {
		startButton.addActionListener(this);
		stopButton.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton targetButton = (JButton) e.getSource();
		Thread thread = new Thread(imageLabel);
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

	private class ImageLabel extends JLabel implements Runnable {

		@Override
		public void run() {

			boolean direction = true;
			while (flag) {
				if (direction) {
					player.setLocation(playerX, playerY += 10);
					if (playerY >= 350) {
						direction = false;
					}
				} else {
					player.setLocation(playerX, playerY -= 10);
					if (playerY <= 5) {
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
		new Game2();
	}

}
