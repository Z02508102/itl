package com.zpx.itl.controller;



import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zpx.itl.pojo.Item;
import com.zpx.itl.pojo.User;
import com.zpx.itl.service.ItemService;

/**
 * 管理页面
 * @author ZPX
 *
 */
@Controller
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	/**
	 * 登录
	 * @param username
	 * @param password
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("/item/getItem")
	public String getItem(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		List<Item> items = (List<Item>) session.getAttribute("itemList");
		if(items != null && !"".equals(items+"")) {
			return "join";
		}
		List<Item> itemList = itemService.getItem();
		session.setAttribute("itemList", itemList);
		return "join";
		
	}
}
