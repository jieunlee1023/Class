package ch02;

import java.util.Scanner;

public class MainTest1 {

	public static void main(String[] args) {

		MyComponents myComponents = new MyComponents();

		Scanner scanner = new Scanner(System.in);
		System.out.println("사용자 아이디를 입력해주세요.");
		String userInput = scanner.nextLine();
		System.out.println("userInput : " + userInput);

//		myComponents.textField.setText(userInput);
		myComponents.inputScannerData(userInput);

	} // end of main

}
