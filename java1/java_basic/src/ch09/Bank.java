package ch09;

public class Bank {

	// 정보은닉
	private int balance;
	private String name;

	// getter
	public int getBalance() {
		return this.balance;
	}

	public String getName() {
		return this.name;
	}

	public void setBalance(int money) {
		if (money <= 0) {
			System.out.println("잘못된 입력 입니다.");
		} else {
			this.balance = money;
		}
	}

	public void setName(String name) {
		this.name = name;
	}

	// 메서드 (입금하는 기능)
	public void deposit(int money) {
		// this.balance = money; 이건 덮어쓰기
		this.balance += money;
	}

	// 출금하는 기능
	private void withdraw(int money) {
		this.balance -= money;
		showInfo(); 
	}

	public void showInfo() {
		System.out.println("현재 계좌의 잔액은 " + balance + "원 입니다.");
	}

}
