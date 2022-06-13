package com.spring.springTest.service;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.spring.springTest.dao.UserDAO;
import com.spring.springTest.vo.UserVO;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDAO userDAO;
	
	@Override
	public ArrayList<UserVO> getUserList() {
		return userDAO.getUserList();
	}
	
	@Override
	public UserVO searchUser(int idx) {
		return userDAO.searchUser(idx);
	}

	@Override
	public void deleteUser(int idx) {
		userDAO.deleteUser(idx);
	}

	@Override
	public void insertUser(UserVO vo) {
		userDAO.insertUser(vo);
	}

	@Override
	public void updateUser(UserVO vo) {
		userDAO.updateUser(vo);
	}
}