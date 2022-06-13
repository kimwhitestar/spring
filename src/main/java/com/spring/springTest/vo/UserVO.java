package com.spring.springTest.vo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import lombok.Data;

public @Data class UserVO {
	/*hibernate validator 체크*/
	private int idx;    

	@NotNull(message="아이디를 입력하세요?")
	@Length(min=4, max=20, message="아이디는 4자 ~ 20글자로 입력하세요")
	@Pattern(regexp = "", message="입력규칙위반")
	private String mid;    
	
	@NotNull(message="이름을 입력하세요?")
	@Length(min=3, max=20, message="이름은 3자 ~ 20글자로 입력하세요")
	@Pattern(regexp = "", message="입력규칙위반")
	private String name;   
	
	@Range(min=20, max=99, message="나이는 20~99세까지 가입 가능합니다")
	private int age;    
	
	@NotNull(message="주소를 입력하세요?")
	@Length(min=1, max=20, message="주소는 1자 ~ 20글자로 입력하세요")
	@Pattern(regexp = "", message="입력규칙위반")
	private String address;
}