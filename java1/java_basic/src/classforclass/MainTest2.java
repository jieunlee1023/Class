package classforclass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class MainTest2 {

	public static void main(String[] args) throws ClassNotFoundException {
		
		//클래스의 정보를 확인해서 생성자, 메서드를 확인하는 방법

		Class c3 = Class.forName("java.lang.String");
		Constructor<String>[] cons = c3.getConstructors();
		for (Constructor<String> constructor : cons) {
			System.out.println("CONS: " + constructor);
			// c3 (String 클래스)에 대한 생성자 정보를 모두 가져옴
		}

		System.out.println("-------------------------------");

		Method[] methods = c3.getMethods();
		for (Method method : methods) {
			System.out.println("method : " + method);
			// c3 (String 클래스)에 대한 메서드 정보를 모두 가져옴
		}
	}

}
