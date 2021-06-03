package com.zensar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

 //http://localhsot:7070/spring-mvc/hello-> sayHello()

@Controller
public class HelloController {
	
	@RequestMapping(value = "/hello",method = RequestMethod.GET)               //more than one argument value attribute is compulsory
	public String sayHello(Model model) {
		model.addAttribute("age", 20);
		System.out.println("hiiiiiii");
		return "hello";                        //logical name of the view 
	}

	@RequestMapping("/test")
	public String test() {
		return "test";                       //logical name of the view 
	}
}
