package ch03;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFarme1 extends JFrame {

	ImagePanel imagePanel;

	public MyFarme1() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("JPanel에 이미지 넣기");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		imagePanel = new ImagePanel();
	}

	private void setInitLayout() {
		setVisible(true);
		add(imagePanel);

	}

	// inner class
	class ImagePanel extends JPanel {

		private Image image;

		public ImagePanel() {
			image = new ImageIcon("player.png").getImage();
		}

		// 그림을 그려주는 기능
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawImage(image, 80, 50, 220, 250, null);
		}
	} // end of ImagePanel

}// end of MyFarme1

public class MainTest1 {

	public static void main(String[] args) {
		new MyFarme1();
	}

}
