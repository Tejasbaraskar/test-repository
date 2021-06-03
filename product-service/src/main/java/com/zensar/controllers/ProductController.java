package com.zensar.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.beans.Product;

@RestController
public class ProductController {

	
	List<Product> products = new ArrayList<Product>();
	public ProductController() {

		products.add(new Product(1, "HDD", 4500));
		products.add(new Product(2, "Mobile", 10000));
		products.add(new Product(3, "Laptop", 50000));
		products.add(new Product(4, "Fan", 500));
		
	}
	
	@RequestMapping("/products/{productId}")
	public Product getProduct(@PathVariable("productId")int productId) {
		for(Product product:products) {
			if(product.getProductId()==productId) {
				return product;
			}
		}
		return null;
	}
	
}
