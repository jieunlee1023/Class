package data_stureture;

import java.util.ArrayList;
import java.util.Collections;

public class MainTest5 {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<>();
		// for (int i = 0; i < arrayList.size(); i++) {} // 반복문이 돌지 않음 ! 조심 !
		for (int i = 1; i <= 45; i++) {
			arrayList.add(i);
		}
		Collections.shuffle(arrayList);

		arrayList.subList(0, 6).sort(null);
		System.out.println(arrayList.subList(0, 6));
	}
}
