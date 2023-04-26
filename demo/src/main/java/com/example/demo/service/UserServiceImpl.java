package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDao;
import com.example.demo.dto.UserDto;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserDao dao;

	@Override
	public UserDto login(UserDto userDto) {
		return dao.login(userDto);
	}

	@Override
	public int signin(UserDto userDto) {
		return dao.signin(userDto);
	}
}
