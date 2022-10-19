package boot.movie.view;

import javax.swing.JFrame;

public class MovieFrame extends JFrame {

	public MovieFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setSize(500, 500);
		setTitle("Movie");
		setResizable(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void setInitLayout() {
		setVisible(true);
	}

	private void addEventListener() {

	}
	
	public static void main(String[] args) {
		new MovieFrame();
	}

}
