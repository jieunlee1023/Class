package startcraft2;

public class G {

	int number= 10;

	public G() {
		System.out.println("G클래스를 메모리에 올려서 객체화 했습니다.");
	}

	public void showInfo() {
		System.out.println("여기는 G클래스의 메서드 showInfo 입니다.");
	}

	public static void main(String[] args) {
		F f = new F();
		System.out.println(f);//f의 주소값
		System.out.println("--------------------");
		System.out.println(f.g);
		f.g.showInfo();
		System.out.println(f.g.number);
		int result = f.g.number;
		System.out.println(result);
	}

}
