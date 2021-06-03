package com.zensar.springbootrestfulwebservice.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
	private RestTemplate restTemplate;
	
	@Autowired
	private ProductService service;
	
	 public ProductController() {
		
	}
	
	
//	@RequestMapping(value = "/products",method = RequestMethod.GET,produces = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
	@GetMapping("/products") 
	 Iterable<Product> getAllProduct() {
		return service.getAllProduct();
	}
	
	
	
	//@RequestMapping("/products/{productId}")

    @Cacheable(cacheNames="demoCache", key="#productId")
	@GetMapping("/products/{productId}")
	public Product getProduct(@PathVariable("productId")int productId) {
		return service.getProduct(productId);
		
		//return restTemplate.exchange("http://localhost:8080/products/"+productId, HttpMethod.GET,null,Product.class);
		
	}
	
	
//	@RequestMapping("/products/name/{productName}/{productCost}")
//	public List<Product> getProductByItsName(@PathVariable("productName")String productName,@PathVariable("productCost")int productCost) {
//		return service.getProductByItsName(productName,productCost);
//	}
	
//	@RequestMapping("/products/name/{productName}")
	@GetMapping("/products/name/{productName}")
	public List<Product> getProductByItsName(@PathVariable("productName")String productName) {
		return service.getProductByItsName(productName);
	}
	
//	@RequestMapping("/products/cost/{productCost}")
	@GetMapping("/products/cost/{productCost}")
	public List<Product> getProductByItsCost(@PathVariable("productCost")int productCost) {
		return service.getProductByItsCost(productCost);
	}
	
	
//	@RequestMapping(value = "/products",method =RequestMethod.POST)
	@PostMapping("/products")
	public Product insertProduct(@RequestBody Product product) {
		
		System.out.println("product inserted successfully !!!!");

		return service.insertProduct(product);
	
	}
	
//	@RequestMapping(value = "/products/{productId}",method = RequestMethod.DELETE)
	@DeleteMapping("/products/{productId}")
	public void deleteProduct(@PathVariable("productId")int productId) {
		
		
			System.out.println("product deleted successfully !!!!");
			service.deleteProduct(productId);
	}
	
//	@RequestMapping(value = "/products/{productId}",method = RequestMethod.PATCH)
	@PatchMapping("/products/{productId}")
	public Product updateProduct(@PathVariable("productId")int productId,@RequestBody Product product) {
		return service.updateProduct(productId, product);
		
	}


	public Page<Product> getAllProductsByPage(PageRequest pageRequest) {

		return service.getAllProductsByPage(pageRequest);
	}
	
	
	
}
