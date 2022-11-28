package com.boot.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.tomcat.util.http.fileupload.RequestContext;

@WebServlet("/loginProc")
public class LoginProc extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginProc() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String mId = request.getParameter("mId");
		String mPw = request.getParameter("mPw");

		Cookie[] cookies = request.getCookies();
		Cookie serverCookie = null;

		
		for (Cookie reqCookie : cookies) {
			System.out.println("req-Cookie" + reqCookie);
			System.out.println("cookie name :" + reqCookie.getName());
			System.out.println("cookie value" + reqCookie.getValue());

			if (reqCookie.getName().equals("memberId")) {
				serverCookie = reqCookie;
			}
		}
		if (serverCookie == null) {
			System.out.println("내가 생성한 쿠키가 없다면 다시 만듭니다.");
			serverCookie = new Cookie("memberId", mId);
		}
		serverCookie.setMaxAge(60 * 60);
		response.addCookie(serverCookie);
		response.sendRedirect("home.jsp");

	

		
		// 체크박스
		String isSaveId = request.getParameter("isSaveId");
		System.out.println(isSaveId+"<<<<<<<<<<<<<<<<<");
		// check : on , not check : null
		if(isSaveId == null) {
			System.out.println("isSaveId : " + isSaveId);
			for(Cookie c:cookies) {
				System.out.println("c name  : " + c.getName());
				// memberId --> 시간을 0으로 돌리고 다시 response에 담아준다.
				c.setMaxAge(0); // 초단위 : 0으로하면 삭제 효과
				response.addCookie(c);
			}
		} else {
			// 쿠키 저장 코드 why (기억하라고 허락했음)
			serverCookie = new Cookie("memberId", mId);
			response.addCookie(serverCookie);
		}
		response.sendRedirect("home.jsp");
		
	}

}