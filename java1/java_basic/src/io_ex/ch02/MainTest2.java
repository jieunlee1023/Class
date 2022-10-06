package io_ex.ch02;

import java.io.FileInputStream;

public class MainTest2 {

	/**
	 * 
	 * @author ji_eu 
	 * 입력스트림 - file 문자 단위로 사용 1. 7 버전 이상 오토 클로즈!
	 */

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("boot_a.txt")) {
			int i;
			while ((i = fis.read()) != -1) {
				// read 는 바이트 단위로 읽어들인다.
				System.out.println((char) i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
