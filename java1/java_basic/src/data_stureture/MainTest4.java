package data_stureture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class MainTest4 {

	public static void main(String[] args) {

		// 2. set 계열어 데이터 저장해보기
		Set set;

		HashSet<Integer> hashSet = new HashSet<>();

		for (int i = 0; i < 6; i++) {
			hashSet.add(getRandomNumber());
		}

		boolean flag = true;
		while (flag) {
			if (hashSet.size() < 6) {
				hashSet.add(getRandomNumber());
			} else {
				flag = false;
			}
		}

		List<Integer> list = new ArrayList<>();
		list.addAll(hashSet);
		list.sort(null);
		System.out.println(list);

	}

	// 1. 랜덤 함수 뽑기 : 1~45
	public static int getRandomNumber() {
		Random random = new Random();
		int result = random.nextInt(45) + 1;
		return result;
	}

}
