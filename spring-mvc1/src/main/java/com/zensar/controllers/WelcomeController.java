package com.zensar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

 //http://localhsot:7070/spring-mvc/hello-> sayHello()

@Controller
public class WelcomeController {
	
	@RequestMapping("/welcome/{name}")          
	public ModelAndView welcome(@PathVariable ("name") String name) {

		ModelAndView view = new ModelAndView("welcome");
		view.addObject("name", name);
		return view;
	}

}
