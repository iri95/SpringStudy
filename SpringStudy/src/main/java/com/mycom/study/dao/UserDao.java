package com.mycom.study.dao;

import com.mycom.study.dto.UserDto;

public interface UserDao {

	int login(UserDto userDto);

	int signin(UserDto userDto);

}
