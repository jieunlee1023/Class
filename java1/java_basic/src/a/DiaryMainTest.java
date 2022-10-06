package a;

import java.util.Scanner;

public class DiaryMainTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean flag = true;

		Diary diaryKim = new Diary("김지은", "KIMJIEUN", "123");
		Diary diaryLee = new Diary("이지은", "LEEJIEUN", "456");
		Diary diaryPark = new Diary("박지은", "PARKJIEUN", "789");

		SecretDiary secretDiary;
		while (flag) {
			System.out.println("※ 누구의 비밀 일기를 확인하시겠습니까 ?");
			System.out.println("종료를 원하시면 0번을 눌러주세요.");
			System.out.println();
			System.out.println("1. 김지은 2. 이지은 3. 박지은");
			String selectNum = sc.next();
			if (selectNum.equals("1") || selectNum.equals("김지은")) {
				System.out.println("비밀번호를 입력하세요.");
				String pw = sc.next();
				if (pw.equals(diaryKim.getPw())) {
					secretDiary = new KimJieunDiary();
					secretDiary.info(diaryKim);
					System.out.println();
					secretDiary.writeDiary(diaryKim);
					System.out.println("※ 수정된 일기를 확인하시겠습니까?");
					System.out.println("1. 네 2. 아니요");
					String reviseFileSelected = sc.next();
					if (reviseFileSelected.equals("1") || reviseFileSelected.equals("네")) {
						secretDiary.updateDiary(diaryKim);
					}
				} else {
					System.out.println("※ 입력하신 비밀번호가 다릅니다.");
				}

			} else if (selectNum.equals("2") || selectNum.equals("이지은")) {
				System.out.println("비밀번호를 입력하세요.");
				String pw = sc.next();
				if (pw.equals(diaryLee.getPw())) {
					secretDiary = new LeeJieunDiary();
					secretDiary.info(diaryLee);
					System.out.println();
					secretDiary.writeDiary(diaryLee);
					System.out.println("※ 수정된 일기를 확인하시겠습니까?");
					System.out.println("1. 네 2. 아니요");
					String reviseFileSelected = sc.next();
					if (reviseFileSelected.equals("1") || reviseFileSelected.equals("네")) {
						secretDiary.updateDiary(diaryLee);
					}
				} else {
					System.out.println("※ 입력하신 비밀번호가 다릅니다.");
				}

			} else if (selectNum.equals("3") || selectNum.equals("박지은")) {
				System.out.println("비밀번호를 입력하세요.");
				String pw = sc.next();
				if (pw.equals(diaryPark.getPw())) {
					secretDiary = new ParkJieunDiary();
					secretDiary.info(diaryPark);
					System.out.println();
					secretDiary.writeDiary(diaryPark);
					System.out.println("※ 수정된 일기를 확인하시겠습니까?");
					System.out.println("1. 네 2. 아니요");
					String reviseFileSelected = sc.next();
					if (reviseFileSelected.equals("1") || reviseFileSelected.equals("네")) {
						secretDiary.updateDiary(diaryPark);
					}
				} else {
					System.out.println("※ 입력하신 비밀번호가 다릅니다.");
				}
			} else if (selectNum.equals("0")) {
				System.out.println("※ 프로그램을 종료합니다.");
				flag = false;

			} else {
				System.out.println("※ 잘못 입력 하셨습니다.");
			}
		}

	} // end of main

}
