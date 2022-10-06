package ch05;

import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyMouseEventListener extends JFrame {

	private JLabel background;
	private JLabel player;
	private JLabel gameOver;

	public MyMouseEventListener() {
		initData();
		setInitLayout();
		addEventListener();
	}

	public void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		background = new JLabel(new ImageIcon("background.png"));
		player = new JLabel(new ImageIcon("player.png"));
		gameOver = new JLabel("호람쥐가 사라졌습니다!");

	}

	public void setInitLayout() {
		setVisible(true);
		setLayout(null);

		player.setSize(180, 200);
		add(player);

		background.setSize(500, 500);
		background.setLocation(0, 0);
		add(background);


	}

	public void addEventListener() {
		this.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {

			}

			@Override
			public void mousePressed(MouseEvent e) {

			}

			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("호람쥐가 사라집니다.");
				player.setLocation(-200,-200);
			
			}

			@Override
			public void mouseEntered(MouseEvent e) {

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("호람쥐가 움직입니다.");
				System.out.println(e.toString());

				e.getX();
				e.getY();

				player.setLocation(e.getX(), e.getY());
			}
		});
	}

	public static void main(String[] args) {
		new MyMouseEventListener();
	} // end of main
} // end of class
