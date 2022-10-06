package test;

//컴파일 시점에 자동으로 넣어줌
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor // 사용자 정의 생성자
@NoArgsConstructor // 기본 생성자
class Dog {

	private String name;
	private int age;

}

public class LombokTest {

	private String name;

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.getName();
		dog.setName("뽀삐");
		System.out.println(dog.getName());
	}
}
