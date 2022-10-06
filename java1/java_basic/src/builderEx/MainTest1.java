package builderEx;

public class MainTest1 {

	public static void main(String[] args) {

//		Student student = new Student();
//		사용 불가. 접근 제어 지시자 private 

		Student 홍길동 = new Student.Builder().settName("홍길동").build();
		System.out.println(홍길동);
		Student 이순신 = new Student.Builder()
				.settGrade(3)
				.settName("이순신")
				.build();
		System.out.println(이순신);
	}

}