package ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.Gson;

public class HttpMainTest3 {

	public static void main(String[] args) {

		// http 통신을 하기 위해서 URL 객체를 만든다.
		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/photos/1");
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

			// JSON < --- 형식을 가지고 있는 문자열
			// GSON <--- 형식이 있기 때문에 어떠한 규칙으로 자바언어에서 편하게 사용 할 수 있는 코드를 미리 만들어 준 라이브러리
//			System.out.println(str.substring(80, 105)); // 5에서 10까지

			// JSON parsing
			Gson gson = new Gson();
			Photo photo = gson.fromJson(str, Photo.class);
			System.out.println(photo);
			
			System.out.println("---------------------");
			System.out.println(photo.albumId);
			System.out.println(photo.id);
			System.out.println(photo.title);
			System.out.println(photo.url);
			System.out.println(photo.thumbnailUrl);
			

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
