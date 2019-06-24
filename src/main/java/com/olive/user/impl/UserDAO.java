package com.olive.user.impl;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.olive.user.service.UserVO;

@Repository("UserDAO") //회원가입DAO
public class UserDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public UserDAO() {
		System.out.println(">> UserDAOMybatis 객체 생성");
	}
	//회원가입(INSERT)
	public void insertUser(UserVO vo) {
		System.out.println("===> insertUser() 실행");
		mybatis.insert("UserDAO.insertUser", vo);
	}
	
	//회원정보 수정
	public void updateUser(UserVO vo) {
		System.out.println("===> updateUser() 실행");
		mybatis.insert("UserDAO.updateUser", vo);
	}
	
	//회원 탈퇴
	public void deleteUser(UserVO vo) {
		System.out.println("===> UserDAO로 deleteUser() 실행");
		mybatis.delete("UserDAO.deleteUser", vo);
	}
	
	//회원정보 조회
	public UserVO getUser(UserVO vo) {
		System.out.println("===> getUser() 실행");
		return mybatis.selectOne("UserDAO.getUser", vo);
	}
	
}
