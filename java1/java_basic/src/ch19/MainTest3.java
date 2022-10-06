package ch19;

import java.util.ArrayList;
import java.util.Scanner;

public class MainTest3 {

	public static void main(String[] args) {

		// 스캐너를 생성해서 책 정보를 저장
		// ArrayList에 담고, CRUD 기능을 사용하는 코드를 만들어 주세요
		// 기능들은 함수로 만들어주세요.

		Scanner scanner = new Scanner(System.in);
		ArrayList<Book> bookList = new ArrayList<>();
		Book book = new Book();
		boolean flag = true;

		final int INSERT = 1;
		final int UPDATE = 2;
		final int DELETE = 3;
		final int READ = 4;
		final int SELECT_READ = 5;
		final int END = 6;

		while (flag) {
			System.out.println("◈ 도서 관리 프로그램! ◈");
			System.out.println("1. 도서 저장 2. 도서 수정 3. 도서 삭제 4. 전체 조회 5. 선택 조회 6. 나가기");
			int userInput = scanner.nextInt();
			if (userInput == INSERT) {
				Book bookTemp = insert();
				bookList.add(bookTemp);
				System.out.println(bookList);
			} else if (userInput == UPDATE) {
				update(bookList);
			} else if (userInput == DELETE) {
				delete(bookList);
			} else if (userInput == READ) {
				read(bookList);
			} else if (userInput == SELECT_READ) {
				selectRead(bookList);
			} else if (userInput == END) {
				System.out.println("※ 프로그램이 종료됩니다.");
				flag = false;
			}
		}
	} // end of main

	public static Book insert() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("◈ 도서 정보를 저장합니다. ◈");
		System.out.println("1. 도서 번호를 입력해주세요.");
		String bookNum = scanner.nextLine();
		System.out.println("2. 제목을 입력해주세요.");
		String title = scanner.nextLine();
		System.out.println("3. 저자를 입력해주세요.");
		String author = scanner.nextLine();
		Book book = new Book(bookNum, title, author);
		return book;
	}

	public static void update(ArrayList<Book> list) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("◈ 도서 정보를 수정합니다. ◈");
		ArrayList<Book> localList = list;
		for (int i = 0; i < localList.size(); i++) {
			Book show = localList.get(i);
			System.out.println((i) + "번 : " + show);
		}
		System.out.println("◈ 몇 번 책을 수정하시겠습니까 ? ◈");
		int index = scanner.nextInt();
		if (index < localList.size()) {
			System.out.println("1. 도서 번호를 입력하세요.");
			String bookNum = scanner.next();
			System.out.println("2. 도서 제목을 입력하세요");
			String bookName = scanner.next();
			System.out.println("3. 저자를 입력하세요");
			String bookAuthor = scanner.next();
			Book reBook = new Book(bookNum, bookName, bookAuthor);
			localList.set(index, reBook);
		} else {
			System.out.println("※ 잘못 입력 하셨습니다.");
		}
	}

	public static ArrayList<Book> delete(ArrayList<Book> list) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("◈ 책 정보를 삭제합니다. ◈");
		ArrayList<Book> localList = list;
		for (int i = 0; i < localList.size(); i++) {
			Book show = localList.get(i);
			System.out.println(i + "번 : " + show);
		}
		System.out.println("◈ 몇 번 책을 삭제하시겠습니다 ? ◈");
		int index = scanner.nextInt();
		if (index < list.size()) {
			System.out.println(index + "번, 삭제 완료 !");
			localList.remove(index);

			System.out.println("◈ 현재 저장된 책 목록입니다. ◈");
			for (int i = 0; i < localList.size(); i++) {
				localList.get(i).showInfo();
			}
		} else {
			System.out.println("※ 잘못 입력 하셨습니다.");
		}
		return localList;
	}

	public static ArrayList<Book> read(ArrayList<Book> list) {
		System.out.println(" ◈ 저장된 도서 전체 조회합니다. ◈");
		ArrayList<Book> localList = list;
		for (int i = 0; i < localList.size(); i++) {
			list.get(i).showInfo();
		}
		return localList;
	}

	public static void selectRead(ArrayList<Book> list) { // 선택 조회
		Scanner scanner = new Scanner(System.in);
		System.out.println("◈ 저장된 도서 선택 조회 합니다. ◈");
		ArrayList<Book> localList = list;
		for (int i = 0; i < localList.size(); i++) {
			Book show = localList.get(i);
			System.out.println(i + "번 : " + show);
		}
		System.out.println("◈ 어떤 책을 조회하시겠습니다 ? ◈");
		int index = scanner.nextInt();
		if (index < localList.size()) {
			list.get(index).showInfo();
		} else {
			System.out.println("※ 잘못 입력 하셨습니다.");
		}
	}

}
