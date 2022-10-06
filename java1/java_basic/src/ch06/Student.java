package ch06;

//함수와 메서드 차이점 ?
//함수는 class와 크게 관계가 없다. (독립적으로 움직임)
// 메서드는 객체의 class의 멤버 변수를 활용해서 동작을 완성한다.

public class Student {

	// 상태 (속성, 필드값)
	public int studentId;
	public String studentName;
	public String address;

	// 행위 (기능)
	// 메서드
	public void study() {
		System.out.println(studentName + "학생이 공부를 합니다.");
	}

	public void breakTime() {
		System.out.println(studentName + "학생이 휴식을 합니다.");
	}

	public void cleanUp() {
		System.out.println(studentId + "학생이 청소를 합니다.");
	}

	public void showStudentInfo() {
		System.out.println("학생의 번호 : " + studentId);
		System.out.println("학생의 이름 : " + studentName);
		System.out.println("학생의 주소 : " + address);
	}

}
