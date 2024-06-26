package com.mahi.springboot.Service;

import java.util.List;

import com.mahi.springboot.Entity.foodList;

public interface foodListService {

	List<foodList> getFoodList();

	public List<foodList> getfoodlistByCategory(String category);
   
	
}
