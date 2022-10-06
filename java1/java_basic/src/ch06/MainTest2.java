package ch06;

public class MainTest2 {

	public static void main(String[] args) {
		UserInfo userLee = new UserInfo();
		userLee.userName="이지은";
		userLee.userId="ljie1023";
		userLee.userPassword="jieun96";
		userLee.userBirth=961023;
		
		userLee.showInfo();
		System.out.println("--------------------");
		userLee.buy();
		
		
	}

}
