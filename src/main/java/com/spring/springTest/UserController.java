package com.spring.springTest;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.springTest.service.UserService;
import com.spring.springTest.vo.UserVO;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/userLogin", method=RequestMethod.GET)
	public String userLoginGet() {
		return "login/login";
	}
	
	@RequestMapping(value="/userLogin", method=RequestMethod.POST)
	public String userLoginPost(UserVO vo, HttpSession session) {
		int level = vo.getLevel();
		UserVO loginVo = userService.getMidCheck(vo.getMid());
		
		if (null == loginVo) {
			return "redirect:/msg/userLoginNo";
		} else {
			session.setAttribute("sMid", loginVo.getMid());
			session.setAttribute("sLevel", level);
			session.setAttribute("sName", loginVo.getName());
			return "member/memberMain";
		}
//		return "user/userMain";
	}

	@RequestMapping(value="/userLogout", method=RequestMethod.GET)
	public String userLogoutGet(HttpSession session, Model m, RedirectAttributes ra) {
		String name = (String) session.getAttribute("sName");
		ra.addAttribute("name", name);
		session.invalidate();//session 끊기
		
		return "redirect:/msg/userLogout";
//	return "redirect:/msgLogout/userLogout/"+name; //@PathVariable 2개 보내기?
	}
	
	@RequestMapping(value="/userList", method=RequestMethod.GET)
	public String userListGet(Model m) {
		m.addAttribute("vos", userService.getUserList());
		return "user/userList";
	}
	
	@RequestMapping(value="/deleteUser", method=RequestMethod.GET)
	public String deleteUser(int idx) {
		userService.deleteUser(idx);
//		return "redirect:/user/userList";
		return "redirect:/user/userDeleteOk";
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
		
		return "redirect:/msg/userInputOk";
		 //return "redirect:/user/userList";

		 /*controller에서 MessageController로 이동할 때만 
			'?'를 '!'처럼 사용자정의문자로 변경해서, split("!")으로 잘라서 읽어야 한다
		 //return "redirect:/msg!flagSw=inputOk";//get방식
		 //return "redirect:/msg?flagSw=inputOk";//get방식 */
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
//		return "redirect:/user/userList";
		return "redirect:/msg/userUpdateOk";
	}
}