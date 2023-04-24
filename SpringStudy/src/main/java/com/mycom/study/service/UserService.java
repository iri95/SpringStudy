package com.mycom.study.service;

import com.mycom.study.dto.UserDto;

public interface UserService {

	int login(UserDto userDto);

	int signin(UserDto userDto);

}
