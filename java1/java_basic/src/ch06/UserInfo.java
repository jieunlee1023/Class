package ch06;

//회원가입
public class UserInfo {

	// 상태(속성) 4개 이상
	public String userName;
	public String userId;
	public String userPassword;
	public int userBirth;

	// 기능 2개이상
	// 회원가입한 정보를 보는 기능을 반드시 만들어주세요.
	public void showInfo() {
		System.out.println("이름 : " + userName);
		System.out.println("아이디 : " + userId);
		System.out.println("비밀번호 : " + userPassword);
		System.out.println("생년월일 : " + userBirth);
	}

	public void buy() {
		System.out.println(userName + "(이)가 물건을 구매합니다.");
	}

}
