package com.jaywant.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaywant.Model.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{
	
	

}
