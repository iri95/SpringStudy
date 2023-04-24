package com.mycom.study.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycom.study.dao.UserDao;
import com.mycom.study.dto.UserDto;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDao userDao;
	
	@Override
	public int login(UserDto userDto) {
		return userDao.login(userDto);
	}
	
	@Override
	public int signin(UserDto userDto) {
		return userDao.signin(userDto);
	}

}
