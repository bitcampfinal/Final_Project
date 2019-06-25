package com.olive.user.view;

import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.olive.user.service.UserService;
import com.olive.user.service.UserVO;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/login.do", method=RequestMethod.POST) 
	public String login(UserVO vo,
			HttpSession session) {
		System.out.println(">> 로그인 처리");
		System.out.println("전달받은 vo: " + vo);
		
		UserVO user = userService.getUser(vo);

		if (user != null) { //사용자가 존재하는 경우
			
			session.setAttribute("user_id", user.getUser_id()); //세션에 유저아이디 저장 
			
			return "main_board.jsp"; //로그인 후 메인 보드 페이지로 이동
		} else { //사용자가 없는 경우
			return "login.jsp"; 
		}
	}
	
	@RequestMapping("/logout.do") //로그아웃
	public String logout(HttpSession session) {
		System.out.println(">>> 로그아웃 처리 - logout()");
		session.invalidate();
		return "login.jsp";
	}
	
	@RequestMapping("/insertUser.do") //회원가입
	public String insertUser(UserVO vo) 
			throws IllegalStateException, IOException {
		System.out.println(">>> 회원가입 - insertUser()");
		
		userService.insertUser(vo);
		return "login.jsp";
	}
	
	@RequestMapping("/updateUser.do") //회원 정보 수정
	public String updateUser(UserVO vo) 
			throws IllegalStateException, IOException {
		System.out.println(">>> 회원정보 수정 - updateUser()");
		
		userService.updateUser(vo);
		return "//마이페이지 페이지";
	}
	
	@RequestMapping("/deleteUser.do") //회원 탈퇴
	public String deleteUser(UserVO vo) 
			throws IllegalStateException, IOException {
		System.out.println(">>> 회원 탈퇴 - deleteUser()");
		
		userService.deleteUser(vo);
		return "login.jsp";
	}
	
}
