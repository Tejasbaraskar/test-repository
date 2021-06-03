package com.zensar.springbootrestfulwebservice.services;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.zensar.springbootrestfulwebservice.beans.Product;

public interface ProductService {

	Iterable<Product> getAllProduct();

	Product getProduct(int productId);

	Product insertProduct(Product product);

	void deleteProduct(int productId);

	Product updateProduct(int productId, Product product);

}