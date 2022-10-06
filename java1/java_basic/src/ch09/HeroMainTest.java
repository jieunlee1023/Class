package ch09;

public class HeroMainTest {

	public static void main(String[] args) {

		Hero hero = new Hero();
		Hero hero2 = new Hero();

		hero.setName("토"); // 2글자를 넘지 못했다
		hero.setName("토르"); // 이름 입력
		hero.setHp(100); // hp 입력
		hero.setPower(101); // power 잘못입력
		hero.setPower(99); // power 입력
		hero.setDefense(55.5); // defense 입력
		hero.setLevel(-2); // level 잘못입력
		hero.setLevel(2); // level 입력

		hero.heroInfo();
		System.out.println("--------------------");

		// String 클래스는 참조타입? O (클래스)
		String temp = new String("반가워");
		System.out.println(temp);
		// 문자열
		// 특별하게 편하게 사용하라고 "반가워"허용 (new~ 사용안해도 되게)
		String temp2 = "반가워";
		System.out.println(temp2);
		System.out.println("--------------------");
		System.out.println(hero);
		System.out.println(hero2);

		if (temp == temp2) {
			System.out.println("주소값이 같습니다.");
		} else {
			System.out.println("주소값이 다릅니다.");
		}
	}

}
