package io_ex.ch01;

import java.io.IOException;

public class MainTest2 {

	public static void main(String[] args) {

		System.out.println("알파벳 여러개 쓰고 엔터");

		int i;
		try {
			// 한 바이트씩 읽어들임 : System.in.read()
			while ((i = System.in.read()) != '\n') {
				System.out.print("i : " + i);
				System.out.print("(인코딩): " + (char) i);
				System.out.println();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
