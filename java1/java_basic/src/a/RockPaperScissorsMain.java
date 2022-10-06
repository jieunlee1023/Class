package a;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		boolean flag = true;

		final int START = 1;
		final int END = 2;
		final int SCISSORS = 1;
		final int ROCK = 2;
		final int PAPER = 3;

		int count = 0;
		int userWin = 0;
		int computerWin = 0;

			while (true) {
				System.out.println("♩ ♪ ♬ ~ ♩ ♪ ♬ ~ ♩ ♪ ♬");
				System.out.println("* 가위-바위-보 게임! *");
				System.out.println("1. 게임 진행하기 2. 게임 나가기");
				int startNum = scanner.nextInt();
				if (startNum == START) {
					System.out.println("* 게임을 진행합니다.");
					System.out.println("골라 주세요! ---> ①. 가위 ②. 바위 ③. 보");
					int selectedNum = scanner.nextInt();
					if (selectedNum == SCISSORS) {
						int randomNum = random.nextInt(3) + 1;
						if (randomNum == SCISSORS) {
							System.out.println("User : 가위 / Computer : 가위");
							System.out.println("* 비겼습니다! *");
						} else if (randomNum == ROCK) {
							System.out.println("User : 가위 / Computer : 바위");
							System.out.println("* 졌습니다! *");
							computerWin++;
						} else if (randomNum == PAPER) {
							System.out.println("User : 가위 / Computer : 보");
							System.out.println("* 이겼습니다! *");
							userWin++;
						} else {
							System.out.println("※ 잘못 입력 하셨습니다.");
						}
						count++;
					} else if (selectedNum == ROCK) {
						int randomNum = random.nextInt(3) + 1;
						if (randomNum == ROCK) {
							System.out.println("User : 바위 / Computer : 바위");
							System.out.println("* 비겼습니다! *");
						} else if (randomNum == PAPER) {
							System.out.println("User : 바위 / Computer : 보");
							System.out.println("* 졌습니다! *");
							computerWin++;
						} else if (randomNum == SCISSORS) {
							System.out.println("User : 바위 / Computer : 가위");
							System.out.println("* 이겼습니다! *");
							userWin++;
						} else {
							System.out.println("※ 잘못 입력 하셨습니다.");
						}
						count++;
					} else if (selectedNum == PAPER) {
						int randomNum = random.nextInt(3) + 1;
						if (randomNum == ROCK) {
							System.out.println("User : 보 / Computer : 보");
							System.out.println("* 비겼습니다! *");
						} else if (randomNum == PAPER) {
							System.out.println("User : 보 / Computer : 가위");
							System.out.println("* 졌습니다! *");
							computerWin++;
						} else if (randomNum == SCISSORS) {
							System.out.println("User : 보 / Computer : 바위");
							System.out.println("* 이겼습니다! *");
							userWin++;
						} else {
							System.out.println("※ 잘못 입력 하셨습니다.");
							break;
						}
					} else {
						System.out.println("※ 잘못 입력 하였습니다.");
					}
					count++;
				} else if (startNum == END) {
					System.out.println("* 게임을 종료합니다.");
					flag = false;
				} else {
					System.out.println("※ 잘못 입력 하셨습니다.");
				}

				if (userWin == 3) {
					System.out.println("3번 이겼습니다 ! 승리 !");
					flag = false;
					break;
				} else if (computerWin == 3) {
					System.out.println("3번 졌습니다 ! 패배 !");
					flag = false;
					break;
				}
			}

	}

}
