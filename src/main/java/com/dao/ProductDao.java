package com.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.dto.Product;

@Service
public class ProductDao {
	
	@Autowired
	ProductRepository productRepository;
	
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	public void register(Product product) {
		productRepository.save(product);
	}

	public Product getProductById(Integer productId) {
		return productRepository.findById(productId).orElse(new Product());
	}

	public Optional<Product> getProductByName(String productName) {
		return productRepository.findByProductName(productName);
	}

	public List<Product> getAllSortedProductsByName() {
		return productRepository.findAllSortedByName();
	}
}
