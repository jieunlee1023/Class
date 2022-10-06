package builderEx;

//빌더 패턴의 이해!
//1. 객체를 생성할 때 쓰는 패턴 (생성패턴)
//2. 구조패턴 (어뎁터 처럼 줄여 사용하는 것)
//3. 행위패턴 (템플릿 메서드 패턴)
public class Student {

	private String name;
	private int grade;

	// 1. 기본 생성자를 private로 정의해서 만들어 준다
	private Student() {

	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + "]";
	}

	// 2. 내부 클래스 만들어 주기
	// (Builder) 이름은 마음대로 설정 가능 (대부분 Builder라고 사용함)
	public static class Builder {
		// 또 변수를 외부 클래스에 있는 녀석들을 선언해 준다.
		private String name;
		private int grade;

		// 3. 내부 클래스를 리턴하는 메소드를 만들어 준다.
		public Builder settName(String name) {
			this.name = name;
			return this;
		}

		public Builder settGrade(int grade) {
			this.grade = grade;
			return this;
		}

		// 빌더패턴의 핵심코드 !
		public Student build() {
			Student student = new Student();
			student.name = this.name; // this --> build (내부)
			student.grade = this.grade;
			return student;
		}

	}

}// end of class
