package ch15;

public class MainTest3 {
	public static void main(String[] args) {

		Computer desctop = new DestTop();
		Computer myNoteBook = new MyNoteBook();
//		Computer noteBook = new NoteBook(); //추상 클래스, 인스턴스화 불가

		desctop.display();
		desctop.typing();
		desctop.turnOn();
		desctop.turnOff();

		System.out.println("--------------");
		myNoteBook.display();
		myNoteBook.typing();
		myNoteBook.turnOn();
		myNoteBook.turnOff();

	}

}
