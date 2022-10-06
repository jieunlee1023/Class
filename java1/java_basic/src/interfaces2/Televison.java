package interfaces2;

//자바는 extends 키워드는 단 한번만 사용 가능! 다중 상속허용 X
//왜 ?
// 사람이 extends 네발 달린 짐승 클래스, 사자, 강아지 /(상속3개)
// 사람 클래스에서 울다 (모호성이 발생하는 것을 막아두었다)
public class Televison extends HomeAppliances implements RemoteController {

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");

	}

}
