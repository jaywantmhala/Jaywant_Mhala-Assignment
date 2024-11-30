package com.jaywant.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.jaywant.DTO.CategoryResponse;
import com.jaywant.Exception.ResourceNotFoundException;
import com.jaywant.Model.Category;
import com.jaywant.Repo.CategoryRepo;

@Service
public class CategoryServices {

	
	@Autowired
	private CategoryRepo categoryRepo;
	
	public Category createCategory(Category category) {
		return categoryRepo.save(category);
	}
	
	public List<Category> getAllCategory(int page) {
	    Pageable pageable = PageRequest.of(page,3);
	    Page<Category> categoryPage = categoryRepo.findAll(pageable);
	    return categoryPage.getContent(); 
	}
	
	public CategoryResponse getCategoryById(int categoryId) {
	    Category category = this.categoryRepo.findById(categoryId)
	            .orElseThrow(() -> new ResourceNotFoundException("Category item not found with id is " + categoryId));

	    CategoryResponse response = new CategoryResponse();
	    response.setId(category.getCategoryId());
	    response.setCategoryName(category.getCategoryName());
	    
	    return response;
	}
	
	public void deleteById(int categoryId) {
		this.categoryRepo.deleteById(categoryId);
	}

	public Category updateCategory(int categoryId, Category category) {
		category.setCategoryId(categoryId);
		return this.categoryRepo.save(category);
	}

	
	
}
