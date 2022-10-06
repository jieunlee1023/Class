package ch06;

public class UserEx {

	String id;
	String password;
	String checkPassword;
	String name;
	String gender;
	int age;

	public void join() {
		if (password.equals(checkPassword)) {
			System.out.println("회원가입 완료!");
			System.out.println(name + "님이 회원가입 되었습니다.");
		} else {
			System.out.println("회원가입 실패!");
		}
	}

	public void checkedPassword() {
		if (password.equals(checkPassword)) {
			System.out.println("비밀번호가 일치합니다.");
		} else {
			System.out.println("비밀번호가 일치하지 않습니다.");
		}
	}

}
