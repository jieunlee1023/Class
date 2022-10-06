package a;

import java.util.ArrayList;
import java.util.Scanner;

import ch19.Book;

public class PhoneMainTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Phone> phoneList = new ArrayList<>();
		boolean flag = true;

		final int INSERT = 1;
		final int READ = 2;
		final int UPDATE = 3;
		final int DELETE = 4;
		final int END = 5;

		while (flag) {
			System.out.println("☎ 전화번호부 관리 프로그램 ☎");
			System.out.println("1. 저장하기 2. 조회하기 3. 수정하기 4. 삭제하기 5. 종료");
			int userInput = sc.nextInt();
			if (userInput == INSERT) {
				System.out.println("☎ 1. 저장하기 ☎");
				System.out.println("1. 이름을 입력하세요");
				String name = sc.next();
				System.out.println(" 2. 가운데 4자리 번호를 입력하세요");
				int middleNum = sc.nextInt();
				System.out.println("3. 마지막 4자리 번호를 입력하세요");
				int lastNum = sc.nextInt();
				Phone phone = new Phone(name, middleNum, lastNum);
				phoneList.add(phone);
				phone.showInfo();
				System.out.println("☎ 저 장 완 료 ! ☎");
				System.out.println();

			} else if (userInput == READ) {
				System.out.println("☎ 2. 조회하기 ☎");
				System.out.println("1. 전체 조회하기 2.선택 조회하기");
				final int ALL_READ = 1;
				final int SELECT_READ = 2;
				int userInputSelected = sc.nextInt();
				if (userInputSelected == ALL_READ) {
					System.out.println("☏ 2-1. 전체 조회하기 ☏");
					System.out.println("☏ 저장된 연락처를 모두 조회합니다. ☎☏");
					System.out.println();
					for (int i = 0; i < phoneList.size(); i++) {
						phoneList.get(i).showInfo();
						System.out.println();
					}
				} else if (userInputSelected == SELECT_READ) {
					System.out.println("☎ 2-2. 선택 조회하기 ☎");
					for (int i = 0; i < phoneList.size(); i++) {
						System.out.print(i + "번 - ");
						phoneList.get(i).showInfoName();
					}
					System.out.println("☏ 누구의 연락처를 조회하시겠습니까 ? (번호로 입력하세요) ☏");
					int index = sc.nextInt();
					if (index < phoneList.size()) {
						phoneList.get(index).showInfo();
						System.out.println();
					} else {
						System.out.println("※ 잘못 입력 하셨습니다.");
					}
				} else {
					System.out.println("※ 잘못 입력 하셨습니다.");
				}
			} else if (userInput == UPDATE) {
				System.out.println("☎ 3. 수정하기 ☎");
				for (int i = 0; i < phoneList.size(); i++) {
					System.out.println(i + "번 : ");
					phoneList.get(i).showInfo();
					System.out.println();
				}
				System.out.println("☏ 누구의 연락처를 수정하시겠습니까 ? (번호로 입력하세요) ☏");
				int index = sc.nextInt();
				if (index < phoneList.size()) {
					System.out.println("1. 이름을 입력하세요");
					String name = sc.next();
					System.out.println("2. 가운데 4자리 번호를 입력하세요");
					int middleNum = sc.nextInt();
					System.out.println("3. 마지막 4자리 번호를 입력하세요");
					int lastNum = sc.nextInt();
					Phone rePhone = new Phone(name, middleNum, lastNum);
					phoneList.set(index, rePhone);
					rePhone.showInfo();
					System.out.println("☎ 수 정 완 료 ! ☎");
				} else {
					System.out.println("※ 잘못 입력 하셨습니다.");
				}
			} else if (userInput == DELETE) {
				System.out.println("☎ 4. 삭제하기 ☎");
				System.out.println("1. 전체 삭제하기 2.선택 삭제하기");
				final int ALL_DELETE = 1;
				final int SELECT_DELETE = 2;
				int userInputSelected = sc.nextInt();
				if (userInputSelected == ALL_DELETE) {
					System.out.println("☎ 4-1. 전체 삭제하기 ☎");
					System.out.println("☏ 저장된 연락처를 모두 삭제합니다. ☏");
					for (int i = 0; i < phoneList.size(); i++) {
						phoneList.remove(i);
					}
					System.out.println("☎ 전 체 삭 제 완 료 ! ☎");
					System.out.println();
				} else if (userInputSelected == SELECT_DELETE) {
					System.out.println("☎ 4-2. 선택 삭제하기 ☎");
					for (int i = 0; i < phoneList.size(); i++) {
						System.out.print(i + "번 -  "); 
						phoneList.get(i).showInfoName();
					}
					System.out.println("☏ 누구의 연락처를 삭제하시겠습니까 ? (번호로 입력하세요)☏");
					int index = sc.nextInt();
					if (index < phoneList.size()) {
						phoneList.remove(index);
						System.out.println("☎ 삭 제 완 료 ! ☎");
					} else {
						System.out.println("※ 잘못 입력 하셨습니다.");
					}
				} else {
					System.out.println("※ 잘못 입력 하셨습니다.");
				}
			} else if (userInput == END) {
				System.out.println("※ 프로그램을 종료합니다.");
				flag = false;
			} else {
				System.out.println("※ 잘못 입력 하셨습니다.");
			}
		}

	} // end of main

} // end of class
