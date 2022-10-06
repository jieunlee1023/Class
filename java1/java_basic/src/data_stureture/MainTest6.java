package data_stureture;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class MainTest6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		boolean flag = true;
		HashMap<String, String> phoneList = new HashMap<>();

		String name;
		String phoneNumber;

		final int INSERT = 1;
		final int READ = 2;
		final int UPDATE = 3;
		final int DELETE = 4;
		final int END = 5;

		final int ALL = 1;
		final int SELECT = 2;

		while (flag) {
			System.out.println("☎ 전화번호부 ☎");
			System.out.println("1. 저장 2. 조회 3. 수정 4. 삭제 5. 나가기");
			int userInput = scanner.nextInt();
			if (userInput == INSERT) {

				System.out.println("1. 저장하기 페이지 입니다.");
				System.out.println(" 등록할 이름을 입력하세요");
				name = scanner.next();
				System.out.println("등록할 전화번호를 입력하세요.");
				phoneNumber = scanner.next();
				phoneList.put(name, phoneNumber);

			} else if (userInput == READ) {
				System.out.println("2. 조회하기 페이지 입니다.");
				System.out.println("1. 전체 조회하기 2. 선택 조회하기");
				int readUserInput = scanner.nextInt();
				if (readUserInput == ALL) {
					System.out.println("전체 조회합니다.");
					for (Entry<String, String> entry : phoneList.entrySet()) {
						System.out.println("[이름] : " + entry.getKey() + ", " + "[연락처] : " + entry.getValue());
					}
				} else if (readUserInput == SELECT) {
					System.out.println("선택 조회합니다.");
					for (String key : phoneList.keySet()) {
						System.out.println("[이름] : " + key);
					}
					System.out.println("누구의 번호를 조회하시겠습니까?");
					String selectUserInput = scanner.next();
					if (phoneList.containsKey(selectUserInput) == true) {
						System.out.println(selectUserInput + "의 연락처 : " + phoneList.get(selectUserInput));
					} else {
						System.out.println("잘못 입력 하셨습니다.");
					}

				}

			} else if (userInput == UPDATE) {
				System.out.println("3. 수정하기 페이지 입니다.");
				for (Entry<String, String> entry : phoneList.entrySet()) {
					System.out.println("[이름] : " + entry.getKey() + " , " + "[연락처] : " + entry.getValue());
				}
				System.out.println("누구를 수정하시겠습니까 ?");
				String updateUserInput = scanner.next();
				if (phoneList.containsKey(updateUserInput) == true) {
					System.out.println("변경 할 이름을 입력하세요.");
					String changeName = scanner.next();
					System.out.println("변경 할 번호를 입력하세요.");
					String changePhoneNum = scanner.next();
					phoneList.put(changeName, changePhoneNum);
					phoneList.remove(updateUserInput);

				} else {
					System.out.println("잘못 입력 하셨습니다.");
				}

			} else if (userInput == DELETE) {
				System.out.println("4. 삭제하기 페이지 입니다.");
				System.out.println("1. 전체 삭제하기 2. 선택 삭제하기");
				int deleteUserInput = scanner.nextInt();
				if (deleteUserInput == ALL) {
					phoneList.clear();
				} else if (deleteUserInput == SELECT) {
					for (Entry<String, String> entry : phoneList.entrySet()) {
						System.out.println("[이름] : " + entry.getKey() + " , " + "[연락처] : " + entry.getValue());
					}
					System.out.println("누구를 삭제하시겠습니까 ?");
					String deleteUser = scanner.next();
					if (phoneList.containsKey(deleteUser) == true) {
						phoneList.remove(deleteUser);
						System.out.println(" 삭제 완료 !");
					}
				} else {
					System.out.println("잘못 입력 하셨습니다.");
				}

			} else if (userInput == END) {
				System.out.println(" 종료됩니다. ");
				flag = false;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}

		}

	}

}
