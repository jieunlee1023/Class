package io_ex.ch04;

import java.io.FileReader;

/**
 * 
 * @author ji_eu Reader 문자 단위 입력 스트림
 * 
 */
public class MainTest1 {

	public static void main(String[] args) {

		// 1byte 씩 inputStream
		// 2바이트씩! - 한글, 중국어, 일본어
		try (FileReader fr = new FileReader("reader_1.txt")) {
			int i;
			while ((i = fr.read()) != -1) {
				System.out.print((char) i);
			}

		} catch (Exception e) {

		}
	}

}
