package ch12;

public class BookMainTest1 {

	public static void main(String[] args) {

//		Book book1 = new Book(100, "플러터UI실전", "김근호");
//		Book book2 = new Book(200, "무궁화꽃이피었습니다", "김진명");
//		Book book3 = new Book(150, "흐르는 강물처럼", "파올로코엘료");
//		Book book4 = new Book(350, "리딩으로 리드하라", "이지성");
//		Book book5 = new Book(150, "사피엔스", "유발하라리");

		// 문제
		// 배열을 이용해서 변수명 shoppingCart 변수에 담아봅시다

		// 1. 배열 크기를 10개로 만들어보세요
		Book[] shoppingCart = new Book[10];

		// 2. 사고싶은 책을 장바구니에 담아봅시다 3개만 - 인덱스 연산
//		shoppingCart[0] = book1;
//		shoppingCart[2] = book3;
//		shoppingCart[8] = book5;

		// 3. 장바구니에 담은 책을 화면에 출력해주세요 -for문활용 출력
		// 책 타이틀, 작가 출력
		for (int i = 0; i < shoppingCart.length; i++) {
//			if (shoppingCart[i] == null) {
//				continue;
//			}else {	
//				    System.out.println(shoppingCart[i].getTitle() +" / "+
//					shoppingCart[i].getAuthor());
//			}
			if (shoppingCart[i] != null) {
				System.out.println(i + ":" + shoppingCart[i].getTitle() + " / " + shoppingCart[i].getAuthor());
			}
		}
		// 4. 0번째 인덱스 있는 녀석과 2번째 있는 녀석을 스왑해주세요 - 인덱스 연산
		
		shoppingCart[1] = shoppingCart[0];
		shoppingCart[0] = shoppingCart[2];
		shoppingCart[2] = shoppingCart[1];

		// 5. 3번째 인덱스에 있는 녀석을 삭제해 보세요.
		shoppingCart[3]= null;
		System.out.println(shoppingCart[3]);
	}

}
