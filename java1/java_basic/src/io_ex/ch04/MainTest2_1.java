package io_ex.ch04;

import java.io.FileWriter;

/**
 * 
 * @author ji_eu 문자단위 출력 스트림 파일에다가 문자쓰기
 *
 */
public class MainTest2_1 {

	public static void main(String[] args) {
		try (FileWriter fw = new FileWriter("writer_1.txt", true)) {
			// true 덮어쓰는 것이 아닌 뒤에 붙일 때!

			char[] buf = { '반', '가', '워' };

			fw.write(buf);
//			fw.write('안');

		} catch (Exception e) {

		}
	}

}
