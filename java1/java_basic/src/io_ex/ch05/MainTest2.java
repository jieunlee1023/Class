package io_ex.ch05;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MainTest2 {

	public static void main(String[] args) {

		String text = "text text";
		String fileName = "result.txt";

		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;
		try {
			// 느리고 불편!
			fileWriter = new FileWriter(fileName);
			bufferedWriter = new BufferedWriter(fileWriter);
			// 파일에 문자 쓰기
			bufferedWriter.write(text);

			bufferedWriter.flush();
			// ★ BufferedWriter 사용시 flush()를 사용해야 파일에 써진다!
			bufferedWriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 자원을 닫을 때는 생성과 반대로 (생성: 기반 -> 보조 / 닫기: 보조 -> 기반)
			try {
				bufferedWriter.close();
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
