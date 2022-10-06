package io_ex.ch05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * @author ji_eu Reader 문자 단위 입력 스트림 파일에서 라인 단위로 문자 읽기
 *
 */
public class MainTest1 {

	public static void main(String[] args) {

		int count = 0;

		try {
			File file = new File("mytext_1.txt");
			FileReader reader = new FileReader(file); // 기반 스트림 + 보조 스트림 (한줄씩 읽게)
			BufferedReader bufferedReader = new BufferedReader(reader);
			// 보조 스트림 생성시 매개변수로 기반 스트림을 넣고 있다.
			// Buffer는 임시 보관 장소, 계속 파일이 쌓이면 무거워진다!
			// 그럴 때는 Buffer를 비워줘야 한다.
			String line;
//			while ((line = bufferedReader.readLine()) != null) {
//				System.out.println(line);
//				count++;
//			}  // --> 반복 횟수 : 5번 (한 문장 한 문장 )
			int i = 0;
			while ((i = reader.read()) != -1) {
				System.out.println((char) i);
				count++;
			} // --> 반복 횟수 : 57번 (한 글자 한 글자 )

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("반복 횟수 :  " + count);
	}

}
