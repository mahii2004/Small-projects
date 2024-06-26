package com.mahi.springboot.Service;

import java.util.List;

import com.mahi.springboot.Entity.Assets;

public interface AssetsService {

	public List<Assets> getAllAssets();

	public Assets getAssetsById(Integer id);

	public Assets findByName(String assetName);



}
