package ch11;

public class Student {

	public static int count;
	private String name;
	private int age;
	private int studentNum;

	public Student() {
		count++;
		studentNum = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	public void studentInfo() {
		System.out.println("------정보-------");
		System.out.println("학생의 이름 : " + name);
		System.out.println("학생의 나이 : " + age);
		System.out.println("학생의 번호 : " + studentNum);
	}

}
