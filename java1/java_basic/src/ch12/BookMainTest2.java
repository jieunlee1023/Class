package ch12;

import java.util.Scanner;

import startcraft2.Zealot;

public class BookMainTest2 {

	public static void main(String[] args) {

		// 북 데이터를 입력하고
		// 북 조회하는 기능을 만들어주세요.
		// 스캐너 활용, 배열 활용

		// 1. 누르면 북 정보를 저장하는 기능을 만들어 주면
		// 2. 전체 북에 대한 정보를 출력하는 기능을 만들어 주시면 됩니다.
		// 3. 예를 들어 북이 3개 있다면 2번 누르면 2에 대한 북에 정보만 출력

		Book book = new Book();
		Book[] booklist = new Book[3];

		int totalPage = 0;
		String title;
		String author = null;

		Scanner scanner = new Scanner(System.in);
		int userInput;
		do {
			System.out.println("원하시는 메뉴를 선택해주세요.");
			System.out.println("1. 책 정보 저장 2. 책 정보 확인 3. 나가기");
			userInput = scanner.nextInt();
			if (userInput == 1) {
				System.out.println("책 정보를 입력해주세요!");
				for (int i = 0; i < booklist.length; i++) {
					System.out.println("책 제목 : ");
					title = scanner.next();
					System.out.println("저자 : ");
					author = scanner.next();
//					System.out.println("책 페이지 : ");
//					totalPage = scanner.nextInt();
					booklist[i] = new Book(title, author);
					booklist[i].showInfo();
				}
			} else if (userInput == 2) {
				int bookSelect;
				System.out.println("책 정보를 확인합니다!\n어떤 방식을 원하나요?");
				System.out.println("1. 전체 책 정보 확인");
				System.out.println("2. 하나의 책 정보 확인");
				bookSelect = scanner.nextInt();
				if (bookSelect == 1) {
					System.out.println("1. 전체 책 정보를 확인합니다.");
					for (int i = 0; i < booklist.length ; i++) {
						booklist[i].showInfo();
					}
					for (int i = 0; i < booklist.length; i++) {
						if (booklist[i] != null) {
							booklist[i].showInfo();
						}
					}
				} else if (bookSelect == 2) {
					System.out.println("2. 하나의 책 정보를 확인합니다");
					System.out.println("몇 번의 책을 원하시는걸까요?");
					int OneBookSelet = scanner.nextInt();
					int i = OneBookSelet;
					if (OneBookSelet == i) {
						booklist[(i - 1)].showInfo();
					}
				}else {
					System.out.println("잘못 입력 하셨습니다.");
				}
			} else if (userInput == 3){
				System.out.println("나가기 완료!");
			} else {
				System.out.println("잘못 입력 하셨습니다. ");				
			}

		} while (userInput != 3);
		System.out.println("프로그램이 종료됩니다.");

	}
}
