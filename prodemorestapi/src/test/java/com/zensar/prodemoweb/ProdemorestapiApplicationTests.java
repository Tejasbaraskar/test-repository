package com.zensar.prodemoweb;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.zensar.prodemoweb.entity.Product;

@RunWith(SpringRunner.class)
@SpringBootTest
class ProdemorestapiApplicationTests {

	@Value("${prodemorestapi.services.url}")
	private String baseURl;
	
	@Test
	public void testGetProduct() {
	
		RestTemplate t1=new RestTemplate();
		Product p1=t1.getForObject(baseURl+"1", Product.class);
		assertNotNull(p1);
		assertEquals("Iphone",p1.getName());
	
	}

	@Test
	public void testCreateProduct() {
		RestTemplate t1=new RestTemplate();
		Product p1=new Product();
		p1.setName("samsung");
		p1.setDescription("is awesome");
		p1.setPrice(10000);
		Product p2=t1.postForObject(baseURl,p1, Product.class);
		assertNotNull(p2);
		assertNotNull(p1.getId());
		assertEquals("samsung",p2.getName());
	}
	
	
	@Test
	public void testUpdateProduct() {
		RestTemplate t1=new RestTemplate();
		Product p1=t1.getForObject(baseURl+"1", Product.class);
		p1.setPrice(1400);
		t1.put("http://localhost:8080/products/", p1);
	}
	
	
}
