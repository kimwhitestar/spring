package com.spring.springTest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
//@RequestMapping("/msg/{msgFlag}")
public class MessageController {

	@RequestMapping(value="/msg/{msgFlag}", method=RequestMethod.GET)
	public String msgGet(@PathVariable String msgFlag, Model m) {
		//@RequestParam (value = "name", defaultValue = "", required=false) String name
		System.out.println("msgFlag : " + msgFlag);
		
		if (msgFlag.equals("userInputOk")) {
			m.addAttribute("msg", "유저 등록됬습니다");
			m.addAttribute("url", "user/userList");
		} else if (msgFlag.equals("userUpdateOk")) {
			m.addAttribute("msg", "유저 수정됬습니다");
			m.addAttribute("url", "user/userList");
		}	else if (msgFlag.equals("userDeleteOk")) {
			m.addAttribute("msg", "유저 삭제됬습니다");
			m.addAttribute("url", "user/userList");
		} else if (msgFlag.equals("userLoginNo")) {
			m.addAttribute("msg", "아이디를 확인하세요");
			m.addAttribute("url", "user/userLogin");
		} else if (msgFlag.equals("userLogout")) {
			m.addAttribute("msg", "로그아웃됬습니다");
			m.addAttribute("url", "user/userLogin");
		} else if (msgFlag.equals("memberNo")) {
			m.addAttribute("msg", "로그인하면 사용할 수 있습니다");
			m.addAttribute("url", "user/userLogin");
		} else if (msgFlag.equals("levelLow")) {
			m.addAttribute("msg", "현재등급은 사용할 수 없습니다");
			m.addAttribute("url", "user/userLogin");
		} 
		
		return "include/message";
	}
	
//	@RequestMapping(value="/msgLogout/{msgFlag}/{name}", method=RequestMethod.GET)
//	public String msgLogoutGet(@PathVariable String msgFlag, @PathVariable String name, Model m) {
//		System.out.println("msgFlag : " + msgFlag);
//		System.out.println("name : " + name);
//		
//		if (msgFlag.equals("userLogout")) {
//			m.addAttribute("msg", name + "님 로그아웃됬습니다");
//			m.addAttribute("url", "user/userLogin");
//		}
//		
//		return "include/message";
//	}
}