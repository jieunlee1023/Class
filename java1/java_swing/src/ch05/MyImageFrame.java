package ch05;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyImageFrame extends JFrame implements MouseListener {

	// 재료 선정
	// 1. JLABLE 사용해서 이미지 그리기
	// 2. 이벤트 리스너 등록 및 구현
	JLabel playerLable;
	JLabel backgroundLable;
	BufferedImage bufferedImage;
	MyImagePanel myImagePanel;

	// 내부 클래스
	class MyImagePanel extends JPanel {
		@Override
		// 페인트 사용해서 크기 변경 (패널에 넣어서)
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(bufferedImage, 0, 0, 500, 500, null);
		}

	}

	public MyImageFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		playerLable = new JLabel(new ImageIcon("player.png"));
		backgroundLable = new JLabel(new ImageIcon("background.png"));

		try {
			bufferedImage = ImageIO.read(new File("background.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		myImagePanel = new MyImagePanel();
	}

	private void setInitLayout() {
		this.setVisible(true);
		this.setLayout(null);
		
		myImagePanel.setSize(500,500);
		myImagePanel.setLocation(0,0);
		this.add(myImagePanel);
		// 좌표기반 배치관리자
		// 사이즈, 위치

		playerLable.setSize(100, 200);
		playerLable.setLocation(100, 100);
//		this.add(playerLable);
		
		myImagePanel.add(playerLable);

//		backgroundLable.setSize(500, 500);
//		backgroundLable.setLocation(0, 0);
//		this.add(backgroundLable);

	}

	private void addEventListener() {
		this.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int x = e.getX() - (playerLable.getBounds().width / 2);
		int y = e.getY() - (playerLable.getBounds().height / 2);
		playerLable.setLocation(x, y);

	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
