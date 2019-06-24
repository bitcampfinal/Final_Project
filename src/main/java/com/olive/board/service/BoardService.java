package com.olive.board.service;

import java.util.List;


public interface BoardService {
	//CRUD 기능 구현 메소드 정의
	void insertBoard(BoardVO vo);    //보드 추가
	void deleteBoard(BoardVO vo);    //보드 삭제 
	void updateBoard(BoardVO vo);   //보드 수정
	List<BoardVO> getBoardList(BoardVO vo);    //자신이 속한 보드 리스트 보기 
}
