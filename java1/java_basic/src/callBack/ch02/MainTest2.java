package callBack.ch02;

public class MainTest2 {

	public static void main(String[] args) {

		// 1. 콜백 메서드를 구현 할 때 생성자를 통해서 주입 받는 방법
		// 2. 메서드를 통해서 구현할 때

		HackerNews2 hackerNews = new HackerNews2();
		MyArticle article = new MyArticle("오늘 날씨가 덥네요 ! ~");
		article.setOnWriteArticle(hackerNews.onWriteArticle);
		article.complete();

	}
}
