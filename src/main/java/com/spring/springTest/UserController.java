package com.spring.springTest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.springTest.service.UserService;
import com.spring.springTest.vo.UserVO;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/userList", method=RequestMethod.GET)
	public String userListGet(Model m) {
		m.addAttribute("vos", userService.getUserList());
		return "user/userList";
	}
	
	@RequestMapping(value="/deleteUser", method=RequestMethod.GET)
	public String deleteUser(int idx) {
		userService.deleteUser(idx);
		return "redirect:/user/userList";
	}
	
	@RequestMapping(value="/insertUser", method=RequestMethod.GET)
	public String insertUser() {
		return "user/insertUser";
	}
	
	@RequestMapping(value="/insertUser", method=RequestMethod.POST)
	public String insertUser(Model m, 
			@Validated UserVO vo, BindingResult bindRes) { //vo와 bindRes는 붙여서 model뒤에 순서대로 써야한다
		
		System.out.println("vo : " + vo);
		System.out.println("error : " + bindRes.hasErrors());
		
		if (! bindRes.hasErrors()) {
			List<ObjectError> list = bindRes.getAllErrors();
			for(ObjectError e: list) {
				System.out.println("[ 에러메세지 ] : " + e.getDefaultMessage());
				return "redirect:/user/insertUser";
			}
		}		
		
		userService.insertUser(vo);
		return "redirect:/user/userList";
	}
	
	@RequestMapping(value="/updateUser", method=RequestMethod.GET)
	public String updateUser(UserVO vo, Model m) {
		m.addAttribute("vo", userService.searchUser(vo.getIdx()));
		return "user/updateUser";
	}
	
	@RequestMapping(value="/updateUser", method=RequestMethod.POST)
	public String updateUser(Model m, 
			@Validated UserVO vo, BindingResult bindRes) { //vo와 bindRes는 붙여서 model뒤에 순서대로 써야한다
		
		System.out.println("vo : " + vo);
		System.out.println("error : " + bindRes.hasErrors());
		
		if (! bindRes.hasErrors()) {
			List<ObjectError> list = bindRes.getAllErrors();
			for(ObjectError e: list) {
				System.out.println("[ 에러메세지 ] : " + e.getDefaultMessage());
				return "redirect:/user/insertUser";
			}
		}		
		
		userService.updateUser(vo);
		return "redirect:/user/userList";
	}
}