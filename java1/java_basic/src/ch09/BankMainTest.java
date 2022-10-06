package ch09;

public class BankMainTest {

	public static void main(String[] args) {

		Bank bank = new Bank();

		// 입금합니다.
		bank.deposit(10_000);
//		bank.withdraw(5_000);
		bank.showInfo();

		// 신입 개발자가 실수로 멤버 변수에 바로 접근해서
		// 잔액을 수정함.

		bank.showInfo();

		int currentMoney = bank.getBalance();
		System.out.println(currentMoney);
		bank.setBalance(500_000);
		bank.showInfo();
		bank.setBalance(-100);
		bank.showInfo();
	}

}
