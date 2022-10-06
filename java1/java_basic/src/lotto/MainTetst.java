package lotto;

import java.util.Random;
import java.util.Scanner;

public class MainTetst {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int[] selectNum = new int[6];
		int[] lottoWinNum = new int[6];

		System.out.println("●○ 로또 프로그램! ○●");
		// 6개의 숫자 입력 받기
		// 중복 불가, 1~45 숫자까지만 가능
		for (int i = 0; i < 6; i++) {
			System.out.println("--> " + (i + 1) + "번째 번호를 입력해주세요.");
			selectNum[i] = scanner.nextInt();
			if (selectNum[i] <= 0 || selectNum[i] > 45) {
				System.out.println("※ 잘못 입력하셨습니다.");
				System.out.println("1에서 45 사이의 숫자를 입력하세요.");
				i--; // if문이 실행되면서 i가 카운트 되기 때문에 꼭 빼줘야함!
			}
			// 중복 불가
			for (int j = 0; j < i; j++) {
				if (selectNum[i] == selectNum[j]) {
					System.out.println("※ 중복된 숫자를 입력하였습니다.");
					i--;
				}
				// 오름차순 정렬
				// 새로운 변수에 담아가며, 수들을 크기를 비교하여 정렬
				if (selectNum[i] < selectNum[j]) {
					int temp = selectNum[i];
					selectNum[i] = selectNum[j];
					selectNum[j] = temp;
				}
			}
		}
		System.out.print("* 숫자 입력 번호 : ");
		for (int i = 0; i < 6; i++) {
			if (i == 5) {
				System.out.print(selectNum[i]);
			} else {
				System.out.print(selectNum[i] + ", ");
			}
		}
		System.out.println();

		for (int j = 0; j < 20; j++) {
			System.out.print("-");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();

		// 로또 전체 번호 1~45개 중 랜덤 6개 , 중복 불가
		for (int i = 0; i < 6; i++) {
			lottoWinNum[i] = random.nextInt(45) + 1;

			for (int j = 0; j < i; j++) {
				if (lottoWinNum[i] == lottoWinNum[j]) {
					i--;
				}
				//오름차순 정렬
				if (lottoWinNum[i] < lottoWinNum[j]) {
					int temp = lottoWinNum[i];
					lottoWinNum[i] = lottoWinNum[j];
					lottoWinNum[j] = temp;
				}
			}
		}

		System.out.print("* 로또 당첨 번호 : ");
		for (int i = 0; i < 6; i++) {
			if (i == 5) {
				System.out.print(lottoWinNum[i]);
			} else {
				System.out.print(lottoWinNum[i] + ", ");
			}
		}
		System.out.println();

		int count = 0; // 맞은 갯수
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (selectNum[i] == lottoWinNum[j]) {
					count++;
				}
			}
		}
		System.out.println("총 맞은 개수는 " + count + "개 입니다.");
		if (count == 6) {
			System.out.println("★☆1등 당첨☆★ - 상금 10억원");
		} else if (count == 5) {
			System.out.println("☆★2등 당첨★☆ - 상금 5천만원");
		} else if (count == 4) {
			System.out.println("★3등 당첨★ - 상금 5백만원");
		} else if (count == 3) {
			System.out.println("☆4등 당첨☆ - 상금 5천원");
		} else {
			System.out.println("♨ 아쉽지만 다음 기회에.... ♨");
		}

	}

}
