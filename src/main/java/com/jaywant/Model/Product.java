package com.jaywant.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class Product {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int productId;
	
	private String productName;
	
	private Long price;
	
	private String image;
	
	private String description;
	
	
	@ManyToOne
	@JsonBackReference
	private Category category;


	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Product(int productId, String productName, Long price, String image, String description, Category category) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.image = image;
		this.description = description;
		this.category = category;
	}


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public Long getPrice() {
		return price;
	}


	public void setPrice(Long price) {
		this.price = price;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", image="
				+ image + ", description=" + description + ", category=" + category + "]";
	}
	
	
	
	
}
