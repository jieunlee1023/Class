<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<!-- 여기 페이지에서 예외가 발생한다면 어디로 이동하라고 지정 가능 하다. -->
	
	<%@ page errorPage="errorpage.jsp" %>
	
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%!String imgDir;
	String testServer;
	String realServer;
	String str;
	%>

	<%
	imgDir = application.getInitParameter("imgDir");
	testServer = application.getInitParameter("testServer");
	realServer = application.getInitParameter("realServer");

	//setAttribute와 getAttribute 사용해보기
	//application.setAttribute(name, object);
	getServletContext().setAttribute("mySqlServerIP", "177.1.23.12");
	getServletContext().setAttribute("mySqlUser", "root");
	%>

	testServer :
	<%=testServer%>
	<br> realServer :
	<%=realServer%>
	<div>
		<img alt="" src="<%=imgDir%>/sanrio.png">
	</div>

	<!-- GET,SET 사용 -->
	<p>
		sqlIP :
		<%=getServletContext().getAttribute("mySqlServerIP")%></p>
	<p>
		mySqlUser :
		<%=getServletContext().getAttribute("mySqlUser")%></p>
		
		<%
		//response.sendRedirect("myapp2.jsp");
		out.print(str.toString());
		%>
</body>
</html>

