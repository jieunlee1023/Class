package lambda_ex;

public class AddTest {

	public static void main(String[] args) {

		IAdd iAdd = (int x, int y) -> {return x + y;};
		System.out.println(iAdd.add(10, 1));
		System.out.println(iAdd.add(100, 500));
		System.out.println(iAdd.add(2, 5));
		
		//인터페이스 원래 사용 방법
		IAdd iAdd2 = new IAdd() {
			
			@Override
			public int add(int x, int y) {
				return x + y ;
			}
		};
		
	}

}

// 람다식을 사용하기 위해서는 미리 정의 되어 있어야 한다. --> 인터페이스가 !
// (단, 추상 메서드는 반드시 한개 이어야 한다.)
// 타입 추론이 가능하기 때문에 사용 가능!

interface IAdd {
	public int add(int x, int y);
	//public int minus();
}