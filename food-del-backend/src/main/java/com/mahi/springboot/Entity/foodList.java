package com.mahi.springboot.Entity;


import java.sql.Blob;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class foodList {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer _id;
	private String name;
	private String image;
	private Double price;
	private String description;
	private String category;
	public Integer get_id() {
		return _id;
	}
	public void set_id(Integer _id) {
		this._id = _id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public foodList(Integer _id, String name, String image, Double price, String description, String category) {
		super();
		this._id = _id;
		this.name = name;
		this.image = image;
		this.price = price;
		this.description = description;
		this.category = category;
	}
	public foodList() {
		super();
	}
	
	
}
