package ch19;

import java.util.ArrayList;

public class MainTest2 {

	public static void main(String[] args) {

		Book book1 = new Book("1", "흐르는강물처럼", "파울로코엘료");
		Book book2 = new Book("2", "플러터UI실전", "김근호");
		Book book3 = new Book("3", "무궁화꽃이피었습니다", "김진명");
		Book book4 = new Book("4", "리딩으로리드하라", "이지성");
		Book book5 = new Book("5", "사피엔스", "유발하라리");

		ArrayList<Book> books = new ArrayList<>();
		ArrayList<Book> books2 = new ArrayList<>();

		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);

		// 문제 : 현재 생성된 arrList에 마지막 인덱스만을 삭제하는 함수를 완성해주세요.

		books = removeOfLastIndex(books);
		System.out.println(books);
	} // end of main

	// 넘겨 받은 ArrayList에 마지막 인덱스 값을 삭제하는 함수
	public static ArrayList<Book> removeOfLastIndex(ArrayList<Book> list) {
		// TIP . 매개변수로 통해서 들어온 데이터는 지역변수를 선언해서 초기화 해주는게 좋다.
		ArrayList<Book> localList = list;
		// 3. 삭제하는 기능
		// 항상 마지막 인덱스에 접근해서 삭제 해야 됨.
//		System.out.println(list.size());
		localList.remove(list.size() - 1);
		return localList;
	}

}
