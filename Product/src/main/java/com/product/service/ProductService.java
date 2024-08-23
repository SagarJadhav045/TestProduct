package com.product.service;

import java.util.List;

import com.product.entity.Product;

public interface ProductService {

	public Product addProduct(Product product);
	
	public Product updateProduct(Product product);
	
	public List<Product> getAllProducts();
	
}
