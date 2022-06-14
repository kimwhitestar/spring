package com.spring.springTest.interceptor;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class GuestInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle( HttpServletRequest request, HttpServletResponse response, 
		Object handler ) throws Exception {
		System.out.println("");
		System.out.println("이곳은 GuestInterceptor의 preHandle메소드");

		HttpSession session = request.getSession();
		int sLevel = session.getAttribute("sLevel")==null?99:Integer.parseInt((String)session.getAttribute("sLevel"));
		
		if (4 < sLevel) { //준회원 : 4, 비회원 : 99
			RequestDispatcher dispatcher = request.getRequestDispatcher("/msg/memberNo");
			dispatcher.forward(request, response);
			return false; //컨트롤러로 안가도록 Interceptor처리됨. (모든 메뉴 접근 금지)
		}
		
		return true;
	}

	@Override
	public void postHandle( HttpServletRequest request, HttpServletResponse response, 
		Object handler, ModelAndView modelAndView ) throws Exception {
		System.out.println("");
		System.out.println("이곳은 GuestInterceptor의 postHandle메소드");
		
		
		
		super.postHandle(request, response, handler, modelAndView);
	}
	
	
}