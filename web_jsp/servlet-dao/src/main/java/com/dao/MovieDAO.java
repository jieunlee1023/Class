package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dto.MovieDTO;

public class MovieDAO {

	// 준비물
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	String url = "jdbc:mysql://localhost:3306/movies?serverTimezone=Asia/Seoul&characterEncoding=UTF-8";
	String dbUser = "root";
	String dbPw = "asd1234";
	String driverName = "com.mysql.cj.jdbc.Driver";

	public MovieDAO() {
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// DB 연결 처리
	// CRUD 처리
	public List<MovieDTO> selectMovie() {
		List<MovieDTO> list = new ArrayList();

		String query = "SELECT * FROM 영화 ";
		try {
			conn = DriverManager.getConnection(url, dbUser, dbPw);
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				MovieDTO dto = new MovieDTO();
				dto.set번호(rs.getString("번호"));
				dto.set이름(rs.getString("이름"));
				dto.set개봉연도(rs.getString("개봉연도"));
				dto.set매출액(rs.getString("매출액"));
				dto.set관객수(rs.getString("관객수"));
				dto.set평점(rs.getString("평점"));

				list.add(dto);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public MovieDTO selectMovieByTitle(String name) {
		
		MovieDTO dto = null;
		String query = "SELECT * FROM 영화 WHERE 이름 = ? ";
		System.out.println(name + "");
		
		try {
			conn = DriverManager.getConnection(url, dbUser, dbPw);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();


			while (rs.next()) {
				dto = new MovieDTO();
				dto.set번호(rs.getString("번호"));
				dto.set이름(rs.getString("이름"));
				dto.set개봉연도(rs.getString("개봉연도"));
				dto.set매출액(rs.getString("매출액"));
				dto.set관객수(rs.getString("관객수"));
				dto.set평점(rs.getString("평점"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dto;

	}

	public int insertMovie(MovieDTO dto) {

		int result = 0;
		String query = 
		"INSERT INTO 영화 (번호, 이름, 개봉연도, 매출액, 관객수, 평점) VALUES (?, ?, ?, ?, ?, ?)";
		
		String num = dto.get번호();
		String name = dto.get이름();
		String date = dto.get개봉연도();
		String totalPrice = dto.get매출액();
		String audience = dto.get관객수();
		String grade = dto.get평점();
		
		
		try {
			conn = DriverManager.getConnection(url, dbUser, dbPw);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, num);
			pstmt.setString(2, name);
			pstmt.setString(3, date);
			pstmt.setString(4, totalPrice);
			pstmt.setString(5, audience);
			pstmt.setString(6, grade);
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (pstmt != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return result;

	
		
	}

	public int updateMovie(MovieDTO dto) {
		int result = 0;
		String query = 
		"UPDATE 영화 SET 매출액 = ? WHERE 이름 = ? ";
		

		String totalPrice = dto.get매출액();
		String name = dto.get이름();
		
		try {
			conn = DriverManager.getConnection(url, dbUser, dbPw);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, totalPrice);
			pstmt.setString(2, name);
			result = pstmt.executeUpdate();
			System.out.println("result : " + result);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (pstmt != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return result;
		
	}

	public int deleteMovie(MovieDTO dto) {
		//DELETE FROM 영화 WHERE 이름 = ?;
		int result = 0;
		String query = 
		"DELETE FROM 영화 WHERE 이름 = ?";
		
		String name = dto.get이름();
		System.out.println("이름은 : " + name);
		
		try {
			conn = DriverManager.getConnection(url, dbUser, dbPw);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (pstmt != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return result;
		
	}

}
