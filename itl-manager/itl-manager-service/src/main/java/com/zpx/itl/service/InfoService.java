package com.zpx.itl.service;

import java.util.Map;

import com.zpx.itl.pojo.Information;
import com.zpx.itl.pojo.PageBean;
import com.zpx.itl.utils.InformationException;

public interface InfoService {
	
	//添加信息
	void addInfo(Information information, Map<String, String> errors) throws InformationException;
	
	//查询所有数据
	PageBean<Information> findAll(int papgeSize, int currentPage);
	
	//根据uid查询详细信息
	Information findByUid(String uid);
	
	//根据姓名进行模糊查询
	PageBean<Information> findByName(String sname, int pageSize, String currentPage);
	
	//根据uid删除数据
	int deleteByUid(String uid);
}
