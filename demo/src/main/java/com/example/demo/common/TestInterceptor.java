package com.example.demo.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.example.demo.dto.UserDto;

@Component
public class TestInterceptor implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) 
			throws Exception{
		System.out.println("TestInterceptor >>> " + request.getRequestURI());
		System.out.println(handler);
		// #1 무조건 통과
		// return true;
		
		// #2 로그인 여부
		HttpSession session = request.getSession();
		UserDto login = (UserDto) session.getAttribute("user");
		if(login == null) {
			response.sendRedirect("/login");
			return false;
		}
		return true;
		
	}
}
