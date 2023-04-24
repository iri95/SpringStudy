package com.mycom.study.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycom.study.dto.UserDto;
import com.mycom.study.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/login")
	public void login() {	
	}
	
	@GetMapping("/signin")
	public void singin() {
	}
	
	@PostMapping("login")
	public String login(UserDto userDto, HttpSession session) {
		if(userService.login(userDto) == 1) {
			session.setAttribute("user", userDto);
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		return "redirect:/board/list";
	}
	
	@PostMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "/user/login";
	}
	
	@PostMapping("signin")
	public String signin(UserDto userDto) {
		if(userService.signin(userDto) == 1) {
			System.out.println("회원가입 완료");
			return "/user/login";
		}else {
			System.out.println("회원가입 실패");
			return "/user/signin";
		}
	}
}
