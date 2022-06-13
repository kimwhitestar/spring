package com.spring.springTest.vo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import lombok.Data;

public @Data class ValidatorVO {
	/* hibernate validator 체크
	 @Digits(Integer=, fraction=) : @숫자(정수, 소수이하자릿수)
	 @Pattern(regex=, flag=)	: 정규식 처리
	 @Past() : 과거 날짜?, @Future : 미래 날짜?
	 @Size() : 요청값 길이 체크
	 @Range() : 요청값 범위 체크
	 */
	
	@NotNull(message="아이디를 입력하세요?")
	@Length(min=4, max=20, message="아이디는 4자 ~ 20글자로 입력하세요")
	@Pattern(regexp = "", message="입력규칙위반")
	private String mid;

	@NotNull(message="비밀번호를 입력하세요?")
	@Length(min=4, max=20, message="비밀번호는 4자 ~ 20글자로 입력하세요")
	@Pattern(regexp = "", message="입력규칙위반")
	private String pwd;

	@Range(min=20, max=99, message="나이는 20~99세까지 가입 가능합니다")
	private int age;
}