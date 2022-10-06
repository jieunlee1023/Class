package ch09;

import java.util.Scanner;

public class WarriorWizardMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		WarriorWizard warrior = new WarriorWizard();
		WarriorWizard wizard = new WarriorWizard();

		int userInput;
		String name;
		int power;
		int damage;

		do {
			System.out.println("★☆★전사 & 마법사 게임★☆★");
			System.out.println("캐릭터를 선택해주세요.");
			System.out.println("1. 전사 (warrior)");
			System.out.println("2. 마법사(Wizard)");
			System.out.println("3. 종료하기");
			userInput = sc.nextInt();

			if (userInput == 1) {
				System.out.println("전사의 이름을 입력해주세요 : ");
				warrior.charName(name = sc.next());
				System.out.println("전사의 공격력을 입력해주세요 : ");
				warrior.attack(power = sc.nextInt());
				System.out.println("전사에게 입힐 데미지를 입력해주세요 : ");
				warrior.beAttack(damage = sc.nextInt());
				warrior.wizardInfo();

				System.out.println("계속 진행하시겠습니까?");
				System.out.println("1. 네 2. 아니오");
				userInput = sc.nextInt();
				if (userInput == 1) {
					System.out.println("전사의 공격력을 입력해주세요 : ");
					warrior.attack(power = sc.nextInt());
					System.out.println("전사에게 입힐 데미지를 입력해주세요 : ");
					warrior.beAttack(damage = sc.nextInt());
					warrior.wizardInfo();
				} else if (userInput == 2) {
					userInput = 3;
				} else {
					System.out.println("잘못입력하셨습니다!");
				}

			} else if (userInput == 2) {
				System.out.println("마법사의 이름을 입력해주세요 : ");
				wizard.charName(name = sc.next());
				System.out.println("마법사의 공격력을 입력해주세요 : ");
				wizard.attack(power = sc.nextInt());
				System.out.println("마법사에게 입힐 데미지를 입력해주세요 : ");
				wizard.beAttack(damage = sc.nextInt());
				wizard.wizardInfo();

				System.out.println("계속 진행하시겠습니까?");
				System.out.println("1. 네 2. 아니오");
				userInput = sc.nextInt();
				if (userInput == 1) {

				} else if (userInput == 2) {
					userInput = 3;
				} else {
					System.out.println("잘못 입력 하셨습니다!");
				}

			} else if (userInput == 3) {

			} else {
				System.out.println("잘못 입력 하셨습니다. 다시 입력 해주세요!");
			}
		} while (userInput != 3);
		System.out.println("프로그램을 종료합니다!");

	}

}
