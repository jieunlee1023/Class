package test.ex07;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import lombok.Getter;

//메인 스레드 바쁨 (이벤트 리스너 처리중 )
// 백그라운드에서 계속 Player의 움직임을 관찰
// 뒤에서 남 모르게 돌아가는 서비스

public class BackgroundBubbleService implements Runnable {

	private BufferedImage image;
	private Bubble bubble;

	public BackgroundBubbleService(Bubble bubble) {
		this.bubble = bubble;
		try {
			image = ImageIO.read(new File("images/backgroundMapService.png"));
//			image = ImageIO.read(new File("images/test.png"));
		} catch (IOException e) {
			System.out.println("이미지 파일명 및 파일 경로를 확인 바랍니다.");
		}
	}

	@Override
	public void run() {
		while (true) {
			// 색상확인
			Color leftColor = new Color(image.getRGB(bubble.getX(), bubble.getY()));
			Color rightColor = new Color(image.getRGB(bubble.getX(), bubble.getY()));
			Color topColor = new Color(image.getRGB(bubble.getX() + 100, bubble.getY()));

			System.out.println(leftColor);
			if (leftColor.getRed() == 255 && leftColor.getGreen() == 0 && leftColor.getBlue() == 0) {
				if (!bubble.isLeft() && !bubble.isLeftWallCrash()) {
					System.out.println("1111");
					bubble.setLeftWallCrash(true);
					bubble.setLeft(false);
				} else {
					break;
				}
				bubble.up();

				System.out.println(leftColor);
			} else if (rightColor.getRed() == 255 && rightColor.getGreen() == 0 && rightColor.getBlue() == 25) {

				if (!bubble.isRight() && !bubble.isRightWallCrash()) {
					bubble.setRightWallCrash(true);
					bubble.setRight(false);
				} else {
					break;
				}
				bubble.up();

			} else if (topColor.getRed() == 255 && rightColor.getGreen() == 0 && rightColor.getBlue() == 25) {
				bubble.setTopWallCrash(true);
				bubble.setUp(false);

			}

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
