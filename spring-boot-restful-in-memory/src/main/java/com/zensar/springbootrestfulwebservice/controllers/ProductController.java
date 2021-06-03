package com.zensar.springbootrestfulwebservice.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.springbootrestfulwebservice.beans.Product;
import com.zensar.springbootrestfulwebservice.services.ProductService;

@RestController
public class ProductController {

/*	@RequestMapping("/")
	public String test() {
		return "<h2>This is rest Application</h2>";
	}
*/
	
	//List<Product> products;
	
	@Autowired
	private ProductService service;
	
	 public ProductController() {
		
	}
	
	
	@RequestMapping(value = "/products",method = RequestMethod.GET,produces = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
	Iterable<Product> getAllProduct() {
		return service.getAllProduct();
	}
	
	@RequestMapping("/products/{productId}")
	public Product getProduct(@PathVariable("productId")int productId) {
		return service.getProduct(productId);
	}
	
	@RequestMapping(value = "/products",method =RequestMethod.POST)
	public Product insertProduct(@RequestBody Product product) {
		
		System.out.println("product inserted successfully !!!!");

		return service.insertProduct(product);
	
	}
	
	@RequestMapping(value = "/products/{productId}",method = RequestMethod.DELETE)
	public void deleteProduct(@PathVariable("productId")int productId) {
		
		
			System.out.println("product deleted successfully !!!!");
			service.deleteProduct(productId);
	}
	
	@RequestMapping(value = "/products/{productId}",method = RequestMethod.PATCH)
	public Product updateProduct(@PathVariable("productId")int productId,@RequestBody Product product) {
		return service.updateProduct(productId, product);
		
	}
	
	
	
}
