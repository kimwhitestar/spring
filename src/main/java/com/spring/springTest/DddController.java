package com.spring.springTest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.springTest.vo.DddVO;

@Controller
@RequestMapping("/ddd")
public class DddController {
	
	@RequestMapping(value="/dddMain", method=RequestMethod.POST)
	public String dddMainPost(DddVO vo, Model model) {
		vo.setMid("hkd1234");
		vo.setName("홍길동");
		vo.setAge(25);
		
		model.addAttribute(vo);
		return "ddd/dddMain";
	}
}