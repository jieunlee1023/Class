package io_ex.ch02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 
 * @author 이지은 입력 스트림- 파일에서 한 바이트씩 자료 읽기 (기본 2바이트인 한글은 깨진다)
 *
 */
public class MainTest1 {

	public static void main(String[] args) {

		FileInputStream fis = null;

		try {
			fis = new FileInputStream("boot_a.txt");
			System.out.print((char) fis.read());
			System.out.print((char) fis.read());
			System.out.print((char) fis.read());
			System.out.print((char) fis.read());
			System.out.print((char) fis.read());
			System.out.print((char) fis.read());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (NullPointerException e) {
				System.out.println("null 포인터 ! 객체 생성 또는 주소값 확인 했니 !?");
			}
		}
	}
}
