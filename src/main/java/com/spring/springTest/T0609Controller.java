package com.spring.springTest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.servlet.ModelAndView;

import t0609.Test8VO;

@Controller
@RequestMapping("/t0609") //중간경로 (매핑주소 컨텍스트경로'/t0609' + 메소드 쪽의 디스패처경로'/t1')
public class T0609Controller {
	
	
	@RequestMapping("/tet1")//defualt doGet방식
	public String test1Get() {
		return "0609/test1";
	}
	
	@RequestMapping(value="/test1", method=RequestMethod.POST)
	public String test1Post() {
		return "/0609/test1";
	}
	
	@RequestMapping(value="/t1", method=RequestMethod.POST)
	public String t1Post() {
		return "0609/test1";
	}
	
	//매핑주소를 여러개 줘도 가능
	@RequestMapping(value= {"/tst1", "/tt1"}, method=RequestMethod.POST)
	public String ttPost() {
		return "0609/test1";
	}
	
	@RequestMapping(value="/test2", method=RequestMethod.POST)
	public String test2Post() {
		return "/0609/test2";
	}
	
	@RequestMapping(value="/t2", method=RequestMethod.POST)
	public String test2Post(HttpServletRequest request) {
		request.setAttribute("name", "홍길동");
		request.setAttribute("age", "30");
		return "/0609/test2";
	}
	
	@RequestMapping(value="/tt2", method=RequestMethod.POST)
	public String tt2Post(HttpServletRequest request) {
		String job = request.getParameter("job");
		String office = request.getParameter("office");
		
		request.setAttribute("name", "홍길동");
		request.setAttribute("age", "30");
		
		request.setAttribute("joboffice", job + office);
		return "/0609/test2"; //이동할 jsp주소 (servlet-context.xml네 정의된 앞뒤주소 사이에 넣을 주소명 기재)
	}
	
	@RequestMapping(value="/test2-5", method=RequestMethod.POST)
	public String tt25Post(HttpSession session) {
		session.setAttribute("name", "홍길동");
		session.setAttribute("age", "30");
		session.setAttribute("joboffice", "아직없음");
		return "/0609/test2"; //1.이동할 jsp주소 (servlet-context.xml네 정의된 앞뒤주소 사이에 넣을 주소명 기재)
	}
	
	@RequestMapping(value="/test2-5-5", method=RequestMethod.POST)
	public String t255Post(HttpSession session) {
		session.invalidate();
		return "redirect:/t0609/test2-5"; //2.매핑중간경로URL로 이동하는 방법(jsp가 아님)
	}

	@RequestMapping(value="/test5", method=RequestMethod.GET)
	public String test5Get() {
		return "0609/test5";//처음에 웹에서 주소쳐서 올 jsp주소
	}
	
	@RequestMapping(value="/test5_1", method=RequestMethod.POST)
	public String test5_1Post(HttpServletRequest request) {
		String job = request.getParameter("job");
		String office = request.getParameter("office");
		
		request.setAttribute("joboffice", job + office);
		
		return "0609/test5";//submit해서 올 jsp주소
	}
	
	@RequestMapping(value="/test8", method=RequestMethod.GET)
	public String test8Post() {
		return "0609/test8";//처음에 웹에서 주소쳐서 올 jsp주소
	}
	@RequestMapping(value="/test8_1", method=RequestMethod.POST)
	public String test8_1Post(HttpServletRequest request, String job, String office) {//request.getParameter("job")과 같음, 이름 바꾸면 안됨
//		String job = request.getParameter("job");
//		String office = request.getParameter("office");
		return "0609/test8";
	}

	@RequestMapping(value="/test8_2", method=RequestMethod.POST)
	public String test8_2Post(HttpServletRequest request, 
			@RequestParam("job") String j, //@RequestParam기재시에는 매개변수명 바꿔도 됨
			@RequestParam("office") String o) {
//		String job = request.getParameter("job");
//		String office = request.getParameter("office");
		return "0609/test8";
	}
	
	@RequestMapping(value="/test8_3", method=RequestMethod.POST)
	public String test8_3Post(Model model, Test8VO vo) {//jsp파라미터와 vo가 같아야만 model과 vo로 연결해서 받음
		model.addAttribute("vo", vo);
		return "0609/test8";
	}
	
	@RequestMapping(value="/test8_3_1", method=RequestMethod.POST)
	public String test8_3_1Post(HttpServletRequest request, Test8VO vo) {//jsp파라미터와 vo가 같아야만 request와 vo로 연결해서 받음
		request.setAttribute("vo", vo);
		vo.setId(vo.getId()+"security1");
		vo.setPassword(vo.getPassword()+"security1");
		vo.setEmail(vo.getEmail()+"security1");
		return "0609/test8";
	}
	
	@RequestMapping(value="/test8_3_2", method=RequestMethod.POST)
	public String test8_3_2Post(
			Model model, Test8VO vo
			) {//jsp파라미터와 vo가 같아야만 request와 vo로 연결해서 받음
		
		vo.setId(vo.getId()+"security2");
		vo.setPassword(vo.getPassword()+"security2");
		vo.setEmail(vo.getEmail()+"security2");
		
		model.addAttribute("vo", vo);
		return "0609/test8";
	}

//	@RequestMapping(value="/test8_3_3", method=RequestMethod.POST)
//	public ModelAndView test8_3_3Post(@ModelAndView(vo="Test8VO") mv) {//이러면 안될까요?
//		vo.setId(vo.getId()+"security2");
//		vo.setPassword(vo.getPassword()+"security2");
//		vo.setEmail(vo.getEmail()+"security2");
//		
//		mv.setViewName("0609/test8");
//		mv.addAttribute("vo", vo);
//		return mv;
//	}
	
	@RequestMapping(value="/test8_3_5", method=RequestMethod.POST)
	public ModelAndView test8_3_5Post(ModelAndView mv, String id, String password, String email) {
		mv.addObject("id", id + "security");
		mv.addObject("password", password + "security");
		mv.addObject("email", email + "security");
		mv.setViewName("0609/test8");
		return mv;
	}

	@RequestMapping(value="/test8_3_10", method=RequestMethod.POST)
	public ModelAndView test8_3_10Post(ModelAndView mv, Test8VO vo) {
		vo.setId(vo.getId()+"security3");
		vo.setPassword(vo.getPassword()+"security3");
		vo.setEmail(vo.getEmail()+"security3");

		mv.addObject("vo", vo);
		mv.setViewName("0609/test8");
		return mv;
	}
	
//	@RequestMapping(value="/test8_3_11", method=RequestMethod.GET)
//	public String test8_3_11Post(Model model, 
//		@RequestParam(id="id", defaultValue="", required=true) String id,
//		@RequestParam(password="password", defaultValue="", required=true) String password,
//		@RequestParam(email="email", defaultValue="", required=true) String email) {
//
//		model.addAttribute("id", id+"security5");
//		model.addAttribute("password", password+"security5");
//		model.addAttribute("email", email+"security5");
//
//		return "0609/test8";
//	}
}