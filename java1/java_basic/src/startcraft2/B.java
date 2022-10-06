package startcraft2;

public class B {
	C c; //현재 주소값 없음. -> 아래 c = new C();가 없으면 null
	public B() {
		System.out.println("B 클래스를 메모리에 올려서 객체화 했습니다.");
		c= new C();
	}
}
