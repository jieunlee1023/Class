package ch11;

//디자인 패턴
//싱글톤 패턴 (유일성을 보장, 단 하나만 객체가 존재해야 할 때)
//1. 생성자를 private로 만든다.
//2. static 변수를 활용해서 내부에서 객체를 생성한다
//3. 외부에서 유일하게 참조변수 (인스턴스변스)에 접근 가능한 public 메서드를 제공한다.
public class Company {
	
	public int cId;
	//1.
	private Company() {

	}
	//2.
	private static Company instance = new Company();
	
	//3
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
		//this가 안된다 - > static은 객체가 생성된다를 보장하지 않음!
	}
	

}
