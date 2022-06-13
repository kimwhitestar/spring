package com.spring.springTest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/tiles")
public class TilesController {
	
	//로그인 처리
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginGet() {
		return "login/login";
	}
	
	//메인화면 처리
	@RequestMapping(value="/memberMain", method=RequestMethod.GET)
	public String memberMainPost() {
		return "member/memberMain";
	}
	
}