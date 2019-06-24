package com.olive.member.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.olive.member.service.MemberVO;

@Repository("MemberDAO")
public class MemberDAO {

	@Autowired
	private SqlSessionTemplate mybatis;
	
	public MemberDAO() {
		System.out.println(">> MemberDAO 객체 생성");
		
	}
	
	public void insertMember(MemberVO vo) {
		System.out.println(">> insertMember() 실행");
		mybatis.insert("MemberDAO.insertMember", vo);		
	}

	public void deleteMember(MemberVO vo) {
		System.out.println("===> deleteMember() 실행");
		mybatis.delete("MemberDAO.deleteMember", vo);
	}

	public void updateMember(MemberVO vo) {
		System.out.println("===> updateMember() 실행");
		mybatis.update("MemberDAO.updateMember", vo);
	}
	
	public List<MemberVO> getBoardList(MemberVO vo) {
		System.out.println("===> getBoardList() 실행");
		return mybatis.selectList("MemberDAO.getBoardList", vo);
	}

	public List<MemberVO> getMemberList(MemberVO vo) {
		System.out.println("===> getMemberList() 실행");
		return mybatis.selectList("MemberDAO.getMemberList", vo);
	}

}
