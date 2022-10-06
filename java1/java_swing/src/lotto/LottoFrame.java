package lotto;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class LottoFrame extends JFrame implements ActionListener {

	final int FRAME_WIDTH = 500;
	final int FRAME_HEIGTH = 800;

	JLabel lottoTitle;
	JPanel lottoWrap;
	JLabel lottoSubTitle;
	JPanel lottoNumberWrap;
	JLabel lottoNum;
	JButton lottoButton;

	LottoNumber lottoNumber = new LottoNumber();

	public LottoFrame() {
		initData();
		setIninLayout();
		addEventListener();
	}

	public void initData() {
		setSize(FRAME_WIDTH, FRAME_HEIGTH);
		setTitle("로또 번호 추첨");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		lottoTitle = new JLabel("★ LOTTO ★");
		lottoWrap = new JPanel();
		lottoSubTitle = new JLabel("▼ LOTTO 번호 추천받기 ▼");
		lottoNumberWrap = new JPanel();
		lottoButton = new JButton("번호 확인하기");
		lottoNum = new JLabel();

	}

	public void setIninLayout() {
		setVisible(true);
		setResizable(false);
		setLayout(null);

		add(lottoTitle);
		add(lottoWrap);
		lottoWrap.add(lottoSubTitle);
		lottoWrap.add(lottoNumberWrap);
		lottoWrap.setLayout(null);
		lottoNumberWrap.setLayout(null);
		add(lottoButton);

		lottoTitle.setSize(FRAME_WIDTH, 200);
		lottoTitle.setLocation(0, 0);
		lottoTitle.setFont(new Font("Serif", Font.BOLD, 50));
		lottoTitle.setForeground(Color.WHITE);
		lottoTitle.setHorizontalAlignment(JLabel.CENTER);
		lottoTitle.setOpaque(true);
		lottoTitle.setBackground(Color.PINK);
		// end of lottoTitle

		lottoWrap.setSize(FRAME_WIDTH, 400);
		lottoWrap.setLocation(0, 200);
		// end of lottoWrap

		lottoSubTitle.setSize(400, 60);
		lottoSubTitle.setLocation(48, 50);
		lottoSubTitle.setFont(new Font("sanSerif", Font.BOLD, 20));
		lottoSubTitle.setForeground(Color.WHITE);
		lottoSubTitle.setHorizontalAlignment(JLabel.CENTER);
		lottoSubTitle.setOpaque(true);
		lottoSubTitle.setBackground(Color.ORANGE);
		lottoSubTitle.setBorder(new TitledBorder(new LineBorder(Color.pink)));
		// end of lottoSubTitle

		lottoNumberWrap.setSize(400, 350);
		lottoNumberWrap.setLocation(48, 130);
		lottoNumberWrap.setBackground(Color.ORANGE);
		lottoNumberWrap.setLayout(null);
		// end of lottoNumberWrap

		lottoNumberWrap.add(lottoNum);
		lottoNum.setSize(300, 150);
		lottoNum.setLocation(50, 60);
		lottoNum.setHorizontalAlignment(JLabel.CENTER);
		lottoNum.setFont(new Font("sanSerif", Font.BOLD, 20));
		lottoNum.setForeground(Color.WHITE);
		lottoNum.setOpaque(true);
		lottoNum.setBackground(Color.PINK);

		lottoButton.setSize(400, 50);
		lottoButton.setLocation(48, 620);
		lottoButton.setFont(new Font("sanSerif", Font.BOLD, 20));

	}

	public void addEventListener() {
		lottoButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		lottoButton.addActionListener(this);
		setupLottoNumber();
	}

	public void setupLottoNumber() {
		int[] numbers = lottoNumber.creatLottoNumbers();
		for (int i = 0; i < numbers.length; i++) {
			lottoNum.setText(numbers[i] + " ");
			// 숫자가 겹쳐서 나옴
		}
		// setText는 스트링을 넣어야함
		// int + " " 가 스트링으로 형변환
	}

	public static void main(String[] args) {
		new LottoFrame();
	}

}
