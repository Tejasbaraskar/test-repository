package com.zensar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@RequestMapping(value="/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/slogin")
	public String formSubmitted(@RequestParam("uname")String user,@RequestParam ("password")String password) {
		System.out.println(user+" "+password);
		return "slogin";
	}
}
