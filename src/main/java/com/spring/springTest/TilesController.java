package com.spring.springTest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/tiles")
public class TilesController {
	
//	//로그인 처리
//	@RequestMapping(value="/user/userLogin", method=RequestMethod.GET)
//	public String userLoginGet() {
//		return "login/login";
//	}
	
//	//로그아웃 처리
//	@RequestMapping(value="/user/userLogout", method=RequestMethod.GET)
//	public String userLogout() {
//		return "login/login";
//	}
	
//	//메인화면 처리
//	@RequestMapping(value="/member/memberMain", method=RequestMethod.GET)
//	public String memberMainGet() {
//		return "member/memberMain";
//	}
	
	//방명록
	@RequestMapping(value="/guest/guestList", method=RequestMethod.GET)
	public String guestListGet() {
		return "guest/guestList";
	}
	
	//게시판
	@RequestMapping(value="/board/boardList", method=RequestMethod.GET)
	public String boardListGet() {
		return "board/boardList";
	}
	
//	//게시판 내용
//	@RequestMapping(value="/board/boardContent", method=RequestMethod.GET)
//	public String boardContent() {
//		return "board/boardContent";
//	}
	
	//PDS
	@RequestMapping(value="/pds/pdsList", method=RequestMethod.GET)
	public String pdsListGet() {
		return "pds/pdsList";
	}
	
	//유저목록
	@RequestMapping(value="/user/userList", method=RequestMethod.GET)
	public String userListGet() {
		return "user/userList";
	}
}