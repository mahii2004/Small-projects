package com.mahi.springboot.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mahi.springboot.Entity.foodList;
import com.mahi.springboot.Repository.foodListRepository;

@Service
public class foodListServiceimpl implements foodListService{
    
	@Autowired
	foodListRepository foodListRepository ;

	@Override
	public List<foodList> getFoodList() {
		
		return foodListRepository.findAll();
	}

	@Override
	public List<foodList> getfoodlistByCategory(String category) {
	   
		return foodListRepository.findByCategoryIgnoreCase(category);
	}
}
