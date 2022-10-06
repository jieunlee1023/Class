package com.boot.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//UserInfoClient 코드를 개발하는 개발자는
// 인터페이스만 보고 코드를 구현할 수 있다.
public class UserInfoClient2 {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("a");
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());

			System.out.println("파일을 잘 찾았습니다.");

			// fis 상태는 파일과 연결된 상태이기 때문에 접근해서 글자를 읽을 수 있다.
			// 글자들을 읽는 방법은 여러가지가 있다.
			Properties prop = new Properties();
			prop.load(fis);

//			String dbType = prop.getProperty("DB_TYPE"); // key
//			System.out.println("DB_TYPE : " + dbType); // value 구조
//
//			String dbType2 = prop.getProperty("DB_TYPE2"); // key
//			System.out.println("DB_TYPE : " + dbType2); // value 구조

			String dbType = prop.getProperty("DB_TYPE"); // key
			IUserInfoDao dao;
			if (dbType.equals("ORACLE")) {
				dao = new UserInfoOracleDao();
			} else if (dbType.equals("MYSQL")) {
				dao = new UserInfoMySqlDao();
			} else {
				dao = new UserInfoMsSqlDao();
			}
			
			//1. 저장하기
			//스캐너를 통해서 데이터를 받고
			UserInfo userInfo = new UserInfo("110", "abc", "홍길동");
			dao.insertUserInfo(userInfo);

		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("요청하신 파일 이름이 없네요!");
		}

	}// end of main

}// end of class
