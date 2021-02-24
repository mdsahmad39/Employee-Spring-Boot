package com.myproject;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.ProductDao;
import com.dto.Product;

@RestController
public class ProductController {
	
	@Autowired
	ProductDao productDao;
	
	@RequestMapping("/register")
	public void register() {
		Product product1 = new Product();
		product1.setProductName("Audio System");
		product1.setProductPrice(9999.23);

		productDao.register(product1);
	}
	
	@RequestMapping("/getProductById/{productId}")
	public Product getProductById(@PathVariable("productId") Integer productId) {
		Product product = productDao.getProductById(productId);
		return product;
	}
	
	@RequestMapping("/getProductByName/{productName}")
	public Optional<Product> getProductByName(@PathVariable("productName") String productName) {
		Optional<Product> product = productDao.getProductByName(productName);
		return product;
	}
	
	@RequestMapping("/getAllSortedProducts")
	public List<Product> getAllSortedProductByName() {
		return productDao.getAllSortedProductsByName();
	}
	
	@RequestMapping("/getAllProducts")
	public List<Product> getAllProduct() {
		return productDao.getAllProducts();
	}
}
