package ch06;

import java.util.Scanner;

public class MAintest3 {

	// 사용자 입장
	// 코드의 시작점
	public static void main(String[] args) {

		User user = new User();
		user.id = "lji";
		user.password = "1234";
		//user.checkPassword = "1233";
		user.name = "이지은";
		user.gender = "여자";
		
		// 조건 : 회원가입시에 반드시 비밀번호 체크가 true가 되어야한다.
		user.checkedPassword("1232");
		user.join();

		// 스캐너 활용해서 유저 객체에 값을 담아주세요!

			Scanner scanner = new Scanner(System.in);
			// String temp = scanner.nextLine();
			System.out.println("회원 이름을 입력하세요 : ");
			user.name = scanner.nextLine();
			System.out.println("아이디를 입력하세요 : ");
			user.id = scanner.nextLine();
			System.out.println("비밀번호를 입력하세요 : ");
			user.password = scanner.nextLine();
			System.out.println("성별를 입력하세요 : ");
			user.gender = scanner.nextLine();
			System.out.println("나이를 입력하세요 : ");
			user.age = scanner.nextInt();
			
			user.showInfo();
			System.out.println("--------------");

	}
}
