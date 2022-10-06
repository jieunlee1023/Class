package try_catch_ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MyException {

	String fileName;
	FileInputStream fileInputStream;

	// 예외에 따라서 처리가 필요 할 때 ..! (던져버림)
	public MyException(String name) throws IOException {
		this.fileName = name;
		readFile();
	}

	public String readFile() throws IOException {
		fileInputStream = new FileInputStream(fileName);
		Properties prop = new Properties();
		prop.load(fileInputStream);
		String strData = prop.getProperty("MYNAME");
		return strData;

	}

	public static void main(String[] args) {
		MyException exception;
		try {
			exception = new MyException("temp1");
			String resultTemp = exception.readFile();
			System.out.println(resultTemp);
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
