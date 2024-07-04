package com.mahi.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mahi.springboot.model.user;

public interface userRepository extends JpaRepository<user,Long> {

	
	
}
