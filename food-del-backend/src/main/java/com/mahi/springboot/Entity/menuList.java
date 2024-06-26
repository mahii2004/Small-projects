package com.mahi.springboot.Entity;

import java.sql.Blob;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class menuList {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer menu_id;
	private String menu_name;
	private String menu_image;
	public Integer getMenu_id() {
		return menu_id;
	}
	public void setMenu_id(Integer menu_id) {
		this.menu_id = menu_id;
	}
	public String getMenu_name() {
		return menu_name;
	}
	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}
	public String getMenu_image() {
		return menu_image;
	}
	public void setMenu_image(String menu_image) {
		this.menu_image = menu_image;
	}
	public menuList(Integer menu_id, String menu_name, String menu_image) {
		super();
		this.menu_id = menu_id;
		this.menu_name = menu_name;
		this.menu_image = menu_image;
	}
	public menuList() {
		super();
		
	}
	
	
}
