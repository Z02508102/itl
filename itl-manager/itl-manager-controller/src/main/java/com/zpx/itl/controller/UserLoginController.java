package com.zpx.itl.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zpx.itl.pojo.User;
import com.zpx.itl.service.UserService;

/**
 * 管理页面
 * @author ZPX
 *
 */
@Controller
public class UserLoginController {

	@Autowired
	private UserService userService;
	
	/**
	 * 登录
	 * @param username
	 * @param password
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/user/login")
	public String userLogin(String username, String password, HttpServletRequest request, HttpServletResponse response) {
		
		HttpSession session = request.getSession();
		User suser = (User) session.getAttribute("user");
		if(suser != null && !"".equals(suser + "")) {
			return "information";
		} else if(username != null && !username.equals("") && password != null && !password.equals("")) {
			User user = userService.userLogin(username, password);
			if(user != null && !"".equals(user + "")) {
				session.setAttribute("user", user);
				return "information";
			}
			session.setAttribute("error", "用户名或密码错误");
			return "login";
		}
		return "login";
	}
	
	/**
	 * 退出
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/user/logout")
	public String userLogout(HttpServletRequest request, HttpServletResponse response) {
		
		HttpSession session = request.getSession();
		session.removeAttribute("user");
		return "index";
	}
	
	/**
	 * 显示登录页面
	 * @return
	 */
	@RequestMapping("/login")
	public String showLogin() {
		
		return "login";
	}
}