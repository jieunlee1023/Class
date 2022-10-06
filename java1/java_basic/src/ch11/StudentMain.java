package ch11;

public class StudentMain {

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.setName("이지은");
		student1.setAge(27);

		Student student2 = new Student();
		student2.setName("김지은");
		student2.setAge(28);

		Student student3 = new Student();
		student3.setName("박지은");
		student3.setAge(29);

		student1.studentInfo();
		student2.studentInfo();
		student3.studentInfo();

	}

}
