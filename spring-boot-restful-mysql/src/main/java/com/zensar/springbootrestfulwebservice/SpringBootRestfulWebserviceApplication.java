package com.zensar.springbootrestfulwebservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.client.RestTemplate;

import com.zensar.springbootrestfulwebservice.beans.Product;
import com.zensar.springbootrestfulwebservice.controllers.ProductController;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@SpringBootApplication
//public class SpringBootRestfulWebserviceApplication {
//
//	public static void main(String[] args) {
//		ConfigurableApplicationContext context= SpringApplication.run(SpringBootRestfulWebserviceApplication.class, args);
//	
//		ProductController controller=context.getBean("productController",ProductController.class);
//		
//		Product product1=new Product(1, "test1", 10);
//		Product product2=new Product(2, "test2", 20);
//		
//		controller.insertProduct(product1);
//		controller.insertProduct(product2);
//	
//	}

//@SpringBootApplication
//public class SpringBootRestfulWebserviceApplication implements CommandLineRunner{
//
//	@Autowired
//	private ProductController controller;
//	
//	public static void main(String[] args) {
//		 SpringApplication.run(SpringBootRestfulWebserviceApplication.class, args);
//	
//		
//	
//	}

//@Override
//public void run(String... args) throws Exception {
//	controller.insertProduct(new Product(1, "hi", 1000));
//	controller.insertProduct(new Product(2, "hello", 2000));
//}

@SpringBootApplication
@EnableSwagger2
@EnableCaching
public class SpringBootRestfulWebserviceApplication implements CommandLineRunner{

	@Autowired
	private ProductController productController;
	
	public static void main(String[] args) {
		 SpringApplication.run(SpringBootRestfulWebserviceApplication.class, args);
	
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Override
	public void run(String... args) throws Exception {
		Page<Product> allProductsByPage= productController.getAllProductsByPage(PageRequest.of(0, 4,Direction.ASC,"productName"));	
		System.out.println(allProductsByPage.toList());
	}


	
	
	
}
