package com.zpx.itl.mapper;

import java.util.List;

import com.zpx.itl.pojo.Information;

public interface InfoMapper {

	//查询所有数据
	List<Information> findAll(int index, int count);
	
	//获取总记录数
	int getTotal();
	
	//根据uid查询详细信息
	Information findByUid(String uid);
}
