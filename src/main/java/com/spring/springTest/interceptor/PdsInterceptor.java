package com.spring.springTest.interceptor;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class PdsInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle( HttpServletRequest request, HttpServletResponse response, 
		Object handler ) throws Exception {
		System.out.println("");
		System.out.println("이곳은 PdsInterceptor의 preHandle메소드");

		HttpSession session = request.getSession();
		int sLevel = session.getAttribute("sLevel")==null?99:Integer.parseInt((String)session.getAttribute("sLevel"));
		
		if (2 < sLevel) { //우수회원 : 2
			RequestDispatcher dispatcher = request.getRequestDispatcher("/msg/levelLow");
			dispatcher.forward(request, response);
			return false; //컨트롤러로 안가도록 Interceptor처리됨. (모든 메뉴 접근 금지)
		}
		
		return true;
	}

	@Override
	public void postHandle( HttpServletRequest request, HttpServletResponse response, 
		Object handler, ModelAndView modelAndView ) throws Exception {
		System.out.println("");
		System.out.println("이곳은 PdsInterceptor의 postHandle메소드");
		
		
		
		super.postHandle(request, response, handler, modelAndView);
	}
	
	
}