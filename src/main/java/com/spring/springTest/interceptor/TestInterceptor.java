package com.spring.springTest.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class TestInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, 
		Object handler) throws Exception {
		System.out.println("");
		System.out.println("이곳은 최초로 만나는 TestInterceptor의 preHandle메소드");

		
		
		//return super.preHandle(request, response, handler);
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, 
		Object handler, ModelAndView modelAndView) throws Exception {
		System.out.println("");
		System.out.println("이곳은 최초로 만나는 TestInterceptor의 postHandle메소드");
		
		
		
		super.postHandle(request, response, handler, modelAndView);
	}
	
	
}

//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//]import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.ModelAndView;
//public class TestInterceptor implements HandlerInterceptor {
//
//	//컨트롤러 들어가기 전 수행
//	@Override
//	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//		return false;
//	}
//
//	//컨트롤러 실행 후 수행
//	@Override
//	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
//			ModelAndView modelAndView) throws Exception {
//	}
//
//	//view 갔다와서 수행
//	@Override
//	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
//			throws Exception {
//	}
//}