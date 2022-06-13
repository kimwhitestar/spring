package com.spring.springTest.vo;

import lombok.Data;

//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;

//@Getter
//@Setter
//@ToString
//위의 3개 어노테이션과 같은 어노테이션 => @Data
public @Data class DddVO {
	private int idx; 
	private String mid; 
	private String pwd; 
	private String name;
	private int age;
}