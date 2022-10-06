package test.ex03;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

//메인 스레드 바쁨 (이벤트 리스너 처리중 )
// 백그라운드에서 계속 Player의 움직임을 관찰
// 뒤에서 남 모르게 돌아가는 서비스

public class BackgroundPlayerService implements Runnable {

	private BufferedImage image;
	// 의존성 포함관계, 의존성 컴포지션
	// 매개변수로 올려둔 player가 없으면 연결되지 않음

	private Player player;

	public BackgroundPlayerService(Player player) {
		this.player = player;
		try {
//			image = ImageIO.read(new File("images/backgroundMapService.png"));
			image = ImageIO.read(new File("images/test.png"));
		} catch (IOException e) {
			System.out.println("이미지 파일명 및 파일 경로를 확인 바랍니다.");
		}
	}

	@Override
	public void run() {
		while (true) {
			// 색상확인
			Color leftColor = new Color(image.getRGB(player.getX(), player.getY()) + 25);
			Color rightColor = new Color(image.getRGB(player.getX() + 50 + 10, player.getY()) + 25);

			// 플레이어 좌표 값이 따라서 빨간색, 파란색, 하얀색을 구분 할 수 있다.
			System.out.print(leftColor);
			System.out.println(rightColor);

			// 왼쪽벽에 충돌함
			// 255 , 0 , 0
			if (leftColor.getRed() == 255 && leftColor.getGreen() == 0 && leftColor.getBlue() == 0) {
				// 빨간색 : 왼쪽 벽에 충돌했다.
				System.out.println("gg");
			} else if (rightColor.getRed() == 255 && rightColor.getGreen() == 0 && rightColor.getBlue() == 0) {
				System.out.println("오른쪽");
			}
			// 위 두 조건이 아니면 하얀색 마음대로 움직임 가능

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
