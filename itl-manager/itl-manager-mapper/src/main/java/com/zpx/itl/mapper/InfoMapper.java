package com.zpx.itl.mapper;

import java.util.List;

import com.zpx.itl.pojo.Information;
import com.zpx.itl.pojo.Param;

public interface InfoMapper {

	//添加信息
	void addInfo(Information information);
	
	//查询所有数据
	List<Information> findAll(int index, int count);
	
	//获取总记录数
	int getTotal();
	
	//根据uid查询详细信息
	Information findByUid(String uid);
	
	//根据学号查询详细信息
	Information findBySnumber(String snumber);
	
	//根据姓名进行模糊查询
	List<Information> findByName(Param param);
	
	//查出模糊查询的总记录数
	int getTotalByName(Param param);
	
	//根据uid删除数据
	int deleteByUid(String uid);
}
