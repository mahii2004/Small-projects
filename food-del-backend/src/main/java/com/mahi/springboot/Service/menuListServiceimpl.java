package com.mahi.springboot.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mahi.springboot.Entity.menuList;
import com.mahi.springboot.Repository.MenuListRepository;

@Service
public class menuListServiceimpl implements menuListService{

	@Autowired
	MenuListRepository menuListRepository;

	@Override
	public List<menuList> getMenuList() {
		
		return menuListRepository.findAll();
	}
	
	
}
