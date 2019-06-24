package com.olive.member.view;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.olive.member.service.MemberService;
import com.olive.member.service.MemberVO;

@Controller
@SessionAttributes("member") //보드라는 이름있으면 세션에 저장
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	@RequestMapping("/insertMember.do") //보드 멤버 가입
	public String insertMember(MemberVO vo) {
		
		System.out.println(">> 보드 멤버 추가");
		System.out.println("전달받은 vo: " + vo);
		
		memberService.insertMember(vo);
		return "//";
	}
	
	@RequestMapping("/updateMember.do") //보드멤버의 권한 수정
	public String updateMember(MemberVO vo) {
		
		System.out.println(">> 보드 권한 수정");
		System.out.println("전달받은 vo: " + vo);
		
		memberService.updateMember(vo);
		return "//";
	}
	
	@RequestMapping("/deleteMember.do") //보드 멤버 삭제 
	public String deleteMember(MemberVO vo) {
		
		System.out.println(">> 보드 멤버 삭제 ");
		System.out.println("전달받은 vo: " + vo);
		
		memberService.deleteMember(vo);
		return "//";
	}
	
	
	@RequestMapping("/getBoardList.do") //자기 보드 리스트 조회
	public String getBoardList(MemberVO vo, Model model) {
		System.out.println(">>> getBoardList()");

		List<MemberVO> boardList = memberService.getBoardList(vo);
		
		model.addAttribute("boardList", boardList);
		
		return "//";
	}	
	
	@RequestMapping("/getMemberList.do") //보드의 멤버 조회
	public String getMemberList(MemberVO vo, Model model) {
		System.out.println(">>> getMemberList()");

		List<MemberVO> memberList = memberService.getMemberList(vo);
		
		model.addAttribute("memberList", memberList);
		
		return "//";
	}	
}
