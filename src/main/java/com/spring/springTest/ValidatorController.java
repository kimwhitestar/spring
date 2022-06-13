package com.spring.springTest;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.springTest.vo.ValidatorVO;

@RequestMapping("/validator")
public class ValidatorController {
	@RequestMapping(value="/validatorFormGet", method=RequestMethod.GET)
	public String validatorFormGet() {
		
		return "validator/validatorForm";
	}
	
	@RequestMapping(value="/validatorFormPost", method=RequestMethod.POST)
	public String validatorFormPost(Model m, 
			@Validated ValidatorVO vo, BindingResult bindRes) { //vo와 bindRes는 붙여서 model뒤에 순서대로 써야한다
//		if (vo.getMid().equals("")) {
//			System.out.println("아이디 오류~~~");
//			//return "validator/validatorForm";
//			m.addAttribute("errMid", "no");//?????
//			//return "redirect:/validator/validatorForm?errMid=no";
//			return "redirect:/validator/validatorForm";
//		}
		
		System.out.println("vo : " + vo);
		System.out.println("아이디 : " + vo.getMid());
		System.out.println("비밀번호 : " + vo.getPwd());
		System.out.println("나이 : " + vo.getAge());
		System.out.println("error : " + bindRes.hasErrors());
		
		if (! bindRes.hasErrors()) {
			List<ObjectError> list = bindRes.getAllErrors();
			for(ObjectError e: list) {
				System.out.println("[ 에러메세지 ] : " + e.getDefaultMessage());
				return "redirect:/validator/validatorForm";
			}
		}
		
		m.addAttribute("vo", vo);
		
		return "validator/validatorFormOk";
	}
	
}