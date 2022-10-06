package frame;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import lombok.Getter;
import object.AngryBird;

public class MainFrame extends JFrame {

	private JLabel background;
	private AngryBird player;

	private double offX;
	private double offY;
	private double pressX;
	private double pressY;
	private double releaseX;
	private double releaseY;
	
	
	public double getPressX() {
		return pressX;
	}

	public void setPressX(double pressX) {
		this.pressX = pressX;
	}

	public double getPressY() {
		return pressY;
	}

	public void setPressY(double pressY) {
		this.pressY = pressY;
	}

	public double getReleaseX() {
		return releaseX;
	}

	public void setReleaseX(double releaseX) {
		this.releaseX = releaseX;
	}

	public double getReleaseY() {
		return releaseY;
	}

	public void setReleaseY(double releaseY) {
		this.releaseY = releaseY;
	}

	public MainFrame() {
		initData();
		setInitLayout();
		addEventListenr();

	}

	private void initData() {
		setTitle("Angry Bird");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		background = new JLabel(new ImageIcon("background.png"));
		setContentPane(background);

		player = new AngryBird(this);

	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(null);
		setLocationRelativeTo(null);
		add(player);
	}

	private void addEventListenr() {
		//addMouseMotionListener(this);
		this.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				pressX = ((Number)e.getX()).doubleValue();
				pressY = ((Number)e.getY()).doubleValue();
				//??
				offX = e.getX() - player.getX();
				offY = e.getY() - player.getY();

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				releaseX = ((Number)e.getX()).doubleValue();
				releaseY =((Number)e.getY()).doubleValue();
				player.move();
			}

			
			// 드래그 
			//mouse모션리스너 써야할 듯!
			public void mouseDragged(MouseEvent e) {
				//?? 
//				player.setX(e.getX() - offX);
//				player.setY(e.getY() - offY);

				repaint();
			}

		});

	}

}
