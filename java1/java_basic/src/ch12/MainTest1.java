package ch12;

import java.util.Scanner;

public class MainTest1 {

	public static void main(String[] args) {

		boolean flag = true;
		Book[] books = new Book[5];
		int lastIndexCount = 0;

		Scanner scanner = new Scanner(System.in);
		while (flag) {
			System.out.println("메뉴를 선택해주세요");
			System.out.println("1.저장  2.전체 조회  3.선택 조회  4.선택 삭제  5.전체 삭제  0.종료");
			// String 값으로 받을 예정
			String selected = scanner.nextLine();
			if (selected.equals("1")) {
				System.out.println("책 제목 입력 ");
				String title = scanner.nextLine();
				System.out.println("저자 입력 ");
				String author = scanner.nextLine();
				books[lastIndexCount] = new Book(title, author);
				lastIndexCount++;

			} else if (selected.equals("2")) {
				// 전체 조회 : 화면에 출력
				for (int i = 0; i < books.length; i++) {
					if (books[i] != null) {
						books[i].showInfo();
					}
				}
			} else if (selected.equals("3")) {
				// 선택 조회
				for (int i = 0; i < books.length; i++) {
					if (books[i] != null) {
						books[i].showInfoOnly();
					}
				}
				System.out.println("어떤 책을 조회하시겠습니까?");
				String selectBook = scanner.nextLine();
				for (int i = 0; i < books.length; i++) {
					if (books[i] != null) {
						if (selectBook.equals(books[i].getTitle())) {
							System.out.println(selectBook + " 책을 조회합니다.");
							books[i].showInfo();
							break;
						}
					} else {
						System.out.println("잘못 입력 하셨습니다.");
						break;
					}
				}
			} else if (selected.equals("4")) {
				// 선택 삭제
				for (int i = 0; i < books.length; i++) {
					if (books[i] != null) {
						books[i].showInfoOnly();
					}
				}
				for (int i = 0; i < books.length; i++) {
					System.out.println("어떤 책을 삭제하시겠습니까?");
					System.out.println("끝내려면 0을 누르세요!");
					String deleteBook = scanner.nextLine();
					if (deleteBook.equals(books[i].getTitle())) {
						books[i] = null;
						System.out.println(deleteBook + " 책을 삭제합니다.");
						System.out.println("삭제완료!");
					} else if (deleteBook.equals("0")) {
						break;
					} else {
						System.out.println("잘못 입력 했습니다.");
						continue;
					}
				}
				
			} else if (selected.equals("5")) {
				// 전체 삭제
				System.out.println("전체 삭제를 합니다.");
				for (int i = 0; i < books.length; i++) {
					books[i] = null;
				}
				for (int i = 0; i < 10; i++) {
					System.out.print("-");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println();
				System.out.println("전체 삭제 완료!");

			} else {
				System.out.println("프로그램 종료 합니다");
				flag = false;
			}
		}

	} // end of main
}
