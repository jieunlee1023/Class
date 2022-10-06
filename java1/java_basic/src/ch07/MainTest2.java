package ch07;

public class MainTest2 {

	// 코드의 시작점 (메인 쓰레드)
	public static void main(String[] args) {

		//UserInfo userInfo1 = new UserInfo();
		
		UserInfo userinfo1 = new UserInfo("lje");
		UserInfo userinfo2 = new UserInfo("lje", "1234");
		UserInfo userinfo3 = new UserInfo("ljie", "1234", "이지은");
		UserInfo userinfo4 = new UserInfo("lje", "1234", "이지은", 27);
		
		userinfo1.showInfo();
	}// end of main function

}
