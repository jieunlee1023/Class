package ch07;

public class UserInfo {

	String userId;
	String userPassword;
	String userName;
	int age;

	// 생성자 오버로딩 연습

	public UserInfo(String userId) {
		// this : 자기 자신을 가르킬 때 사용 (자기 자신을 의미)
		// 매개변수와 멤버변수의 이름이 같을 때!
		// 변수는 가까운 것을 따라가는 성질이 있다.
		this.userId = userId;
	}

	public UserInfo(String userId, String userPassword) {
		this.userId = userId;
		this.userPassword = userPassword;
	}

	public UserInfo(String userId, String userPassword, String userName) {
		this.userId = userId;
		this.userPassword = userPassword;
		this.userName = userName;
	}

	public UserInfo(String userId, String userPassword, String userName, int age) {
		this.userId = userId;
		this.userPassword = userPassword;
		this.userName = userName;
		this.age = age;
	}

	public void showInfo() {
		System.out.println("이름 : " + userName);
		System.out.println("나이 : " + age);
		System.out.println("아이디 : " + userId);
		System.out.println("비밀번호 : " + userPassword);
	}
}
