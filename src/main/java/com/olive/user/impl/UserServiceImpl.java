package com.olive.user.impl;

import org.springframework.stereotype.Service;

import com.olive.user.service.UserService;
import com.olive.user.service.UserVO;

import org.springframework.beans.factory.annotation.Autowired;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDAO userDAO;
	
	public UserServiceImpl() {
		System.out.println(">> UserServiceImpl 객체 생성");
	}
	
	@Override
	public void insertUser(UserVO vo) {
		userDAO.insertUser(vo);
	}

	@Override
	public void updateUser(UserVO vo) {
		userDAO.updateUser(vo);
	}
	
	@Override
	public void deleteUser(UserVO vo) {
		userDAO.deleteUser(vo);
	}

	@Override
	public UserVO getUser(UserVO vo) {
		return userDAO.getUser(vo);
	}
	

}
