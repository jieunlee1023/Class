package threadex.ch03;

public class BankAccount {

	private int money = 100_000;
	// 변수 money에 쉽게 접근하지 않기 위해
	// private로 지정하고 get, set 메서드 사용

	public int getMoney() {
		return this.money;
	}

	public void setMoney(int money) {
		if (money <= 0) {
			System.out.println("잘못된 입력 값입니다.");
		} else {
			this.money = money;
		}
	}

	// 입금하기
	public synchronized void saveMoney(int money) {
		// 현재 초기값 10만원
		// 3초 걸릴 동안 9만 5천원으로 이미 변경 되었음
		// 하지만 여기서는 여전히 10만원인 상태 (의도치 않은 결과 발생)
		int currentMoney = getMoney();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		setMoney(currentMoney + money);
		System.out.println("입금 후 계좌 잔액 : " + getMoney());
	}

	// 출금하기
	public void withdrawMoney(int money) {
		synchronized (this) {
			int currentMoney = getMoney();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (currentMoney >= money) {
				setMoney(currentMoney - money);
				System.out.println("출금 후 계좌 잔액 : " + getMoney());
			} else {
				System.out.println("계좌 잔액이 부족합니다.");
			}
		}
	}

} // end of class
