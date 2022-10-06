package generic_ex.ch02;

public class GenericPrinter<T> {

//	 T - type 라는 대체 문자를 사용, 
//	 E - element, K - key, V - value (아무 문자나 사용 가능)
//	 자료형 매개변수 (type parameter)

	private T material; // T 자료형으로 선언한 변수

	public T getMaterial() { // T자료형으로 반환하는 제네릭 메서드
		return material;
	}

	// T 자료형 매개변수가 사용되는 제네릭 메서드
	public void setMaterial(T material) {
		this.material = material;
	}

}
