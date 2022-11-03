package ch05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import ch01.Todo;

public class MainTest {

	public static void main(String[] args) {

		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/comments");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

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
			System.out.println("---------------------------------");

			Gson gson = new Gson();

			Type type = new TypeToken<ArrayList<Comments>>() {
			}.getType();
			ArrayList<Comments> comments = gson.fromJson(str, type);
			System.out.println(comments);

			for (Comments comments2 : comments) {
				System.out.println("--------------------------------------");
				System.out.println("변환 :");
				System.out.println(comments2.toString());
			}

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
