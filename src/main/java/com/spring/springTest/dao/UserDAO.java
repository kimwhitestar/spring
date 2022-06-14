package com.spring.springTest.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.spring.springTest.vo.UserVO;

public interface UserDAO {

	public ArrayList<UserVO> getUserList();

	public UserVO searchUser(@Param(value = "idx") int idx);
	
	public void deleteUser(@Param(value = "idx") int idx);

	public void insertUser(@Param(value = "vo") UserVO vo);

	public void updateUser(@Param(value = "vo") UserVO vo);

	public UserVO getMidCheck(@Param(value = "mid") String mid);
	
}