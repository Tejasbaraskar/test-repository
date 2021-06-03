package com.zensar.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zensar.beans.Product;
import com.zensar.services.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {

//	List<Product> products;

	
//	public ProductController() {
////		products=new ArrayList<Product>();
//	}
	
	@Autowired
	private ProductService service;
	
	@RequestMapping(value="/insert",method = RequestMethod.GET)
	public  String getProductInsertPage(@ModelAttribute("product")Product product) {
		return "productInfo";
	}
	
/*	@RequestMapping(value="/submit",method = RequestMethod.POST)
	public  String submitProduct(@RequestParam("productId")int id,@RequestParam("productName")String name,@RequestParam("productCost")int cost,Model model) {

 //2//		Product product=new Product(id, name, cost);
 //2//		model.addAttribute("product", product);
		
//1//		model.addAttribute("productId", id);
//1//		model.addAttribute("productName", name);
//1//		model.addAttribute("productCost", cost);

		return "productSubmit";
	}
*/
	
	
	
	@RequestMapping(value="/submit",method = RequestMethod.POST)
	public  String submitProduct(@Valid @ModelAttribute("product") Product product,BindingResult bindingResult) {
      //  int i=10/0;                                                            // exception handling in spring
//		products.add(product);	
		
		if(bindingResult.hasErrors()) {
			return "productInfo";
		}
		
		
		int result=service.insertProduct(product);
		if(result>0) {
			System.out.println("product inserted successfully !!!!");
			return "productSubmit";
		}
		
		return "productInfo";
	}
	
	
	@ModelAttribute                                               //it executes following method before handler methods
	public void addCommanMessage(Model model) {
		model.addAttribute("heading", "Product Management Application");
	}
	
	@RequestMapping("/all")
	public String getAllProducts(Model model){
		List<Product> products=service.getAllProducts();
		model.addAttribute("products", products);
		System.out.println(products);
		return "productDisplay";
	}
	
	@RequestMapping("/getProduct")
	public String getProduct(@RequestParam("productId")int productId,Model model) {
		Product product=service.getProduct(productId);
		model.addAttribute("product", product);
		return "displayOneProduct";
	}
	
	@RequestMapping("/")
	public String findProduct() {
		return "findProduct";
	}
	
}
