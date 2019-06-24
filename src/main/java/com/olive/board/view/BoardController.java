package com.olive.board.view;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.olive.board.service.BoardService;
import com.olive.board.service.BoardVO;

@Controller
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	@RequestMapping("/insertBoard.do") //보드 멤버 가입
	public String insertBoard(BoardVO vo) {
		
		System.out.println(">> 보드 멤버 추가");
		System.out.println("전달받은 vo: " + vo);
		
		boardService.insertBoard(vo);
		return "//";
	}
	
	@RequestMapping("/updateBoard.do") //보드멤버의 권한 수정
	public String updateBoard(BoardVO vo) {
		
		System.out.println(">> 보드 권한 수정");
		System.out.println("전달받은 vo: " + vo);
		
		boardService.updateBoard(vo);
		return "//";
	}
	
	@RequestMapping("/deleteBoard.do") //보드 멤버 삭제 
	public String deleteBoard(BoardVO vo) {
		
		System.out.println(">> 보드 멤버 삭제 ");
		System.out.println("전달받은 vo: " + vo);
		
		boardService.deleteBoard(vo);
		return "//";
	}
	
	
	@RequestMapping("/getBoardList.do") //자기 보드 리스트 조회
	public String getBoardList(BoardVO vo, Model model) {
		System.out.println(">>> getBoardList()");

		List<BoardVO> boardList = boardService.getBoardList(vo);
		
		model.addAttribute("boardList", boardList);
		
		return "//";
	}	
	
	
}
