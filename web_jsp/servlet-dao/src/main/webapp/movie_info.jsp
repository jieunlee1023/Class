<%@page import="com.dto.MovieDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
body {
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
}

table {
	border: 1px solid red;
}
</style>
</head>
<body>

	<%
	ArrayList<MovieDTO> list = (ArrayList<MovieDTO>) request.getAttribute("movieList");
	//out.print("리스트 사이즈 : " + list.size());
	%>

	<table>
		<thead>
			<tr>
				<td>번호</td>
				<td>영화이름</td>
				<td>개봉연도</td>
				<td>매출액</td>
				<td>관객수</td>
				<td>평점</td>
			</tr>
		</thead>
		<tbody>
			<%
			for (int i = 0; i < list.size(); i++) {
			%>
			<tr>
				<td><%=list.get(i).get번호()%></td>
				<td><%=list.get(i).get이름()%></td>
				<td><%=list.get(i).get개봉연도()%></td>
				<td><%=list.get(i).get매출액()%></td>
				<td><%=list.get(i).get관객수()%></td>
				<td><%=list.get(i).get평점()%></td>

			</tr>
			<%
			}
			%>
		</tbody>
	</table>

</body>
</html>