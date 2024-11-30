package com.jaywant.DTO;

import com.jaywant.Model.Product;

public class ProductResponse {
    private int productId;
    private String productName;
    private Long price;
    private String image;
    private String description;
    private int categoryId; 
    private String categoryName;

    // Getters and Setters

    public ProductResponse(Product product) {
        this.productId = product.getProductId();
        this.productName = product.getProductName();
        this.price = product.getPrice();
        this.image = product.getImage();
        this.description = product.getDescription();
        this.categoryId = product.getCategory().getCategoryId();  
        this.categoryName=product.getCategory().getCategoryName();
    }
    
    

	public ProductResponse() {
		super();
		// TODO Auto-generated constructor stub
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
    
	
    
}
