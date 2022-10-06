package io_ex.ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * @author 이지은 
 * 바이트 단위 출력 -1
 * 파일에 한 바이트씩 쓰기
 *
 */

public class MainTest1 {

	public static void main(String[] args) {
		// 함수안에 사용하는 변수는 지역 변수 초기화 값을 넣어주는게 좋다! (습관)

		FileOutputStream fos = null;

		try {
			// 만약 파일이 없다면 자동으로 파일을 만들어준다.
			fos = new FileOutputStream("output_a.txt");
			fos.write(65);
			fos.write(66);
			fos.write('c');
			fos.write('D');
			fos.write('e');
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
