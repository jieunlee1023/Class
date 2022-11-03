package ch04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import ch01.Todo;

public class HttpMainTest2 {

	public static void main(String[] args) {

		// http 통신을 하기 위해서 URL 객체를 만든다.
		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/todos");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			connection.setRequestMethod("GET"); // 연결 요청
			connection.connect(); // 연결 된 상태

			int statusCode = connection.getResponseCode();

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

			// 1.  gson.fromJson(str, Todo.class) ; // 리플렉션 기법
			
			// 2. JSON Parsing할 데이터 타입을 미리 정한다.
			
			Type type = new TypeToken<ArrayList<Todo>>() {}.getType(); 
			ArrayList<Todo> todos = gson.fromJson(str, type);
			System.out.println(todos);
			for (Todo todo : todos) {
				System.out.println("------------------------------");
				System.out.println("변환 : " );
				System.out.println(todo.toString());
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
