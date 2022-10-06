package ch13;

public class Car {
	//차와 엔진에서는 상속 관계를 만들면 안된다.
	//포함 관계로 만들 수 있다.
	
	Engin engin;
	
	public Car (String cName, int cPrice, Engin engin) {
		this.name = cName;
		this.price = cPrice;
		this.engin = engin;
	}
	
	String name;
	int price;
	
	//문제 
	//car 클래스 생성시에 엔진 클래스를 메모리에 올려주세요
	//단 engin의 이름과 가격을 외부에서 전달 받도록 설계 해주세요.
	
}
