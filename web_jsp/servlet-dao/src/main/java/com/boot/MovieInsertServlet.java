package com.boot;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.MovieDAO;
import com.dto.MovieDTO;

@WebServlet("/moviesave")
public class MovieInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MovieInsertServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// 요청 처리
		request.setCharacterEncoding("UTF-8");

		// 응답처리
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		MovieDTO dto = new MovieDTO();
		dto.set번호(request.getParameter("num"));
		dto.set이름(request.getParameter("name"));
		dto.set개봉연도(request.getParameter("date"));
		dto.set매출액(request.getParameter("totalPrice"));
		dto.set관객수(request.getParameter("audience"));
		dto.set평점(request.getParameter("grade"));

		MovieDAO dao = new MovieDAO();
		int result = dao.insertMovie(dto);

		if (result == 1) {
			out.print("정상 등록되었습니다");
		} else {
			out.print("잘못 입력되었습니다.");
		}

	}

}
