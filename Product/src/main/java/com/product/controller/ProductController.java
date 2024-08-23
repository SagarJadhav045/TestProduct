package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.product.entity.Product;
import com.product.service.ProductServiceImpl;

@RestController
public class ProductController {
	
	@Autowired
	ProductServiceImpl serviceImpl;

	@GetMapping("/getAllProducts")
	public List<Product> getAllProducts(){
		return serviceImpl.getAllProducts();
	}
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {		
		return serviceImpl.addProduct(product);
	}
	
	@PutMapping("/updateProduct")
	public Product updateProduct(@RequestBody Product product) {		
		return serviceImpl.addProduct(product);
	}
	
}
