package com.zpx.itl.mapper;

import com.zpx.itl.pojo.User;

public interface UserMapper {
	
	User userLogin(String username, String password);

}
