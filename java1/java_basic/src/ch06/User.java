package ch06;

public class User {

	String id;
	String password;
//	String checkPassword;
	String name;
	String gender;
	boolean isPasswordChecked = false;
	int age;

//	public void join() {
//		if (password.equals(checkPassword)) {
//			System.out.println("회원가입 성공!");
//			System.out.println(name + "님이 회원가입 완료 되었습니다.");
//		} else {
//			System.out.println("회원가입 실패");
//		}
//	}

//	public void checkedPassword() {
//		// 문자열 비교할 때는 무조건 equals 사용
//		if (password.equals(checkPassword)) {
//			System.out.println("비밀번호가 일치 합니다.");
//		} else {
//			System.out.println("비밀번호가 일치하지 않습니다.");
//		}
//	}

	public void join() {
		if (isPasswordChecked) {// 함수안에 다른 함수 호출
			System.out.println("회원가입 성공!");
			System.out.println(name + "님이 회원가입 완료 되었습니다.");
		} else {
			System.out.println("회원가입 실패");
			System.out.println("비밀번호를 먼저 체크 해주세요.");
		}
	}

	public void checkedPassword(String inputPw) {
		// 문자열 비교할 때는 무조건 equals 사용
		if (password.equals(inputPw)) {
			isPasswordChecked = true;
		} else {
			isPasswordChecked = false;
		}
	}
	public void showInfo() {
		System.out.println(" 이름 : " + name);
		System.out.println(" 아이디 : " + id);
		System.out.println(" 비밀번호 : " + password);
		System.out.println(" 성별 : " + gender);
		System.out.println(" 나이 : " + age);
	}
}
