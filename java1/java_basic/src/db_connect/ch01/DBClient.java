package db_connect.ch01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBClient {

	// String url = jdbc:mysql://localhost:3306/
	// shopdb?serverTimezone=Asia/Seoul&characterEncoding=UTF-8
	private static final String DB_HOST = "localhost";
	private static final int DB_PORT = 3306;
	private static final String DB_DATABASE_NAME = "shopdb";
	private static final String DB_CHARSET = "UTF-8";
	private static final String DB_USER_NAME = "root";
	private static final String DB_PASSWORD = "asd1234";

	private static Connection conn = null; // 자바 개발자들이 만들어 준 클래스
	private static DBClient dbClient; // 사용자 정의 클래스

	// 외부에서 바로 생성을 막게 설계한다. (싱글톤패턴)
	private DBClient() {

	}
	public static DBClient getInstance() {
		// 동기화가 필요하다면 --> synchronized
		if (dbClient == null) {
			dbClient = new DBClient(); // 한번은 객체화 시켜줘야 사용가능함
		}
		return dbClient;
	}

	private static void unBindingDBClient() {
		// static 변수의 경우 static 메서드로 만들어주는 것이 공식임
		// 안 쓸 때 해지해주는 ~ 메서드~
		dbClient = null;
	}

	// Connection 연결
	public Connection getConnection() {
		// 방어적 코드
		if (conn == null) {

			String urlFormat = "jdbc:mysql://%s:%d/%s?serverTimezone=Asia/Seoul&characterEncoding=%s";
			String url = String.format(urlFormat, DB_HOST, DB_PORT, DB_DATABASE_NAME, DB_CHARSET);

			// MySQL JDBC 드라이버를 클래스로 로딩해서 DriverManager 클래스를 사용한다.
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection(url, DB_USER_NAME, DB_PASSWORD);
				System.out.println(">>> Connection Success <<<");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				System.out.println(">>> Connection Fail <<<");
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println(">>> Connection Fail <<<");
			}
		}
		return conn;
	}

	// Connection 해제
	public static void connectClose() {
		if (conn != null) {
			try {
				conn.close();
				System.out.println(">>> Connection Close Ok <<<");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			conn = null;
		}
	}

}
