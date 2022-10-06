package ch05;

//설계도를 만들었다.
public class Student {

	// 상태 (속성)
	String name; // 멤버변수 (참조타입)
	int height; // 멤버변수 (기본 데이터 타입)
	double weight; // 멤버변수 (기본 데이터 타입)

	Order order; // 멤버변수 (참조타입)

	// 메인 함수 (코드의 시작점)
	public static void main(String[] args) {

		int num1; // 지역변수 (기본 데이터 타입)
		Order order; // 지역변수 (참조타입)
		Student student; // 지역변수 (참조타입)

		// 1
		// 1.화면에 바로 출력하는 방법
		System.out.println(intAdd(10, 20, 30));
		// 2. 지역변수 생성해서 데이터를 잠시 보관
		int intAddResult = intAdd(1, 2, 3);
		System.out.println(intAddResult);

		// 2
		// 1.화면에 바로 출력하는 방법
		System.out.println(doubleAdd(0.05, 0.05, 0.5));
		// 2. 지역변수 생성해서 데이터를 잠시 보관
		double doubleAddResult = doubleAdd(1, 2, 3.0);
		System.out.println(doubleAddResult);

		// 3
		printArticle("안녕");
		
		//printArticle 리턴 타입 없다.
		//String s = printArticle("안녕"); 
		//System.out.println(printArticle("여기서 사용!"));
		//리턴 받을 것이 없는데 어떻게 담고, 출력을 하라는거니! -> 오류
	}

	public static void addNum(int n1, int n2) {
		int result; // 지역변수 (기본 데이터 타입)
		UserInfo userInfo; // 지역변수 (참조타입)
		n1 = 10; // 지역변수 (구체적으로 매개변수)
	}

	// 함수를 만들어 봅시다.
	// 1. 리턴값이 int, 매개변수 n1, n2, n3 이름은 intAdd
	public static int intAdd(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}

	// 2. 리턴 값이 double, 매개변수 d1, d2, d3 이름은 doubleAdd
	public static double doubleAdd(double d1, double d2, double d3) {
//		double result;
//		result = d1 + d2 + d3;
//		return result;
		return d1 + d2 + d3;
	}

	// 3. 리턴 값이 void, 매개변수 String article 이름은 printArticle
	public static void printArticle(String article) {
		System.out.println("이 메소드를 호출하면 articlae 값이 출력 :  "+article);
	}
	// 4. 1번까지 3번까지 만든 함수를 직접 호출해보세요. (Stack 메모리 구조)

	// 행위 (기능)

}// end of class
