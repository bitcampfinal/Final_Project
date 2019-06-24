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
			HttpSession session) {//UserVO : Command 객체
		System.out.println(">> 로그인 처리");
		System.out.println("전달받은 vo: " + vo);
		
		//예외처리를 위해 예외 발생 시키기
		if(vo.getUser_id() == null || vo.getUser_id().equals("")) {
			throw new IllegalArgumentException("아이디는 반드시 입력해야 합니다.");
		}
		
		UserVO user = userService.getUser(vo);

		if (user != null) { //사용자가 존재하는 경우
			
			session.setAttribute("user_id", user.getUser_id()); //세션에 유저아이디 저장 
			
			return ""; //여기 수정
		} else { //사용자가 없는 경우
			return "login.jsp";
		}
	}
	
	@RequestMapping(value="/login.do", method=RequestMethod.GET) 
	public String loginView(@ModelAttribute("user")UserVO vo) {
		System.out.println(">> 로그인 화면으로 이동 - loginView()");
		vo.setUser_id("test");
		vo.setPassword("1234");
		
		return "login.jsp";
		
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
		return "//보드 화면";
	}
	
	@RequestMapping("/updateUser.do") //회원 정보 수정
	public String updateUser(UserVO vo) 
			throws IllegalStateException, IOException {
		System.out.println(">>> 회원정보 수정 - updateUser()");
		
		userService.updateUser(vo);
		return "//보드 화면";
	}
	
	@RequestMapping("/deleteUser.do") //회원 정보 수정
	public String deleteUser(UserVO vo) 
			throws IllegalStateException, IOException {
		System.out.println(">>> 회원 탈퇴 - deleteUser()");
		
		userService.deleteUser(vo);
		return "//보드 화면";
	}
	
}
