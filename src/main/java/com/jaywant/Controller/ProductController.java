package com.jaywant.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.jaywant.Model.Product;
import com.jaywant.Services.ProductService;

import DTO.ProductRequest;
import DTO.ProductResponse;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<ProductResponse> createProduct(@RequestBody ProductRequest productReq) {
        ProductResponse createdProduct = productService.createProduct(productReq);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdProduct); 
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductResponse> getProductById(@PathVariable int id) {
        ProductResponse productResponse = productService.getProductById(id);
        return ResponseEntity.ok(productResponse); 
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAllProduct(@RequestParam(defaultValue = "0") int page) {
        List<Product> products = productService.getAllProduct(page);
        return ResponseEntity.ok(products); 
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable int id) {
        productService.deleteProduct(id);
        return ResponseEntity.noContent().build(); 
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable int id, @RequestBody Product product) {
        Product updatedProduct = productService.updateProduct(id, product);
        return ResponseEntity.ok(updatedProduct); 
    }
}
