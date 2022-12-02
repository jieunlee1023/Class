<%@page import="java.sql.ResultSet"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.naming.InitialContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	//톰캣 서버에서 자원을 찾기 위해 InitialCntext 인스턴스 생성
	InitialContext initialContext = new InitialContext();
	//lookup() 메소드로 JNDI 이름으로 등록되어 있는 서버 자원을 찾음
	DataSource dataSource = (DataSource) initialContext.lookup("java:comp/env/jdbc/mysqlDB");

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String query = "SELECT * FROM 영화 ";
	// 커넥션 풀에 rent해서 데이터 베이스 연결 객체를 가지고 온다.
	conn = dataSource.getConnection();
	pstmt = conn.prepareStatement(query);
	rs = pstmt.executeQuery();

	while (rs.next()) {
		out.print(rs.getString("이름"));
		out.print("<br>");
	}
	%> 

	<h3>
		<a href="/boot/movieInfo">1. 영화 정보 전체조회하기</a>
	</h3>
	<h3>2. 영화 정보 선택 조회하기</h3>
		<div>
			<form action="/boot/movieinfobytitle" method="get">
				조회 하실 영화이름 : <input type="text" name="name"> <br> 
				<input type="submit" value="조회하기">
			</form>
		</div>
	<h3>3. 영화 정보 등록하기</h3>
		<div>
			<form action="/boot/moviesave" method="post">
				영화번호 : <input type="text" name="num"> <br> 
				영화이름 : <input type="text" name="name"> <br> 
				개봉연도 : <input type="text" name="date"> <br> 
				매출액 : <input type="text" name="totalPrice"> <br> 
				관객수 : <input type="text"name="audience"> <br> 
				평점 : <input type="text" name="grade"> <br> 
				<input type="submit" value="등록하기">
			</form>
		</div>

	<br>
	<h3>4. 영화 정보 수정하기</h3>
	<div>
		<form action="/boot/movieupdate" method="post">
			수정 할 영화이름 : <input type="text" name="name"> <br> 
			수정 할 매출액 : <input type="text" name="totalPrice"> <br> 
			<input type="submit" value="수정하기">
		</form>
	</div>

	<br>
	<h3>5. 영화 정보 삭제하기</h3>
	<div>
		<form action="/boot/moviedelete" method="post">
			삭제 할 영화이름 : <input type="text" name="name"> <br> 
			<input type="submit" value="삭제하기">
		</form>
	</div>

</body>
</html>