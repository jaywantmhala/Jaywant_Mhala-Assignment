package com.jaywant.Model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Category {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int categoryId;
	
	
	private String categoryName;
	
	
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Product> product;


	public Category(int categoryId, String categoryName, List<Product> product) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.product = product;
	}


	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}


	public String getCategoryName() {
		return categoryName;
	}


	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}


	public List<Product> getProduct() {
		return product;
	}


	public void setProduct(List<Product> product) {
		this.product = product;
	}


	
	
	
	
	
}
