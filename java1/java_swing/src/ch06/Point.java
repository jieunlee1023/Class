package ch06;
 
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
 
import javax.swing.JFrame;
 
public class Point extends JFrame implements KeyListener {
 
    JFrame frame;
    java.awt.Point p;
 
    public Point() {
        
        super("Frame 움직이기");
        
        this.addKeyListener(this);
        frame = new JFrame();
        frame.setBounds(300, 200, 300, 200);
 
        
        
        
        //보여줘라
        this.setVisible(true);
        frame.setFocusable(true);
        //종료코드
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
    }
 
    public static void main(String[] args) {
        new Point();
    }
 
    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }
 
    @Override
    public void keyPressed(KeyEvent e) {
        p = frame.getLocation();
 
        if (e.getKeyCode() == 37)
            System.out.println("왼쪽 누름");
        frame.setLocation(p.x - 20, p.y);
        if (e.getKeyCode() == 38)
            System.out.println("위 누름");
        frame.setLocation(p.x, p.y - 20);
        if (e.getKeyCode() == 39)
            System.out.println("오른쪽 누름");
        frame.setLocation(p.x + 20, p.y);
        if (e.getKeyCode() == 40)
            System.out.println("아래 누름");
        frame.setLocation(p.x, p.y + 20);
    }
 
    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }
 
}