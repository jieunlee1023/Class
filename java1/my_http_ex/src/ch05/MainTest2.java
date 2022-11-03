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

public class MainTest2 {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/users");
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
			System.out.println("---------------------------------");

			Gson gson = new Gson();

			Type type = new TypeToken<ArrayList<Users>>() {
			}.getType();
			ArrayList<Users> users = gson.fromJson(str, type);
			System.out.println(users);

			for (Users users2 : users) {
				System.out.println("--------------------------------------");
				System.out.println("변환 :");
				System.out.println(users2.toString());
			}

			System.out.println("--------------------------------------");
			String userName = users.get(2).username;
			System.out.println("username : " + userName);

			String ing = users.get(2).address.geo.lng;
			System.out.println("Ing : " + ing);

			String companyName = users.get(2).company.name;
			System.out.println("companyName : " + companyName);

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
