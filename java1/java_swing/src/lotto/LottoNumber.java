package lotto;

import java.util.Arrays;
import java.util.Random;

public class LottoNumber {

	final int LOTTO_NUMBER_SIZE = 6;

	public int[] creatLottoNumbers() {
		// 로또 전체 번호 1~45개 중 랜덤 6개 , 중복 불가
		Random random = new Random();
		int[] lottoWinNum = new int[LOTTO_NUMBER_SIZE];

		for (int i = 0; i < lottoWinNum.length; i++) {
			lottoWinNum[i] = random.nextInt(45) + 1;

			for (int j = 0; j < i; j++) {
				if (lottoWinNum[i] == lottoWinNum[j]) {
					i--;
				}
			}
		}
		Arrays.sort(lottoWinNum); // 배열의 전체를 오름 차순으로 정렬
		return lottoWinNum;
	}
}
