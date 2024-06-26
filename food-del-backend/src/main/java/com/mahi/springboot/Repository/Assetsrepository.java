package com.mahi.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.mahi.springboot.Entity.Assets;

@Repository

public interface Assetsrepository extends JpaRepository<Assets,Integer>{

	public Assets findByAssetNameIgnoreCase(String assetName);

}
