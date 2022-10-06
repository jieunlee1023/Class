package ch05;

import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventListenerEx2 extends JFrame {
	JLabel label;
	
	public MouseEventListenerEx2() {
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
		setLocation(100, 100);
	}

	private void addEventListener() {
        //익명구현클래스로 코딩
        this.addMouseListener(new MouseListener() {


            //마우스가 눌렀다가 떨어졌을때 실행되는 메소드
            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub
                System.out.println("11111111");

            }

            //마우스가 눌러졌을떄 실행돠는 매소두
            @Override
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub
                System.out.println("222222222");
            }

            //마우스가 감지되고 있는 객체에서 나갔을떄 실행되는 메소두
            @Override
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub
                System.out.println("3333");
            }


            //마우스가 감지하고 있는 객체에서 들어갔을떄
            @Override
            public void mouseEntered(MouseEvent e) {
                // TODO Auto-generated method stub
                System.out.println("4444");
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                System.out.println("5555");
                label.setLocation(e.getX(), e.getY() - label.getBounds().height);
            }
        });
	}
	
	public static void main(String[] args) {
		new MouseEventListenerEx2();
	} //end of main

} // end of class
