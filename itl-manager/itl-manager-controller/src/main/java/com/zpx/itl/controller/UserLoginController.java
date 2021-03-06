package com.zpx.itl.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	 * @throws IOException 
	 * @throws ServletException 
	 */
	@RequestMapping("/user/login")
	public String userLogin(String username, String password, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		HttpSession session = request.getSession();
		User suser = (User) session.getAttribute("user");
		if(suser != null && !"".equals(suser + "")) {
			return "information";
		} else if(username != null && !username.equals("") && password != null && !password.equals("")) {
			User user = userService.userLogin(username, password);
			if(user != null && !"".equals(user + "")) {
				session.setAttribute("user", user);
				//登录成功，转发至信息列表页面
				//request.getRequestDispatcher("/item/infoList").forward(request, response);
				//转发
				request.getRequestDispatcher("/info/infoList?currentPage=1").forward(request, response);
			}else {
				request.setAttribute("error", "用户名或密码错误");
				return "login";
			}
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
