package startcraft2;

import java.util.Random;

public class MainTest1 {

	public static void main(String[] args) {

		final int ZEALOT = 1;
		final int MARINE = 2;
		final int ZERGLING = 3;

		Zealot zealot1 = new Zealot("질럿1");
		Zealot zealot2 = new Zealot("질럿2");
		Marine marine1 = new Marine("마린1");
		Zergling zergling = new Zergling("저글링1");

		Random random = new Random();
		int number = random.nextInt(3) + 1;

		if (ZEALOT == number) {
			zealot1.attack(marine1);
			zealot1.attack(zergling);
		} else if (MARINE == number) {
			marine1.attack(zealot1);
			marine1.attack(zergling);
		} else {
			zergling.attack(marine1);
			zergling.attack(zealot1);
		}

		zealot1.showInfo();
		marine1.showInfo();
		zergling.showInfo();

		System.out.println("-----------------------------");
		// 강제공격
		zealot1.attack(zealot2);
		zealot1.attack(zealot1);

		// 자기 자신을 공격하는 명령을 했다면 동작하지 않게 코드를 수정해주세요
		// 클래스에서 수정을 해야한다. (점을 타고 들어감)
	}

}
