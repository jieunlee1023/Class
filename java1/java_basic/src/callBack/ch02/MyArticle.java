package callBack.ch02;

//ㅡ호출자(콜리)로 만들어보자! 
// 주소값을 알고 있어야 한다. 편지를 전달 할 객체에 ..!
public class MyArticle {

	String article;

	OnWriteArticle onWriteArticle;

	// 생성자를 통해서
	public MyArticle(String article, OnWriteArticle onWriteArticle) {
		this.article = article;
		this.onWriteArticle = onWriteArticle;
	}

	// 메서드를 통해서
	public MyArticle(String article) {
		this.article = article;
	}

	public void setOnWriteArticle(OnWriteArticle onWriteArticle) {
		this.onWriteArticle = onWriteArticle;
	}

	public void complete() {
		onWriteArticle.printNews(this.article);
	}

}
