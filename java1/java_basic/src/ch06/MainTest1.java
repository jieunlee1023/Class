package ch06;

public class MainTest1 {
	//메인 함수 (코드의 시작점)
	public static void main(String[] args) {
		
		//객체 : 메모리에 올라갔을 때 객체라고 한다. (인스턴스)
		Student studentKim = new Student();
		studentKim.studentName = "홍길동";
		studentKim.studentId = 1;
		studentKim.address = "부산시 진구";
		
		//기능 : 자신의 정보를 화면에 출력
		studentKim.showStudentInfo();
		studentKim.study();
		
		System.out.println("=================");
		Student studentLee = new Student();
		studentLee.studentName = "이순신";
		studentLee.studentId = 2;
		studentLee.address = "부산시 해운대구";
		
		studentLee.showStudentInfo();
		studentLee.study();
		
		// kim의 변수 이름에 접근해서 화면에 결과를 출력해주세요.
		System.out.println(studentKim.studentName);
		System.out.println(studentLee.studentName);
		
		studentKim.showStudentInfo();
		
		studentKim.study();
		studentLee.study();
		
		studentKim.breakTime();
		studentKim.cleanUp();
		
	}//end of main 

}//end of class
