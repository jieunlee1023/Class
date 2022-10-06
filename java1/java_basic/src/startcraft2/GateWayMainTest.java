package startcraft2;

import java.util.Scanner;

public class GateWayMainTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		GateWay gateWay1 = new GateWay();
		GateWay gateWay2 = new GateWay();

		int userInput = 0;
		int userInputGate = 0;
		int userInputCreate = 0;
		do {
			System.out.println(" 무엇을 생산하시겠습니까 ?");
			System.out.println("1. 질럿 2. 드라군");
			userInput = scanner.nextInt();
			if (userInput == 1) {
				System.out.println("몇 번 게이트에서 생산하시겠습니까?");
				System.out.println(" 1. 1번 2. 2번 ");
				userInputGate = scanner.nextInt();
				if (userInputGate == 1) {
					System.out.println("몇 마리를 생산하시겠습니까?");
					userInputCreate = scanner.nextInt();
					Zealot zealot = gateWay1.createZealot(userInputCreate);
					System.out.println("1번 게이트에서 질럿 "+ GateWay.zealotTotalCount + "마리 생산완료!");
				} else if (userInputGate == 2) {
					System.out.println("몇 마리를 생산하시겠습니까?");
					userInputCreate = scanner.nextInt();
					Zealot zealot = gateWay2.createZealot(userInputCreate);
					System.out.println("2번 게이트에서 질럿 "+ GateWay.zealotTotalCount + "마리 생산완료!");
				}
			}else if (userInput == 2){
				
			}else if (userInput == 3) {
				System.out.println("프로그램이 종료됩니다.");
			}else {
				System.out.println("잘못 입력하셨습니다.");
				System.out.println("다시 입력해주세요.");
			}
		} while (userInput != 3);
		
		

		
		// 질럿이 총 몇마리 생성되었는가를 데이터로 저장해서 관리하고 싶다면
//		Dragoon dragoon1 = gateWay1.createDragoon();
//		Dragoon dragoon2 = gateWay2.createDragoon();
//		Dragoon dragoon3 = gateWay2.createDragoon();
//		Dragoon dragoon4 = gateWay1.createDragoon();
//		Dragoon dragoon5 = gateWay2.createDragoon();
//		Dragoon dragoon6 = gateWay2.createDragoon();
//		Dragoon dragoon7 = gateWay1.createDragoon();
//
//		System.out.println(GateWay.dragoonTotalCount + "마리 생산완료!");
//		System.out.println(GateWay.dragoonTotalCount + "마리 생산완료!");

	}

}
