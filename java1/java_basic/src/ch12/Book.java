package ch12;

public class Book {

	private String totalPage;
	private String title;
	private String author;

	public Book() {
	}

	public Book(String title) {
		this.title = title;
	}

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public Book(String title, String author, String totalPage) {
		this.title = title;
		this.author = author;
		this.totalPage = totalPage;
	}

	public String getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(String totalPage) {
		this.totalPage = totalPage;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void showInfo() {
		System.out.println("★-----------------★");
		System.out.println("               책 정 보               ");
		System.out.println("책 제목 : " + title);
		System.out.println("저자 : " + author);
		System.out.println("페이지수 : " + totalPage);
		System.out.println("★-----------------★");
		System.out.println();
	}

	public void showInfoOnly() {
		System.out.println("책 제목 : " + title);
	}

}
