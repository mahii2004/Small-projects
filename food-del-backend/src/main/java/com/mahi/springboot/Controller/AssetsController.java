package com.mahi.springboot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mahi.springboot.Entity.Assets;
import com.mahi.springboot.Service.AssetsService;

@RestController
@CrossOrigin("http://localhost:5173")
public class AssetsController {
    
	@Autowired
	AssetsService AssetsService ;
	
	@GetMapping("/assets/get")
	public List<Assets> getAllAssets(){
		return AssetsService.getAllAssets();
	}
	
	@GetMapping("/assets/get/{id}")
	public Assets getAssetsById(@PathVariable Integer id) {
		return AssetsService.getAssetsById(id);
	}
	
	@GetMapping("/assets/get/name/{name}")
	public Assets getAssetsByName(@PathVariable("name") String assetName) {
		return AssetsService.findByName(assetName);
	}
	

	
}
