package startcraft2;

public class GateWayMainTest2 {

	public static void main(String[] args) {
		// 배열이란 ? 연관된 데이터를 통으로 모아서 관리하기 위해 사용하는 데이터 타입
		// 모든 프로그램에서 인덱스의 시작은 0부터 시작한다.
		// 인덱스 공식 n-1
		// 인덱스의 크기는 (길이는) n

//		 a[100] : 인덱스의 크기 - 99
//		 b[881] : 인덱스의 크기 - 880
//		 c[987543] : 인덱스의 크기 - 987542

		/* 1번방식 */ int[] intArr = new int[3];
		/* 2번방식 */ int intArr2[] = new int[5];

		// 인덱스 연산
		intArr[0] = 10;
		intArr[1] = 5;
		intArr[2] = 101;
//		intArr[3] = 0.5; //정수값만 넣을 수 있도록 해두었기 때문에 오류
		
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println(intArr[2]);

		int[] intArr3 = new int[47];
		//배열의 크기는 47, 인덱스의 크기는 46
		
		int[] intArr4 = new int[776];
		//배열의 크기는 776, 인덱스의 크기는 775

		// 배열은 선언과 동시에 자료형에 따라 초기화 된다.
		int[] numbers = new int[3];
		double[] numbers2 = new double[3];

		System.out.println(numbers[2]);
		System.out.println(numbers2[2]);

		// 오류 확인
		// 배열을 사용할 때 인덱스에 크기와 배열의 길이를 잘 확인해야한다.
		// System.out.println(numbers[3]); : 오류

		// 필요에 따라서 배열 선언과 동시에 초기화를 직접 할 수 있다.
		// String != String[] 은 완전 다른 데이터 타입입니다.
		String[] strArr1 = new String[] { "안", "녕", "하" };
		String strArr2[] = new String[] { "반", "가", "워" };
		System.out.println(strArr1[0]);
		int[] intArr1 = { 10, 20, 101 };
		System.out.println(intArr1[2]);

	}

}
