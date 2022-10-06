package ch03;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

//외부클래스
class MyFrame2 extends JFrame {

	MyDrawPanel drawPanel;

	public MyFrame2() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("paint 연습");
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		drawPanel = new MyDrawPanel();
	}

	private void setInitLayout() {
		setVisible(true);
		add(drawPanel);
	}

	// 내부클래스
	class MyDrawPanel extends JPanel {

		@Override
		public void paint(Graphics g) {
			super.paint(g);
//			g.drawString    ("안녕하세요 2D TEST", 50, 50);
//			g.drawLine     (50, 50, 100, 100);  // 선을 긋다 x축, y축
//			g.drawOval    (100, 100, 10, 10);
//			g.drawRect       (200, 200, 150, 150);

			g.drawRect(280, 350, 200, 200);
			g.drawLine(280, 350, 380, 250);
			g.drawLine(480, 350, 380, 250);
			g.drawRect(310, 370, 50, 50);
			g.drawRect(310, 370, 25, 25);
			g.drawRect(335, 370, 25, 25);
			g.drawRect(310, 395, 25, 25);
			g.drawRect(335, 395, 25, 25);
			g.drawRect(400, 370, 50, 50);
			g.drawRect(400, 370, 25, 25);
			g.drawRect(425, 370, 25, 25);
			g.drawRect(400, 395, 25, 25);
			g.drawRect(425, 395, 25, 25);
			g.drawRect(310, 450, 150, 100);
			g.drawRect(330, 470, 50, 80);
			g.drawRect(380, 470, 50, 80);
			g.drawRect(260, 550, 240, 20);
			g.drawOval(360, 510, 10, 10);
			g.drawOval(390, 510, 10, 10);

			g.drawOval(540, 490, 20, 20);
			g.drawOval(530, 470, 20, 20);
			g.drawOval(550, 470, 20, 20);
			g.drawOval(520, 490, 20, 20);
			g.drawOval(560, 490, 20, 20);
			g.drawOval(530, 510, 20, 20);
			g.drawOval(550, 510, 20, 20);
			g.drawRect(545, 530, 10, 40);
			g.drawOval(555, 550, 20, 20);
			g.drawOval(525, 550, 20, 20);

			g.drawOval(190, 490, 20, 20);
			g.drawOval(180, 470, 20, 20);
			g.drawOval(200, 470, 20, 20);
			g.drawOval(170, 490, 20, 20);
			g.drawOval(210, 490, 20, 20);
			g.drawOval(180, 510, 20, 20);
			g.drawOval(200, 510, 20, 20);
			g.drawRect(195, 530, 10, 40);
			g.drawOval(205, 550, 20, 20);
			g.drawOval(175, 550, 20, 20);
		}
	} // end of MyDrawPanel

}// end of MyFrame2

//public class
public class PaintMainTest {

	public static void main(String[] args) {
		new MyFrame2();
	}

}
