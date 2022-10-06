package test.ex00;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import lombok.Getter;

//메인 스레드 바쁨 (이벤트 리스너 처리중 )
// 백그라운드에서 계속 Player의 움직임을 관찰
// 뒤에서 남 모르게 돌아가는 서비스

public class BackgroundEnemyService implements Runnable {

	private BufferedImage image;
	private Enemy enemy;

	public BackgroundEnemyService(Enemy enemy) {
		this.enemy = enemy;
		try {
			image = ImageIO.read(new File("images/backgroundMapService.png"));
		} catch (IOException e) {
			System.out.println("이미지 파일명 및 파일 경로를 확인 바랍니다.");
		}
	}

	@Override
	public void run() {
		while (true) {
			// 색상확인
			Color leftColor = new Color(image.getRGB(enemy.getX(), enemy.getY()) + 25);
			Color rightColor = new Color(image.getRGB(enemy.getX() + 50 + 10, enemy.getY()) + 25);

			int bottomColorLeft = image.getRGB(enemy.getX() + 20, enemy.getY() + 50 + 5); // -1
			int bottomColorRight = image.getRGB(enemy.getX() + 50 - 10, enemy.getY() + 50 + 5); // -1
			if (bottomColorLeft + bottomColorRight != -2) {
				// 여기가 바닥입니다.
				enemy.setDown(false);
			} else {
				if (!enemy.isUp() && !enemy.isDown()) {
					enemy.down();

				}
			}

			if (leftColor.getRed() == 255 && leftColor.getGreen() == 0 && leftColor.getBlue() == 25) {
				enemy.setLeft(false);
				if (!enemy.isRight()) {
					enemy.right();
				}
			} else if (rightColor.getRed() == 255 && rightColor.getGreen() == 0 && rightColor.getBlue() == 25) {
				enemy.setRight(false);
				if (!enemy.isLeft()) {
					enemy.left();
				}
			}

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
