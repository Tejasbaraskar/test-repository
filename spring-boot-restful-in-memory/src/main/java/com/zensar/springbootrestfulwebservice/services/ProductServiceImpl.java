package com.zensar.springbootrestfulwebservice.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zensar.springbootrestfulwebservice.beans.Product;
import com.zensar.springbootrestfulwebservice.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService  {



	
	@Autowired
	private ProductRepository repository;
	
	 public ProductServiceImpl() {
		 
	}
	
	
	@Override
	public Iterable<Product> getAllProduct() {
		return repository.findAll();
	}
	
	@Override
	public Product getProduct(int productId) {
		return repository.findById(productId).get();
	}
	
	@Override
	public Product insertProduct(Product product) {
		return repository.save(product);
	}
	
	@Override
	public void deleteProduct(int productId) {
	 repository.deleteById(productId);;
	}
	
	@Override
	public Product updateProduct(int productId,Product product) {
		return repository.save(product);
		
	}
	
	
}
