package ch15;

public class DestTop extends Computer {

	@Override
	public void display() {
		System.out.println("모니터로 표시 합니다.");
		
	}

	@Override
	public void typing() {
		System.out.println("기계식 키보드로 타이핑 합니다");
	}

}
