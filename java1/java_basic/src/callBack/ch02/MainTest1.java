package callBack.ch02;

public class MainTest1 {

	public static void main(String[] args) {

		//콜백 메서드
		HackerNews hackerNews = new HackerNews();
		MyArticle article = new MyArticle("오늘 날씨가 덥네요 ! ~", hackerNews);
		article.complete(); // <----- HackerNews에 있는 printArticle 이라는 메서드를 호출하고 싶을때

	}
}
