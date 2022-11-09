package stream_api;

public class MainTest6 {

	public static void main(String[] args) {

		// 조건 : 오름 차순으로 정렬되어 있는 것부터 시작
		// 이진 검색 (이진트리)
		// 나열된 수 중에 8을 찾으세요.
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		int target = 18;

		// 인덱스
		int left = 0;
		int right = numbers.length - 1;
		int mid = (left + right) / 2;
		
		System.out.println(mid);
		System.out.println(numbers[mid]);
		
		int temp = numbers[mid];
		boolean find = false;
		int count = 1;
		
		//        0     <=    19
		while(left <= right) {
			if(target == temp) {
				// 수를 찾은 경우
				find = true;
				break;
			} else if (target < temp) {
				//찾으려는 수가 더 작은 경우
				 right = mid -1;
			} else {
				// 찾으려는 수가 더 큰 경우
				left = mid + 1;
			}
			// mid는 인덱스 위치 --> 4
			mid = (left + right) / 2; 
			// temp는 인덱스에 해당하는 값 --> 5
			temp = numbers[mid];
			System.out.println("-----------------------------");
			System.out.println("mid: "+mid);
			System.out.println("temp: "+temp);
			System.out.println("count : " +count);
			System.out.println("-----------------------------");
			count ++;
			System.out.println("-----------------------------");
		} // end of while

		if (find == true) {
			mid ++;
			System.out.println("찾는 수는 "+mid+"번째 있습니다.");
		}else {
			System.out.println("찾는 수가 없습니다.");
		}

	}
}
