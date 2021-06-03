package com.zensar.springbootrestfulwebservice.services;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.zensar.springbootrestfulwebservice.beans.Product;

public interface ProductService {

	Iterable<Product> getAllProduct();

	Product getProduct(int productId);

	Product insertProduct(Product product);

	void deleteProduct(int productId);

	Product updateProduct(int productId, Product product);
	
	//List<Product> getProductByItsName(String productName,int productCost);
	
	List<Product> getProductByItsName(String productName);
	List<Product> getProductByItsCost(int productCost);

	Page<Product> getAllProductsByPage(PageRequest pageRequest);

}