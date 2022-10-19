package db_connect.ch02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {

	private static final String DB_HOST = "localhost";
	private static final int DB_PORT = 3306;
	private static final String DB_DATABASE_NAME = "nation";
	private static final String DB_CHARSET = "UTF-8";
	private static final String DB_USER_NAME = "root";
	private static final String DB_PASSWORD = "asd1234";

	private static Connection conn = null;
	private static DBHelper dbHelper;

	private DBHelper() {
	}

	public static DBHelper getInstance() {
		if (dbHelper == null) {
			dbHelper = new DBHelper();
		}
		return dbHelper;
	}

	private static void unBindingDBClient() {
		dbHelper = null;
	}

	public Connection getConnection() {
		if (conn == null) {
			String urlFormat = "jdbc:mysql://%s:%d/%s?serverTimezone=Asia/Seoul&characterEncoding=%s";
			String url = String.format(urlFormat, DB_HOST, DB_PORT, DB_DATABASE_NAME, DB_CHARSET);

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection(url, DB_USER_NAME, DB_PASSWORD);
				System.out.println("*** 연결 성공 ***");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				System.out.println("*** 연결 실패 ***");
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("*** 연결 실패 ***");
			}
		}
		return conn;
	}

	public static void connectClose() {
		if (conn != null) {

			try {
				conn.close();
				System.out.println("***연결 종료 성공***");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			conn = null;
		}

	}

}
