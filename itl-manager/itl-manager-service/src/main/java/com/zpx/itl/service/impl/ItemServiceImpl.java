package com.zpx.itl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import com.zpx.itl.mapper.ItemMapper;
import com.zpx.itl.mapper.UserMapper;
import com.zpx.itl.pojo.Item;
import com.zpx.itl.pojo.User;
import com.zpx.itl.service.ItemService;
import com.zpx.itl.service.UserService;


@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemMapper itemMapper;
	
	@Override
	public List<Item> getItem() {
		List<Item> itemList = itemMapper.getItem();
		return itemList;
	}

}
