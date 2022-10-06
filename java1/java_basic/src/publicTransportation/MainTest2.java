package publicTransportation;

import java.util.Scanner;

public class MainTest2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		final int BUS = 1;
		final int SUBWAY = 2;
		final int ADULT = 1;
		final int TEENAGER = 2;
		final int CHILD = 3;

		People adultPeople1 = new People("성인1", 25);
		People teenagerpeople1 = new People("청소년1", 17);
		People childPeople1 = new People("아동1", 8);
		
		Bus bus111 = new Bus(1004);
		Subway subway1 = new Subway(1);

		int userInput; //탈 것 선택
		int userSelect1 =0;//연령대 선택
		int userSelect2 =0;// 
		do {
			System.out.println("(ღゝ◡╹)ノ♡");
			System.out.println("탈 것을 선택하시오!");
			System.out.println("1. 버스 2. 지하철 3.나가기");
			userInput = scanner.nextInt();
			if (userInput == BUS) {
				System.out.println("연령대를 선택해주세요.");
				System.out.println("1. 성인 (20살이상) 2. 청소년 (10살~19살) 3. 아동 (9살이하)");
				userInput = scanner.nextInt();
				if (userInput ==ADULT) {
					adultPeople1.busTake(bus111);
					adultPeople1.showInfo();
					bus111.showInfo();
				} else if (userInput == TEENAGER) {
					teenagerpeople1.busTake(bus111);
					teenagerpeople1.showInfo();
					bus111.showInfo();
					
				} else if (userInput == CHILD ) {
					childPeople1.busTake(bus111);
					childPeople1.showInfo();
					bus111.showInfo();
				} else {
					System.out.println("잘못입력하셨습니다.");
				}
//				for (int i = 0; i < 10; i++) {
//					System.out.print(">>>");
//					try {
//						Thread.sleep(200);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//				}
				while (userSelect1 != 1) {
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
					System.out.println("1. 예\t2.아니오");
					userSelect1 = scanner.nextInt();
					if (userSelect1 == 1) {
						adultPeople1.busTakeOff(bus111);
						bus111.takeOff(1);
						bus111.showInfo();
					} else if (userSelect1 == 2) {
						System.out.println("버스가 달리는 중입니다.");
					} else {
						System.out.println("잘못 입력하셨습니다.");
					}
				}

			} else if (userInput == 2) {
				teenagerpeople1.subwayTake(subway1);
				for (int i = 0; i < 10; i++) {
					System.out.print(">>>");
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println();
				System.out.println("-------------------");
				teenagerpeople1.showInfo();
				subway1.showInfo();
				while (userSelect2 != 1) {
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
					System.out.println("1. 예\t2.아니오");
					userSelect2 = scanner.nextInt();
					if (userSelect2 == 1) {
						teenagerpeople1.subwayTakeOff(subway1);
						subway1.takeOff(1);
						subway1.showInfo();
					} else if (userSelect2 == 2) {
						System.out.println("지하철이 달리는 중입니다.");
					} else {
						System.out.println("잘못 입력하셨습니다.");
					}
				}

			}
		} while (userInput != 3);
		System.out.println("프로그램 종료됩니다.");

	}

}
