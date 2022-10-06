package io_ex.ch02;

import java.io.FileInputStream;
import java.io.InputStream;

public class MainTest3 {

	/**
	 * 
	 * @author ji_eu 입력스트림 - 
	 * file 문자 단위로 사용 1. 7 버전 이상 오토 클로즈!
	 */

	public static void main(String[] args) {
		
		InputStream inputStream;
		
		try (FileInputStream fis = new FileInputStream("boot_a.txt")) {
			byte[] bs = new byte[10];

			int i;
			while ((i = fis.read(bs, 1, 7)) != -1) {
				for (int j = 0; j < i; j++) {
					System.out.print((char) bs[j]);
				}
				System.out.println(" i : " + i + "바이트씩 읽음");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
