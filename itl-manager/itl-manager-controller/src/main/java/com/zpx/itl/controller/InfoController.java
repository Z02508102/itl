package com.zpx.itl.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zpx.itl.mapper.InfoMapper;
import com.zpx.itl.pojo.Information;
import com.zpx.itl.pojo.PageBean;
import com.zpx.itl.pojo.User;
import com.zpx.itl.service.InfoService;

/**
 * 管理页面
 * @author ZPX
 *
 */
@Controller
public class InfoController {

	@Autowired
	private InfoService infoService;
	private PageBean<Information> pageBean;
	
	@RequestMapping("/info/infoList")
	public String getItem(String currentPage, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		if(user != null && !"".equals(user + "")) {
			//request.setCharacterEncoding("utf-8");
			//response.setContentType("text/html;charset=utf-8");
			
			PageBean pageBean;
			//当前页
			//currentPage = "1";
			int currentPage1 = Integer.parseInt(currentPage);
			//每页显示几条数据
			int pageSize = 10;
			
			pageBean = infoService.findAll(pageSize, currentPage1);
			session.setAttribute("pageBean", pageBean);
			//response.sendRedirect("/itl/item/information");
			return "information";
		}
		return "index";
	}
	
	//根据uid查询详细信息
	@RequestMapping("/info/findByUid")
	public String findByUid(String uid, HttpServletRequest request, HttpServletResponse response) {
		
		HttpSession session = request.getSession();
		Information info = infoService.findByUid(uid);
		if(info != null && !"".equals(info + "")) {
			session.setAttribute("info", info);
			return "personal";
		}
		//session中有数据，从session中取数据即可
		return "information";
	}
	
	//根据姓名进行模糊查询
	@RequestMapping("/info/findByName")
	public String findByName(String sname, String currentPage, HttpServletRequest request, HttpServletResponse response) {
		
		HttpSession session = request.getSession();
		
		//每页显示几条数据
		int pageSize = 10;
		PageBean pageBean = infoService.findByName(sname, pageSize, currentPage);
		session.setAttribute("pageBean", pageBean);
		return "information";
	}
	
}
