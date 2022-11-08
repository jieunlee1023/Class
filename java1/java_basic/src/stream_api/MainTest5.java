package stream_api;

public class MainTest5 {

	public static void main(String[] args) {

		// 여러개의 수가 배열에 있을 때 그 중 가장 큰 값고 가장 작은 값을 찾으시오.
		// 배열에 몇 번째 있는지 순서를 찾으시오
		// 반복문은 한번만 사용하여 문제를 해결 하시오.
		int[] numbers = { 10, 55, 23, 2, 79, 101, 16, 82, 30, 45 };

		int max = numbers[0];
		int maxPos = 0;
		int min = numbers[0];
		int minPos = 0;

		for (int i = 0; i < numbers.length; i++) {
			
			// 1. 가장 큰 수 찾기
			if (max < numbers[i]) {
				max = numbers[i];
				maxPos = i + 1;
			}
			
			//2. 가장 작은 수를 찾기
			if (min > numbers[i]) {
				min = numbers[i];
				minPos = i + 1;
			}  
			
		}
		System.out.println("가장 큰 값은 "+max+ "이고 위치는 "+ maxPos +"번 째 입니다.");				
		System.out.println("가장 작은 값은 "+min+ "이고 위치는 "+ minPos +"번 째 입니다.");
	}

}
