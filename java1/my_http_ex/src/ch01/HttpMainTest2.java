package ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.Gson;

public class HttpMainTest2 {

	public static void main(String[] args) {

		// http 통신을 하기 위해서 URL 객체를 만든다.
		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/todos/1");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			connection.setRequestMethod("GET"); // 연결 요청
			connection.connect(); // 연결 된 상태

			int statusCode = connection.getResponseCode();
			System.out.println("statusCode : " + statusCode);

			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			StringBuffer sb = new StringBuffer();
			String line = null;

			if (statusCode == 200) {
				while ((line = reader.readLine()) != null) {
					sb.append(line + "\n");
				}
			}
			String str = sb.toString();
			System.out.println(str);
			System.out.println("------------------------------");

			// JSON parsing
			Gson gson = new Gson();
			Todo todo = gson.fromJson(str, Todo.class);
			System.out.println(todo);
			System.out.println("------------------------------");

			System.out.println(todo.userId);
			System.out.println(todo.id);
			System.out.println(todo.title);
			System.out.println(todo.completed);

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
