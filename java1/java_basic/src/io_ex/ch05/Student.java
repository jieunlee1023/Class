package io_ex.ch05;

import java.io.Serializable;

//오브젝트를 파일에다가 저장하고 싶을 때 -- FileOutStream + FileObjectOutStream..
//writeObject (Object);

//직렬화 - 클래스를 바이트 단위로 직렬화 시킨다
//( 클래스를 압축한다, 클래스를 01010.. 기계어로 변경한다) 이를 Serializable라고 한다.
public class Student implements Serializable {

	static final long serialVersionUID = 1L; // :고유 값

	String name;
	transient int age; // 직렬화 시킬 때 제외 (데이터가 파일에 저장 안된다!)
	String tel;

	public Student(String name, int age, String tel) {
		this.name = name;
		this.age = age;
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", tel=" + tel + "]";
	}

}