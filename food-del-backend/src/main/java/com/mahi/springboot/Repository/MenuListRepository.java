package com.mahi.springboot.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mahi.springboot.Entity.menuList;

@Repository
public interface MenuListRepository extends JpaRepository<menuList,Integer>{

}
