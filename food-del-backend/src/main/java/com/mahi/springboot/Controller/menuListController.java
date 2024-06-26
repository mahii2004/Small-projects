package com.mahi.springboot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mahi.springboot.Entity.menuList;
import com.mahi.springboot.Service.menuListService;

@RestController
@CrossOrigin("http://localhost:5173")
public class menuListController {
   
	@Autowired
	menuListService menuListService;
	@GetMapping("/getmenulist")
	public List<menuList> getMenuList(){
		return menuListService.getMenuList();
	}
}
