package com.jaywant.DTO;


public class ProductRequest {

    private String productName;
    private Long price;
    private String image;
    private String description;
    private int categoryId; 

    public ProductRequest() {
        super();
    }

    public ProductRequest(String productName, Long price, String image, String description, int categoryId) {
        this.productName = productName;
        this.price = price;
        this.image = image;
        this.description = description;
        this.categoryId = categoryId;
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

    @Override
    public String toString() {
        return "ProductDTO [productName=" + productName + ", price=" + price + ", image=" + image + ", description="
                + description + ", categoryId=" + categoryId + "]";
    }
}
