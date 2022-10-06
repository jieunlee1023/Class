package try_catch_ex;

public class MainTest1 {

	public static void main(String[] args) {
		// 예외가 발생 할 수 있는 코드
		String nameAge = "이지은, 27";
		try {
			// 예외가 발생 할 수 있는 문장
			int i = Integer.parseInt(nameAge);
		} catch (Exception e) { // 모든 예외는 Exception 안에 담김
			// 예외 발생시 실행 할 문장
			System.out.println("형이 맞지 않습니다.");
		}
	}
}
