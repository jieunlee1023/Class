package callBack.ch02;

import java.text.SimpleDateFormat;
import java.util.Calendar;

//응답자로 만들어보자
// 인터페이스를 구현하는 방법
public class HackerNews implements OnWriteArticle {

	private String nowDate() {

		// 1. Calendar .. long
		// 2. Date
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		return dateFormat.format(Calendar.getInstance().getTimeInMillis());
	}

	@Override
	public void printNews(String article) {
		System.out.println("*****HackerNews*****");
		System.out.println();
		System.out.println(article);
		System.out.println();
		System.out.println("기사 작성일 : " + nowDate());

	}

}