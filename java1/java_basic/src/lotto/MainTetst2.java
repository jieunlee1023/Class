package lotto;

import java.util.Random;
import java.util.Scanner;

public class MainTetst2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		while(true) {
			int[] lottoWinNum = new int[6];
			// 로또 전체 번호 1~45개 중 랜덤 6개 , 중복 불가

			for (int i = 0; i < 6; i++) {
				lottoWinNum[i] = random.nextInt(45)+1;

				for (int j = 0; j < i; j++) {
					if (lottoWinNum[i] == lottoWinNum[j]) {
						i--;
					}
					if (lottoWinNum[i] < lottoWinNum[j]) {
						int temp = lottoWinNum[i];
						lottoWinNum[i] = lottoWinNum[j];
						lottoWinNum[j] = temp;
					}
				}
			}
			System.out.print("로또 당첨 번호 : ");
			for (int i = 0; i < 6; i++) {
				System.out.print(lottoWinNum[i] + " ");
			}
			System.out.println();
		}




	}

}
