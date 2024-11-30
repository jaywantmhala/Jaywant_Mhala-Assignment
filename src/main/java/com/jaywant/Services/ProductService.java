package com.jaywant.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.jaywant.DTO.ProductRequest;
import com.jaywant.DTO.ProductResponse;
import com.jaywant.Exception.ResourceNotFoundException;
import com.jaywant.Model.Category;
import com.jaywant.Model.Product;
import com.jaywant.Repo.CategoryRepo;
import com.jaywant.Repo.ProductRepo;

@Service
public class ProductService {

	
	@Autowired
	private ProductRepo productRepo;
	
	@Autowired
	private CategoryRepo categoryRepo;
	
	public ProductResponse createProduct(ProductRequest productReq) {
		Category category = categoryRepo.findById(productReq.getCategoryId())
	            .orElseThrow(() -> new ResourceNotFoundException("Category item  not found with id is : " + productReq.getCategoryId()));
		Product product = new Product();
		product.setProductName(productReq.getProductName());
		product.setPrice(productReq.getPrice());
		product.setImage(productReq.getImage());
		product.setDescription(productReq.getDescription());
		product.setCategory(category);
		product = productRepo.save(product);
	    return new ProductResponse(product);	
	    }
	
	
	public ProductResponse getProductById(int productId) {
	    Product product = this.productRepo.findById(productId)
	            .orElseThrow(() -> new ResourceNotFoundException("Product item not found with id is : " + productId));

	    ProductResponse response = new ProductResponse();
	    response.setProductId(product.getProductId());
	    response.setProductName(product.getProductName());
	    response.setDescription(product.getDescription());
	    response.setImage(product.getImage());
	    response.setPrice(product.getPrice());
	    
	    if (product.getCategory() != null) {
	        response.setCategoryId(product.getCategory().getCategoryId());
	        response.setCategoryName(product.getCategory().getCategoryName());
	    }

	    return response;
	}
	
	
	

	public List<Product> getAllProduct(int page) {
		Pageable pageable = PageRequest.of(page, 1);
		Page<Product> product = productRepo.findAll(pageable);
		return product.getContent();
	}
	
	public void deleteProduct(int productId) {
		this.productRepo.deleteById(productId);
	}
	
	
	
	
	public Product updateProduct(int productId, Product product) {
	    Product products = productRepo.findById(productId)
	            .orElseThrow(() -> new ResourceNotFoundException("Product not found with id: " + productId));

	    if (product.getProductName() != null) {
	    	products.setProductName(product.getProductName());
	    }
	    if (product.getPrice() != null) {
	    	products.setPrice(product.getPrice());
	    }
	    if (product.getImage() != null) {
	    	products.setImage(product.getImage());
	    }
	    if (product.getDescription() != null) {
	    	products.setDescription(product.getDescription());
	    }
	    if (product.getCategory() != null) {
	    	products.setCategory(product.getCategory());
	    }

	    return productRepo.save(products);
	}

	
	
	
}
