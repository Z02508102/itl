package com.zpx.itl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zpx.itl.mapper.InfoMapper;
import com.zpx.itl.pojo.Information;
import com.zpx.itl.pojo.PageBean;
import com.zpx.itl.pojo.Param;
import com.zpx.itl.service.InfoService;


@Service
public class InfoServiceImpl implements InfoService {

	@Autowired
	private InfoMapper infoMapper;
	private Param param = new Param();
	
	//添加信息
	public int addInfo(Information information) {
		
		Information info = infoMapper.findBySnumber(information.getSnumber());
		if(info != null && !"".equals(info + "")) {
			return 1;
		}
		return infoMapper.addInfo(information);
		
	}
	
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

	//根据学生姓名进行模糊查询
	public PageBean<Information> findByName(String sname, int pageSize, String currentPage) {
		
		PageBean pageBean = new PageBean();
		param.setSname(sname);
		pageBean.setPageSize(pageSize);
		//总记录数
		int total = infoMapper.getTotalByName(param);
		pageBean.setTotal(total);
		//当前页
		int currentPage1 = Integer.parseInt(currentPage);
		pageBean.setCurrentPage(currentPage1);
		if(total % pageBean.getPageSize() == 0) {
			//总页数
			pageBean.setTotalPage(total / pageBean.getPageSize());
		}else {
			pageBean.setTotalPage(total / pageBean.getPageSize() + 1);
		}
		
		//翻页后，从第(pageBean.getCurrentPage() - 1) * pageSize 开始查询
		String count = (pageBean.getCurrentPage() - 1) * pageBean.getPageSize() + "";
		param.setCount(count);
		
		String pageSize1 = pageBean.getPageSize() + "";
		param.setPageSize(pageSize1);
		List<Information> info = infoMapper.findByName(param);
		pageBean.setBeanlist(info);
		return pageBean;
	}

	//根据uid删除数据
	public int deleteByUid(String uid) {
		
		return infoMapper.deleteByUid(uid);
	}
	
	

}
