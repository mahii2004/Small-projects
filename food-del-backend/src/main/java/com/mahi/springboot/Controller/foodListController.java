package com.mahi.springboot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mahi.springboot.Entity.foodList;
import com.mahi.springboot.Service.foodListService;

@RestController
@CrossOrigin("http://localhost:5173")
public class foodListController {
	
	@Autowired
	 foodListService foodListService;
	
	@GetMapping("/getfoodlist")
	public List<foodList> getFoodList(){
		return foodListService.getFoodList();
	}

	@GetMapping("/getfoodlist/{category}")
	public List<foodList> getfoodlistByCategory(@PathVariable String category) {
		return foodListService.getfoodlistByCategory(category);
	}
}
