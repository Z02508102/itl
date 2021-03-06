package com.zpx.itl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转
 * @author ZPX
 *
 */

@Controller
public class PageController {

	
	@RequestMapping("/")
	public String showIndex() {
		
		return "index";
	}
	
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page) {
		
		if(page.equals("information")) {
			
			return "login";
		}
		return page;
	}
}
