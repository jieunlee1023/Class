package ch05_2;

public interface SecretDiary {
	//1. 인터페이스 선언 (추상 메서드 3개)
	//2. 추상 클래스 선언 (후크 메서드) 
	//3. 메서드 선언 매개변수 타입은 인터페이스로 구상
	//4. 직접 설계 및 사용해보기
	
	void info(Diary diary);
	void writeDiary(Diary diary);
	void updateDiary(Diary diary);
}
