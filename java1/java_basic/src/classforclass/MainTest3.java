package classforclass;

public class MainTest3 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		Person person = new Person("James");
		System.out.println(person);
		System.out.println("-------------------------");
		
		Class c1 = Class.forName("classforclass.Person");
		// 객체를 생성하는 방법
		Person person2 = (Person)c1.newInstance();
		System.out.println(person2);
		
	}

}
