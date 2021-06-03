package com.zensar.services;

import java.util.List;

import com.zensar.beans.Product;

public interface ProductService {

	public int insertProduct(Product product);
	public List<Product> getAllProducts();
	public Product getProduct(int productId);
}
