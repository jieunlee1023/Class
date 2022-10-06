package ch06;

public class UserEx_Main {

	public static void main(String[] args) {

		UserEx user = new UserEx();
		user.id = "jieun";
		user.password = "12345";
		user.checkPassword = "12346";
		user.name = "이지은";
		user.gender = "여자";
		user.age = 27;
		
		user.checkedPassword();
		user.join();

	}

}
