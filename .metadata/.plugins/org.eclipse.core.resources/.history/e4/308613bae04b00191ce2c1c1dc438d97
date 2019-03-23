package com.zpx.itl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zpx.itl.mapper.InfoMapper;
import com.zpx.itl.pojo.Information;
import com.zpx.itl.pojo.PageBean;
import com.zpx.itl.service.InfoService;


@Service
public class InfoServiceImpl implements InfoService {

	@Autowired
	private InfoMapper infoMapper;
	
	//查询所有数据
	public PageBean<Information> findAll(int pageSize, int currentPage) {
		
		PageBean pageBean = new PageBean();
		
		pageBean.setPageSize(pageSize);
		//总记录数
		int total = infoMapper.getTotal();
		pageBean.setTotal(total);
		//当前页
		pageBean.setCurrentPage(currentPage);
		if(total % pageSize == 0) {
			//总页数
			pageBean.setTotalPage(total / pageSize);
		}else {
			pageBean.setTotalPage(total / pageSize + 1);
		}
		
		//翻页后，从第(pageBean.getCurrentPage() - 1) * pageSize 开始查询
		int count = (pageBean.getCurrentPage() - 1) * pageSize;
		
		List<Information> list = infoMapper.findAll(count, pageSize);
		pageBean.setBeanlist(list);
		return pageBean;
	}

	//根据uid查询详细信息
	public Information findByUid(String uid) {
		
		Information info = infoMapper.findByUid(uid);
		return info;
	}

}
