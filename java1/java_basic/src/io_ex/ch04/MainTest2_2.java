package io_ex.ch04;

import java.io.FileReader;
import java.io.FileWriter;

public class MainTest2_2 {

	public static void main(String[] args) {

		int i;
		try (FileWriter fw = new FileWriter("writer_1.txt")) {
			try (FileReader fr = new FileReader("reader_1.txt")) {
				fw.write("복사본 \n");
				while ((i = fr.read()) != -1) {
					fw.write((char) i);
				}
			} catch (Exception e) {
			}
		} catch (Exception e) {
		}

	}
}
