package wrapper_ex;

public class MainTest8 {

	public static void main(String[] args) {

		// String medal = "GOld";
		// 입력값이 비슷하게 들어오면 오류를 발생 시킬 수 있다.
		//enum 을 사용하면 실수가 현저히 줄어든다~
		Medal medal = Medal.BRONZE;

		switch (medal) {
		case GOLD:
			System.out.println("금메달 입니다.");
			break;

		case SILVER:
			System.out.println("은메달 입니다.");
			break;
		case BRONZE:
			System.out.println("동메달 입니다.");
			break;

		default:
			System.out.println("메달이 없습니다.");
			break;
		}
	}
}
