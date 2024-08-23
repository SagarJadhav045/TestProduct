package com.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.entity.Product;
import com.product.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepository productRepository;
	

	@Override
	public Product addProduct(Product product) {
		Product prod = new Product();
		if(product.getPrice() > 0) {
			prod = productRepository.save(product);
		}
		return prod;
	}

	@Override
	public Product updateProduct(Product product) {
		double price = product.getPrice();
		String name = product .getName();
		Product pName = productRepository.getProductByName(name);
		if(price > 0 && !name.equals(pName.getName())) {
			product.setName(name);
			product.setPrice(price);
		}
		return product;
	}

	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	
	
}
