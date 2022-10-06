package Transportation;

public class Transportation {

	protected String name;
	protected int num;
	protected int PeopleCount = 0;
	protected int maxPeopleCount;

	public void take(int count) {
		if (maxPeopleCount < count) {			
			System.out.println("탈 수 있는 사람의 수를 초과했습니다.");
		}else {
			this.PeopleCount += count;
			System.out.println("사람이 " + count + "명 탔습니다");
			System.out.println("현재 타고 있는 사람 수 : "+PeopleCount);
		}
	}

	public void takeOff(int countOff) {
		if (PeopleCount <= 0) {
			System.out.println("현재 아무도 타고 있지 않습니다.");
		} else if (maxPeopleCount < countOff) {
			System.out.println("내릴 수 있는 사람의 수를 초과했습니다");
		} else {
			this.PeopleCount -= countOff;
			System.out.println("사람이 "+countOff + "명이 내립니다.");
			System.out.println("현재 타고 있는 사람 수 : "+PeopleCount);
		}
	}

	public void showInfo() {
		System.out.println("-----------------");
		System.out.println("차의 번호는 " + num + "입니다.");
		System.out.println("현재 타고 있는 사람의 수는 " + PeopleCount + " 입니다.");
		System.out.println("-----------------");
	}
}
