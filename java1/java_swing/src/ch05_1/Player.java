package ch05_1;

//1. 상속으로 사용방식
public class Player extends MoveableAdapter {

	@Override
	public void left() {
		System.out.println("좌표 x값으로 -10만큼 이동합니다.");
	}

	@Override
	public void right() {
		System.out.println("좌표 y값으로 -10만큼 이동합니다.");
	}

	// 2. inner class 사용방식
	private class MyMove extends MoveableAdapter {
		@Override
		public void left() {
			System.out.println("좌표 x값으로 -10만큼 이동합니다.");
//			setLocation(기존값 - 10)
		}

		@Override
		public void right() {
			System.out.println("좌표 y값으로 -10만큼 이동합니다.");
		}
	}

}
