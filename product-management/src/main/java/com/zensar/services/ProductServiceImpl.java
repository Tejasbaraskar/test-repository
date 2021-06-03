package com.zensar.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.beans.Product;
import com.zensar.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

//	List<Product> products;

	@Autowired
	private ProductRepository repository;
	
//	 public ProductServiceImpl() {
//		
////		products=new ArrayList<Product>();
//
//	}
	
	
	@Override
	public int insertProduct(Product product) {
		
//		products.add(product);
//		System.out.println(product);
		
		return repository.submitProduct(product);
	}

	@Override
	public List<Product> getAllProducts() {
		
		return repository.getAllProducts();
	}

	@Override
	public Product getProduct(int productId) {

		return repository.getProduct(productId);
		
	}


	
}
