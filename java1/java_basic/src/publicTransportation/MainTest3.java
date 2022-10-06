package publicTransportation;

import java.util.Scanner;

public class MainTest3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		People adultPeople1 = new People("성인1", 25);
		People teenagerpeople1 = new People("청소년1", 17);
		People childPeople1 = new People("아동1", 8);

		Bus bus111 = new Bus(1004);
		Subway subway1 = new Subway(1);

		int userInput = 0; // 탈 것 선택
		int userAge; // 연령 선택
		int userTakeOffBus = 0; // 버스내리기
		int userTakeOffSubway = 0; // 지하철 내리기

		while (userInput != 3) {
			System.out.println("(—̳͟͞͞♥ —̳͟͞͞♥ —̳͟͞͞♥ —̳͟͞͞♥ —̳͟͞͞♥ ");
			System.out.println("탈 것을 선택하시오!");
			System.out.println("1. 버스 2. 지하철 3. 나가기");
			userInput = scanner.nextInt();
			if (userInput == 1) {
				System.out.println("연령대를 선택해주세요.");
				System.out.println("1. 성인 (20살이상)\n2. 청소년 (10살~19살)\n3. 아동 (9살이하)");
				userAge = scanner.nextInt();

				if (userAge == 1) {
					adultPeople1.busTake(bus111);
					System.out.println("-------------------");
					adultPeople1.showInfo();
					bus111.showInfo();
				} else if (userAge == 2) {
					teenagerpeople1.busTake(bus111);
					System.out.println("-------------------");
					teenagerpeople1.showInfo();
					bus111.showInfo();
				} else if (userAge == 3) {
					childPeople1.busTake(bus111);
					System.out.println("-------------------");
					childPeople1.showInfo();
					bus111.showInfo();
				} else {
					System.out.println("잘못 입력 하셨습니다.");
					userAge = scanner.nextInt();
					System.out.println("다시 선택해주세요!");
					continue;
				}

				userTakeOffBus = 0;
				while (userTakeOffBus != 1) {
					for (int i = 0; i < 10; i++) {
						System.out.print(">>>");
						try {
							Thread.sleep(200);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println();
					System.out.println("내리시겠습니까 ?");
					System.out.println("1. 예\t2. 아니오");
					userTakeOffBus = scanner.nextInt();
					if (userTakeOffBus == 1) {
						bus111.takeOff(1);
						System.out.println("-------------------");
						bus111.showInfo();
					} else if (userTakeOffBus == 2) {
						System.out.println("버스가 달리는 중입니다.");
					} else {
						System.out.println("잘못 입력 하셨습니다.");
					}
				}

			} else if (userInput == 2) {
				System.out.println("연령대를 선택해주세요.");
				System.out.println("1. 성인 (20살이상)\n2. 청소년 (10살~19살)\n3. 아동 (9살이하)");
				userAge = scanner.nextInt();
				if (userAge == 1) {
					adultPeople1.subwayTake(subway1);
					System.out.println("-------------------");
					adultPeople1.showInfo();
					subway1.showInfo();
				} else if (userAge == 2) {
					teenagerpeople1.subwayTake(subway1);
					System.out.println("-------------------");
					teenagerpeople1.showInfo();
					subway1.showInfo();
				} else if (userAge == 3) {
					childPeople1.subwayTake(subway1);
					System.out.println("-------------------");
					childPeople1.showInfo();
					subway1.showInfo();
				} else {
					System.out.println("잘못 입력하셨습니다.");
					break;
				}
				userTakeOffSubway = 0;
				while (userTakeOffSubway != 1) {
					for (int i = 0; i < 10; i++) {
						System.out.print(">>>");
						try {
							Thread.sleep(200);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println();
					System.out.println("내리시겠습니까 ?");
					System.out.println("1. 예\t2. 아니오");
					userTakeOffSubway = scanner.nextInt();
					if (userTakeOffSubway == 1) {
						subway1.takeOff(1);

						System.out.println("-------------------");
						subway1.showInfo();
					} else if (userTakeOffSubway == 2) {
						System.out.println("지하철이 달리는 중입니다.");
					} else {
						System.out.println("잘못 입력 하셨습니다.");
					}
				}
			}
		}
		System.out.println("프로그램 종료됩니다.");
	}
}
