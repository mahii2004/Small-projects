package com.mahi.springboot.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mahi.springboot.Entity.Assets;
import com.mahi.springboot.Repository.Assetsrepository;
@Service
public class AssetsServiceimpl implements AssetsService {
    
	@Autowired
	Assetsrepository Assetsrepository ;

	@Override
	public List<Assets> getAllAssets() {
		
		return Assetsrepository.findAll();
	}

	
	@Override
	public Assets getAssetsById(Integer id) {
		
		return Assetsrepository.findById(id).get();
	}


	@Override
	public Assets findByName(String assetName) {

		return Assetsrepository.findByAssetNameIgnoreCase(assetName);
	}


	

}
