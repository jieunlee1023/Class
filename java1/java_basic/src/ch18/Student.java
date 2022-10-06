package ch18;

//자바에서는 extends 키워드를 단 한번만 사용할 수 있다.
//자바에서는 다중상속을 지원하지 않는다. (모호성 발생 방지)
//단, 최상위 클래스인 Object 클래스는 예외로 한다.
//컴파일러가 자동으로 Object 를 상속해놨음!
//★★★ 모든 클래스의 최상위 클래스는 Object클래스 이다.
public class Student /* extends Object */ {

	private int studentId;
	private String studentName;

	public Student() {
	}

	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;

	}
	// 문제1
	// toString 메서드를 재정의 하세요.
	// "학번 : " + studentId + ", 이름 : " + studentName

	@Override
	public String toString() {
		return "학번 : " + studentId + ", 이름 : " + studentName;
	}

	// 문제 2
	// equals 메서드를 재정의 하세요
	// 조건은 학생의 이름과 학생의 ID 값이 같다면 같은 학생 입니다.

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student tempStudent = (Student) obj;
			if (this.studentId == tempStudent.studentId && this.studentName == tempStudent.studentName) {
				return true;
			}
		}
		return false;
	}

}
