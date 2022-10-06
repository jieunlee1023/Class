package ch07;

public class MainTest1 {

	public static void main(String[] args) {
		// 객체가 생성될 때 변수나 상수를 초기화 하거나
		// 다른 초기화 기능을 수행하는 메서드를 호출함
		
		//메모리에 올라갈 때 가장 먼저 동작되는 것은 생성자
		
//		Student student1 = new Student(10, "홍길동", 3);
//		student1.number = 10;
//		student1.name = "홍길동";
//		student1.grade = 3;
		
		
		//아래의 경우 Student 생성자가 2개인데 잘 찾을 수 있을까?
		// 생성자가 갖고 있는 모양, 데이터 타입까지 같은 것을 찾아감
		//데이터 타입과 갯수로만 접근, 변수명으로 접근 x
		
		//기본 생성자 활용해서 메모리에 할당
		Student student1 = new Student();
		
		//사용자 정의 생성자 활용해서 메모리에 할당
		Student student2 = new Student(100, "홍길동", 1);
		
		System.out.println(student1.showInfo());
		System.out.println(student2.showInfo());
	}

}
