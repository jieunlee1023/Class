package ch05;

import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventListenerEx1 extends JFrame implements MouseListener {

	JLabel label;
	final int LABEL_WIDTH = 100;
	final int LABEL_HEIGHT = 100;
	int xPosition = 100;
	int yPosition = 100;

	public MouseEventListenerEx1() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label = new JLabel("Hello JAVA");
	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(null);

		// 사이즈, 좌표값 위치
//		label.setSize(100, 100);
//		label.setLocation(100, 100);
		add(label);
		label.setBounds(xPosition, yPosition, LABEL_WIDTH, LABEL_HEIGHT);
		System.out.println("bounds : " + label.getBounds());
	}

	private void addEventListener() {
		this.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("마우스가 클릭 되었습니다.");
		System.out.println(e.toString());

		Rectangle r = label.getBounds();

		e.getX();
		e.getY();
		System.out.println("x : " + e.getX());
		System.out.println("y : " + e.getY());

		label.setLocation(e.getX() - r.width, e.getY() - r.height);
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	public static void main(String[] args) {
		new MouseEventListenerEx1();
	} //end of main

} // end of class
