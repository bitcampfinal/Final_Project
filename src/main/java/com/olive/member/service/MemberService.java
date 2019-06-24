package com.olive.member.service;

import java.util.List;



public interface MemberService {
	//CRUD 기능 구현 메소드 정의
	void insertMember(MemberVO vo); //보드 멤버 추가 
	void deleteMember(MemberVO vo); //보드 멤버 삭제
	void updateMember(MemberVO vo); //보드 멤버 수정
	List<MemberVO> getBoardList(MemberVO vo);    //자신이 속한 보드 리스트 보기 
	List<MemberVO> getMemberList(MemberVO vo);   //보드의 멤버보기 
}
