package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserDto;
import com.example.demo.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/login")
	public int login(UserDto userDto, HttpSession session) {
		UserDto dto = userService.login(userDto);
		if(dto == null) {
			System.out.println("로그인 실패");
			return 0;
		}else{
			session.setAttribute("user", dto);
			System.out.println("로그인 성공");
			return 1;
		}
	}
	
	@PostMapping("/signin")
	public int signin(UserDto userDto) {
		int ret = userService.signin(userDto);
		if(ret == 1) {
			System.out.println("회원가입 성공");
		}else {
			System.out.println("로그인 실패");
		}
		return ret;
	}

}
