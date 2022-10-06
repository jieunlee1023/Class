package ch17;

import java.util.Random;
import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {

		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		Product[] products = new Product[4];
		TeddyBear teddyBear = new TeddyBear();
		LionDoll lionDoll = new LionDoll();
		Gun gun = new Gun();
		Airpot airpot = new Airpot();
		
		products[0] = teddyBear;
		products[1] = lionDoll;
		products[2] = gun;
		products[3] = airpot;
		

		boolean flag = true;
		int userMoney = 10_000;
		int userInput;
		int randomNum;

		while (flag) {
			System.out.println("뽑기 게임을 시작합니다 !");
			if (userMoney == 0) {
				System.out.println("돈이 부족합니다!");
			} else {
				userMoney -= 1000;
			}
			System.out.println("한 판당 1000원 입니다. ");
			System.out.println(" 1. 시작하기 2. 나가기");
			userInput = scanner.nextInt();
			if (userInput == 1) {

				for (int i = 0; i < 20; i++) {
					try {
						System.out.print("-");
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println();

				for (int i = 0; i < products.length; i++) {
					
					if (products[i] != null) {
						i = random.nextInt(products.length);
						if (i == 0) {
							teddyBear.showInfo();
							break;
						} else if (i == 1) {
							lionDoll.showInfo();
							break;
						} else if (i == 2) {
							gun.showInfo();
							break;
						} else if (i == 3) {
							airpot.showInfo();
							break;
						}else if (products[i]==null) {
							
						}
					}
				}
				System.out.println("현재 가진 돈은 : " + userMoney + "입니다.");
				System.out.println("---------------------");
			}else {
				flag = false;
			}
		}

	}

}
