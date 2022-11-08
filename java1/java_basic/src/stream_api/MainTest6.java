package stream_api;

import java.util.Arrays;

public class MainTest6 {

	public static void main(String[] args) {

		// 조건 : 오름 차순으로 정렬되어 있는 것부터 시작
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int target = 8;

		// 인덱스
		int left = 0;
		int right = numbers.length - 1;
		int mid = (left + right) / 2; // 4번째 5
//		System.out.println(mid);

		// 이진 검색 (이진트리)
		// 나열된 수 중에 8을 찾으세요.
	
	
		
		while (left < right) {
			if (mid - left >= 0) {
				for (int i = 0; i < numbers[mid]; i++) {
					if (numbers[i] == target) {
						System.out.println("target은 " + mid + " 번째에 있습니다.");
					}else {
						System.out.println("없");
					}
					mid++;
				}
			} else if (right - mid >= 0) {
				for (int i = 0; i < numbers[mid]; i++) {
					System.out.println(right);
					System.out.println("----------------");
					System.out.println(mid);
					if (numbers[i] == target) {
						System.out.println("target은 " + mid + " 번째에 있습니다.");
					}
				}
				mid--;
				break;
			}

		}
	}
}
