package com.olive.user.service;

public interface UserService {
	//CRUD 기능 구현 메소드 정의
	void insertUser(UserVO vo); //회원가입
	void deleteUser(UserVO vo); //회원탈퇴 
	void updateUser(UserVO vo); //회원정보 수정
	UserVO getUser(UserVO vo);  //회원정보 조회
	
}
