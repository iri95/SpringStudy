package com.example.demo.service;

import com.example.demo.dto.UserDto;

public interface UserService {

	UserDto login(UserDto userDto);

	int signin(UserDto userDto);

}
