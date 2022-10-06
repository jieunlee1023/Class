package ch12;

import java.util.Scanner;

public class MainTest2 {

	public static void main(String[] args) {

		boolean flag = true;
		Book[] bookData = new Book[5];
		int lastIndexCount = 0;

		Scanner scanner = new Scanner(System.in);
		// 무조건 String 값으로 받으시오

		while (flag) {
			System.out.println("★---메뉴를 선택해주세요!---★");
			System.out.println(" 0. 종료하기");
			System.out.println(" 1. 책 정보 저장하기");
			System.out.println(" 2. 전체 정보 조회하기");
			System.out.println(" 3. 선택 정보 조회하기");
			System.out.println(" 4. 전체 삭제하기");
			System.out.println(" 5. 선택 삭제하기");

			String userInput = scanner.nextLine();
			if (userInput.equals("1")) {
				// 책 정보 저장하기
				System.out.println("★-책 제목을 입력하세요-★");
				String title = scanner.nextLine();
				System.out.println("★-저자를 입력하세요-★");
				String author = scanner.nextLine();
				System.out.println("★-책 페이지를 입력하세요-★");
				String totalPage = scanner.nextLine();
				if (lastIndexCount >= bookData.length) {
					System.out.println("※ 저장 공간이 가득 찼습니다.");
				} else {
					bookData[lastIndexCount] = new Book(title, author, totalPage);
					lastIndexCount++;
					System.out.println("★-저장 되었습니다.-★");
				}

			} else if (userInput.equals("2")) {
				// 전체 정보 조회하기
				for (int i = 0; i < bookData.length; i++) {
					if (bookData[i] != null) {
						bookData[i].showInfo();
					} else if (bookData[i] == null) {

					} else {
						System.out.println("※ 저장된 데이터가 없습니다.");
						break;
					}
				}
			} else if (userInput.equals("3")) {
				// 선택 정보 조회하기
				for (int i = 0; i < bookData.length; i++) {
					if (bookData[i] != null) {
						bookData[i].showInfoOnly();
					}
				}
				System.out.println("★-어떤 책을 조회하시겠습니까?-★");
				String selectBook = scanner.nextLine();
				for (int i = 0; i < bookData.length; i++) {
					if (bookData[i] != null) {
						if (selectBook.equals(bookData[i].getTitle())) {
							System.out.println("'" + selectBook + "' 책 정보를 조회합니다.");
							for (int j = 0; j < 20; j++) {
								System.out.print("-");
								try {
									Thread.sleep(100);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
							}
							System.out.println();
							bookData[i].showInfo();
							break;
						}
					} else if (bookData[i] == null) {
						continue;
					} else {
						System.out.println("※ 잘못 입력 하셨습니다.");
						break;
					}
				}
			} else if (userInput.equals("4")) {
				// 전체 삭제하기
				System.out.println("★-저장된 정보를 모두 삭제 합니다.-★");
				for (int i = 0; i < bookData.length; i++) {
					bookData[i] = null;
				}
				for (int i = 0; i < 20; i++) {
					System.out.print("-");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println();
				System.out.println("★-전체 삭제 완료!-★");
			} else if (userInput.equals("5")) {
				// 선택 삭제하기
				for (int i = 0; i < bookData.length; i++) {
					if (bookData[i] != null) {
						bookData[i].showInfoOnly();
					}
				}
				System.out.println("★-어떤 책을 삭제하시겠습니까?-★");
				String deleteBook = scanner.nextLine();
				for (int i = 0; i < bookData.length; i++) {
					if (bookData[i] != null) {
						if (deleteBook.equals(bookData[i].getTitle())) {
							System.out.println("'" + deleteBook + "' 책을 삭제합니다.");
							for (int j = 0; j < 20; j++) {
								System.out.print("-");
								try {
									Thread.sleep(100);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
							}
							bookData[i] = null;
							System.out.println();
							System.out.println("★-삭 제 완 료!-★");
							break;
						}
					} else if (bookData[i] == null) {
						continue;
					} else {
						System.out.println("※ 잘못 입력 하셨습니다.");
						break;
					}
				}
			} else if (userInput.equals("0")) {
				// 종료하기
				System.out.println("프로그램을 종료합니다!");
				flag = false;
			} else {
				System.out.println("※ 잘못 입력하셨습니다.\n다시 입력해주세요 : )");
			}
		}
	} // end of main
}
