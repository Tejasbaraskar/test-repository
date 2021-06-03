package com.zensar.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zensar.beans.Product;


public interface ProductRepository {

	public int submitProduct(Product product);
	public List<Product> getAllProducts();
	public Product getProduct(int productId);

}
