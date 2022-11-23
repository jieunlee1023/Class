package com.boot.mroot;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ms1")
public class MyServlet extends HttpServlet {
	// Servlet 자바 언어로 동적인 web 서비스 언어를 만들어주는 것
	private static final long serialVersionUID = 1L;

	public MyServlet() {
		super();
	}
	
	// request, response 객체는 웹 컨테이너가 먼저 만들어 주는 녀석이다.
	// get 요청시 콜백 반응

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println(request);
		System.out.println(response);
		
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head>");
		out.print("<style>");
		out.print("p { color: red; font-size : 80px;}");
		out.print("</style>");
		out.print("</head>");
		out.print("<body>");
		out.print("<p> Hello First Servlet ~ </p>");
		out.print("</body>");
		out.print("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		doGet(request, response);
		System.out.println("여기는 Post 방식으로 접근했어요!!!");
	}

}
