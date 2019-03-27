package com.zpx.itl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import com.zpx.itl.mapper.UserMapper;
import com.zpx.itl.pojo.User;
import com.zpx.itl.service.UserService;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	public User userLogin(String username, String password) {
		
		String uname = DigestUtils.md5DigestAsHex(username.getBytes());
		String pwd = username + password;
		String pwdMd5 = DigestUtils.md5DigestAsHex(pwd.getBytes());
		User user = userMapper.userLogin(uname, pwdMd5);
		return user;
	}

}
