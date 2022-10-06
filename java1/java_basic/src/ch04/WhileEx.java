package ch04;

import java.util.Random;
import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {
		
		// 야구 게임 (사용자한테 입력을 받아서 3번 안에 randomResult 값을 맞추는 게임)
		// 조건 3번안에 값을 맞추면 안타입니다. 화면에 출력, 3번 다 틀렸으면 아웃입니다. 화면에 출력
		
		Random random = new Random();
		int randomResult = random.nextInt(5) + 1; // 0 1 2 --> 0말고 1 2 3 원해
		
		Scanner sc = new Scanner (System.in);
		int userNum;
		int chance = 3; //3번의 기회가 주어지기 위한 변수
		
		System.out.println("1부터 5중 랜덤 숫자 맞추기!");
		System.out.println("숫자를 입력하세요 : ");
		do{
			userNum = sc.nextInt();
			if (userNum == randomResult) {
				System.out.println("입력한 값: "+userNum);
				System.out.println("랜덤 값: "+randomResult);
				System.out.println("맞췄습니다! 안타입니다.");
				break;
			} else {
				System.out.println("입력한 값: "+userNum);
				System.out.println("랜덤 값: "+randomResult);
				System.out.println("틀렸습니다. 기회는 "+chance+"번 남았습니다.");
				if (chance<=1) {
					System.out.println("아웃입니다!");
					break;
				}
			}
			chance--;
		}while(userNum != randomResult);
		
	}//end of main

}//end of class
