package com.spring.springTest.service;

import java.util.ArrayList;

import com.spring.springTest.vo.UserVO;

public interface UserService {
	public ArrayList<UserVO> getUserList();
	public UserVO searchUser(int idx);
	public void deleteUser(int idx);
	public void insertUser(UserVO vo);
	public void updateUser(UserVO vo);
	public UserVO getMidCheck(String mid);
}