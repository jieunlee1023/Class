package a;

public class ParkJieunDiary extends Diary implements SecretDiary {

	@Override
	public void info(Diary diary) {
		System.out.println("이름 : " + diary.getName());
		System.out.println("아이디 : " + diary.getId());
		System.out.println("비밀번호 : " + diary.getPw());
	}

	@Override
	public void writeDiary(Diary diary) {
		System.out.println("|--------------------|");
		System.out.println("|  ! !  박지은 일기 입니다  ! !   |");
		System.out.println("|--------------------|");
		System.out.println("               ᕱ ᕱ || 　");
		System.out.println("             ( ･ω･ || 　 　");
		System.out.println("              /　 つΦ 　");
	}

	@Override
	public void updateDiary(Diary diary) {
		System.out.println("|--------------------|");
		System.out.println("|  ! 박지은 수정 일기 입니다 !   |");
		System.out.println("|--------------------|");
		System.out.println("               ᕱ ᕱ || 　");
		System.out.println("             ( ･ω･ || 　 　");
		System.out.println("              /　 つΦ 　");
	}

}
