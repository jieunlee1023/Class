package io_ex.ch04;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainTest3 {

	public static void main(String[] args) {

		String originFilePath = "images.zip";
		String copyFilePath = "copy_images.zip";

		try (FileInputStream fis = new FileInputStream(originFilePath)) {
			try (FileOutputStream fos = new FileOutputStream(copyFilePath)) {
				int i;
				while ((i = fis.read()) != -1) {
					// System.out.println(i);
					fos.write(i);
				}
			} catch (Exception e) {
			}
		} catch (Exception e) {

		}

	}

}
