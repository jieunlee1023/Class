package ch07;

public class Student {
	
	int number;
	String name;
	int grade;
	
	//기본 생성자
	public Student() {
	}
	
	// 모양~ 맞추기 ~
	public Student(int n, String a, int g) {
		// {} : 수행문을 작성할 수 있다.
		number = n;
		name = a;
		grade = g;
	}
	
	public String showInfo() {
		return grade + "학년 " + name + " 학생의 번호는 " + number + "입니다."; 
	}
}//end of class