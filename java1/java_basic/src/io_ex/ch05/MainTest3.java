package io_ex.ch05;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainTest3 {

	public static void main(String[] args) {

		Student s1 = new Student("티모", 50, "1111");
		Student s2 = new Student("야스오", 150, "2222");
		Student s3 = new Student("애쉬", 10, "3333");

		FileOutputStream fos = null;
		ObjectOutputStream objectOutputStream = null;
		try {
			fos = new FileOutputStream("object_text.txt");
			objectOutputStream = new ObjectOutputStream(fos);
			// 객체 단위로 사용하고 싶다면
			objectOutputStream.writeObject(s1);
			objectOutputStream.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				objectOutputStream.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}