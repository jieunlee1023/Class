package frame;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import object.AngryBird;

public class MainFrame extends JFrame {

	private JLabel background;
	private JLabel player ;
	
	public MainFrame() {
		initData();
		setInitLayout();
		addEventListenr();
		
	}

	private void initData() {
		setTitle("Angry Bird");
		setSize(800, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		background = new JLabel(new ImageIcon("background.png"));
		setContentPane(background); 
		
		player = new JLabel(new ImageIcon("player.png"));
		
	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(null);
		setLocationRelativeTo(null);
		add(player);
	}

	private void addEventListenr() {
		this.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mousePressed(MouseEvent e) {
		System.out.println("ds");
			}
			
			
			
			@Override
			public void mouseReleased(MouseEvent e) {
		System.out.println("dsf");
			}
			
		});
		
	}
	
}
