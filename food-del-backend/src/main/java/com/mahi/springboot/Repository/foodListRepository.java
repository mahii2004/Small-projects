package com.mahi.springboot.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mahi.springboot.Entity.foodList;

@Repository
public interface foodListRepository extends JpaRepository<foodList,Integer>{

	List<foodList> findByCategoryIgnoreCase(String category);

}
