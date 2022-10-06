package io_ex.ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * 
 *
 * @author 이지은 바이트 단위 출력 스트림 - 2 A 부터 Z까지 한꺼번에 파일에 쓰기
 *
 */
public class MainTest3 {

	public static void main(String[] args) throws FileNotFoundException {

		FileOutputStream fos = new FileOutputStream("output_b.txt");

		// 오토 클로즈 동작!
		try (fos) {
			byte[] bs = new byte[26];
			byte data = 65;
			for (int i = 0; i < bs.length; i++) {
				bs[i] = data;
				data++;
			}
			fos.write(bs, 2, 10);
			fos.write(bs, 2, 10);
			fos.flush(); // 출력 버퍼를 비울 때 사용한다.
		} catch (Exception e) {
		}
		System.out.println("출력이 완료되었습니다!");
	}

}
