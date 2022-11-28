package com.boot.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println(">>>필터 초기화 하는 부분");
	}

	// 보통 실제 동작을 구현하는 부분
	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("필터 동작1");
		req.setCharacterEncoding("UTF-8");
		chain.doFilter(req, res);
		System.out.println("필터 동작2");
		System.out.println("-------------------------------");
		res.setContentType("text/html; charset=UTF-8");
		
	}

	// 필터 종료시 
	@Override
	public void destroy() {
		System.out.println(">>>필터 종료");
	}

}
