package com.olive.board.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.olive.board.service.BoardVO;


@Repository("BoardDAO")
public class BoardDAO {

	@Autowired
	private SqlSessionTemplate mybatis;
	
	public BoardDAO() {
		System.out.println(">> BoardDAO 객체 생성");
		
	}
	
	public void insertBoard(BoardVO vo) {
		System.out.println(">> insertMember() 실행");
		mybatis.insert("BoardDAO.insertBoard", vo);		
	}

	public void deleteBoard(BoardVO vo) {
		System.out.println("===> deleteBoard() 실행");
		mybatis.delete("BoardDAO.deleteBoard", vo);
	}

	public void updateBoard(BoardVO vo) {
		System.out.println("===> updateBoardr() 실행");
		mybatis.update("BoardDAO.updateBoardr", vo);
	}
	
	public List<BoardVO> getBoardList(BoardVO vo) {
		System.out.println("===> getBoardList() 실행");
		return mybatis.selectList("BoardDAO.getBoardList", vo);
	}

}
